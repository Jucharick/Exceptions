package HW_03;

public class User {
  private String name;
  private String surname;
  private String middleName;
  private String numberPhone;

  public User (String surname, String name, String middleName, String numberPhone) {
    this.surname = surname;
    this.name = name;
    this.middleName = middleName;
    this.numberPhone = numberPhone;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getNumberPhone() {
    return numberPhone;
  }

  public String toString() {
    return surname + " " + name + " " + middleName + " " + numberPhone;
}
}
