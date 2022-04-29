public class Coordinates{
    private int longitude;
    private int latitude;
    private int height;

    private Coordinates(int longitude, int latitude, int height){
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude(){
        return this.longitude;
    }
    public int getLatitude(){
        return this.latitude;
    }
    public int getHeight(){
        return this.height;
    }

    static Coordinates createPosition(int longitude, int latitude, int height){
        return new Coordinates(longitude, latitude, height);
    }

}