public class Date{

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(Date other) {
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	public void displayDate() {
	
	System.out.printf("%d-%d-%d",day,month,year) ;
	System.out.println("");

	}

}