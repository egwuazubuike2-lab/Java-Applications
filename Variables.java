public class Variables{
	public static void main(String[] args){
		String name = "Azubuike";
		int age = 36;
		double pi = 3.14159;
		char gender = 'm';
		boolean isAdmin = true;
		System.out.println("My name is: " +name);
		System.out.printf("I am %d years old %n",age);
		System.out.printf("The value of pi is %.2f: %n",pi);
		System.out.printf("I am a %s male %n",gender);
		
		if(isAdmin){
			System.out.printf("He is an Admin %n",isAdmin);
		}	
		else
			System.out.printf("He is not an Admis",isAdmin);
	
		
		
	}
}