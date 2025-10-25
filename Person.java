public class Person {
    private Name name;
    private int height;
    private Person father;

    public Person(Name name, int height) {
        this.name = name;
        this.height = height;
    }
    public Person(Name name, int height, Person father) {
        this.name = name;
        this.height = height;
        this.father = father;
    }
    public void setFather(Person father) {
        this.father = father;
    }

    @Override
    public String toString() {
        if ((name.getLastName() == null || name.getLastName().isEmpty()) &&
                father != null && father.name.getLastName() != null) {
            name.setLastName(father.name.getLastName());
        }
        if ((name.getMiddleName() == null || name.getMiddleName().isEmpty()) &&
                father != null && father.name.getFirstName() != null) {
            String middleName = father.name.getFirstName() + "ович";
            name.setMiddleName(middleName);
        }

        return "Человек с именем: " + name +
                " и ростом: " + height;
    }
}
