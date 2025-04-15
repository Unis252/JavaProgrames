package Numbers;

public class SumOfDigitsInAgivenNumber {

    public static void main(String[] args) {

        int number=12345,sum=0;

        while (number>0)
        {
            sum=sum+number%10;
            number=number/10;
        }

        System.out.println("Sum of digits in a given number is  "   +sum);
    }
}
