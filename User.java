package food_tracker;
// The `User` class is straightforward. It keeps track of a user's first and last names; email address; and age, as one would expect. The only application-specific field is `targetAdherence`. If we imagine that people use this application to improve their eating habits and eat more complete meals, `targetAdherence` represents their goal for healthy eating &mdash; i.e., what percentage of their meals they want to be complete.

// For example, my goal might be to get to a point where nine out of every ten meals I eat are "complete." In that case, my `targetAdherence` would be `90`.

public class User {

  private String name;
  private String email;
  private int age;
  private int tagetAdherence;

  public User(String _name, String _email, int _age, int _targetAdherence){
    name = _name;
    email = _email;
    age = _age;
    tagetAdherence = _targetAdherence;
  }

  public void printUser(){
    System.out.println("The information for " + name +":");
    System.out.println("Email: " + email);
    System.out.println("Age: " + age);
    System.out.println("Target Adherence (0-100): " + tagetAdherence);
  }

}