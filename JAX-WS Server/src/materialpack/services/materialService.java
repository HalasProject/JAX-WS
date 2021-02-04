package materialpack.services;
import materialpack.domain.Product;

import java.util.List;

public interface materialService {

	public List<Product> getProducts();
	
	public Product getProductlById(int id);
	
	public boolean addProduct(Product p) ;
	
	public boolean deleteProductById(int id);
	
	public boolean updateProduct(Product p);

}
