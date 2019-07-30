package chap11.sec01.exam02;

public class Key {
	public int number; 
	
	public Key(int number) {
		this.number = number; 
	}
	
	@Override
	public int hashCode() {
		return number; 
	}
}
