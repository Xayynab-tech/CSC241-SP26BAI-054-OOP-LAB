package parking.student;
import parking.core.*;
public class ReservedStudentPermit extends StudentPermit {

	private int slotNo;
	
	public ReservedStudentPermit(String plateNo, ParkingZone zone, int d, int m, int y,String dept, int slot){
	super(plateNo,zone,d,m,y,dept) ;
	this.slotNo = slotNo;
	}

	public int reservedFee(){
		return studentFee() + 200 ;
	}

	public void printReserved() {
		System.out.println("Reserved Slot : " + slotNo ) ;
	}

	public String verificationCode() {
		int check = ( permitId + slotNo ) % 10 ;
		return department+"-"+permitId+"-S"+slotNo+"-"+check ;

	}


}