class A
{

public static void main(String []args){


try{
int [] a=new int[5];
//int m=7/0; //ArithmeticException
//After Arithmetic exception,next try statement will not be executed.
System.out.println("WIll never executed");
a[10]=50;  //ArrayIndexOutOfBoundsException
}
/*catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Exception:"+e.getMessage());
}*/
catch(ArithmeticException e){
	System.out.println("Exception:"+e.getMessage());
}
catch(NullPointerException e){
	System.out.println("Exception:"+e.getMessage());
}
finally{
System.out.println("End of try - multiple catch");
}

}
}