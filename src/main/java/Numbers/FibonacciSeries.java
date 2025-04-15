package Numbers;

public class FibonacciSeries {

    public static void main(String[] args) {

        int firstTerm=0,secondTerm=1,thirdTerm, num=10;

        System.out.print(firstTerm+" "+secondTerm+" ");
        for(int i=1;i<=num;i++)
        {
            thirdTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
            System.out.print(thirdTerm+" ");
        }
    }
}
