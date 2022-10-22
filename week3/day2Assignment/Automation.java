package week3.day2Assignment;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accessing all methods from Interface and Implement class");
		Multiplelanguage ML = new Multiplelanguage();
		ML.Python();
		ML.Java();
		ML.JavaScript();
		ML.Ruby();
		ML.Selenium();
		
		System.out.println("\nAccessing all methods from Interface - Language");
		Language l = new Multiplelanguage();
	    l.Java();
		l.JavaScript();
		l.Ruby();
		
		System.out.println("\nAccessing all methods from Interface TestTool");
		TestTool t = new Multiplelanguage();
		t.Selenium();
		

	}

}
