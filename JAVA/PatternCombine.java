public class PatternCombine{


public  static void main(String args[]){


int rows = 4;

for(int i=1;i<=rows;i++){

for(int j=1;j<=i;j++){

System.out.print(j+" ");
}
System.out.println();

}


for(int i=1;i<=rows;i++){

for(int j=rows;j>=i;j--){

System.out.print(j+" ");
}
System.out.println();

}

}

}