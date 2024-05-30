package J2_JavaCollection.JA2_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JA2_2_26_MapIterator {
    public static void main(String[] args) {
        HashMap<String, String> map_1 = new HashMap<String, String>();

        map_1.put("Vietnam", "HaNoi");
        map_1.put("America", "Washington");
        map_1.put("Korea", "Seoul");


        Iterator<Map.Entry<String, String>> iterator = map_1.entrySet().iterator();
        while (iterator.hasNext()) {
            var item = iterator.next();
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
