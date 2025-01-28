//Design a class by using constructor overloading print "Java is a programming language " 
//by using every word in an individual constructor by using constructor chaining.

package Jan27;
public class ConstructorChaining {
	public static void main(String[] args) {
		new print();
	}
}
class print{
	print(){
		this(10);
		System.out.println("language. ");
	}
	print(int a){
		this(1.5);
		System.out.print("Programming ");
	}
	print(double b){
		this("A");
		System.out.print("a ");
	}
	print(String c){
		this(true);
		System.out.print("is  ");
	}
	print(boolean a){
		System.out.print("Java ");
	}
}
