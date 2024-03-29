public class Fibo{
       public static void main(String[] args){
             int num=22;
             int n1=0,n2=1,nextTerm;
             boolean flag=false;
             if(num==0 || num==1){
                   flag=true;
             }
             while(num<=num){
                      nextTerm=n1+n2;
                      if(nextTerm==num){
                          flag=true;
                          break;
                      }
                      n1=n2;
                      n2=nextTerm;
                 }
                  if(flag){
                    System.out.println("present");
                  }
                  else{
                       System.out.println("not present");
                  
             }
       }
}