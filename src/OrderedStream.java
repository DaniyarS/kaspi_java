import java.util.ArrayList;
import java.util.List;

public class OrderedStream {

    List<String> os = new ArrayList<>();

    public OrderedStream(int n) {
        os = new ArrayList<>(n+1);
    }

    public List<String> insert(int id, String value) {
        os.add(id, value);
        if (os.get(id+1) == null) return new ArrayList<>();
        else return os.subList(id, id+1);
    }
}
