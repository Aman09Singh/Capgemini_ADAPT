import java.util.HashMap;
public class Assignment4Q7 {
    public static void main(String[] args) {
    	
    }
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    	StringBuilder res = new StringBuilder();
    	for(HashMap.Entry<String,Integer> mp:map.entrySet()) {
    		res.append(mp.getKey()+mp.getValue());
    	}
    	return res.toString();
    }
}