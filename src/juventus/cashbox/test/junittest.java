package juventus.cashbox.test;


import juventus.cashbox.*;
import juventus.cashbox.persistence.Order;
import juventus.cashbox.persistence.Product;
import juventus.cashbox.persistence.ProductManager;
import junit.framework.TestCase;


public class junittest extends TestCase{
	
	//Test Methoden müssen mit test beginnen!!!
	
	public void testbetrag(){			
		
		ProductManager testmanager = new ProductManager();
		
		Order testorder = new Order();
		
		Product testproduct1 = new Product("supertester X", 30.00);
		Product testproduct2 = new Product("supertester Y", 60.02);
		
		testmanager.AddProduct(testproduct1);
		testmanager.AddProduct(testproduct2);
		
		
		//this prints out the amount of all products in the list
		
		System.out.print(testmanager.GetInvoice());
		
		//assertEquals("Falscher Betrage zusammen Rechnung", "1,00", testorder.GetTotal());
	}
	
	

}
