import java.util.Arrays;

/**
 * Created by vit on 5/7/2016.
 */
public class GaMainClass {
    //matrix
    public static double[][] matrix = MatrixFromFile.readMatrixFromFile("K:\\GoogleDrive\\GitHub_project\\ga.ms.danylov\\src\\weight_matrix10.txt");

    public static void main(String[] args) {

        Population pop = new Population(10,10);
        Population newPop;

        for (int i = 0; i < pop.size(); i++) {
            System.out.println(pop.chromosomes[i].toString());
        }

        System.out.println("");
        System.out.println("New population");

        newPop = additionFunctions.selectionPop(pop);
        for (int i = 0; i < pop.size(); i++) {
            System.out.println(newPop.chromosomes[i].toString());
        }
//        double a = calcFitness.getAllFitness(pop);
//        System.out.println(a);
    }
}


