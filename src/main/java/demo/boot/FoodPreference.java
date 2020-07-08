package demo.boot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodPreference {

  public enum Type {
    NO_FOOD,
    VEGETARIAN,
    VEGAN,
    MEAT
  }

  private UUID eventId;
  private Type type;
}
