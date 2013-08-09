package lab.np.dpsamples;

/**
 * Document it
 */
public abstract class GelatoDecorator implements Gelato {

    protected Gelato gelato;

    protected GelatoDecorator(Gelato gelato) {
        this.gelato = gelato;
    }

    public String describe(){
        return this.gelato.describe();
    }
}
