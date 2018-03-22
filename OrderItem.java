package org.java.learn;

public final class OrderItem extends AbstractEntity<OrderItem> {

	private static final long serialVersionUID = -2663354902183760635L;

	private Item item;
	private int quantity;

	public OrderItem(Item item, int quantity) {
		super();
		this.item = item;
		if(quantity > 0){
			this.quantity = quantity;
		} else {
			this.quantity = 1;
		}
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice(){
		return item.getUnitPrice() * this.quantity;
	}

	@Override
	public int compareTo(OrderItem other) {
		return this.getItem().compareTo(other.getItem());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderItem [item=" + item + ", quantity=" + quantity + "]";
	}
	
}
