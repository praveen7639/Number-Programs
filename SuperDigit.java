import java.util.*;

class SuperDigit{
         
         public static void main(String[] args){
               Scanner sc= new Scanner(System.in);
               System.out.println("Enter the number:");
               int num =sc.nextInt();

               int res=isSuperDigit(num);
               System.out.println(res);

         }

         public static int isSuperDigit(int num){
               int sum=0;
               int rem=0;

                 while(num!=0 || sum>9){

                    if (num == 0){  
                        num = sum;  
                        sum = 0;  
                    }                             
                       rem=num%10;
                       sum=sum+rem;
                       num/=10;
                 }
                 return sum;
         }

}