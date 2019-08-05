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

  private ArrayList<Meal> meals = new ArrayList<Meal>();
  private User user;

  public MealTracker(User _user, ArrayList<Meal> _meals){
    user = _user;
    meals = _meals;
  }

  public MealTracker(User _user, Meal _meal){
    user = _user;
    meals.add(_meal);
  }

  void addMeal(Meal meal){
    meals.add(meal);
  }

  void viewMeals(){
    for(Meal m: meals){
      m.print();
    }
  }

  int getMealCount(){
    return meals.size();
  }

  // what percent of meals are onTrack
  double getAdherence(){
    int mealOnTrack = 0;
    for (Meal m: meals){
      if (m.isComplete()){
        mealOnTrack++;
      }
    }

    // Take the number of meals onTrack/ number of meals

    return (mealOnTrack/meals.size())*100;
  }

  boolean isOnTrack(){

    System.out.println("User target adherence: " + user.getTargetAdherence());
    System.out.println("User Actual adherence: " + this.getAdherence());

    if (user.getTargetAdherence()<=this.getAdherence()){
      return true;
    } else {
      return false;
    }
  }
}