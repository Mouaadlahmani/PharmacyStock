package dao;
import java.util.List;

import mitier.Product;

public interface IproductDao {
	public Product save(Product p);
	public List<Product> prodoctsByMC(String mc);
	public Product getProduct(int id);
	public Product update(Product p);
	public void delete(int id);
}
