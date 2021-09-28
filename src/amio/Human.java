package amio;

public class Human {
    String name;
    int age;
    double weight;
    Human(String name,int age,double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void play(){
        System.out.println(this.name+ " is playing Football!!!");

    }
    void dance(){
        System.out.println(this.name+ " is Dancing on the floor....");
    }

}
