package Classes;

/**
 * Created by JPMPC-B215 on 11/10/2016.
 */
public abstract class Person {
    private String name;
    private boolean gender; // true for male; otherwise female
    private int age;
    private double weight; // in kilograms
    private double height; // in centimeters
    String email;

    Person() { }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String introduceYourSelf()
    {
        return this.name;
    }

    public String introduceYourSelf(String name)
    {
        return name;
    }

    public String introduceYourSelf(String name, String e)
    {
        return introduceYourSelf(name) + ", I'm from " + e;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGenderMale() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
