import java.util.*;

class Ceaser{
       
         public static final String alpha="abcdefghijklmnopqrstuvwxyz";
           
            public static String encrypted(String inp,int shift){
                   
                   inp=inp.toLowerCase();

                   String enc="";

                   for(int i=0;i<inp.length();i++){
                     
                     int pos=alpha.indexOf(inp.charAt(i));

                     int encpos=(shift + pos ) % 26;
                     char encChar = alpha.charAt(encpos);

                     enc+=encChar;

                   }
                   return enc;
            }

            public static String decrypted(String enc,int shift){
                  String dec="";

                  for(int i=0;i<enc.length();i++){
                        
                        int pos=alpha.indexOf(enc.charAt(i));

                        int decpos=(pos -shift) %26;

                        if(decpos < 0){
                              decpos = alpha.length() + decpos;
                        }

                        char decChar = alpha.charAt(decpos);
                        dec += decChar ;

                     
                  }
                   return dec;
            }
              
       public static void main(String[] args) {
              
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the string : ");
              String inp=sc.nextLine();
              System.out.println("Enter number of positions to shift:");
              int shift=sc.nextInt();

              System.out.println("Encrypted Data:" + encrypted(inp,shift));

                 System.out.println("Decrypted Data:" + decrypted(encrypted(inp,shift),shift));
       }
}