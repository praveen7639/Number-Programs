class NPrimeNumbers{
         public static void main(String[] args){
                int count=0,n=5,num=2;
                while(count!=n){
                       boolean prime=true;
                       for(int i=2;i<Math.sqrt(num);i++){
                              if(num%i==0){
                                   prime=false;
                              }
                       }
                       if(prime){
                              count++;
                              System.out.println(num);
                       }
                       num++;
                }
         }
}