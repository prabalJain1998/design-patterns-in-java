import java.util.HashMap;

public class Context {
    HashMap<String, Integer> hs;
    
    Context() {
        hs= new HashMap<>();
    }

    void put(String key, int value) {
        hs.put(key, value);
    } 

    int getValue(String key) {
        return hs.get(key);
    }
    
}
