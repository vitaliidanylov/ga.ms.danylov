/**
 * Created by vit on 5/7/2016.
 */
public class calcFitness {
    /*Public methods*/
    //get fitness of chromosome
    static double getFitness(double[][] matrix, Chromosome ch){
        double fitness = 0;
        int    tmpInd = 0;

        for (int i = 0; i < ch.size(); i++) {
               if (ch.getGene(i) == 1){
                   fitness += matrix[tmpInd][i];
                   tmpInd = i;
               }
        }

        return 1/fitness;
    }

    //get general fitness
    public static double getAllFitness(Population pop){
        double sum = 0;
        for (int i = 0; i < pop.size(); i++) {
//            System.out.println(sum);
            sum += calcFitness.getFitness(GaMainClass.matrix,pop.chromosomes[i]);
        }
        return sum;
    }

}
