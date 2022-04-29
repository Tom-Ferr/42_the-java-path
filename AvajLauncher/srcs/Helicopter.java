public class Helicopter implements Flyable extends Aircraft{

private WeatherTower weatherTower

    Helicopter(String name, Coordinates coordinates){
        this.name = name;
        this.coordinates = coordinates;
    }
    public void updateConditions(){};
    public void registerTower(WeatherTower WeatherTower){}

};