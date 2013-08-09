package lab.np.dpsamples;

/**
 * Cognac decorator
 */
public class CognacDecorator extends GelatoDecorator {

    public CognacDecorator(Gelato gelato) {
        super(gelato);
    }

    @Override
    public String describe() {
        return super.describe() + " with cognac";
    }
}
