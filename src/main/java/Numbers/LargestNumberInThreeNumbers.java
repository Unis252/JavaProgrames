package Numbers;

public class LargestNumberInThreeNumbers {

    public static void main(String[] args) {

        int a=100,b=200,c=300;

        int i = a > b ? a : b;

        int LargestNumber=i>c?i:c;

        System.out.println("largest Number is   "+LargestNumber);


    }
}
