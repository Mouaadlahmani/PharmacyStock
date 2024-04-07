package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mitier.Product;

public class ProductDaoImpl implements IproductDao{

	@Override
	public Product save(Product p) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("INSERT INTO STOCK (NAME, QUANTITY, PRICE) VALUES (?,?,?)");
			ps.setString(1, p.getName());
			ps.setInt(2, p.getQuantity());
			ps.setDouble(3, p.getPrice()); 
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement
					("SELECT MAX(ID) AS MAX_ID FROM STOCK");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				p.setId(rs.getInt("MAX_ID"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<Product> productsByMC(String mc) {
		List<Product> products=new ArrayList<Product>();
		Connection connection = SingletonConnection.getConnection();
		
	
		try {
			PreparedStatement ps3=connection.prepareStatement
					("SELECT * FROM STOCK WHERE NAME LIKE ?");
			ps3.setString(1, mc);
			ResultSet rs=ps3.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setId(rs.getInt("ID"));
				p.setName(rs.getString("NAME"));
				p.setQuantity(rs.getInt("QUANTITY"));
				p.setPrice(rs.getDouble("PRICE"));
				products.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
