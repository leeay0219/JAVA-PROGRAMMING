package chap08.sec01.exam01;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV On"); 
	}

	@Override
	public void turnOff() {
		System.out.println("TV Off");
	}

	@Override
	public void setVolume(int volume) {
		if (RemoteControl.MAX_VOLUME < volume)
		System.out.println("TV Volumn: " + volume); 
	}

}
