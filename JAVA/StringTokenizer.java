import java.util.StringTokenizer;
public class StringTokenizer{

	public static void main(String []args){

		String s = "Hello World";

		StringTokenizer st =new StringTokenizer(s);

		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			}

		}
	}