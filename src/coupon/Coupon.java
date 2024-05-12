package coupon;

public class Coupon {

	private String code;
	private double discountPercentage;
	private boolean valid;
	
	
	public Coupon(String code, double discountPercentage, boolean valid) {
		super();
		this.code = code;
		this.discountPercentage = discountPercentage;
		this.valid = valid;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
