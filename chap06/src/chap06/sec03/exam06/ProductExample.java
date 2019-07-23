package chap06.sec03.exam06;
public class ProductExample {

	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println("p1 : " + p1);
		System.out.println();

		Product p2 = new Product(1, "상품1", 10, 10000);
		System.out.println("p2 : " + p2.pNum);
		System.out.println("p2 : " + p2.pName);
		System.out.println("p2 : " + p2.stock);
		System.out.println("p2 : " + p2.cost);
		System.out.println("p2 : " + p2.company);
		System.out.println();
		
		Product p3 = new Product(2, "상품2", 20, 20000, "Hanwha");
		System.out.println("p3 : " + p3.pNum);
		System.out.println("p3 : " + p3.pName);
		System.out.println("p3 : " + p3.stock);
		System.out.println("p3 : " + p3.cost);
		System.out.println("p3 : " + p3.company);
		System.out.println();
		
		Product p4 = new Product(3, new char[] {'상', '품', '명', '3'} , 20, 20000, "Hanwha");
		System.out.println("p4 : " + p4.pNum);
		System.out.println("p4 : " + p4.pName);
		System.out.println("p4 : " + p4.stock);
		System.out.println("p4 : " + p4.cost);
		System.out.println("p4 : " + p4.company);
		System.out.println();
		
		Product p5 = new Product(4, new char[] {'상', '품', '명', '4'} , 20, 20000, new char[] {'한', '화'});
		System.out.println("p5 : " + p5.pNum);
		System.out.println("p5 : " + p5.pName);
		System.out.println("p5 : " + p5.stock);
		System.out.println("p5 : " + p5.cost);
		System.out.println("p5 : " + p5.company);
		System.out.println();
	}

}
