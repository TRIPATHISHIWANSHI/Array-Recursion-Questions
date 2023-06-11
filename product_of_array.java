package recursion_arrays;

import java.util.ArrayList;

//Write a recursive function that takes a list of numbers as an input and return product of all numbers in list
public class product_of_array 
{
	static int product=1;
	//stack int retuen type
	static int product_of_array(int [] a,int index) 
	{
		if(index==a.length) {
			return product;
		}
		product=a[index]*product;
		return product_of_array(a,index+1);
		
	}
	//stack void return type
	static void product_of_array2(int []a,int index,int result) {
		if(index==a.length) {
			System.out.println(result);
			return;
		}
		result=result*a[index];
		product_of_array2(a,index+1,result);
		
	}
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7,8,9,10,2,1};
		System.out.println("PRODUCT OF ALL THE NUMBERS IN LIST "+product_of_array(a,0));
		// to check result System.out.println(1*2*3*4*5*6*7*8*9*1
		product_of_array2(a,0,1);
	}

}
