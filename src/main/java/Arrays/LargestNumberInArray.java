package Arrays;

public class LargestNumberInArray {

    public static void main(String[] args) {

        int[]a={22,66,1,88,90,111,5};

        int MaxValue=a[0];

        for(int i=1;i<a.length-1;i++)
        {
            if(a[i]>MaxValue)
            {
                MaxValue=a[i];
            }
        }
        System.out.println("Largest Number in Array is "+MaxValue);
    }

}
