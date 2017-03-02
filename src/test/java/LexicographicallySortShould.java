import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class LexicographicallySortShould {

	LexicographicallySorter lexicographicallySorter = new LexicographicallySorter();

	@Test
	public void sortSimpleSample() {
		String input =
				"5\n" +
				"6 facebook hacker cup for studious students\n" +
				"5 k duz q rc lvraw\n" +
				"5 mybea zdr yubx xe dyroiy\n" +
				"5 jibw ji jp bw jibw\n" +
				"5 uiuy hopji li j dcyi";

		String expected =
				"cupfacebookforhackerstudentsstudious\n" +
				"duzklvrawqrc\n" +
				"dyroiymybeaxeyubxzdr\n" +
				"bwjibwjibwjijp\n" +
				"dcyihopjijliuiuy\n";

		assertThat(lexicographicallySorter.sort(input), is(expected));
	}
}
