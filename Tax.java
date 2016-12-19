import java.util.Scanner;
class Tax {
	String[] exemptItems = {"book", "chocolate", "headache", "pill"};
	String[] input1 = {"1 book at 12.49", "1 music CD at 14.99","1 chocolate bar at 0.85"};
	String[] input2 = {"1 imported box of chocolates at 10.00","1 imported box of perfume at 47.50"};
	String[] input3 = {"1 book at 12.49", "1 bottle of perfume at 18.99", "1 packet of headache pills at 9.75", "1 box of imported chocolates at 11.25"};

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This is my Tax class");
		
		Item item = new Item();
		item.setName("Cheeseburger");
		item.setPrice(24);

		System.out.println(item.getName() + " is " + item.getPrice() + " dollars.");

		Receipt receipt = new Receipt();
		System.out.print("Say Hello: ");
		String greeting = scanner.next();
		// String greeting = System.console().readLine();
		System.out.println(".........");
		System.out.println(greeting);
	}


}



