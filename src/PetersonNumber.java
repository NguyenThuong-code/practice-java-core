public class PetersonNumber {
   static void isPeter(int n){
int num =n;
int sum =0;
while (n>0){
    int digit =n%10;
    sum+=factorial(digit);
    n=n/10;
}
if (sum==num){
    System.out.println("is Pete");
}else {
    System.out.println("Not");
}
    }
   static int factorial(int number){
       int x =1;
       int fac=1;
       for(int i=1; i<= number; i++){
          fac= fac*i;
       }
       return fac;
   }
    public static void main(String[] args) {
       isPeter(773);
    }
}
