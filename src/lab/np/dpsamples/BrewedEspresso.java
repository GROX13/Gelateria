package lab.np.dpsamples;

/**
 * Covers gelato with brewed espresso
 * Concrete decorator implementation
 */
public class BrewedEspresso extends GelatoDecorator {

    /**
     * Initializes instance of BrewedEspresso decorator
     *
     * @param gelato
     *              The gelato to decorate
     */
    public BrewedEspresso(Gelato gelato) {
        super(gelato);
    }

    /**
     * Describes gelato covered with brewed espresso
     *
     * @return The description of gelato decorated with brewed espresso
     */
    @Override
    public String describe() {
        return super.describe() + " covered with brewed espresso";
    }
}
