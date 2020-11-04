
public class TestingWhileCondition {
	
	public static void main(String[]args) {
		
		int counter = 0;
		int total = 0;
		
		while(counter <= 10) {
			
			//total = total+counter;
			total+= counter;
			counter ++;
			//counter = counter + 1;
			//counter += 1; 
			
			System.out.println(total);
		}
		
	}

}
