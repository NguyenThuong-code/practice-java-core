import java.util.Scanner;

public class Flinter {
   public static int n;
    public static String stringNumber(int n){
        if(n%3==0&n%4==0&n%5==0){
          return "HelloFlintersVietnam";
        }else if(n%3==0&n%4==0){
            return "HelloFlinters";
        }else if(n%5==0){
            return "Vietnam";
        }else if(n%4==0){
            return "Flinters";
        }else if(n%3==0){
            return "Hello";
        }else {
            return "";
        }
    }
    public static void main(String[] args) {
        System.out.println(stringNumber(11));
    }
}
