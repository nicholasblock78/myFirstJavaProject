class Tax {
	String[] exemptItems = {"book", "chocolate", "headache", "pill"};

	public static void main (String[] args) {
		System.out.println("This is my Tax class");
		Item item = new Item();
		item.itemName = "Hello";
		System.out.println(item.itemName);
	}
}

