package Arrays;

import java.util.Arrays;

public class MoveAllZerosToEndOfArray {

    public static void main(String[] args) {

        int[]a={1,0,3,0,2,0,0,8};
        int length=a.length;
        int[]temp=new int[length];
        int tempIndex=0;


        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                temp[tempIndex]=a[i];
                tempIndex++;

            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
