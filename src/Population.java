/**
 * Created by vit on 5/13/2016.
 */
public class Population {
    //array if chromosomes
    Chromosome[] chromosomes;

    //Constructors
    public Population(int populationSize, boolean initialize) {
        chromosomes = new Chromosome[populationSize];
        //init population
        if(initialize){
            //loop and create chromosomes
            for (int i = 0; i < size(); i++) {
                Chromosome newChromo = new Chromosome();
                newChromo.generateChromosome();
                saveChromosome(i,newChromo);
            }
        }
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
}
