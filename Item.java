class Item {
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	private int itemTaxRate;

	public String getName() {
		return itemName;
	}
	public void setName(String aName) {
		itemName = aName;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int aQuantity) {
		itemQuantity = aQuantity;
	}

	public int getPrice() {
		return itemPrice;
	}
	public void setPrice(int aPrice) {
		itemPrice = aPrice;
	}

	public int getItemTaxRate() {
		return itemTaxRate;
	}

	public void setItemTaxRate() {
		// if conditional logic and regex to determine
		// tax rate for each item
		// how do i call items own attribute here. will need itemName
	}
}

// needs to take params for 1) price 2) name

// Item.new(int price, String name)