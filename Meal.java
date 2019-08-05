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

  private Nutrients nutrients;
  private String name;
  private ArrayList<Food> foods = new ArrayList<Food>();

  public Meal(String _name, ArrayList<Food> _foods){

    name = _name;
    foods.addAll(_foods);

    double calories = 0.0;
    double fat = 0.0;
    double carbs = 0.0;
    double protein = 0.0;

    // lets add all of the nutrients for all of the foods to get a total count for calories
    // for (int i=0; i<foods.size(); i++){  
    //    Nutrients nutris = foods.get(i).getNutrients();
    //    calories += nutris.getCalories();
    //    fat =+ nutris.getFat();
    //    carbs += nutris.getCarbs();
    //    protein += nutris.getProtein();
    // }

    // another way to loop through the ArrayList
    for (Food food: foods){  
      Nutrients nutris = food.getNutrients();
      calories += nutris.getCalories();
      fat =+ nutris.getFat();
      carbs += nutris.getCarbs();
      protein += nutris.getProtein();
   }

    nutrients = new Nutrients(calories, fat, carbs, protein);
  }

  boolean isComplete(){

    boolean protein = false;
    boolean grain = false;
    boolean fruit = false;
    boolean vegetable = false;

    for (Food food: foods){
      switch (food.getCategory()) {
          case Protein:
              protein = true;
              break;
          case Grain:
              grain = true;
              break;
          case Fruit:
              fruit = true;
              break;
          case Vegetable:
              vegetable = true;
              break;
        }
      }
      // && will return false if any of the categories are false
      return protein && grain && fruit && vegetable;
  }

  Nutrients getNutrients(){
    return nutrients;
  }

  String getName(){
    return name;
  }

  void viewFood(){
    for (Food food: foods){
      System.out.println(food.getName());
    }
  }

  void print(){
    System.out.println("Here is a list of your Meal "+name+": ");
    for (Food food: foods){
      food.print();
    }
  }

}