package recursion_arrays;

public class HighestElement {
	//using stack return int type
	static int highestElement(int[] ar,int index,int highest) {
		
		if(index==ar.length) {
			return highest;
		}
		highest=(ar[index]>highest?ar[index]:highest);
		return highestElement(ar,index+1,highest);
	}
	public static void main(String[] args) 
	{
		int [] a= {1,6,2,99,23,45,66,-100,0};
		System.out.println("HIGHEST ELEMENT IN THE ARRAY is:"+highestElement(a,0,0));
		int [] a2= {-1,-6,-2,-99,-23,-45,-66,-100,0};
		System.out.println("HIGHEST ELEMENT IN THE ARRAY is:"+highestElement(a2,0,0));
	}

}
