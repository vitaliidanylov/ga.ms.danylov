import java.util.Arrays;

/**
 * Created by vit on 5/19/2016.
 */
public class additionFunctions {

    //check path for validation
    public static boolean isCon(double[][] arr, Chromosome ch){
        boolean res = false;
        int point = 0;

        for (int i = 1; i < arr.length; i++) {
            if((ch.getGene(i)==1)&&(arr[point][i]>0)&&!Double.isInfinite(arr[point][i])){
                point = i;
                continue;
            }
            if((ch.getGene(i) == 1) && Double.isInfinite(arr[point][i])){
                res = false;
                break;
            }
            res = true;
        }

        return res;
    }

    //selection function
    public static Population selectionPop(Population oldPop){
        //counter to track how many chromosome in new population
        int     ctrNew = 0,
                ctrOld = 0;
        //get sum of all fitness
        double sumOfFit = calcFitness.getAllFitness(oldPop);
        //array of fitness of each chromosome
        double[] arrOfFit = new double[oldPop.size()];
        //create new population
        Population newPop = new Population(oldPop.size());
        //count each fitness of population
        for (int i = 0; i < oldPop.size(); i++) {
            arrOfFit[i] = calcFitness.getFitness(GaMainClass.matrix, oldPop.chromosomes[i])/sumOfFit;
        }

        double rand;
        while(ctrNew < newPop.size()){
            rand = Math.random();
            if (rand<arrOfFit[ctrOld]){
                newPop.chromosomes[ctrNew] = oldPop.chromosomes[ctrOld];
                ctrNew++;
            } else {
                ctrOld++;
                if (ctrOld == oldPop.size()){
                    ctrOld=0;
                }
            }
        }

        return newPop;
    }

    //crossover function
    public static Population crossoverPop(Population oldPop){
        //crate new population
        Population newPop = new Population(oldPop.size());
        //cut point
        int cutPoint = 2 + (int)(Math.random() * ((oldPop.chromosomes[0].size() - 3) + 1));

        return newPop;
    }

}
