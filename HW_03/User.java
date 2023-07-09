package HW_03;

public class User {
  private String name;
  private String surname;
  private String middleName;
  private int numberPhone;

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setNumberPhone(int numberPhone) {
    this.numberPhone = numberPhone;
  }

  public User (String surname, String name, String middleName, int numberPhone) {
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

  public int getNumberPhone() {
    return numberPhone;
  }
}
