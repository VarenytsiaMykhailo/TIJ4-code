public class Dog {

    String name;

    String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot";
        spot.name = "hav hav";
        Dog scruffy = new Dog();
        scruffy.name = "scruffy";
        scruffy.says = "aff aff";

        System.out.println("spot: " + spot.name + " " + spot.says);
        System.out.println("scruffy: " + scruffy.name + " " + scruffy.says);

        Dog newDog = new Dog();
        spot = newDog;

        System.out.println(spot == newDog);
        System.out.println(spot.equals(newDog));
    }
}
