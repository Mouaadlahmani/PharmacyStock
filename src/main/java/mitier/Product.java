package mitier;

import java.io.Serializable;

public class Product implements Serializable{
		
		private int id;
		private String name;
		private int quantity;
		private double price;
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Product(String name, int quantity, double price) {
			super();
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
}
