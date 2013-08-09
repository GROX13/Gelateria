package lab.np.dpsamples;

/**
 * Created with IntelliJ IDEA.
 * User: Niko
 * Date: 8/3/13
 * Time: 7:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class VeinsOfChocolate extends GelatoDecorator {

    public VeinsOfChocolate(Gelato gelato){
        super(gelato);
    }

    @Override
    public String describe() {
        return super.describe() + " with veins of chocolate";
    }
}
