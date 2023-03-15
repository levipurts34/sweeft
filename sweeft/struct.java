import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class struct {
	 private ArrayList<Integer> arr;
	 private Map<Integer, Integer> map;
	 public void MyStructure() {
	        arr = new ArrayList<Integer>();
	        map = new HashMap<Integer, Integer>();
	 }
	 public void add(int x) {
	        if (!map.containsKey(x)) {
	            int index = arr.size();
	            arr.add(x);
	            map.put(x, index);
	        }
	 }
	 public void remove(int x) {
	      if (map.containsKey(x)) {
	            int index = map.get(x);
	            map.remove(x);
	            int last = arr.size() - 1;
	            arr.set(index, arr.get(last));
	            arr.remove(last);
	            map.put(arr.get(index), index);
	        }
	 }
}
