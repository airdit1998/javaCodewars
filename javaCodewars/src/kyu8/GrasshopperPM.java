package kyu8;

public class GrasshopperPM {

    static String greet(String name, String owner) {
        return (name.toLowerCase().equals(owner.toLowerCase())) ? "Hello boss" : "Hello guest";
    };
}
