//Design a class for (Bag, Pen, Bike, car, Flower, Board, MIC, Animal, Home, Bus) with minimum three states 
//create three objects and initialize the states.


package Jan27;
public class MultipleObjects {
	public static void main(String[] args) {
		Bag bag1 = new Bag("Backpack","black",1000);
		Bag bag2 = new Bag("Travelbag","Red",2000);
		Bag bag3 = new Bag("Suitcase","Blue",1500);
		bag1.display();
		bag2.display();
		bag3.display();
		
		Pen pen1 = new Pen("Blue","Ballpoint",5);
		Pen pen2 = new Pen("Black","Fountain",20);
		Pen pen3 = new Pen("Blue","Gel",15);
		pen1.display();
		pen2.display();
		pen3.display();

		Bike bike1 = new Bike("Yamaha","Blue",150000);
		Bike bike2 = new Bike("TVS","Jupiter",90000);
		Bike bike3 = new Bike("Honda","Activa",90000);
		bike1.display();
		bike2.display();
		bike3.display();
		
		Car car1 = new Car("Chevrolet","Corvette",7000000);
		Car car2 = new Car("Ferrari","SF90",90000000);
		Car car3 = new Car("Aston Martin","Valkyrie",200000000);
		car1.display();
		car2.display();
		car3.display();
		
		Flower flower1 = new Flower("Rose","Red",20);
		Flower flower2 = new Flower("Lotus","Rose",50);
		Flower flower3 = new Flower("Mariegold","Yellow",30);
		flower1.display();
		flower2.display();
		flower3.display();
										
		Board board1 = new Board("Blackboard","Large",2000);
		Board board2 = new Board("Whiteboard","Large",3000);
		Board board3 = new Board("Blackboard","Small",500);
		board1.display();
		board2.display();
		board3.display();
		
		MIC mic1 = new MIC("Wired","Sony",2000);
		MIC mic2 = new MIC("Wireless","Boat",900);
		MIC mic3 = new MIC("Handheld","Sony",1300);
		mic1.display();
		mic2.display();
		mic3.display();
		
		Animal animal1 = new Animal("Dog","Domestic","Black");
		Animal animal2 = new Animal("Wolf","Wild","White");
		Animal animal3 = new Animal("Bear","Wild","Brown");
		animal1.display();
		animal2.display();
		animal3.display();
		
		Home home1 = new Home("2BHK","900 sqfeet",2000000);
		Home home2 = new Home("4BHK","1200 sqfeet",7500000);
		Home home3 = new Home("5BHK","2000 sqfeet",150000000);
		home1.display();
		home2.display();
		home3.display();
		
		Bus bus1 = new Bus("Bharat Benz","Black","A/C");
		Bus bus2 = new Bus("Volvo","Blue","A/C");
		Bus bus3 = new Bus("Bharat Benz","Red","Sleeper");
		bus1.display();
		bus2.display();
		bus3.display();
		
		
	}
}
class Bag{
	String Type;
	String color;
	long price;
	public Bag(String Type,String color,long price) {
		this.Type=Type;
		this.color=color;
		this.price=price;
	}
	public void display() {
		System.out.println("Type :"+Type);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		System.out.println("=======================");
	}
}
class Pen{
	String color;
	String type;
	long price;
	public Pen(String color,String type,long price) {
		this.color=color;
		this.price=price;
		this.type=type;
	}
	public void display() {
		System.out.println("Type :"+type);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		System.out.println("=======================");
	}
}
class Bike{
	String color;
	String Brand;
	long price;
	public Bike(String color,String Brand,long price) {
		this.Brand=Brand;
		this.color=color;
		this.price=price;
	}
	public void display() {
		System.out.println("Brand:"+Brand);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		System.out.println("=======================");
	}
}
class Car{
	String Company;
	String Model;
	long price;
	public Car(String Company,String Model,long price) {
		this.Company=Company;
		this.Model=Model;
		this.price=price;
	}
	public void display() {
		System.out.println("Company:"+Company);
		System.out.println("Model  :"+Model);
		System.out.println("Price  :"+price);
		System.out.println("=======================");
	}
}
class Flower{
	String Name;
	String color;
	long price;
	public Flower(String Name,String color,long price) {
		this.color=color;
		this.Name=Name;
		this.price=price;
	}
	public void display() {
		System.out.println("Name :"+Name);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
		System.out.println("=======================");
	}
}
class Board{
	String Type;
	String Size;
	long price;
	public Board(String Type,String Size,long price) {
		this.price=price;
		this.Size=Size;
		this.Type=Type;
	}
	public void display() {
		System.out.println("Type :"+Type);
		System.out.println("Size :"+Size);
		System.out.println("Price:"+price);
		System.out.println("=======================");
	}
}
class MIC{
	String Type;
	String Brand;
	long price;
	public MIC(String Type,String Brand,long price) {
		this.Brand=Brand;
		this.price=price;
		this.Type=Type;
	}
	public void display() {
		System.out.println("Brand:"+Brand);
		System.out.println("Type :"+Type);
		System.out.println("Price:"+price);
		System.out.println("=======================");
	}
}
class Animal{
	String Name;
	String Type;
	String color;
	public Animal(String Name,String Type,String color) {
		this.color=color;
		this.Name=Name;
		this.Type=Type;
	}
	public void display() {
		System.out.println("Name:"+Name);
		System.out.println("Type :"+Type);
		System.out.println("Color:"+color);
		System.out.println("=======================");
	}
}
class Home{
	String Type;
	String size;
	long price;
	public Home(String Type,String size,long price) {
		this.price=price;
		this.size=size;
		this.Type=Type;
	}
	public void display() {
		System.out.println("Type :"+Type);
		System.out.println("Size:"+size);
		System.out.println("Price:"+price);
		System.out.println("=======================");
	}
}
class Bus{
	String Brand;
	String Color;
	String Type;
	public Bus(String Brand,String Color,String Type) {
		this.Color=Color;
		this.Brand=Brand;
		this.Type=Type;
	}
	public void display() {
		System.out.println("Brand:"+Brand);
		System.out.println("Color:"+Color);
		System.out.println("Type :"+Type);
		System.out.println("=======================");
	}
}

