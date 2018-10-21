import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Learner {
    public List<String> log;
    private final int f;
    private Map<String, Integer> map;

    public Learner(int f) {
        log = new ArrayList<>();
        map = new HashMap<>();
        this.f = f;
    }

    public boolean learn(String value) {
        map.put(value, map.getOrDefault(value, 0) + 1);
        if (map.get(value) > f) {
            log.add(value);
            return true;
        }
        return false;
    }

    // when to remove from map?
}
