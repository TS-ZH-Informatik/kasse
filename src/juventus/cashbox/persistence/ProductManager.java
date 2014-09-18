package juventus.cashbox.persistence;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;


public class ProductManager {
	
	private ArrayList<Product> arrProducts;
	
	public ProductManager()
	{
		// test product Product product01 = new Product("Kaugummi", 0.20);
		arrProducts = new ArrayList<Product>();
	}
	
	public Product GetProduct(int param_Id)
	{
		if(arrProducts.size() > param_Id)
		{
			return this.arrProducts.get(param_Id);
		}
		else
		{	
			System.out.println("there are no products");
			return null;
		}
	}
	
	public int GetListSize()
	{
		return this.arrProducts.size();
	}
	
	public BigDecimal GetInvoice()
	{
		BigDecimal sumer = BigDecimal.ZERO;
		for(Iterator<Product> i = arrProducts.iterator(); i.hasNext(); ) {
		     Product current = i.next();
		     sumer = sumer.add(current.GetPrice());
		}
		return sumer;
	}
	
	public void AddProduct(Product param_Product)
	{
		arrProducts.add(param_Product);
	}
}
