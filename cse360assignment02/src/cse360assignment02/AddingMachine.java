package cse360assignment02;

public class AddingMachine {
	private int total;
	private String memory = "0";
	  
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total = total + value;
		  memory = memory + " + " + value;
	  }

	  public void subtract (int value) {
		  total = total - value;
		  memory = memory + " - " + value;
	  }

	  public String toString () {
	    return memory + "\n";
	  }

	  public void clear() {
		  memory = "0";
		  total = 0;
	  }
	  
	  public static void main(String args[])
		{
			AddingMachine myCalculator = new AddingMachine();
			myCalculator.add(4);
			myCalculator.subtract(2);
			myCalculator.add(5);
			System.out.print(myCalculator.toString());
		}
}
