/**
 * Created by vit on 5/7/2016.
 */
public class calcFitness {

    public static int maxFitness = Integer.MAX_VALUE;

    /*Public methods*/
    //get fitness of chromosome
    static int getFitness(double[][] matrix, Chromosome ch){
        int  fitness = 0,
             tmpInd = 0;

        for (int i = 0; i < ch.size(); i++) {
               if (ch.getGene(i) == 1){
                   fitness += matrix[tmpInd][i];
                   tmpInd = i;
               }
        }
        return fitness;
    }

    //get general fitness
    public static double getAllFitness(Population pop){
        double sum = 0;
        int currentFitness;
        Chromosome maxChromo;

        for (int i = 0; i < pop.size(); i++) {
//            System.out.println(sum);
            currentFitness = calcFitness.getFitness(GaMainClass.matrix,pop.chromosomes[i]);
            sum += currentFitness;

            if(maxFitness > currentFitness){
                maxFitness = currentFitness;
            }
        }
        return sum;
    }


//    //get max fitness
//    public static double getMaxFitness(Population pop){
//        int maxFit;
//        int arrayOfFit[] = new int[pop.size()];
//
//        for (int i = 0; i < pop.size(); i++) {
//            arrayOfFit[i] = calcFitness.getPathLength(GaMainClass.matrix, pop.chromosomes[i]);
//        }
//
//
//        return maxFit;
//    }
//
//    static int getPathLength(double[][] matrix, Chromosome ch){
//        int    length = 0,
//               tmpInd = 0;
//
//        for (int i = 0; i < ch.size(); i++) {
//            if (ch.getGene(i) == 1){
//                length += matrix[tmpInd][i];
//                tmpInd = i;
//            }
//        }
//        return length;
//    }

}
