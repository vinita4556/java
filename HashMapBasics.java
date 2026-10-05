import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class HashMapBasics {
    public static void main(String[] args){
 //---------TREEMap-----//
  Map<String, String> mapping  = new TreeMap<>();
        //insertion 
        mapping.put("in", "India");
        //mapping.put("in", "India2"); putting the same key will override the previous value
        mapping.put("en", "England");
        mapping.put("us", "United States");
       
        System.out.println(mapping);

         Map<String, String> m = new TreeMap<>();
        m.put("fr", "France");
        System.out.println(m);

        m.putAll(mapping); // adding all the elements of mapping to m
        System.out.println(m); 

        //deletion
        m.remove("en");
        System.out.println(m);

           //size
        //System.out.println(m.size());
          //clear
        //m.clear();
        //System.out.println(m.size());

        //putifAbsent Mathod - it means pehle se mapping nhi poresent toh put kro
        //m.putIfAbsent("is", "India3");
        //System.out.println(m);

        //get method
        System.out.println(m.get("in")); // it will return the value of key in
        
        //getOrDefault method - it will return the value of key if present otherwise it will return the default value
        System.out.println(m.getOrDefault("is", "India3")); // it will return
        System.out.println(m.getOrDefault("usa", "NONE")); // it will return NONE because key is not present in the map


        //containsKey method - it will return true if key is present in the map otherwise it will return false
       System.out.println(m.containsKey("in")); // it will return true
        System.out.println(m.containsKey("im")); // it will return false


        //containsValue method - it will return true if value is present in the map otherwise it will return false
        System.out.println(m.containsValue("India")); // it will return true
        System.out.println(m.containsValue("Brazil")); // it will return false

        System.out.println(m);
        //replace method - it will replace the value of key if key is present in the map otherwise it will return null
        m.replace("in", "India2");
        System.out.println(m);

        //keyset
        Set<String> keyset = m.keySet();
        System.out.println(keyset);

        //Valueset
         Collection<String> valueset = m.values();
         System.out.println(valueset);

         //entrySet - it will return a set of key-value pairs
            Set<Map.Entry<String, String>> entryset = m.entrySet();
            System.out.println(entryset);
    }
}



//---------LINKEDHASHMAP-----------------//

         /*Map<String, String> mapping  = new LinkedHashMap<>();
        //insertion 
        mapping.put("in", "India");
        //mapping.put("in", "India2"); putting the same key will override the previous value
        mapping.put("en", "England");
        mapping.put("us", "United States");
       
        System.out.println(mapping);

         Map<String, String> m = new LinkedHashMap<>();
        m.put("fr", "France");
        System.out.println(m);

        m.putAll(mapping); // adding all the elements of mapping to m
        System.out.println(m); 

        //deletion
        m.remove("en");
        System.out.println(m);

           //size
        //System.out.println(m.size());
          //clear
        //m.clear();
        //System.out.println(m.size());

        //putifAbsent Mathod - it means pehle se mapping nhi poresent toh put kro
        //m.putIfAbsent("is", "India3");
        //System.out.println(m);

        //get method
        System.out.println(m.get("in")); // it will return the value of key in
        
        //getOrDefault method - it will return the value of key if present otherwise it will return the default value
        System.out.println(m.getOrDefault("is", "India3")); // it will return
        System.out.println(m.getOrDefault("usa", "NONE")); // it will return NONE because key is not present in the map


        //containsKey method - it will return true if key is present in the map otherwise it will return false
       System.out.println(m.containsKey("in")); // it will return true
        System.out.println(m.containsKey("im")); // it will return false


        //containsValue method - it will return true if value is present in the map otherwise it will return false
        System.out.println(m.containsValue("India")); // it will return true
        System.out.println(m.containsValue("Brazil")); // it will return false

        System.out.println(m);
        //replace method - it will replace the value of key if key is present in the map otherwise it will return null
        m.replace("in", "India2");
        System.out.println(m);

        //keyset
        Set<String> keyset = m.keySet();
        System.out.println(keyset);

        //Valueset
         Collection<String> valueset = m.values();
         System.out.println(valueset);

         //entrySet - it will return a set of key-value pairs
            Set<Map.Entry<String, String>> entryset = m.entrySet();
            System.out.println(entryset);
    }
}*/
      

//-------HASHMAP BASICS -----------------//
 
       /*  Map<String, String> mapping  = new HashMap<>();
        //insertion 
        mapping.put("in", "India");
        //mapping.put("in", "India2"); putting the same key will override the previous value
        mapping.put("en", "England");
        mapping.put("us", "United States");
       
        System.out.println(mapping);

         Map<String, String> m = new HashMap<>();
        m.put("fr", "France");
        System.out.println(m);

        m.putAll(mapping); // adding all the elements of mapping to m
        System.out.println(m); 

        //deletion
        m.remove("en");
        System.out.println(m);

           //size
        //System.out.println(m.size());
          //clear
        //m.clear();
        //System.out.println(m.size());

        //putifAbsent Mathod - it means pehle se mapping nhi poresent toh put kro
        //m.putIfAbsent("is", "India3");
        //System.out.println(m);

        //get method
        System.out.println(m.get("in")); // it will return the value of key in
        
        //getOrDefault method - it will return the value of key if present otherwise it will return the default value
        System.out.println(m.getOrDefault("is", "India3")); // it will return
        System.out.println(m.getOrDefault("usa", "NONE")); // it will return NONE because key is not present in the map


        //containsKey method - it will return true if key is present in the map otherwise it will return false
       System.out.println(m.containsKey("in")); // it will return true
        System.out.println(m.containsKey("im")); // it will return false


        //containsValue method - it will return true if value is present in the map otherwise it will return false
        System.out.println(m.containsValue("India")); // it will return true
        System.out.println(m.containsValue("Brazil")); // it will return false

        System.out.println(m);
        //replace method - it will replace the value of key if key is present in the map otherwise it will return null
        m.replace("in", "India2");
        System.out.println(m);

        //keyset
        Set<String> keyset = m.keySet();
        System.out.println(keyset);

        //Valueset
         Collection<String> valueset = m.values();
         System.out.println(valueset);

         //entrySet - it will return a set of key-value pairs
            Set<Map.Entry<String, String>> entryset = m.entrySet();
            System.out.println(entryset);
    }
}*/