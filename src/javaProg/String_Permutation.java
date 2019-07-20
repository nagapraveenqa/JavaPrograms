package javaProg;
/* I/P : "abc"
 * O/P : abc, acb, bca, bac, cab, cba
 */

public class String_Permutation {
	private void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);//ABC->BAC//CBA->
				permute(str, l + 1, r);//BCA
				str = swap(str, l, i);//CBA
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {

		// String str="abc";
		String str = "ABC";
		int n = str.length();
		String_Permutation permutation = new String_Permutation();
		permutation.permute(str, 0, n - 1);

	}
}
