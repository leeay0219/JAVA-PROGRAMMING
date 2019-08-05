package C6.InstanceMem;

public class ShopService {
	private static ShopService sgt = new ShopService();
	private ShopService() {}
	
	static ShopService getInstance() {
		return sgt; 
	}
}
