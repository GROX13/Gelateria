
/*
    Gelateria

    Amarena: Fior di Latte blended with a sour cherry sauce
      Vaniglia: Vanilla
    Stracciatella: Fior di Latte with veins of chocolate

     Bacio: Hazelnut
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
     Tiramisù: Gelato version of the Italian dessert
     Zuppa Inglese: Cookies and sherry are mixed into a custard-flavored gelato

*/

package lab.np.dpsamples;

public class Main {

    public static void main(String[] args) {

        Gelato amarena = GelatoFactory.makeAmarena();
        Gelato stracciatella = GelatoFactory.makeStracciatella();
        Gelato vanillaWithCognac = GelatoFactory.makeVaniglia();

        vanillaWithCognac = new Cognac(vanillaWithCognac);

        Gelato amarenaAndVanillaWithCognac = GelatoFactory.createMix(amarena, vanillaWithCognac);

        System.out.println(stracciatella.describe());
        System.out.println(amarenaAndVanillaWithCognac.describe());
    }
}
