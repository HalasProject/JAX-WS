package dawspack.client;

import java.util.List;

import javax.swing.*;

import dawspack.services.DawsServiceImpl;
import dawspack.services.DawsServiceImplService;
import dawspack.services.Product;

public class dawsClient {

	public static void main(String[] args) {
		while(true) {
		String[] buttons = { "All Products", "Search Product", "Delete Product", "Add Product","Update Product"};  
		DawsServiceImpl webService = new DawsServiceImplService().getDawsServiceImplPort();
		
		String productID;
		
		JTextField product_id = new JTextField(5);
		JTextField product_name = new JTextField(5);
	    JTextField product_qty = new JTextField(5);
	      
		int choice = JOptionPane.showOptionDialog(null, "Please choose one of the following operation:","DAWS JAX-WS (API)",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.INFORMATION_MESSAGE, null, buttons, buttons[0]);
		System.out.println(choice);
		switch (choice) {
		case 0:
			List<Product> products = webService.getProducts();
			String rows = "\n Products records \n ";
			for (Product product : products) {
	            rows += "\n" + "ID: " + product.getId() + " | Name: " + product.getName() + "  |  Quantity: " + product.getQuantity();
	        }
			JOptionPane.showMessageDialog(null, rows);
			break;
		case 1:
			productID = JOptionPane.showInputDialog("Search product by id");
			Product product = webService.getProductlById(Integer.parseInt(productID));
			JOptionPane.showMessageDialog(null, "Name: "+product.getName()+" | Quantity: "+product.getQuantity()+"");
			break;
		case 2:
			productID = JOptionPane.showInputDialog("Product id to delete:");
			boolean deleted = webService.deleteProductById(Integer.parseInt(productID));
			if (deleted) {
				JOptionPane.showMessageDialog(null, "Product Deleted Successfully","Delete", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Error occured during product delete","Delete", JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 3:
			JPanel myPanel = new JPanel();
			myPanel.add(new JLabel("name:"));
		    myPanel.add(product_name);
		    myPanel.add(Box.createHorizontalStrut(15));
		    myPanel.add(new JLabel("qty:"));
		    myPanel.add(product_qty);

		    int result = JOptionPane.showConfirmDialog(null, myPanel, 
		               "Please Enter name and qty of product", JOptionPane.OK_CANCEL_OPTION);
		    if (result == JOptionPane.OK_OPTION) {
		    	  Product a	 = new Product();
		    	  a.setName(product_name.getText());
		    	  a.setQuantity(Integer.parseInt(product_qty.getText()));
		    	  if(webService.addProduct(a)) {
		    		  JOptionPane.showMessageDialog(null, "Product Added Successfully","Added", JOptionPane.INFORMATION_MESSAGE);
		    	  } else {
		    		  JOptionPane.showMessageDialog(null, "Error occured during product insertion","Added", JOptionPane.ERROR_MESSAGE);
		    	  };
		     }
		    break;
		case 4:

		      JPanel myPanel2 = new JPanel();
		      myPanel2.add(new JLabel("id:"));
		      myPanel2.add(product_id);
		      myPanel2.add(Box.createHorizontalStrut(15));
		      myPanel2.add(new JLabel("name:"));
		      myPanel2.add(product_name);
		      myPanel2.add(Box.createHorizontalStrut(15));
		      myPanel2.add(new JLabel("qty:"));
		      myPanel2.add(product_qty);

		      int result2 = JOptionPane.showConfirmDialog(null, myPanel2, 
		               "Please Enter name and qty of product", JOptionPane.OK_CANCEL_OPTION);
		      if (result2 == JOptionPane.OK_OPTION) {
		    	  Product updated_product	 = new Product();
		    	  updated_product.setId(Integer.parseInt(product_id.getText()));
		    	  updated_product.setName(product_name.getText());
		    	  updated_product.setQuantity(Integer.parseInt(product_qty.getText()));
		    	  if(webService.updateProduct(updated_product)) {
		    		  JOptionPane.showMessageDialog(null, "Product Updated Successfully","Update", JOptionPane.INFORMATION_MESSAGE);
		    	  } else {
		    		  JOptionPane.showMessageDialog(null, "Error occured during product update","Update", JOptionPane.ERROR_MESSAGE);
		    	  };
		      }
		      break;
		default:
			break;
		}
	}
	}

}
