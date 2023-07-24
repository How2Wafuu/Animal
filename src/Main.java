public class Main {
public static void main (String[] args) {
  System.out.println("Welcome to the farm!");
  Cow Miki = new Cow();
  Miki.Sound();
    Miki.Eat();
  Pig Piggu = new Pig();
    Piggu.Sound();
    Duck Donald = new Duck();
    Donald.Sound();
    Donald.Clean(new Cow());
    Duck Daisy = new PekingDuck();
    Daisy.Clean(Donald);


  }
}