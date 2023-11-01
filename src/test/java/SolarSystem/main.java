package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys = new solarSystemBasics();
        solarsys.Sun = "1";
        solarsys.Moon = "2";
        solarsys.Planets = "3";
        solarsys.Stars = "4";

        FeatureSun Sun = new FeatureSun();
        Sun.name ="panther";
        Sun.colour="black";
        Sun.temp="-1223124kelvin";
    }
}
