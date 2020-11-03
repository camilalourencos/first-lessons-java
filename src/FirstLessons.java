
public class FirstLessons {
	
	public static void main (String[]args) {
		//testing variable's data types
		
		//numbers
		int age = 30 + 10; //integer 
		double salary = 54000.45 / 12; //numbers with decimals
		int payment = (int) salary; //casting - forcing a floating number into a integer
		System.out.println("Elena is "+age+" years old and earns $"+payment+" per month");
		
		//characters
		char letter = 'A'; // char is used for a one character only or an integer equivalent to an unicode character
		char letter2 = 66;
		char letter3 = (char)(letter2+1); //number 1 is an integer and it's needed to perform a casting to fit this into a char variable
		System.out.println("The first three letters of the alphabet are "+letter+letter2+letter3);
		
		String streetName = "Rua PipiPopo, "; 
		String address = streetName + 123;
		System.out.println(address); 
		
		//primitive variable's data types store values - String as an exception
		int firstNumber = 5;
		int secondNumber = 10;
		secondNumber = firstNumber;
		firstNumber = 10;
		secondNumber = firstNumber;
		
		System.out.println(secondNumber);
		
		
	}

}
