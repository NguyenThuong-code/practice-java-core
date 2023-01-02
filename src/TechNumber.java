public class TechNumber {
    public static void main(String[] args) {
        int n, num ,firstHaft , secondHaft, digits=0, squareOfSum =0;
        n= 2025;
        num=n;
        while ( num>0){
            digits++;
            num=num/10;
        }if (digits%2==0){
            num=n;
            firstHaft=num%(int) Math.pow(10, digits/2);
            secondHaft= num/(int) Math.pow(10, digits/2);
            squareOfSum=(firstHaft+secondHaft)*(firstHaft+secondHaft);
        if(n==squareOfSum){
            System.out.println(n+"is tech");
        }else {
            System.out.println(n+"not tech");
        }
        }
    }
}
