package lab.np.dpsamples;

/**
 * Adds coffee granules to gelato
 * Concrete decorator implementation
 */
public class CoffeeGranules extends GelatoDecorator {
    /**
     * Initializes instance of CoffeeGranules decorator
     *
     * @param gelato
     *              The gelato to decorate with coffee granules
     */
    public CoffeeGranules(Gelato gelato) {
        super(gelato);
    }

    /**
     * Adds coffee granules to gelato description
     *
     * @return The description of decorated gelato
     */
    @Override
    public String describe() {
        return super.describe() + " with coffee granules";
    }
}
