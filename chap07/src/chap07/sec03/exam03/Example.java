package chap07.sec03.exam03;

public class Example {

	public static void main(String[] args) {
		LoginServlet loginServlet = new LoginServlet();
		response(loginServlet);
		JoinServlet joinServlet = new JoinServlet();
		response(joinServlet);
	}
	public static void response(HttpServlet servlet) {
		servlet.service();
	}

}
