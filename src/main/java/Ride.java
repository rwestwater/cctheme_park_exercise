import java.util.ArrayList;

public class Ride {

    private String name;
    private String model;
    private int minAge;
    private int minHeight;

    public Ride(String name, String model, int minAge, int minHeight){
        this.name = name;
        this.model = model;
        this.minAge = minAge;
        this.minHeight = minHeight;
        }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getMinAge(){
        return minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }


}
