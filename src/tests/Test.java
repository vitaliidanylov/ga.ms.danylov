package tests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by vit on 5/7/2016.
 */
public class Test {
    public static void main(String[] args) {
        double arr[][] = new double[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Double.POSITIVE_INFINITY;
            }
        }
        try {
            write("valera.txt", arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write (String filename, double[][] x) throws IOException {
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                outputWriter.write(x[i][j]+" ");
            }
            outputWriter.write("\n");
        }
        outputWriter.flush();
        outputWriter.close();
    }
}
