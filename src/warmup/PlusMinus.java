package warmup;

import java.util.Locale;
import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
		
		Locale.setDefault(new Locale("en", "US", "WIN"));
		double positive = 0.0;
		double negative = 0.0;
		double zeros = 0.0;

		for (int i : arr) {
			if (i > 0)
				positive++;
			else
				if (i < 0)
					negative++;
				else
					zeros++;
		}
		System.out.println(String.format("%.6f", (positive/arr.length)));
		System.out.println(String.format("%.6f", (negative/arr.length)));
		System.out.println(String.format("%.6f", (zeros/arr.length)));
    }
	
	//Locale.setDefault(new Locale("en", "US", "WIN"));
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
	
}