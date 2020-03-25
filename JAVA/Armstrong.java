import java.util.*;


public class Armstrong{

	public static void main(String []args){

		int r,sum=0,temp;
		int n;
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		temp=n;
		while(n>0){

			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
			}

			if (temp==sum){
				System.out.println("Armstrong");

				}
				else{

					System.out.println("Not an Armstrong");
					}
		}

	}