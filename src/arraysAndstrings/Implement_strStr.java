//28. Implement strStr()
//needle and haystack problem

package arraysAndstrings;

public class Implement_strStr {
	public static void main(String[] args) {
		String hay = "hello";
		String ne = "ll";
		strStr(hay, ne);
		System.out.print(strStr(hay, ne));
		
	}
	public static int strStr(String haystack, String needle) {
		int haylen = haystack.length();
		int nelen = needle.length();
		int sublen = haylen - nelen;
		if(haylen < nelen) {
			return -1;
		}else if(nelen == 0) {
			return 0;
		}
		for(int i = 0; i<= sublen; i++) {
			if(haystack.substring(i, i+nelen).equals(needle)) {
				return i;
			}
			
		}
		
		return -1;
	}

}
