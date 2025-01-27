//Design a class for employees with minimum three states create three objects and initialize the states.


package Jan27;

public class ObjectEmployee {
	
	public static void main(String[] args) {
		Employee e1 =new Employee();
		e1.Name="Elon Musk";
		e1.id= 20245;
		e1.salary=70000;
		e1.display();
		
		Employee e2 =new Employee();
		e2.Name="Jeff Bezos";
		e2.id= 20277;
		e2.salary=60000;
		e2.display();
		
		Employee e3 =new Employee();
		e3.Name="Bill Gates";
		e3.id= 52468;
		e3.salary=45000;
		e3.display();
	
	}
}
class Employee{
	String Name;
	int id;
	long salary;
	public void display() {
		System.out.println("Name  :"+Name);
		System.out.println("ID    :"+id);
		System.out.println("Salary:"+salary);
		System.out.println();
	}

}


