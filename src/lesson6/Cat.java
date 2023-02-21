package lesson6;

public class Cat extends Animal {
  public Cat(int maxRunDistance, int maxJumpHeight) {
    this.maxRunDistance = maxRunDistance;
    this.maxJumpHeight = maxJumpHeight;
  }

  @Override
  public void swim(int distance) {
    System.out.println("Коты не умеют плавать!");
  }
}
