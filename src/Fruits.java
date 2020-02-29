public class Fruits {

       private String name;
       private int weight;
       private String colour;

    public Fruits(String name, int weight, String colour) {
        this.name = name;
        this.weight = weight;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}
