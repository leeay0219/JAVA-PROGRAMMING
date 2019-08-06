package chap12.sec01.exam07;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); 
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() +": " + memory +" -> " + this.memory);
	} //synchronized=user1이 해당 블록을 실행하는 동안에는 다른 동작 불가능
	
	
}

