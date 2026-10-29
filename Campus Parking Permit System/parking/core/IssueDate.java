package parking.core;
	public class IssueDate {

	private int day;
	private int month;
	private int year;

	public IssueDate(int day, int month, int year){
	this.day = day;
	this.month = month;
	this.year = year;
	}

	public String Format() {
		return String.format("%d/%d/%d",day,month,year);
	}




}