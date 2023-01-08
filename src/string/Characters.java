package string;

public class Characters {
    public static void main(String[] args) {
        String str="grass is greener on the other side";
        int[] freq= new int[str.length()];
        char minChar= str.charAt(0), maxChar= str.charAt(0);
        int i, j, min, max;
        char string[]=str.toCharArray();
        for (i=0;i<string.length;i++){
            freq[i]=1;
            for (j=i+1;j<string.length;j++){
                if (string[i]==string[j]&&string[i]!=' '&&string[i]!='O'){
                    freq[i]++;
                    string[j]='O';
                }
            }
        }
        min=max=freq[0];
        for (i=0; i<freq.length;i++){
            if (min>freq[i]&&freq[i]!='O'){
                min=freq[i];
                minChar=string[i];
            }
            if (max<freq[i]){
                max=freq[i];
                maxChar=string[i];
            }
        }
        System.out.println("Min" +minChar);
        System.out.println("Max"+maxChar);
    }
}
