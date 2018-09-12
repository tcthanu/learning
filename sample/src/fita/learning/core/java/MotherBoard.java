package fita.learning.core.java;

public class MotherBoard {
	String model;
	MotherBoard(String model){
		this.model = model;
	}
	static class USB{
		int no_of_usb2_ports = 2;
		int no_of_usb3_ports = 2;
		int getTotalNoOfUsbPorts() {
			int total_ports = no_of_usb2_ports + no_of_usb3_ports;
			return total_ports;
		}
	}
	
	public static void main(String[] args) {
		MotherBoard.USB usb= new MotherBoard.USB();
		System.out.println("Total Ports :" +usb.getTotalNoOfUsbPorts());
	}

}
 

