import java.time.LocalDate;

public class Person {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final LocalDate dateOfBirth;
  private final String emailAddress;
  private final String phoneNumber;

  public Person(
    String firstName,
    String middleName,
    String lastName,
    LocalDate dateOfBirth,
    String emailAddress,
    String phoneNumber) {

      if (firstName == null || lastName == null) {
        throw new IllegalArgumentException("First name or Last name cannot be null");
      }

      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
      this.dateOfBirth = dateOfBirth;
      this.emailAddress = emailAddress;
      this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Person{" + 
      "firstName='" + firstName + '\'' +
      ", middleName='" + middleName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", dateOfBirth='" + dateOfBirth + '\'' +
      ", emailAddress='" + emailAddress + '\'' +
      ", phoneNumber='" + phoneNumber + '\'' +
      "}";
  }
}
