public class ReverseNumber {
    public static void main(String[] args) {
        int n= 120456;

 int revert=0;
         for (;n!=0; n=n/10){
             int remain=n%10;
             revert=revert*10+remain;

         }
        System.out.println(n);


    }
}
