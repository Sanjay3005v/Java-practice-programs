//Design a class for an object and initialize the state of the object using Non-static method and display the states  
//using non static method-->2 separate method to initialize and to display.


package Jan27;
public class Object2 {
	String Company;
	String Model;
	long price;
	public static void main(String[] args) {
		Cars car1 = new Cars("Chevrolet","Corvette",7000000);	
		Cars car2 = new Cars("Porche","911",3000000);
		car1.display();
		car2.display();
	}
}
class Cars{
	String Company;
	String Model;
	long price;
	
	public  Cars(String Company,String Model,long price) {
		this.Company=Company;
		this.Model=Model;
		this.price=price;
	}
	
	public void display() {
		System.out.println("Company:"+Company);
		System.out.println("Model  :"+Model);
		System.out.println("Price  :"+price);
		System.out.println();
	}
}
