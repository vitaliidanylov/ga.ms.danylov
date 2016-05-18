/**
 * Created by vit on 5/7/2016.
 */
public class calcFitness {

    /*Public methods*/
    //get fitness of chromosome
    static double getFitness(double[][] matrix, Chromosome ch){
        double fitness = 0;
        int    tmpInd = 0;

        if(isCon(matrix,ch)){
            for (int i = 0; i < ch.size(); i++) {
                if (ch.getGene(i) == 1){
                    fitness += matrix[tmpInd][i];
                    tmpInd = i;
                }
            }

        } else {
            System.out.println("Path doesn't exist!");
        }
        return 1/fitness;
    }

    //check if path exists
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
}
