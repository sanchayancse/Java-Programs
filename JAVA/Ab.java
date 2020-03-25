import java.io.*;

public class Ab {

public static void main(String [] args) throws Exception{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	String str[]=br.readLine().split(" ");
	long sum=0;
	long min = Long.parseLong(str[0]);
	long max = Long.parseLong(str[0]);
	for(int i=0;i<n;i++){
		long ele =Long.parseLong(str[i]);
		sum+=ele;
		if(max<ele)
		max=ele;
		if(min>ele)
		min=ele;


		}
		System.out.println((sum-max)+" "+(sum-min));
	}

}