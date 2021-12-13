package classes;

public class Animal {

    public int age;
    public String commonName;
    public String food;
    public String individualName;

    public Animal (String commonName, String individualName, String food, int age) {

        this.age = age;
        this.commonName = commonName;
        this.food = food;
        this.individualName = individualName;

    }

    public String getStats() {

        return String.format("name: %s | common name: %s | food: %s | age: %d", this.individualName, this.commonName, this.food, this.age);

    }
    public String eatsWhat() {
        return String.format("%s likes to eat: %s", this.commonName, this.food);
    }
}