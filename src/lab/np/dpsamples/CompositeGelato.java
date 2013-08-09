package lab.np.dpsamples;

import java.util.ArrayList;


/**
 * Composite ice cream
 */
public class CompositeGelato implements Gelato {

    ArrayList<Gelato> mix = new ArrayList<Gelato>();

    public String describe() {
        StringBuilder output = new StringBuilder(mix.size() * 15);

        output.append(this.mix.get(0).describe());

        for (int i = 1; i < this.mix.size(); i++) {
            output.append(" and ");
            output.append(this.mix.get(i).describe());
        }

        return output.toString();
    }

    /**
     * Adds gelato to mix
     * @param gelato
     */
    public void add(Gelato gelato) {
        this.mix.add(gelato);
    }

    /**
     * Removes gelato from mix
     * @param gelato
     */
    public void remove(Gelato gelato) {
        this.mix.remove(gelato);
    }
}
