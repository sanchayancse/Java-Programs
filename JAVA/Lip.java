import java.util.Scanner;


public class Lip{

public static void main(String []args){

int lipr;
Scanner sc = new Scanner (System.in);
lipr = sc.nextInt();
if(((lipr%4 == 0) && (lipr%100 != 0)) || (lipr%400 == 0) )
{
	System.out.println("Liper");
	}
	else{
	System.out.println("Not Liper");
	}
}
}