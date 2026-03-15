package ClassObject;

public class Student {
	
	int age;
	String name;
	
	Student(int a , String b)
	{
		age = a;
		name = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student(19 , "Pranav");
        System.out.println(obj.age);
        System.out.println(obj.name);

        
	}

}
