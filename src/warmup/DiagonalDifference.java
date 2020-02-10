package warmup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int result = 0;
		
		int aux = arr.size()-1;
		for (int i = 0; i <= aux; i++) {
			result += arr.get(i).get(i); // Diagonal principal
			result -= arr.get(i).get(aux-i); // Diagonal secundaria
		}
		
		return Math.abs(result);
	}

//	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); // Leitura a partir do console

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); // Leitura a partir do console

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(Collectors.toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = DiagonalDifference.diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}