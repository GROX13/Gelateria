/*
	Amarena: Fior di Latte blended with a sour cherry sauce
Bacio: Hazelnut
Caffè: Coffee
Cannella: A lightly cinnamon-flavored gelato
Cioccolato: Chocolate
Crema: Custard
Dulce de Leche: Sweetened milk/caramel-flavored gelato
Fragola: Strawberry
Frutti di Bosco: Mixed berry gelato
Gelato di Banana: Banana
Limone: Lemon
Liquirizia: Licorice gelato
Malaga: A rum-raisin flavored gelato
Menta: Mint
Noce di Cocco: Coconut
Panna Cotta: Cooked cream
Pesca: Peach
Pistacchio: Pistachio
Puffo: A blue, anise-flavored gelato
Riso: Gelato with bits of rice; like a rice pudding
Stracciatella: Fior di Latte with veins of chocolate
Tiramisù: Gelato version of the Italian dessert
Vaniglia: Vanilla
Zuppa Inglese: Cookies and sherry are mixed into a custard-flavored gelato
	* */

package lab.np.dpsamples;

public class Main {

    public static void main(String[] args) {

        Gelato fiorDiLatte = new FiorDiLatte();
        Gelato amarena = new SourCherrySauce(fiorDiLatte);
        Gelato stracciatella = new VeinsOfChocolate(fiorDiLatte);
        Gelato vaniglia = new Vaniglia();
        CompositeGelato misto = new CompositeGelato();
        misto.add(amarena);
        misto.add(vaniglia);
        misto.add(stracciatella);

        System.out.println(misto.describe());
    }
}
