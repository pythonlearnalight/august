package pkg1;

public class Student {
	
	int a;
	
	public void aman()
	{
		System.out.println("Welcome"); //ctrl + space
	}
	
	public static void main(String[] args) {
		//className referenceVariable = new className()
		Student abc = new Student();
		abc.aman();
		abc.a=10;
		System.out.println(abc.a);
		
	}
}

//main is the method which is the entry point of execution of code.
//write main ctrl + space

//for accessing variable and methods present in class we need to create Object variable of the class with new keyword

