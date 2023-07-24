public class Owl extends Animal implements Flyable{
    public void Sound(){
        System.out.println("Hoot");
    }

    public void Eat(){
        System.out.println("Nom Nom");
    }
    @Override
    public void fly() {
        System.out.println("Owl flies away!");

    }

    @Override
    public void Glide() {
        System.out.println("Glide Glide Owl go Glide");
    }
}
