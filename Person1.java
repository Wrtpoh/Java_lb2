public class Person1 {
    private Name1 name;
    private int height;
    private Person1 father;

    // Конструктор 1: имя как строка + рост
    public Person1(String firstName, int height) {
        this.name = new Name1(firstName); // только личное имя
        this.height = height;
    }

    // Конструктор 2: имя как строка + рост + отец
    public Person1(String firstName, int height, Person1 father) {
        this(firstName, height);
        this.father = father;
        if (father != null) {
            this.name = new Name1(firstName, father.name.getLastName(), father.name.getFirstName() + "ович");
        }
    }

    // Конструктор 3: имя как объект Name1 + рост
    public Person1(Name1 name, int height) {
        this.name = name;
        this.height = height;
    }

    // Конструктор 4: имя как объект Name1 + рост + отец
    public Person1(Name1 name, int height, Person1 father) {
        this(name, height);
        this.father = father;
        if (father != null) {
            if (this.name.getLastName() == null || this.name.getLastName().isEmpty()) {
                this.name.setLastName(father.name.getLastName());
            }
            if (this.name.getMiddleName() == null || this.name.getMiddleName().isEmpty()) {
                this.name.setMiddleName(father.name.getFirstName() + "ович");
            }
        }
    }

    @Override
    public String toString() {
        return name + ", " + height;
    }

    public void setFather(Person1 father) {
        this.father = father;
    }
}
