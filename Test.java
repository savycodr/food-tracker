package food_tracker;

class Test {
  public static void main(String[] args) {

    // create a User
    User archie = new User("Archie", "arch@stl.com", 1, 75);
    archie.printUser();

    // create a Category
    Category cat =  Category.Beverage;

    // create Nutrients
    Nutrients almonds = new Nutrients(150, 5, 11, 8);

    // Create Food
    Food nuts = new Food("nuts", almonds, Category.Protein);
  }
}