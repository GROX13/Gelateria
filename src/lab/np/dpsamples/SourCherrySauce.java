package lab.np.dpsamples;

/**
 * Sour cherry sauce decorator
 */
public class SourCherrySauce extends GelatoDecorator{

    public SourCherrySauce(Gelato gelato) {
        super(gelato);
    }

    @Override
    public String describe() {
        return super.describe() + " blended with a sour cherry sauce";
    }
}
