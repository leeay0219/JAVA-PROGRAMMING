package chap08.sec01.exam01;

public interface RemoteControl {
	public String COMPANY = "Hanwha";
	public int MAX_VOLUME = 10; 
	public int MIN_VOLUME = 0; 
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
