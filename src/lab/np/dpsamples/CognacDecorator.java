package lab.np.dpsamples;

/**
 * Adds a little cognac to ice cream.
 * Concrete decorator implementation
 */
public class CognacDecorator extends GelatoDecorator {

    /**
     * Constructor
     * @param gelato
     */
    public CognacDecorator(Gelato gelato) {
        super(gelato);
    }

    /**
     * Decoration
     *
     * @return description
     */
    @Override
    public String describe() {
        return super.describe() + " blended with cognac";
    }
}
