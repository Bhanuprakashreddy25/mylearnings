public class StepsToMiles {
	public static double stepstomiles(int steps) {
		double miles = (double) steps / 2000;
		return miles;
	}
		public static void main(String[] args) {
		System.out.println("500 Steps is equal to " + stepstomiles(500) + "miles");
		System.out.println("2000 Steps is equal to " + stepstomiles(2000) + "miles");
		System.out.println("3000 Steps is equal to " + stepstomiles(3000) + "miles");

	}
}