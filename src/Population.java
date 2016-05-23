/**
 * Created by vit on 5/13/2016.
 */
public class Population {
    //array if chromosomes
    Chromosome[] chromosomes;
    Chromosome ch;
    int ctr = 0;

    //Constructors
    public Population(int populationSize, int chSize) {
        chromosomes = new Chromosome[populationSize];
        //init population
        while(ctr < populationSize){
            ch = new Chromosome(chSize);
            if(additionFunctions.isCon(GaMainClass.matrix, ch)){
                saveChromosome(ctr,ch);
                ctr++;
            }
        }
    }

    public Population(int populationSize) {
        chromosomes = new Chromosome[populationSize];
    }

    /*Getters*/
    public Chromosome getChromosome(int index){
        return chromosomes[index];
    }

    /*Public methods*/
    public int size(){
        return chromosomes.length;
    }

    //save chromosome
    public void saveChromosome(int index, Chromosome chr){
        chromosomes[index] = chr;
    }

    //get random chromosome
    public static Chromosome getRandChromo(Population pop){
        Chromosome newChromosome;
        //choose random number in a range of population size
        int rand = (int) (Math.random()*pop.size());

        newChromosome = pop.chromosomes[rand];

        return newChromosome;
    }

    //print population
    public void printPopulation(){
        for (int i = 0; i < chromosomes.length; i++) {
            System.out.println(chromosomes[i].toString());
        }
    }

}
