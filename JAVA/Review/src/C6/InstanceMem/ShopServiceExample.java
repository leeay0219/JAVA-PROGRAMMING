package C6.InstanceMem;

public class ShopServiceExample {
	public static void main(String[]args) {
		ShopService o1 = ShopService.getInstance();
		ShopService o2 = ShopService.getInstance();
		
		if (o1 == o2) {
			System.out.println("same obj");
		} else
			System.out.println("diff obj"); 
	}
}
