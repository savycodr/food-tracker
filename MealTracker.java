package food_tracker;

import java.util.ArrayList;

// The `MealTracker` class is responsible for collecting all of the meals a `User` has eaten. As such, each `MealTracker` maintains a reference to a `User`. It exposes the following API:

// * `void addMeal`
// * `void viewMeals`
// * `int getMealCount`
// * `double getAdherence`
// * `boolean isOnTrack`

// _Adherence_ refers to what percentage of `Meal`s are "complete" &mdash; i.e., what percentage of meals contain Fruits; Vegetables; Protein; _and_ Fat. The `isOntrack` method determines whether this `User`'s adherence is above their "threshold."

// The `viewMeals` method should print the name of each meal in the MealTracker.

public class MealTracker{

  public ArrayList<Meal> meals = new ArrayList<Meal>();
  public User user;

  public MealTracker(User _user, ArrayList<Meal> _meals){
    user = _user;
    meals = _meals;
  }

}