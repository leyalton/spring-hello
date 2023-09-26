public class Cat {
    public String firstName;
    public String lastName;

    public Cat() {

    }

    public void setFirstName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName + " " + lastName;

    }
}