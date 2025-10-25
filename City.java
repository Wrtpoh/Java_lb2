import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Path> paths; // список дорог к другим городам

    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPath(City city, int cost) {
        paths.add(new Path(city, cost));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" -> ");
        if (paths.isEmpty()) {
            sb.append("нет дорог");
        } else {
            for (int i = 0; i < paths.size(); i++) {
                sb.append(paths.get(i).toString());
                if (i < paths.size() - 1) sb.append(", ");
            }
        }
        return sb.toString();
    }
}

