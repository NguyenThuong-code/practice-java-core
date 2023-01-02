import java.text.DecimalFormat;

public class NumberToWord {
    private static final String[] twoDigits= {"", "Ten", "Twenty","Thirty","Forty", "Fifty", "Sixty","Seventy","Eighty", "Ninety"};
    private static final String[] oneDigits={"","One","Two","Three", "four","Five","Six", "Seven", "Eight", "Nine","Ten","Eleven", "Twelve", "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private NumberToWord(){}
    private static String convertUpToThousand(int number){
        String soFar;
        if(number%100<20){
            soFar=oneDigits[number%100];
            number=number/100;
        }else {
            soFar=oneDigits[number%10];
            number=number/10;
            soFar=twoDigits[number%10]+soFar;
            number=number/10;
        }
        if (number==0)
            return soFar;
        return oneDigits[number]+"Hundred"+soFar;
    }
    public static String convertNumberToWord(long number){
        if (number==0){
            return "zero";
        }
        String num=Long.toString(number);
        String pattern= "000000000000";
        DecimalFormat decimalFormat= new DecimalFormat(pattern);
        num= decimalFormat.format(number);
        int billions= Integer.parseInt(num.substring(0,3));
        int millions= Integer.parseInt(num.substring(3,6));
        int hundredThousands=Integer.parseInt(num.substring(6,9));
        int thousand= Integer.parseInt(num.substring(9,12));
        String tradBillions;
        switch (billions){
            case 0:
                tradBillions="";
                break;
            case 1:
                tradBillions= convertUpToThousand(billions)+" Billion ";
                break;
            default:
                tradBillions=convertUpToThousand(billions)+" Billion ";

        }
        String result= tradBillions;
        String traMillions;
        switch (millions){
            case 0:
                traMillions= convertUpToThousand(millions)+" Million ";
                break;
            default:
                traMillions= convertUpToThousand(millions)+" Million ";
        }
        result=result+traMillions;
        String tradHundredThousands;
        switch (hundredThousands) {
            case 0:
                tradHundredThousands = "";
                break;
            case 1:
                tradHundredThousands = "One Thousand ";
                break;
            default:
                tradHundredThousands = convertUpToThousand(hundredThousands) + " Thousand ";

        }result=result+tradHundredThousands;
                String tradThousand;
                tradThousand=convertUpToThousand(thousand);
                result=result+tradThousand;

        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }

    public static void main(String[] args) {
        System.out.println(convertNumberToWord(2));
        System.out.println(convertNumberToWord(99));
        System.out.println(convertNumberToWord(456));
        System.out.println(convertNumberToWord(1101));
        System.out.println(convertNumberToWord(19812));
        System.out.println(convertNumberToWord(674319));
        System.out.println(convertNumberToWord(909087531));
        System.out.println(convertNumberToWord(1000000000));
        System.out.println(convertNumberToWord(359999999));
        System.out.println(convertNumberToWord(1213000000L));
        System.out.println(convertNumberToWord(1000000));
        System.out.println(convertNumberToWord(1111111111));
        System.out.println(convertNumberToWord(3000200));
        System.out.println(convertNumberToWord(700000));
        System.out.println(convertNumberToWord(9000000));
    }
}
