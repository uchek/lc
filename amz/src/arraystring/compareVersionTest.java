package arraystring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class compareVersionTest {

	@Test
	void testCompVer() {

		arraystring.compareVersion cv = new arraystring.compareVersion();
		
		int ret = cv.compVer("1.2", "1.2");
		assertEquals(0, ret);
		
		ret = cv.compVer("1.2", "1");
		assertEquals(1, ret);
		
		ret = cv.compVer("1.2", "1.2.1");
		assertEquals(-1, ret);
	
		// will fail since the 2nd ver len greater. look at the 2nd solution
//		ret = cv.compVer("1", "1.0");
//		assertEquals(0, ret);
	}
	
	@Test
	void testCompVer1() {

		arraystring.compareVersion cv = new arraystring.compareVersion();
		
		int ret = cv.compVer1("1.2", "1.2");
		assertEquals(0, ret);
		
		ret = cv.compVer1("1.2", "1");
		assertEquals(1, ret);
		
		ret = cv.compVer1("1.2", "1.2.1");
		assertEquals(-1, ret);
	
		ret = cv.compVer1("1", "1.0");
		assertEquals(0, ret);
	}

}
