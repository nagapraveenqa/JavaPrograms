package javaProg;

public class String_RevString {
	public static String rev;
	//With Loop
	public static void revStringWithLoop(String str){
		System.out.println("With Loop : ");
		rev="";
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+ch[i];
		}
		System.out.println("String before Reverse : "+str+"\nString after Reverse : "+rev);
	}
	
	//With String Builder
	public static void revStringWithStringBuilder(String str){
		System.out.println("\nWith String Builder : ");
		StringBuilder sb=new StringBuilder(str);
		System.out.println("String before Reverse : "+str+"\nString after Reverse : "+sb.reverse());
	}
	
	public static void main(String[] args) {
		String str="java";
		revStringWithLoop(str);
		revStringWithStringBuilder(str);
	}
}
