package dawspack.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import dawspack.database.Connection;
import dawspack.domain.Product;

@WebService
public class dawsServiceImpl implements dawsService {

	private List<Product> products = new ArrayList<Product>();
    
	Connection DB = new Connection("halas","halas00","daws");

	public dawsServiceImpl() {
		DB.connect();
		System.out.println("[*] Database Connection: "+DB.isConnected());
	}

	@Override
	public List<Product> getProducts() {
		System.out.println("[!] getProducts method has been invoked");
		products.clear();
		ResultSet data;
		try {
			data = DB.query("SELECT * FROM products");
			while(data.next()){
				products.add(new Product(data.getInt("id"), data.getString("name"), data.getInt("qty")));		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}

	@Override
	public Product getProductlById(int id) {
		System.out.println("[!] getProductlById method has been invoked");

		ArrayList<Object> params = new ArrayList<>();
		params.add(id);
		
		ResultSet data;
		try {
			data = DB.preparedStatement("SELECT * FROM products where id = ?", params);
			data.next();
			Product oneProduct = new Product(data.getInt("id"), data.getString("name"), data.getInt("qty"));
			return oneProduct;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return new Product();
	}

	@Override
	public boolean addProduct(Product p) {
		System.out.println("[!] addProduct method has been invoked");
		if (p == null) throw new NullPointerException("Product is null");
		
		try {
			String query = "INSERT INTO products (name, qty) VALUES ('"+p.getName().toString()+"',"+p.getQuantity()+")";
			int created = DB.updateQuery(query);
			return (created == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
		
	}

	@Override
	public boolean deleteProductById(int id) {
		System.out.println("[!] deleteProductById method has been invoked");
		
		try {
			int Deleted = DB.updateQuery("DELETE FROM products where id = "+ id +"");
			return (Deleted == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateProduct(Product p) {
		System.out.println("[!] updateProduct method has been invoked");
		
		try {
			int isUpdated = DB.updateQuery("UPDATE products set name = '"+ p.getName( )+"',qty = "+ p.getQuantity() +" WHERE id = "+p.getId()+"");
			return (isUpdated == 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

}
