public class MyClass {
    // ================= HANOI TOWERS ================
    public static void hanoi(int disk, String from, String temp, String goal){
        if (disk == 1) 
        System.out.println("Disk 1 moves from "+from+" to "+goal);
        else
        {
            hanoi(disk-1, from , goal, temp);
            System.out.println("Disk "+disk+" moves from "+ from+" to "+goal);
             hanoi(disk-1,temp, from , goal);
        }
    }
    // ============  SUM OF NUMBERS ==================
      public static int triangle(int n){
          if (n==1) return n;
          else return n+ triangle(n-1);
      }
      // ============  FACTORIAL OF NUMBER ==================
        public static int factorial(int n){
          if (n==1) return n;
          else return n * factorial(n-1);
      }
      // ============  REVERSE STRING ==================
       public static String reverse(String str){
           if (str.length() == 1) return str;
           else
           {
               return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
           }
         }
         
         // ============  iS STRING A PALINDROME ==================
       public static boolean isPalindrome(String str){
           if (str.length() ==1 || str.length() ==0 ) return true;
           else 
           {
               if (str.charAt(0)==str.charAt(str.length()-1)) 
             return  isPalindrome(str.substring(1,str.length()-1));
           }
           return false;
       }
    public static void main(String args[]) {
        String z = "toppot";
        
         System.out.println(isPalindrome(z) ? " Yes" : "No");
         System.out.println(triangle(12));
         System.out.println();
         System.out.println(factorial(7));
          System.out.println(reverse("Reverse Me!"));
         hanoi(3, "A","B","C");
    }
}
