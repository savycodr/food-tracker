package food_tracker;
import java.util.ArrayList;
import java.util.Scanner;

class Test {
  public static void main(String[] args) {

    // create a User
    User archie = new User("Archie", "arch@stl.com", 1, 75);
    archie.print();

    // create Nutrients
    Nutrients almonds = new Nutrients(150, 5, 11, 8);
    Nutrients brownRice = new Nutrients(175, 3, 12, 5);
    Nutrients fruit = new Nutrients(60, 5, 11, 0);
    Nutrients vege = new Nutrients(25, 3, 12, 2);


    // Create Food
    Food nuts = new Food("nuts", almonds, Category.Protein);
    Food rice = new Food("rice", brownRice, Category.Grain);
    Food banana = new Food("banana", fruit, Category.Fruit);
    Food corn = new Food("corn", vege, Category.Vegetable);


    ArrayList<Food> foods = new ArrayList<Food>();
    foods.add(nuts);
    foods.add(rice);
    foods.add(banana);
    foods.add(corn);

    // Create a Meal
    Meal meal = new Meal("Gumbo", foods);
    Nutrients nutris = meal.getNutrients();
    nutris.print();

    // Set up a Meal Tracker
    MealTracker mt = new MealTracker(archie, meal);
    mt.viewMeals();
    System.out.println("the number of meals " + mt.getMealCount());
    System.out.println("the user is on track " + mt.isOnTrack());


    // // Create a new Scanner that reads from the System's standard input stream.
    // Scanner input = new Scanner(System.in);

    // // To collect a whole sentence, use the "nextLine" method. 
    // System.out.println("Enter a sentence for me to read. ");
    // String sentence = input.nextLine();

    // // For a single word, simply use next.
    // System.out.println("Enter a word for me to read. ");
    // String word = input.next();

    // // The other data types have aptly named methods.
    // System.out.println("Enter an integer for me to read. ");
    // int integer = input.nextInt();

    // System.out.println("Enter a double for me to read. ");
    // double dub = input.nextDouble();

  }
}