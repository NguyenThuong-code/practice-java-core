package string;

public class DivideString {
    public static void main(String[] args) {
        String str= "aaabbbcccddd";
        int len = str.length();
        int n=2;
        int temp=0, chars=len/n;
        String[] equalStr= new String[n];
        if (len%n!=0){
            System.out.println("Cannot divided"+ n);
        }else {
            for (int i=0;i<len;i=i+chars){
                String part =str.substring(i, i+chars);
                equalStr[temp]=part;
                temp++;
            }
            System.out.println(n+"equal parts");
            for (int i=0;i<equalStr.length;i++){
                System.out.println(equalStr[i]);
            }
        }
    }
}
