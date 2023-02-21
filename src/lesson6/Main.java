package lesson6;

public class Main {
  public static void main(String[] args) {
    var dog = new Dog(500, 10, 1);
    var cat = new Cat(200, 2);
    dog.run(400);
    dog.run(600);
    dog.swim(1);
    dog.swim(11);
    dog.jumpOver(1);
    dog.jumpOver(2);
    cat.run(100);
    cat.run(300);
    cat.swim(1);
    cat.jumpOver(1);
    cat.jumpOver(3);
  }
}
