package SolarSystem;

public class SolarSystem {
    public static void main(String[] args) {
        SolarSystemBase solar = new SolarSystemBase();
        solar.sun = "1";
        solar.planet = "2";
        solar.star = "2";
        System.out.println("the solar system is ready");

        //...
        FeatureSun xros = new FeatureSun();
        xros.color = "pink";
        xros.temp = "100";
        xros.size = "9km";

        //...
        Planet1 renox = new Planet1();
        renox.color = "grey";
        renox.size = "100km";
        renox.radius = "50km";

        //..
        Planet2 perox = new Planet2();
        perox.color = "white";
        perox.size = "100000km";
        perox.radius = "50000km";
    }
}
