package iceberg;

public class Coordinates {
    private final int longitude;
    private final int latitude;

    public Coordinates(int longitude, int latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }
    
}
