package arraystring;

public class compareVersion {
	public int compVer(String ver1, String ver2) {
		String [] ver1Arr = ver1.split("\\.");
		String [] ver2Arr = ver2.split("\\.");
		
		int len = ver2Arr.length;
		
		if (ver1Arr.length < ver2Arr.length) {
			len = ver1Arr.length;
		}
		
		for (int i=0; i < len; i++) {
			if (Integer.parseInt(ver1Arr[i]) > Integer.parseInt(ver1Arr[i])) {
				return 1;
			}
			if (Integer.parseInt(ver1Arr[i]) < Integer.parseInt(ver1Arr[i])) {
				return -1;
			}
		}
		
		if (ver1Arr.length > ver2Arr.length) {
			return 1;
		} 
		
		if (ver1Arr.length < ver2Arr.length) {
			return -1;
		} 
		
		return 0;
	}
	
	public int compVer1(String ver1, String ver2) {
		String [] ver1Arr = ver1.split("\\.");
		String [] ver2Arr = ver2.split("\\.");
		
		int len = Math.max(ver1Arr.length, ver2Arr.length);
		
		for (int i=0; i < len; i++) {
			Integer v1 = i < ver1Arr.length ? Integer.parseInt(ver1Arr[i]):0;
			Integer v2 = i < ver2Arr.length ? Integer.parseInt(ver2Arr[i]):0;
			
			int comp = v1.compareTo(v2);
			if (comp != 0) {
					return comp;
			}
		}
		
		return 0;
	}

	void printArr(String []s) {
		System.out.printf("Len: %d\n", s.length);
		for(int i=0; i< s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
