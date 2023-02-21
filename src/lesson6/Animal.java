package lesson6;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Animal {
  int maxRunDistance;
  int maxSwimDistance;
  int maxJumpHeight;

  public void run(int distance) {
    if (maxRunDistance < distance) {
      System.out.println("run: true");
    } else {
      System.out.println("run: false");
    }
  }

  public void swim(int distance) {
    if (maxSwimDistance < distance) {
      System.out.println("swim: true");
    } else {
      System.out.println("swim: false");
    }
  }

  public void jumpOver(int height) {
    if (maxJumpHeight < height) {
      System.out.println("jump over: true");
    } else {
      System.out.println("jump over: false");
    }
  }
}