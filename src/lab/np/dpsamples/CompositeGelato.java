package lab.np.dpsamples;

import java.util.ArrayList;


/**
 * Gelato misto (mixed)
 * Safe implementation of composite pattern
 */
public class CompositeGelato implements Gelato {

    ArrayList<Gelato> mix = new ArrayList<Gelato>();

    /**
     * Describes gelato misto (mixed)
     *
     * @return The description of gelato misto
     */
    @Override
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
     *
     * @param gelato
     */
    public void add(Gelato gelato) {
        this.mix.add(gelato);
    }

    /**
     * Removes gelato from mix
     *
     * @param gelato
     */
    public void remove(Gelato gelato) {
        this.mix.remove(gelato);
    }
}
