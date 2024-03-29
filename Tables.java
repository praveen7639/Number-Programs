import java.util.*;

class Tables{
      public static void main(String[] args){
               Scanner in=new Scanner(System.in);
               System.out.println("Which table  do you want to create?");
               int n = in.nextInt();
               
               for(int i=1;i<=10;i++){
                     System.out.println(n+"*"+i+"="+n*i);
               }
      }
}