package lab.np.dpsamples;

/**
 * Gelato decorator
 * Decorates ice cream with coffee granules
 */
public class Coffee extends GelatoDecorator {

    public Coffee(Gelato gelato){
        super(gelato);
    }

    @Override
    public String describe() {
        return super.describe() + " with coffee granules";
    }
}
