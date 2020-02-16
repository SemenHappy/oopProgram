package collection;

public class Person {
    private String name;
    private String gender;
    private double age;

    public Person(String name, String gender, double age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
