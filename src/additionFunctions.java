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
            arrOfFit[i] = sumOfFit/calcFitness.getFitness(GaMainClass.matrix, oldPop.chromosomes[i])*100;
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
        //counters
        int     newCtr = 0,
                cutPoint,
                point = oldPop.chromosomes[0].size();
        //parents
        Chromosome p1,
                   p2;
        //crate new population
        Population newPop = new Population(oldPop.size());

        //temporary array
        int[] tmpArray;

        while(newCtr != oldPop.size()){
            //crossover point
            cutPoint = 2 + (int)(Math.random() * ((point - 3) + 1));
            System.out.println("Cut point: "+cutPoint);

            //choose two chromosome randomly from old population
            p1 = Population.getRandChromo(oldPop);
            p2 = Population.getRandChromo(oldPop);

            //output Old
            System.out.println("Old output: ");
            System.out.println(p1.toString());
            System.out.println(p2.toString());

            //initialize tmp array
            tmpArray = new int[(oldPop.size()-1)-cutPoint];
            //change genes between two parents
            System.arraycopy(p1.getGenes(),cutPoint,tmpArray,0,(oldPop.size()-1)-cutPoint);
            System.arraycopy(p2.getGenes(),cutPoint,p1.getGenes(),cutPoint,(oldPop.size()-1)-cutPoint);
            System.arraycopy(tmpArray,0,p2.getGenes(),cutPoint,(oldPop.size()-1)-cutPoint);

            if (additionFunctions.isCon(GaMainClass.matrix,p1)){
                newPop.chromosomes[newCtr] = p1;
                newCtr++;
            } else if (additionFunctions.isCon(GaMainClass.matrix,p2)){
                newPop.chromosomes[newCtr] = p2;
                newCtr++;
            }

            //output New
            System.out.println("New output: ");
            System.out.println(p1.toString());
            System.out.println(p2.toString());
        }


        return newPop;
    }

}
