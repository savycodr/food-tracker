package food_tracker;
import java.util.ArrayList;

// The `Food` class exposes the following API:

// * `double getCalories`
// * `double getFat`
// * `double getCarbohydrates`
// * `double getProtein`
// * `double getName`

public class Food {

  private Nutrients nutrients;
  private String name;
  private Category category;

  public Food(String _name, 
              double _calories, double _fat, double _carbs, double _protein, 
              Category _cat){

    name = _name;
    nutrients = new Nutrients(_calories, _fat, _carbs, _protein);
    category = _cat;
  }

  public Food(String _name, 
              Nutrients _nutrients, 
              Category _cat){

    name = _name;
    nutrients = _nutrients;
    category = _cat;
  }

  Nutrients getNutrients(){
    return nutrients;
  }

  String getName(){
    return name;
  }

  Category getCategory(){
    return category;
  }

  void print(){
    System.out.println("Food: " + name);
    System.out.println("Category: " + category);
    nutrients.print();
  }


}