import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine().trim());
		
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String cases = br.readLine().trim();
		    char arr[] = cases.toCharArray();
		    
		    int count1=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]=='1')
		           count1++;
		    }
		    
		   int a = (count1*(count1-1))/2;
		    
		    
		    System.out.println(a);
		}
	}
}