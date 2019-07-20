package food_tracker;
import java.util.ArrayList;

// * `double getCalories`
// * `double getFat`
// * `double getCarbohydrates`
// * `double getProtein`
// * `String getName`
// * `DateTime getMealTime`
// * `void viewFoods`
// You don't have to save a `MealTime` &mdash; it's just logical to do so. If you'd like to implement this, read about Java's [Date and Time Classes](https://docs.oracle.com/javase/tutorial/datetime/iso/datetime.html), or use [Joda-Time](www.joda.org/joda-time/quickstart.htm).

// When implementing `viewFoods`, simply print the name of each food in the meal.

public class Meal{

  public Nutrients nutrients;
  public String name;
  public ArrayList<Food> foods = new ArrayList<Food>();

  public Meal(String _name, ArrayList<Food> _foods){

    name = _name;
    foods.addAll(_foods);
  }

}