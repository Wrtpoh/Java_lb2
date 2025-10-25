public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(name + ": мяу!");
    }
    public void meow(int n) {
        if (n <= 0) {
            System.out.println(name + ": ...");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");
        for (int i = 0; i < n; i++) {
            sb.append("мяу");
            if (i < n - 1) sb.append("-");
        }
        sb.append("!");
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}
