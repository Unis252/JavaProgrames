package Numbers;

public class ReverseOfANumber {

    public static void main(String[] args) {

        int number=123;
        int rev;

        while (number>0)
        {
            rev=number%10;
            System.out.print(rev);
            number=number/10;
        }
    }
}
