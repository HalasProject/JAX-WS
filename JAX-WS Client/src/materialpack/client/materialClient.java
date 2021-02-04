package materialpack.client;

import materialpack.services.MaterialServiceImpl;
import materialpack.services.MaterialServiceImplService;
import materialpack.services.Product;

public class materialClient {

	public static void main(String[] args) {
		
		MaterialServiceImpl webService = new MaterialServiceImplService().getMaterialServiceImplPort();
		Product product = webService.getProductlById(2);
		System.out.println(product.getName());
	}

}
