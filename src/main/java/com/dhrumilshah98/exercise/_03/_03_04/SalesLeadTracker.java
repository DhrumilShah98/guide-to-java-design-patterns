package exercise._03._03_04;

import java.time.LocalDate;

public class SalesLeadTracker {
  public static void main(String[] args) {

    // Problem with having a big constructor
    // 1. Difficult to see which fields are which in the constructor
    // 2. Arguments can get mixed up
    // 3. Difficult to read and maintain
    var person1 = new Person.PersonBuilder("Tracy", "Westbuy")
      .setDateOfBirth(LocalDate.of(1985, 1, 1))
      .setEmailAddress("tracy@example.com")
      .build();
    addPersonToLeadTracker(person1);

    var person2 = new Person.PersonBuilder("Jerome", "Donaldson")
      .setMiddleName("Henry")
      .setPhoneNumber("1234567890")
      .build();
    addPersonToLeadTracker(person2);
  }

  private static void addPersonToLeadTracker(Person person) {
    System.out.println("A new lead was added to the lead tracker: \n" + person);
  }
}
