
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        System.out.println("Vasya weight: " + vasya.getWeight());

        while (vasya.getWeight() >= 1000)
            vasya.meow();
        System.out.println("Vasya weight: " + vasya.getWeight());
        System.out.println("Vasya: " + vasya.getStatus());

        Cat murka = new Cat();
        System.out.println("Murka weight: " + murka.getWeight());
        murka.feed(murka.getWeight() + 20);
        System.out.println("Murka weight: " + murka.getWeight());

        Cat pussy = new Cat();
        System.out.println("Pussy weight: " + pussy.getWeight());
        pussy.feed(pussy.getWeight() + 4000);
        System.out.println("Pussy weight: " + pussy.getWeight());
        System.out.println("Pussy: " + pussy.getStatus());

        Cat valera = new Cat();
        System.out.println("Valera weight: " + valera.getWeight());

        Cat choppa = new Cat();
        System.out.println("Choppa weight: " + choppa.getWeight());

    }
}