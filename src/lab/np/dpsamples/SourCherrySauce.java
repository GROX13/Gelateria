package lab.np.dpsamples;

/**
 * Created with IntelliJ IDEA.
 * User: Niko
 * Date: 8/5/13
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
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
