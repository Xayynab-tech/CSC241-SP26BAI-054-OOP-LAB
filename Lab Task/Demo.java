public class Demo{
	public static void main(String[] args) {
	
	Product p1 = new Product("Abc", 22.4, 2, new Date());
	Product p2 = new Product("Def", 29.8, 9);
	Product p3 = new Product("Xyz", 91.2, 4);
	Product p4 = new Product("Lmn", 70.4, 1);

	p1.displayProduct();
	p1.displayMaxMin();
	System.out.println(" ");

	p2.displayProduct();
	p2.displayMaxMin();
	System.out.println(" ");

	p3.displayProduct();
	p3.displayMaxMin();
	System.out.println(" ");

	p4.displayProduct();
	p4.displayMaxMin();
	System.out.println(" ");

}

}