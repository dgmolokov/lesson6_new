package lesson6;

public class Cat extends Animal {
  public Cat(int maxRunDistance, int maxJumpHeight) {
    this.setMaxRunDistance(maxRunDistance);
    this.setMaxJumpHeight(maxJumpHeight);
  }

  @Override
  public boolean swim(int distance) {
    System.out.println("Коты не умеют плавать!");
    return false;
  }
}
