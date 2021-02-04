package dawspack.client;

import dawspack.services.DawsServiceImpl;
import dawspack.services.DawsServiceImplService;
import dawspack.services.Product;

public class dawsClient {

	public static void main(String[] args) {
		
		DawsServiceImpl webService = new DawsServiceImplService().getDawsServiceImplPort();
		Product product = webService.getProductlById(2);
		System.out.println(product.getName());
	}

}
