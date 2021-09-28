package amio;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Alex",24,70);
        Human h2 = new Human("xiaomi",34,70);
        Human h3 = new Human("Rock",29,76);


        System.out.println(h1.name);
        System.out.println(h2.weight);
        System.out.println(h3.age);

        h1.play();
        h3.dance();


	
    }
}
