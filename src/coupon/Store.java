package coupon;

import java.util.List;

public class Store {

	private List<Product> products;
	private List<Coupon> coupons;
	private List<Transaction> transactions;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Coupon> getCoupon() {
		return coupons;
	}

	public void setCoupon(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void editProduct(Product product, String newName, double newPrice) {

		product.setName(newName);
		product.setPrice(newPrice);
	}

	public void removeProduct(Product product) {
		products.remove(product);
	}

	public void addCoupon(Coupon coupon) {
		coupons.add(coupon);
	}

	public void removeCoupon(Coupon coupon) {
		coupons.remove(coupon);
	}

	public void handleTransaction(Customer customr, Product product, Coupon coupon) {

		double totalprice = product.getPrice();
		if (coupon != null && coupon.isValid()) {
			double discountAmount = totalprice * coupon.getDiscountPercentage() / 100;
			totalprice -= discountAmount;
			coupon.setValid(false);
		}
		Transaction transaction = new Transaction(customr, product, coupon, totalprice);
		transactions.add(transaction);

		System.out.println("Transaction completed : " + transaction.getDate() + "customer " + customr.getName()
				+ "product " + product.getName() + "totalprice " + totalprice);
	}
	
	public static void main(String[] args) {
	}
}
