package lab.np.dpsamples;

/**
 * Gelato Factory
 * Used to create concrete gelato instances
 */

public class GelatoFactory {

    /**
     * Creates vanilla ice cream
     *
     * @return The instance of vaniglia
     */
    public static Gelato makeVaniglia() {
        return new VanigliaGelato();
    }

    /**
     * Creates Amarena
     *
     * @return The instance of amarena
     */
    public static Gelato makeAmarena() {

        // Make fior di latte gelato
        Gelato gelato = new FiorDiLatteGelato();

        // Blend (decorate) with sour cherry sauce
        gelato = new SourCherrySauce(gelato);

        return gelato;
    }

    /**
     * Creates Stracciatella
     *
     * @return The instance of stracciatella
     */
    public static Gelato makeStracciatella() {

        // Make fior di latte gelato
        Gelato gelato = new FiorDiLatteGelato();

        // Blend (decorate) with veins of chocolate
        gelato = new VeinsOfChocolate(gelato);

        return gelato;
    }

    /**
     * Creates instance of affogato al caffè
     *
     * @return  The instance of affogato al caffè
     */
    public static Gelato makeAffogatoAlCaffe(){

        // Make vaniglia
        Gelato gelato = makeVaniglia();

        //Cover with brewed espresso
        gelato = new BrewedEspresso(gelato);

        return gelato;
    }

    /**
     * Creates mixed gelato
     *
     * @param gelati
     *              gelati to mix
     *
     * @return Mixed gelato
     */
    public static Gelato createMix(Gelato... gelati){

        // Make gelato misto (mixed)
        CompositeGelato mix = new CompositeGelato();

        for (Gelato gelato: gelati){
             mix.add(gelato);
        }

        return mix;
    }
}
