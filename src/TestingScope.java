public class TestingScope {

	public static void main(String[] args) {
		//testing scope		
		int age = 32;
		int tattoos = 5;
		boolean coolKid;
		
		//boolean coolKid = tattoos >= 4;
		//variable must be declared prior to the use. It "dies" when the {} it is placed is closed. 
		//Therefore, if it is declared between if {} it won't be valid on the lines ahead 
		
		if(tattoos>=4) {
			coolKid = true;
		}else {
			coolKid = false;
		}
		
		if(age<=29 || coolKid) {
			System.out.println("You're not THAT old");
		} else {
			System.out.println("Oh no...");
			}
	}
}
