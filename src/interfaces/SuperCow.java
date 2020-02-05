package interfaces;

public class SuperCow implements Cloneable, Comparable<SuperCow> {
    private double power = 100;
    private String name;
    public SuperCow(){

    }
    private SuperCow(double power, String name){
        this.power = power;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
      //  return super.clone();
        return new SuperCow(power, name);
    }

    @Override
    public String toString() {
        return "SuperCow{" +
                "power=" + power +
                ", name='" + name + '\'' +
                '}';
    }

    public void print(){
        System.out.println("SuperCow");


    }

//    @Override
//    public int compareTo(Object o) {
//        return (int) (this.power -  ((SuperCow) o).power);
//        //return 0;
//    }

    @Override
    public int compareTo(SuperCow o) {
        return (int) (power - o.power);
    }
}
