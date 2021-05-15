package OOP1;

public class Addition {

	int x;
	int y;

	void add() {
		int sum = x + y;
		System.out.println(sum);
	}

	int add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
		return sum;
	}

	double add(double a, double b, double c) {
		double sum = a + b + c;
		System.out.println(sum);
		return sum;

	}

	public static void main(String[] args) {

		Addition a1 = new Addition();
		a1.add(10, 10, 10);
		a1.x = 10;
		a1.y = 20;

	}// end of main

}// end of Addition
