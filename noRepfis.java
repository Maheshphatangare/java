public class noRepfis {

        public static void main(String[] args)   {
              
              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Enter any String text");
              
              String str = scanner.nextLine().toLowerCase();
              
               char ch;
               boolean status = false;
              
              Map<Character,Integer> strmap = new HashMap<Character,Integer>();
              
               for(int i=0;i<str.length();i++) {
                     
                      ch = str.charAt(i);
                     
                      if(strmap.get(ch)==null) {
                           
                            strmap.put(ch,1);
                           
                     } else {
                           
                            strmap.put(ch, strmap.get(ch)+1);
                     }
              
              }
              
              
               for(int i=0;i<str.length();i++) {
                     
                      char d = str.charAt(i);
                     
                      if(strmap.get(d)==1) {
                           
                           System.out.println("First non-repeated character in the given string is: "+d);
                            status = true;
                            break;
                     }
                     
              }
              
               if(!status) {

                     System.out.println("There is no unique character in the given string");
              }
              
               scanner.close();
          
       }
}
