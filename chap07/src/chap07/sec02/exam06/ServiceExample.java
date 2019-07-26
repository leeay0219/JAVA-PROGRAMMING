package chap07.sec02.exam06;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.service.login();
		controller.setService(new AService());
		controller.service.login();
	}

}
