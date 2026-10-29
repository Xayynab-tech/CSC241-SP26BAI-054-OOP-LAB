package parking.app;
import parking.core.*;
import parking.student.*;
import parking.office.*;

	public class Demo{
	
	public static void main(String args[]){

	ParkingOffice office = new ParkingOffice() ;
	ParkingZone shared = 
		new ParkingZone("BlockA");
	office.addZone(shared);
	office.addZone(new ParkingZone("Staff",2));
	System.out.println("Registered zones: ");
	office.printZones();

	ParkingPermit p = new ParkingPermit("LEA-101",office.getZone(0),12,10,2026);

	StudentPermit s = new StudentPermit("LEB-202",office.getZone(0),13,10,2026, "BCS");

	ReservedStudentPermit r = new ReservedStudentPermit("LEC-303",office.getZone(1),14,10,2026, "BCS",12);

	
	p.printBasic();
	System.out.println("Fee: Rs. " + p.standardFee());
	System.out.println("--");
	
	s.printStudent();
	System.out.println("Fee: Rs. " + s.studentFee());
	System.out.println("--");

	r.printReserved();
	System.out.println("Fee: Rs. " + r.reservedFee());
	System.out.println("Verification : " + r.verificationCode());
	System.out.println("--");

	System.out.println("Total permits : " + ParkingPermit.getIssuedCount());
	
	shared.setName("Block B");
	System.out.println("After zone rename: ");
	p.printBasic();
	s.printStudent();

	}


}