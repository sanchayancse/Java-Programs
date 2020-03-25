

public class MaxMinArray{

public static void main(String args[]){

	int[] a ={10,20,2,5,70,100};
int max=a[0];
int min=a[0];
for(int i=1;i<a.length;i++)
	{

		if(max<a[i]){

			max=a[i];

			}

					if(min>a[i]){

						min=a[i];
					}

		}
System.out.println(min+" " +max);
	}

}