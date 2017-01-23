import org.junit.*;
import static org.junit.Assert.*;

public class NumberHungryTest {
	@Test
	public void userInputSuccess() {
		NumberHungry numberHungry = new NumberHungry();
		numberHungry.add("1");
		numberHungry.add("2");
		numberHungry.add("3");
		numberHungry.add("4");
		numberHungry.add("5");
		numberHungry.add("6");
		numberHungry.add("7");
		numberHungry.add("8");
		numberHungry.add("9");
		numberHungry.add("10");
	}
	@Test
	public void userInputFailString() {
		NumberHungry numberHungry = new NumberHungry();
		numberHungry.add("1");
		numberHungry.add("2");
		numberHungry.add("3");
		numberHungry.add("4");
		numberHungry.add("5");
		numberHungry.add("6");
		numberHungry.add("7");
		numberHungry.add("8");
		numberHungry.add("a");
		numberHungry.add("9");
		numberHungry.add("10");
	}
	@Test
	public void userInputFailNull() {
		NumberHungry numberHungry = new NumberHungry();
		numberHungry.add("1");
		numberHungry.add("2");
		numberHungry.add("3");
		numberHungry.add("4");
		numberHungry.add("5");
		numberHungry.add("6");
		numberHungry.add("7");
		numberHungry.add("8");
		numberHungry.add("");
		numberHungry.add("9");
	}
}
