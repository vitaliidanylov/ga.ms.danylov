import java.util.Arrays;

/**
 * Created by vit on 5/7/2016.
 */
public class GaMainClass {
    //matrix
    public static double[][] matrix = MatrixFromFile.readMatrixFromFile("K:\\GoogleDrive\\GitHub_project\\ga.ms.danylov\\src\\weight_matrix10.txt");

    public static void main(String[] args) {

        Population pop = new Population(10,10);
//        calcFitness.getAllFitness(pop);

        additionFunctions.crossoverPop(pop);

    }
}


