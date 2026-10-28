public class Demo{
	public static void main(String args[]) {

	Product p = new Product("Keyboard",5600,new Date(2,6,2026));
	p.displayDetails();
	System.out.println("");

	ElectronicProduct e = new ElectronicProduct("Mouse",2100,new Date(18,9,2016),12);
	e.displayDetails();
	System.out.println("");

	Laptop l = new Laptop("ProBook",6700,new Date(9,2,2022), 24, 256);
	l.displayDetails();
	System.out.println("");

	ClothingProduct c = new ClothingProduct("Shirt",5700,new Date(28,10,2026),"Medium");
	c.displayDetails();



	}


}