package Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[]a={1,22,50,90,100,2,5,95};

        int FirstMax=Integer.MIN_VALUE;
        int SecondMax=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>FirstMax)
            {
                SecondMax=FirstMax;
                FirstMax=a[i];
            } else if (a[i]>SecondMax) {
                {
                    SecondMax=a[i];
                }

            }
        }
        System.out.println("Second Largest Number in given array is "+SecondMax);
    }
}
