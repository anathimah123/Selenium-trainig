package practise;

public class Parent {

	public static void main(String [] argd) {
		//this step prints in the output 
		System.out.println("I Navigated to home page");
		
		Methods m =new Methods();
		m.ValidateHeader();
		System.out.println(m.ValidateHeader());
		//classobject.methodname
	}
}