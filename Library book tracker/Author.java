public class Author {

	private String name ;
	private String nationality ;

	public Author(String name , String nationality) {

	this.name = name;
	this.nationality = nationality;
	}

	public String toString () {

	return String.format("%s(%s)" , name,nationality );

	}


}