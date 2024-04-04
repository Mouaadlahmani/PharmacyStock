package dao;

import mitier.Product;

public class testDao {

	public static void main(String[] args) {
		ProductDaoImpl dao = new ProductDaoImpl();
		Product p1 = dao.save(new Product("BATATA",150,3.5));
		System.out.println(p1.toString());
	}

}
