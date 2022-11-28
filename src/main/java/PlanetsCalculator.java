import java.util.HashMap;
import java.util.Map;

public class PlanetsCalculator {




    public double calculateAgeBySeconds(double seconds,String planet) {
        HashMap<String, Double> planets = new HashMap<>();
        planets.put("ziemia", 31557600.0);
        planets.put("merkury", 0.2408467);
        planets.put("wenus", 0.61519726);
        planets.put("mars", 1.8808158);
        planets.put("jowisz", 11.862615);
        planets.put("saturn", 29.447498);
        planets.put("uran", 84.016846);
        planets.put("neptun", 164.79132);

        double result;
        if (planet.equals("ziemia")){
            result = seconds / 31557600;
        }else
            result = seconds / ( 31557600 * planets.get(planet));
        return roundOff(result);
    }


    static double roundOff(double numberToRound){
        return Math.round(numberToRound * 100.0) / 100.0;
    }
}
