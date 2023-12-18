package DI.compare.normalWay;

public class NormalWay {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.handleService();
    }
}

class Service {
    void doSomeThing() {
        System.out.println("Service run");
    }
}

class Controller {
    Service service = new Service();

    public void handleService() {
        service.doSomeThing();
    }
}


