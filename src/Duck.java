public class Duck extends Animal implements Flyable{
    public void Sound(){
        System.out.println("Quack");
    }
    public void Eat(){
        System.out.println("Nom Nom");
    }
    public void Clean(Animal animal){

        System.out.println("I am cleaning " + animal.getClass().getName());

    }

    @Override
    public void fly() {
        System.out.println("Flop Flop Flop");
    }

    @Override
    public void Glide() {
        System.out.println("Glide Glide Duck go Glide");
    }
}
