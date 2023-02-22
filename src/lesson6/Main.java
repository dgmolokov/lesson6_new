package lesson6;

public class Main {
  public static void main(String[] args) {
    var dog = new Dog(500, 10, 1);
    var cat = new Cat(200, 2);
    System.out.println(dog.run(400));
    System.out.println(dog.run(600));
    System.out.println(dog.swim(1));
    System.out.println(dog.swim(11));
    System.out.println(dog.jumpOver(1));
    System.out.println(dog.jumpOver(2));
    System.out.println(cat.run(100));
    System.out.println(cat.run(300));
    System.out.println(cat.swim(1));
    System.out.println(cat.jumpOver(1));
    System.out.println(cat.jumpOver(3));
  }
}
