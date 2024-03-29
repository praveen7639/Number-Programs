class PrimeNumberWhile{
        public static void main(String[] args){
                int num=3;
                int i=2;
                boolean prime=true;
                while(i <= num/2){
                       if(num % i ==0){
                           prime=false;
                           break;
                       }
            i++;
                }
                System.out.println(prime);
        }
}