public class SimpleInterest {

	private double amount;
	private double years;
	private double rateOfInterest;
	public SimpleInterest() {
		
	}
	public SimpleInterest(double amount, double years, double rateOfInterest) {
		super();
		this.amount = amount;
		this.years = years;
		this.rateOfInterest = rateOfInterest;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getYears() {
		return years;
	}
	public void setYears(double years) {
		this.years = years;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public double getInterest() {
		return amount*years*rateOfInterest/100;
	}

}
