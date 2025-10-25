import java.util.Scanner;

public class Name1 {
    private String firstName;
    private String lastName;
    private String middleName;

    public Name1(String firstName) {
        this.firstName = firstName;
    }

    public Name1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name1(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Name1() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void inputFromKeyboard(Scanner sc) {
        System.out.print("Введите имя (обязательно): ");
        while (true) {
            firstName = sc.nextLine().trim();
            if (!firstName.isEmpty()) break;
            System.out.print("Имя не может быть пустым, повторите ввод: ");
        }

        System.out.print("Введите фамилию (можно оставить пустым): ");
        lastName = sc.nextLine().trim();
        if (lastName.isEmpty()) lastName = null;

        System.out.print("Введите отчество (можно оставить пустым): ");
        middleName = sc.nextLine().trim();
        if (middleName.isEmpty()) middleName = null;
    }

    public void show() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null && !firstName.isEmpty()) {
            sb.append(firstName);
        }
        if (middleName != null && !middleName.isEmpty()) {
            sb.append(" ").append(middleName);
        }
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(" ").append(lastName);
        }
        return sb.toString().isEmpty() ? "Имя не задано" : sb.toString();
    }
}