/**
 * Created by vit on 5/7/2016.
 */
public class Chromosome {

    public int defChLength = 10;
    public int[] genes = new int[defChLength];

    public Chromosome() {
        generateChromosome();
    }

    public Chromosome(int defChLength) {
        this.defChLength = defChLength;
        genes = new int[defChLength];
        generateChromosome();
    }

    //generate random chromosome
    public void generateChromosome(){
        for (int i = 0; i <  size(); i++) {
            byte gene = (byte) Math.round(Math.random());
            genes[i] = gene;
            setGene(0, (byte) 1);
            setGene(size()-1, (byte) 1);
        }
    }

    /*getters and setters*/
    // if we want to change chromosome length
    public void setDefaultChromoLength(int length){
        defChLength = length;
    }

    public int getGene(int index){
        return genes[index];
    }

    public void setGene(int index, byte value){
        genes[index] = value;
    }

    /*public methods*/
    public int size(){
        return genes.length;
    }
    @Override
    public String toString() {
        String geneString = "";
        for (int i = 0; i < size(); i++) {
            geneString += getGene(i);
        }
        return geneString;
    }
}
