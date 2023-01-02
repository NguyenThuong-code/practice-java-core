public class AutomorphicNumber {
    public static String automorphic(int n){
        int square = n*n;
       while (n>0){
          if (n%10!=square%10)
              return "Not Auto";
              n=n/10;
           square=square/10;
       }
       return "Auto";
    }
    public static void main(String[] args) {
        System.out.println(automorphic(6));
        System.out.println(automorphic(5));
    }
}
