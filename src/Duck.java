public class Duck extends Animal implements Flyable{
    public void Sound(){
        System.out.println("Quack");
    }
    public void Eat(){
        System.out.println("Nom Nom");
    }
    public void Clean(Animal animal){

        System.out.println(this + " is cleaning " + animal.toString());

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
