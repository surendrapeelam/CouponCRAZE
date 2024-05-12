package coupon;

import java.util.Date;

public class Transaction {

	private Customer customer;
	private Product product;
	private Coupon coupon;
	private double totalPrice;
	private Date date;
	
	
	public Transaction(Customer customer, Product product, Coupon coupon, double totalPrice, Date date) {
		super();
		this.customer = customer;
		this.product = product;
		this.coupon = coupon;
		this.totalPrice = totalPrice;
		this.date = date;
	}


	public Transaction(Customer customer, Product product, Coupon coupon, double totalPrice) {
		this.customer = customer;
		this.product = product;
		this.coupon = coupon;
		this.totalPrice = totalPrice;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Coupon getCoupon() {
		return coupon;
	}


	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	} 	
	
	
	
}
