public class DataType{
	public static void main(String[] agrgs){
		byte myAge = 25;
		short quantity = 25000;
		int nigeriaPopulation = 200000000;
		long worldsPopulation = 67400000000000L;
		float price = 458.315F;
		double balance = 3456927.657657;
		char symbol = '$';
		boolean isJavaFun = true;
		
		
		System.out.printf("I am %d years old%n",myAge);
		System.out.printf("I ordered %d quantity of phones%n",quantity);
		System.out.printf("The population of Nigeria is %d%n",nigeriaPopulation);
		System.out.printf("The worlds population is %d%n",worldsPopulation);
		System.out.printf("The price for 2 books is %.2f%n",price);
		System.out.printf("My account balance is %C%.2f%n",symbol,balance);
		System.out.printf("Is Java Fun? %b%n",isJavaFun);
		
	}
}				