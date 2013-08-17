package lab.np.dpsamples;

/**
 * Adds a little cognac to gelato.
 * Concrete decorator implementation
 */
public class Cognac extends GelatoDecorator {

    /**
     * Initializes instance of Cognac decorator
     *
     * @param gelato
     *              The gelato to decorate with cognac
     */
    public Cognac(Gelato gelato) {
        super(gelato);
    }

    /**
     * Adds cognac to gelato description
     *
     * @return The description of decorated gelato
     */
    @Override
    public String describe() {
        return super.describe() + " blended with cognac";
    }
}
