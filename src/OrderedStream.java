import java.util.ArrayList;
import java.util.List;

public class OrderedStream {

    List<String> os = new ArrayList<>();

    public OrderedStream(int n) {
        os = new ArrayList<>(n);
    }

    public List<String> insert(int id, String value) {
        os.add(id, value);


        return os;
    }
}
