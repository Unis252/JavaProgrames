package Arrays;

import java.util.Arrays;

public class ReverseOfAnArray {

    public static void main(String[] args) {

        int[]a={1,9,20,44,100,98,4};

        int left=0;
        int right=a.length-1;

        while(left<right)
        {
            int temp=a[right];
            a[right]=a[left];
            a[left]=temp;
            right--;
            left++;
        }
        System.out.println("Reversed array is "+ Arrays.toString(a));
    }
}
