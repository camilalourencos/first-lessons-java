public class TestingConditions {

	public static void main(String[] args) {
		//testing conditions		
		int age = 32;
		int tattoos = 0;
		if(age<=29) {
			System.out.println("You're not on the thirties yet! Phew!");
		} else {
			if(tattoos>=1) {
				System.out.println("Well, at least you got tatts...");
			} else {
				System.out.println("Oh no...");
			}
		}
	}
}


