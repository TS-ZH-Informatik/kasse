package juventus.cashbox.business;
import java.math.BigDecimal;
import java.util.ArrayList;

import juventus.cashbox.persistence.Coin;
import juventus.cashbox.persistence.Order;

public class CashBox {
	private ArrayList<Order> arrOrder;
	private ArrayList<Coin> arrCoins;
	private BigDecimal bigdecCashBoxMoney;
	
	public CashBox()
	{
		arrOrder = new ArrayList<Order>();
		arrCoins = new ArrayList<Coin>();
		
		Coin coinOne = new Coin("Einfraenkler", 1.00);
		Coin coinTwo = new Coin("Zweifraenkler", 2.00);
		Coin coinFive = new Coin("Fuenflieber", 5.00);
		
		this.arrCoins.add(coinOne);
		this.arrCoins.add(coinTwo);
		this.arrCoins.add(coinFive);
		
		this.bigdecCashBoxMoney = BigDecimal.valueOf(100.00).setScale(2);
		
	}
	
	public CashBox(double param_doubCashBoxMoney)
	{
		arrOrder = new ArrayList<Order>();
		
		this.bigdecCashBoxMoney = BigDecimal.valueOf(param_doubCashBoxMoney);
	}
	
	
	public void NewOrder()
	{
		Order order = new Order();
		arrOrder.add(order);
	}
	
	public void SetCashBoxMoney(double param_Money)
	{
				
		this.bigdecCashBoxMoney = BigDecimal.valueOf(param_Money);
	}
	
	public void AddCashBoxMoney(double param_Money)
	{
				
		this.bigdecCashBoxMoney = BigDecimal.valueOf(bigdecCashBoxMoney.doubleValue() + param_Money);
	}
	
	public BigDecimal GetCashBoxMoney()
	{
		
		return this.bigdecCashBoxMoney;
	}
	
	public ArrayList<Coin> GetAllCoins()
	{
		return this.arrCoins;
	}
	
	public Coin GetCoinById(int param_Index)
	{
		return this.arrCoins.get(param_Index);
	}
	
	public Coin GetCoinByName(String param_Name)
	{
		for(int i=0; this.arrCoins.size()>i ; i++)
		{
			if(this.arrCoins.get(i).GetName() == param_Name)
			{
				return this.arrCoins.get(i);
			}
		}
		return null;
	}
}
