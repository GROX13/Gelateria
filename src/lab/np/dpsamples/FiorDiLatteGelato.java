package lab.np.dpsamples;

/**
 * Gelato Fior di Latte ("Flower of Milk" Gelato)
 * This is a simple gelato, very versatile; enjoy it plain, with fresh fruit, or to accompany a cake.
 * This gelato is often used in the preparation of affogato al caffè, where the gelato is covered with brewed espresso and topped with whipped cream.
 * See more at: http://enthusiasts.ciachef.edu/gelato-fior-di-latte
 */
public class FiorDiLatteGelato implements Gelato {

    /**
     * Describes the fior di latte gelato
     *
     * @return The short description of fior di latte gelato
     */
    @Override
    public String describe() {
        return "\"Flower of Milk\" Gelato";
    }
}
