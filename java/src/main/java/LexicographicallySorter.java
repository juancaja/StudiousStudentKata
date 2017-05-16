package java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import com.sun.deploy.util.StringUtils;

public class LexicographicallySorter {

	public String sort(String input) {
		List<String> result = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new StringReader(input))) {
			String line = reader.readLine();
			int number = Integer.parseInt(line);
			String sortedLine;

			for (int i = 0; i < number; i++) {
				line = reader.readLine();
				sortedLine = lexicographicallySortLine(line);
				result.add(sortedLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return StringUtils.join(result, "\n");
	}

	private String lexicographicallySortLine(String line) {
		String[] words = line.substring(2).split("\\s+");

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return (a + b).compareTo(b + a);
			}
		};

		Arrays.sort(words, comparator);

		String result = "";
		for (String word: words) {
			result += word;
		}
		return result;
	}

}
