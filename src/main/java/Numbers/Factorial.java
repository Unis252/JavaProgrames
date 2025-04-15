package Numbers;

public class Factorial {

    public static void main(String[] args) {

        int number=5,factorial=1;

        for(int i=number;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of given number is "+factorial);
    }
}
