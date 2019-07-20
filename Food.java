package food_tracker;
import java.util.ArrayList;

// The `Food` class exposes the following API:

// * `double getCalories`
// * `double getFat`
// * `double getCarbohydrates`
// * `double getProtein`

// * `double getName`
// * `ArrayList<Category> getCategories`
// * `void addCategory`

public class Food{

  public Nutrients nutrients;
  public String name;
  public ArrayList<Category> categories = new ArrayList<Category>();

  public Food(String _name, 
              double _calories, double _fat, double _carbs, double _protein, 
              Category _cat){

    name = _name;
    nutrients = new Nutrients(_calories, _fat, _carbs, _protein);
    categories.add(_cat);
  }

  public Food(String _name, 
              Nutrients _nutrients, 
              Category _cat){

    name = _name;
    nutrients = _nutrients;
    categories.add(_cat);
  }

}