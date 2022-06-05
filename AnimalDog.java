class Dog {
    String color;
    String name;

    void sleeping() {
        System.out.println("dog is sleeping");
    }
}

public class AnimalDog {
    public static void main (String args[])
    {
        Dog d1 = new Dog();
        d1.color = "red";
        Dog d2 = d1;
       
        d2.color = "purple";
        d2.name = "petty";
        


        System.out.println(d1.color);
        System.out.println(d1.name);
        System.out.println(d2.color);
        System.out.println(d2.color);
     d1.sleeping();

}

}
