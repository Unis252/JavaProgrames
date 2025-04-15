package Arrays;

import java.util.Arrays;

public class RotationOfArray {

    public static void main(String[] args) {

        int[]a={1,2,3,4,5,6,7,8};
        int rotate=3;
        int length=a.length-1;
        System.out.println(length);
        int[] temp=new int[length];

        for(int i=0;i<length;i++)
        {
            //temp[(rotate+i)%length]=a[i];
            temp[(i - rotate + length) % length] = a[i];
        }

        System.out.println("Array after rotating" + Arrays.toString(temp));
    }
}
