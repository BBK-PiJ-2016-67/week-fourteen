import java.util.*;

public class NumberHungry {
	private List<Integer> numberArray = new ArrayList<Integer>();
	private int count = 0;
	private int sum = 0;
	public void add(String x) {
		try {
			int i = Integer.parseInt(x);
			this.numberArray.add(i);
			count = count + 1;
			sum = sum + i;
			if (count == 10) {
				int average = sum / 10;
				System.out.println("The mean average of the sum of inputted values is " + average);
			}
		} catch (NumberFormatException e) {
			System.out.println("Error: int values only please");
		}
	}
}
