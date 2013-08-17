package lab.np.dpsamples;

/**
 * Abstract decorator of gelato
 */
public abstract class GelatoDecorator implements Gelato {

    protected Gelato gelato;

    /**
     * Initializes instance of gelato decorator.
     *
     * @param gelato
     *              The gelato to decorate
     */
    protected GelatoDecorator(Gelato gelato) {
        this.gelato = gelato;
    }

    /**
     * Delegates description operation to inner gelato instance.
     *
     * @return The description of inner gelato
     */
    @Override
    public String describe(){

        //delegation
        return this.gelato.describe();
    }
}
