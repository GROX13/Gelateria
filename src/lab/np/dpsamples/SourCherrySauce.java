package lab.np.dpsamples;

/**
 * Adds sour cherry sauce to gelato
 * Concrete decorator implementation
 */
public class SourCherrySauce extends GelatoDecorator{

    /**
     * Initializes instance of sour cherry sauce decorator
     * @param gelato
     */
    public SourCherrySauce(Gelato gelato) {
        super(gelato);
    }

    @Override
    public String describe() {
        return super.describe() + " blended with a sour cherry sauce";
    }
}
