package recursion_arrays;

import java.util.Arrays;

//Write recursive function that takes an array of words and returns an array containing all words capitalized
//example i/p : ["foo", "bar", "world"]  then o/p : ["FOO", "BAR", "WORLD"]
public class capitalizedLetters {

	static String[] capitalized(String[]s,int index) {
		if(s.length<=0){
			return s;
		}
		if(index==s.length) {
			return s;
		}
		s[index]=s[index].toUpperCase();
		return capitalized(s,index+1);
		
		
	}
	public static void main(String[] args) 
	{
		String[] s= {"foo","bar","world"};
		System.out.println(Arrays.toString(capitalized(s,0)));
	}

}
