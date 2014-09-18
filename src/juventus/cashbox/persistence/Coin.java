package juventus.cashbox.persistence;

import java.math.BigDecimal;

public class Coin {
	
	private String strName;
	private BigDecimal bigdecPrice;
	
	public Coin(String param_Name, Double param_Price)
	{
		this.strName = param_Name;
		this.bigdecPrice = new BigDecimal(param_Price);
	}
	
	public void SetName(String param_strName)
	{
		this.strName = param_strName;
	}
	
	public String GetName()
	{
		return this.strName;
	}
	
	public void SetPrice(Double param_Price)
	{
		this.bigdecPrice = new BigDecimal(param_Price);
	}
	
	public BigDecimal GetPrice()
	{
		return this.bigdecPrice;
	}

}
