public class PayrateCalculator {
	public static void calculatepay (String employee, double hourlyrate, double hours) {
		double weeklyPay = hourlyrate * hours;
		System.out.println(employee + ":" + weeklyPay);
	}
	
	public static void main (String[] args) {
		calculatepay("Fred", 12.50, 20.0);
		calculatepay("Amir", 15.00, 35.0);
		calculatepay("James", 15.00, 20.00);

	}
}