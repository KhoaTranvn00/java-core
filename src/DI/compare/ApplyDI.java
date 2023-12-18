package DI.compare;

public class ApplyDI {
    public static void main(String[] args) {
        IService service = new Service1();
        Controller controller = new Controller(service);

        controller.handleService();
    }
}

interface IService {
    void doSomeThing();
}

class Service1 implements IService {
    @Override
    public void doSomeThing() {
        System.out.println("Service1 run");
    }
}
class Service2 implements IService {
    @Override
    public void doSomeThing() {
        System.out.println("Service2 run");
    }
}

class Controller {
    IService service;

    public Controller(IService service) {
        this.service = service;
    }

    public void handleService() {
        service.doSomeThing();
    }
}
