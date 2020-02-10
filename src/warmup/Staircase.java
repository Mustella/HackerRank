package warmup;

import java.util.Scanner;

public class Staircase {

	static void staircase(int n) {
		for (int i = 0; i < n; i++) {
			int degraus = i+1;
			System.out.print(new String(new char[n-degraus]).replace('\0', ' '));
			System.out.println(new String(new char[degraus]).replace('\0', '#'));
		}
    }

	// Locale.setDefault(new Locale("en", "US", "WIN"));

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}

}