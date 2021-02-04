package dawspack.services;
import dawspack.domain.Product;

import java.util.List;

public interface dawsService {

	public List<Product> getProducts();
	
	public Product getProductlById(int id);
	
	public boolean addProduct(Product p) ;
	
	public boolean deleteProductById(int id);
	
	public boolean updateProduct(Product p);

}
