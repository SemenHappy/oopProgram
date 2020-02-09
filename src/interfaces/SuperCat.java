package interfaces;

public class SuperCat implements Ability, Cloneable, Comparable<SuperCat> {
    private String name;
    private double strength;

    public SuperCat() {

    }




    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void fight() {
        System.out.println("i can fight");

    }

    @Override
    public void rebuild() {
        System.out.println("i can rebuild my strength");

    }

    @Override
    protected SuperCat clone() throws CloneNotSupportedException {
        return (SuperCat) super.clone();

    }

    @Override
    public String toString() {
        return "SuperCat{" +
                "power=" + strength +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrenght(double strenght) {
        this.strength = strenght;
    }

    @Override
    public int compareTo(SuperCat o) {
        return (int) (strength - o.strength);
    }
}
