package dao;

import java.util.List;

import mitier.Product;

public class testDao {

	public static void main(String[] args) {
		ProductDaoImpl dao = new ProductDaoImpl();
		/*Product p1 = dao.save(new Product("Remix",160,3.5));
		System.out.println(p1.toString());*/
		System.out.println("Chercher des produits");
		List<Product> prods=dao.productsByMC("REMIX");
		for(Product p :prods){
			System.out.println(p.toString());
		}
	}
}  
