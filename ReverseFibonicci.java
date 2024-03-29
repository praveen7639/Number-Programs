import java.util.*;

public class ReverseFibonicci{
     public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter no of terms");
          int n=sc.nextInt();

          int n1=34;
          int n2=21;
          int n3=1;
          System.out.print(n1+","+n2+",");          
                 while(n3!=0){
                 n3=n1-n2;
                 System.out.print(n3+",");
                 n1=n2;
                 n2=n3;
                 }
     }
}