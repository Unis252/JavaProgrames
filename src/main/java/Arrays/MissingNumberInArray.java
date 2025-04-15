package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int[]a={1,2,4,5,6,7};

        int ExpectedNoOFElements=a.length+1;
        int ExpectedSum=ExpectedNoOFElements*(ExpectedNoOFElements+1)/2;
        System.out.println("Total sum of all Elements in array is "+ExpectedSum);
        int ActualSum=0;

        for(int i=0;i<a.length;i++)
        {
            ActualSum=a[i]+ActualSum;
        }

        System.out.println("Missing number in given array is "+(ExpectedSum-ActualSum));

        int[] b={100,200,500,700,1000};
        List<Integer> missingNumbers = new ArrayList<>();

        for(int i=0;i<b.length-1;i++)
        {
            int current=b[i];
            int next = b[i+1];
            int diff=next-current;

            if(diff>100)
            {
                for(int j=current+100;j<next;j=j+100)
                {
                    missingNumbers.add(j);
                }

            }



        }
        System.out.println("Missing numbers are : " +missingNumbers);
    }


}
