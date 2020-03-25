import java.io.*;
import java.util.*;

public class My{

public static void main(String []args) throws Exception {
int n,m,o;
Scanner sc = new Scanner(System.in);
  n=sc.nextInt();
  m=sc.nextInt();
  o=sc.nextInt();
String[] str1= new String [n];

for (int i = 0; i < n; i++)
{ String userInput = sc.next();
str1[i] = userInput; }



String[] str2= new String [m];

for (int i = 0; i < m; i++)
{ String userInput = sc.next();
str2[i] = userInput; }
String[] str3= new String [o];

for (int i = 0; i < o; i++)
{ String userInput = sc.next();
str3[i] = userInput; }



String outstr =" ";

 char[] a = str1.toCharArray();

char[] b = str2.toCharArray();

char[] c = str3.toCharArray();



for(char k : a ){
	System.out.println(k);
	}








}

}


