package StarAndOtherPatterns;

public class AlphabeticPatterns {

    public static void main(String[] args) {

/*      A
        A B
        A B C
        A B C D
        A B C D E
*/
        int alpha=65;
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(alpha+j)+" ");
            }

            System.out.println();
        }

        System.out.println("-----------------------------------");


/*      A
        B B
        C C C
        D D D D
*/
        int Alpha2=65;
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)alpha+" ");

            }
            alpha++;
            System.out.println();
        }

    }
}
