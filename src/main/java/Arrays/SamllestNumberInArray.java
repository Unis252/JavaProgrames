package Arrays;

public class SamllestNumberInArray {

    public static void main(String[] args) {

        int[]a={22,66,1,88,90,111,5};

        int MinValue=a[0];

        for(int i=1;i<a.length-1;i++)
        {
            if(a[i]<MinValue)
            {
                MinValue=a[i];
            }
        }
        System.out.println("Smallest Number in Array is "+MinValue);
    }
}
