package org.bughunter;

import org.bughunter.arrays.TwoDimensionArray;

import java.util.Arrays;

public class Main_02 {
    public static void main(String[] args) {
        int[][] int2DArray;
        int2DArray = new int[2][2];
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        System.out.println(Arrays.deepToString(int2DArray));

        String s2DArray[][] = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(s2DArray));

        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(3,3);
        twoDimensionArray.insertValueInTheArray(0,0,10);
        twoDimensionArray.insertValueInTheArray(0,1,20);
        twoDimensionArray.insertValueInTheArray(1,0,30);
        twoDimensionArray.insertValueInTheArray(2,0,40);

        System.out.println(Arrays.deepToString(twoDimensionArray.arr));
        twoDimensionArray.deleteValueFromArray(0,0);
        System.out.println(Arrays.deepToString(twoDimensionArray.arr));
    }
}
