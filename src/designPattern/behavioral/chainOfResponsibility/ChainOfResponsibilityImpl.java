package designPattern.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityImpl {
    public static void main(String[] args) {
        BaseHandler checkUserExit = new CheckUserExist();
        BaseHandler checkCredential = new CheckCredential();
        BaseHandler checkRole = new CheckRole();

        checkUserExit.setNextHandler(checkCredential);
        checkCredential.setNextHandler(checkRole);

        checkUserExit.handle("takhoa", "passwordTest");
    }
}

abstract class BaseHandler {
    protected BaseHandler nextHandler;

    public void setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(String username, String password);
}

class CheckUserExist extends BaseHandler {
    @Override
    public void handle(String username, String password) {
        if (username.equals("takhoa")) {
            System.out.println("Pass parse 1");
            if (nextHandler != null) {
                nextHandler.handle(username, password);
            }
        } else {
            System.out.println("Fail parse 1, and Stop here");
        }
    }
}
class CheckCredential extends BaseHandler {
    @Override
    public void handle(String username, String password) {
        if (password.equals("passwordTest")) {
            System.out.println("Pass check credential");
            if (nextHandler != null) {
                nextHandler.handle(username, password);
            }
        } else {
            System.out.println("Fail parse check credential");
        }
    }
}
class CheckRole extends BaseHandler {
    @Override
    public void handle(String username, String password) {
        if (username.equals("takhoa")) {
            System.out.println("Pass check role");
        }
    }
}
