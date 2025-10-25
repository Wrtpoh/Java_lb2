import java.util.Scanner;

public class Name {
    // Класс "Имя": фамилия, имя, отчество (все могут быть необязательными)
    private String lastName;
    private String firstName;
    private String middleName;

    // Конструкторы
    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public Name(String firstName) {
        this(null, firstName, null);
    }

    public Name() {
    }

    // Геттеры и сеттеры
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // Ввод данных с клавиатуры
    public void inputFromKeyboard(Scanner sc) {
        System.out.print("Введите фамилию (можно оставить пустым): ");
        lastName = sc.nextLine().trim();
        if (lastName.isEmpty()) lastName = null;

        System.out.print("Введите имя (обязательно): ");
        while (true) {
            firstName = sc.nextLine().trim();
            if (!firstName.isEmpty()) break;
            System.out.print("Имя не может быть пустым, повторите ввод: ");
        }

        System.out.print("Введите отчество (можно оставить пустым): ");
        middleName = sc.nextLine().trim();
        if (middleName.isEmpty()) middleName = null;
    }

    // Метод отображения имени
    public void show() {
        System.out.println("Результат: " + this.toString());
    }

    // Преобразование в строку
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(firstName);
        }
        if (middleName != null && !middleName.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(middleName);
        }
        return sb.toString().isEmpty() ? "Имя не задано" : sb.toString();
    }
}
