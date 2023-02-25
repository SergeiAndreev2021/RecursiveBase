// Euclid algorithm for gcd
public class MyClass {
     
     public static int divider(int a, int b) {
         if (b == 0) return a;
         int r = a % b;
         return divider(b,r);
     }
   
    public static void main(String args[]) {
       System.out.println(divider(144,2068));
    }
}
