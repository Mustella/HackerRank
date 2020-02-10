package warmup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareTriplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		Integer[] arr = {0, 0};
		
		for (int i = 0; i < 3; i++) { // avaliar as notas de 0 a 2
			if (a.get(i) > b.get(i))
				arr[0]++; // Ponto para Alice
			else if (a.get(i) < b.get(i))
				arr[1]++; // Ponto para Bob
		}
		
		List<Integer> returnList = Arrays.asList(arr);

		return returnList;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); //Leitura a partir do console

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> result = compareTriplets(a, b);

		bufferedWriter.write(result.stream().map(Object::toString).collect(Collectors.joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}