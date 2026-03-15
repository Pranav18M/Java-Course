package Inheritance;

class animal{
	String name;
	int age;
	
	void makesound() {
		System.out.println("Animal make sound");
	}
	
}

class Dog extends animal{
	String bread;
	
	void makesound() {
		System.out.println("Dog barks");
	}
	
	void fetch() {
		System.out.println("Dog is fetching");
	}
}

class cat extends animal{
   
	void makesound() {
		System.out.println("Meaow");
	}
	
	void climb() {
		System.out.println("cat is climbing");
	}
}
public class Challange1 {

	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.name = "Timmy";
		d1.age = 2;
		d1.bread= "golden";
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.bread);
		d1.fetch();
		d1.makesound();

 System.out.println("--------------------------------------------");
		
		
		cat c1 = new cat();
		c1.name = "cutee";
		c1.age=1;
		System.out.println(d1.name);
		System.out.println(d1.age);
		c1.climb();
		c1.makesound();


	}

}

