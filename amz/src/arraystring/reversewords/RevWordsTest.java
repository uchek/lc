package arraystring.reversewords;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RevWordsTest {

	@Test
	void test() {
		RevWords rw = new RevWords();
		
		String s = "helo king man cobra";
		
		//char []ac = s.toCharArray();
		//rw.rWords(ac);
		
		
		char []ac1 = s.toCharArray();
		rw.rWords1(ac1);
		System.out.println(ac1);
		
	}

}
