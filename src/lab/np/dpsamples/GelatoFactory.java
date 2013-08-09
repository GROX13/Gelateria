package lab.np.dpsamples;

/**
 * Gelato Factory
 * Factory method pattern implementation
 */

public class GelatoFactory {

    /**
     * Creates vanilla ice cream
     *
     * @return
     */
    public static Gelato createVaniglia() {
        return new Vaniglia();
    }

    /**
     * Creates Amarena
     *
     * @return
     */
    public static Gelato makeAmarena() {
        // Make ice cream
        Gelato gelato = new FiorDiLatte();

        // Blend (decorate) with sour cherry sauce
        gelato = new SourCherrySauce(gelato);

        return gelato;
    }

    /**
     * Creates stracciatella
     * @return Stracciatella
     */
    public static Gelato createStracciatella() {
        // Make ice cream
        Gelato gelato = new FiorDiLatte();

        // Blend (decorate) with veins of chocolate
        gelato = new VeinsOfChocolate(gelato);

        return gelato;
    }

    public static Gelato createMix(Gelato... gelati){

        CompositeGelato mix = new CompositeGelato();

        for (Gelato gelato: gelati){
             mix.add(gelato);
        }

        return mix;
    }
}
