
public class JavaStatements {
	
	private static int[] numbers = {1, 10, 15, 54, 15, 10, 10};


	public static void main(String[] args) {
		// display on the console the number 10 and 15 when the array index is equal to 10 or 15
		// if not display not equal
		/*
		for (int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == 10 || numbers[i] == 15)
			    System.out.println("i index is " + i + " the value is " + numbers[i]);
			else
				System.out.println("Not Equal");
		}*/
		
		int day = 1;
		switch(day) {
		case 1:
			System.out.println("Day 1");
			break;
		case 2:
			System.out.println("Day 2");
			break;
		case 3:
			System.out.println("Day 3");
			break;
		case 4:
			System.out.println("Day 4");
			break;
		case 5:
			System.out.println("Day 5");
			break;
	}
	
}

}

