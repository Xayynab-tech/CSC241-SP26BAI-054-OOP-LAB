public class Book {

	private String bookId;
	private String title;
	private double price;
	private int stock;
	private Author author;
	private static int counter = 0;
	private static int totalBooksCreated = 0 ;


	public Book( String title , double price , int stock , Author author) {

	this.title = title ;
	this.price = price ;
	this.stock = stock ;
	this.author = author ;

	}

	public Book( String title , double price ){

	this.title = title ;
	this.price = price ;
	}

	public void display() {

  	System.out.printf("Id : b%02d \n", counter++);
    	System.out.printf("Title : %-20s \n", title);
    	System.out.printf("Price : %.2f \n", price);
    	System.out.printf("Stock : %d \n", stock);
    	System.out.printf("Author : %-20s \n", author.toString());
    	System.out.println("Total Books: " + ++totalBooksCreated);
}



}