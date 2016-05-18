package tests;

import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 * Created by vit on 5/18/2016.
 */
public class isInf {
    public static void main(String[] args) {
        double[][] array = {
            {Infinity,Infinity,5},
            {Infinity,2,Infinity},
            {Infinity,Infinity,24},
            {5,2,Infinity}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (Double.isInfinite(array[i][j])){
                    System.out.println("It's true");
                } else {
                    System.out.println("It's false");
                }
            }
        }
    }
}
