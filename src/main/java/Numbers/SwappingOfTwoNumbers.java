package Numbers;

public class SwappingOfTwoNumbers {

    public static void main(String[] args) {

        int a=5,b=2;
/*        int c;
        c=a;
        a=b;
        b=c;

        System.out.println("After Swapping "+a+"    " +b);*/

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping "+a+"    " +b);
    }
}
