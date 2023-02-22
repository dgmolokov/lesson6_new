package lesson6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Animal {
  private int maxRunDistance;
  private int maxSwimDistance;
  private int maxJumpHeight;

  public boolean run(int distance) {
    return (maxRunDistance < distance);
  }

  public boolean swim(int distance) {
    return maxSwimDistance < distance;
  }

  public boolean jumpOver(int height) {
    return maxSwimDistance < height;
  }
}