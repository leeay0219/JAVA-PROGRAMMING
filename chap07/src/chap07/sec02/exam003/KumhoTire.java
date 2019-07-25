package chap07.sec02.exam003;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation; 
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Kumho Tire 수명" + (maxRotation-accumulatedRotation) + "회");
			return true; 
		} else {
			System.out.println("***" + location + "Kumho Tire 펑크 ***");
			return false; 
		}
	}
}
