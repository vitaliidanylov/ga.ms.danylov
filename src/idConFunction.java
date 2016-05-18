import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 * Created by vit on 5/18/2016.
 */
public class idConFunction {
    public static void main(String[] args) {
        double[][] array = new double[][]
                {{0, 4, 5, Infinity, Infinity},
                {4, 0, 6, 7, Infinity},
                {5, 6, 0, Infinity, 4},
                {Infinity, 7, Infinity, 0, 2},
                {Infinity, Infinity, 4, 2, 0}
        };

        Chromosome ch = null;
        ch.setDefaultChromoLength(5);
        ch = new Chromosome();
        ch.generateChromosome();
        System.out.println(ch.toString());
//        System.out.println(getFitness(array,ch));

    }

//    static double getFitness(double[][] matrix, Chromosome ch){
//        double fitness = 0;
//        int    tmpInd = 0;
//
//        if(isCon(matrix,ch)){
//            for (int i = 0; i < ch.size(); i++) {
//                if (ch.getGene(i) == 1){
//                    fitness += matrix[tmpInd][i];
//                    tmpInd = i;
//                }
//            }
//
//        } else {
//            System.out.println("Path doesn't exist!");
//        }
//        return 1/fitness;
//    }

//    public static boolean isCon(double[][] arr, Chromosome ch){
//        boolean res = false;
//        int point = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if((ch.getGene(i)==1)&&(arr[point][i]>0)&&!Double.isInfinite(arr[point][i])){
//                point = i;
//                continue;
//            }
//            if((ch.getGene(i) == 1) && Double.isInfinite(arr[point][i])){
//                res = false;
//                break;
//            }
//            res = true;
//        }
//
//        return res;
//    }
}
