package chap07.sec01.exam01;

public class DmbcellPhoneExample {
	public static void main(String[]args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone ("javaphone", "black", 10);
		
		System.out.println("model: " + dmbCellPhone.model);
		System.out.println("colour: " + dmbCellPhone.colour);
	
		System.out.println("channel: " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell(); 
		dmbCellPhone.sendVoice("Hello");
		dmbCellPhone.receiveVoice("Hi");
		dmbCellPhone.sendVoice("Oh hi");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(30);
		dmbCellPhone.turnOffDmb();
		
	}
}
