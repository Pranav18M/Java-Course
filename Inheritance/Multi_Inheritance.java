package Inheritance;

class a{
	int one =1;
	
}

class b extends a {
	int two = 2;
}

class c extends b {
	int three= 3;
}
public class Multi_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    c obj1 = new c();
    System.out.println(obj1.one);
    
	}

}
