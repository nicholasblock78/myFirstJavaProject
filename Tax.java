import java.util.Scanner;
class Tax {
	String[] exemptItems = {"book", "chocolate", "headache", "pill"};

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



