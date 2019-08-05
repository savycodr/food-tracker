package food_tracker;


public class Nutrients {

  double calories;
  double fat;
  double carbohydrates;
  double protein;

  public Nutrients ( double _calories, double _fat, double _carbohydrates, double _protein){

     calories = _calories;
     fat = _fat;
     carbohydrates = _carbohydrates;
     protein = _protein;

  }

  double getCalories(){
    return calories;
  }

  double getFat(){
    return fat;
  }

  double getCarbs(){
    return carbohydrates;
  }

  double getProtein(){
    return protein;
  }

  public void print(){
    System.out.println("Calories: " + getCalories());
    System.out.println("Fat: " + getFat());
    System.out.println("Carbs: " + getCarbs());
    System.out.println("Protein: " + getProtein());
  }

}