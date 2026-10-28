public class Main {

	public static void main(String args[]) {

	Book b1 = new Book("Alchemist",500,4,new Author("Paulo Coelho" , "British") );
	b1.display() ;
	System.out.println(" ") ;


	Book b2 = new Book("Her Radiant Curse",700,9,new Author("J.K Rowling" , "British") );
	b2.display() ;
	System.out.println(" ") ;


	Book b3 = new Book("Atomic Habits",820,3,new Author("James Clear" , "British") );
	b3.display() ;
	System.out.println(" ") ;

	}
}