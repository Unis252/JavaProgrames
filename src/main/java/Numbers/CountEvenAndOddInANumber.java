package Numbers;

public class CountEvenAndOddInANumber {

    public static void main(String[] args) {

        int number=1234567;
        int evenCount=0,oddCount=0,temp;

        while (number>0)
        {
            temp=number%10;

            if(temp%2==0)
            {
                evenCount++;
            }else oddCount++;

            number=number/10;
        }

        System.out.println("In Given number Even count is"+"    "+evenCount +"   "+"Odd Count is "   +oddCount);
    }
}
