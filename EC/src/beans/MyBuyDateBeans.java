package beans;

import java.util.Date;

public class MyBuyDateBeans {

	private int totalPrice;
	private String deliveryMethodName;
	private Date buyDate;



	 public int getTotalPrice() {

		 return this.totalPrice;
	 }

	 public void setTotalPrice(int totalPrice) {

		 this.totalPrice=totalPrice;
	 }
	public String getDeliveryMethodName() {

		return this.deliveryMethodName;
	}

	public void setDeliveryMethodName(String deliveryMethodName) {

		this.deliveryMethodName=deliveryMethodName;
	}

	public Date getBuyDate() {

		return this.buyDate;
	}

	public void setBuyDate(Date buyDate) {

		this.buyDate=buyDate;
	}
	
	
}
