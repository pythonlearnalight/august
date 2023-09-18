package pkg1;

public class Assignment1 {
	int age;
	String name;
	
	public void display1()
	{
		System.out.println("Wlcome alll of you");
	}
	
	public void display2()
	{
		System.out.println("Automation as veray easy");
	}
	
	public static void main(String[] args) {
		Assignment1 assg1 = new Assignment1();
		
		assg1.display1();
		assg1.display2();
		assg1.age = 26;
		System.out.println(assg1.age);
		assg1.name = "aman";
		System.out.println(assg1.name);
				
			
	}
	
	
}