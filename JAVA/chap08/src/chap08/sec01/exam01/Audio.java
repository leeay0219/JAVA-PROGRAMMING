package chap08.sec01.exam01;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio On"); 
	}

	@Override
	public void turnOff() {
		System.out.println("Audio Off");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Audio Volume: " + volume); 
	}

}
