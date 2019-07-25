package chap07.sec01.exam01;

public class DmbCellPhone extends CellPhone {
	int channel; 
	
	DmbCellPhone (String model, String colour, int channel) {
		this.model = model; 
		this.colour = colour; 
		this.channel = channel; 
	}
	
	void turnOnDmb() {
		System.out.println("channel: " + channel + "dmb starts");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel; 
		System.out.println("channel: " + channel + "changed");
	}
	
	void turnOffDmb() {
		System.out.println("Dmb off"); 
	}
}
