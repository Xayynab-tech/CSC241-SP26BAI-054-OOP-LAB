public class ElectronicProduct extends Product{

	private int warrantyMonths;

	public ElectronicProduct(String name, double price, Date manufacturingDate, int warrantyMonths) {

	super(name,price,new Date(manufacturingDate));
	this.warrantyMonths = warrantyMonths;
	}

	@Override
	public void displayDetails() {
	super.displayDetails();
	System.out.println("Warranty Months : " + warrantyMonths) ;
	}
	

}