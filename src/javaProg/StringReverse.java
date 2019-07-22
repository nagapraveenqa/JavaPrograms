package javaProg;

public class StringReverse {
	
	public static String reverseString(String str){
		String revStr="";
		String[] strArr=str.split(" ");
		
		for(String each:strArr){
		String rev=""+each.charAt(0);
		for(int i=each.length()-1;i>0;i--){
			rev=rev+each.charAt(i);
		}
		revStr=revStr+rev+" ";
		}
		return revStr;
	}
	
	public static void main(String[] args) {
		String str="Good Morning";
		System.out.println(reverseString(str));
	}
}
