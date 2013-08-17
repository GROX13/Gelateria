package lab.np.dpsamples;

/**
 * Adds veins of chocolate to gelato
 *
 * Concrete decorator implementation
 */
public class VeinsOfChocolate extends GelatoDecorator {

    /**
     * Initializes instance of VeinsOfChocolate decorator
     *
     * @param gelato
     *              The gelato to decorate with veins of chocolate
     */
    public VeinsOfChocolate(Gelato gelato){
        super(gelato);
    }

    /**
     * Describes gelato with veins of chocolate
     *
     * @return The description of gelato with veins of chocolate
     */
    @Override
    public String describe() {
        return super.describe() + " with veins of chocolate";
    }
}
