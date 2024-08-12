package exercise._03._03_02;

import java.time.LocalDate;

public class SalesLeadTracker {
  public static void main(String[] args) {

    // Problem with having a big constructor
    // 1. Difficult to see which fields are which in the constructor
    // 2. Arguments can get mixed up
    // 3. Difficult to read and maintain
    var person1 = new Person(
      "Tracy",
      null,
      "Westbuy",
      LocalDate.of(1985, 1, 1),
      "tracy@example.com",
      null);
    addPersonToLeadTracker(person1);

    var person2 = new Person(
        "Jerome",
        "Henry",
        "Donaldson",
        null,
        null,
        "1234567890"); 
    addPersonToLeadTracker(person2); 
  }

  private static void addPersonToLeadTracker(Person person) {
    System.out.println("A new lead was added to the lead tracker: \n" + person);
  }
}
