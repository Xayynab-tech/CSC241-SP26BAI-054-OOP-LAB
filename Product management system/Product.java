public class Product {

	private static int nextId = 1 ;
	private static final String ID_SUFFIX = "-PRD" ;
	
	private final String id;
	private String name;
	private double price;
	private Date manufacturingDate;

	public Product(String name, double price, Date manufacturingDate) {
	
	this.name = name ;
	this.price = price ;
	this.manufacturingDate = new Date(manufacturingDate );
	this.id = nextId + ID_SUFFIX ;
	nextId++ ;

	}

	public String getId(){
	return id ;
	}

	public void displayDetails() {
	System.out.println("Name : "+ name);
	System.out.println("Id : "+ id);
	System.out.println("Price : "+ price);
	manufacturingDate.displayDate();
	
	}


}