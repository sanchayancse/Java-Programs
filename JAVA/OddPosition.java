import java.util.*;
public class OddPosition {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {4,3,6,5,1,8,8};

        System.out.println("Elements of given array present on odd position: ");
        //Loop through the array by incrementing value of i by 2


		int count=arr.length/2;
		//System.out.println(count);
		int [] brr= new int[count];
		int j=0;
        for (int i = 1; i < arr.length; i = i+2,j++) {

			brr[j]=arr[i]*arr[i];
			System.out.println(brr[j]);
        }
		String str=Arrays.toString(brr);
		String str1=str.replaceAll(",","").replace("[","").replace("]","");
		String str2=str1.replaceAll("\\s","");
		System.out.println(str2);
		int a= str2.length();
		System.out.println(str2.substring(0,4));


    }
}