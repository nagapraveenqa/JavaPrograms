package javaProg;

import java.util.Arrays;

public class ExtractNum {
	
	public static void extractNums(String str){
		String[] array=str.split("[^0-9]");
		System.out.println(Arrays.asList(array));
	}
	
	public static void main(String[] args) {
		String str="abc123";
		extractNums(str);
		
		
	}

}
