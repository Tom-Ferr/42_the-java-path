public class Baloon implements Flyable extends Aircraft{

private WeatherTower weatherTower

    Baloon(String name, Coordinates coordinates){
        this.name = name;
        this.coordinates = coordinates;
    }
    public void updateConditions(){};
    public void registerTower(WeatherTower WeatherTower){}

};