package tests;
import java.util.Arrays;

/**
 * Created by vit on 5/22/2016.
 */
public class Crossover {
    public static void main(String[] args) {
        int[] a = {12,25,33,41,5,6};
        int[] b = {0,0,0,0,0,0};

        Arrays.sort(a);
        System.out.println("Biggest values is: " + a[a.length-1]);
        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < 20; i++) {
//            int point = 2 + (int)(Math.random() * ((a.length - 3) + 1));
//            System.out.println(point);
//        }
//        System.out.println(Arrays.toString(crossOver(a,b)));
    }
    public static int[] crossOver(int[] a, int[] b){
        int point = 2 + (int)(Math.random() * ((a.length - 3) + 1));
        System.out.println("Point is: "+point);
        System.arraycopy(a,point,b,point,(a.length-point));
        System.arraycopy(b,1,a,1,point-1);
        return a;
    }
}
