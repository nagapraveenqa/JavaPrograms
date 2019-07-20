/* i/p : "aaabbabcccdd"
 * o/p : "a4b3c3d2"
 */

package javaProg;

import java.util.Arrays;

public class CharCounnt {

	public static String charCount(String str) {
		String s = "";
		int count = 1;
		char[] chrArr = str.toCharArray();
		// Arrays.sort(chrArr);
		for (int i = 0; i < chrArr.length - 1; i++) {
			if (i <=(chrArr.length - 1)) {
				if (chrArr[i] == chrArr[i + 1]) { 
					count++;
				} else {
					s = s + chrArr[i] + count; // 1//2//3//4
					count = 1;
				}
			} else if(chrArr[i-1] == chrArr[i]) {
				
				s = s + chrArr[i] + count;
			}
			else{
				s = s + chrArr[i] +1;
			}

		}
		return s;
	}

	public static void main(String[] args) {
		String str = "aaabbabcccdd";
		String str1 = "aaaabbbddddeeeef";
		System.out.println(charCount(str1));
	}

}
