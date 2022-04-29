public class JetPlane implements Flyable extends Aircraft{

private WeatherTower weatherTower

    JetPlane(String name, Coordinates coordinates){
        this.name = name;
        this.coordinates = coordinates;
    }
    public void updateConditions(){};
    public void registerTower(WeatherTower WeatherTower){}

};