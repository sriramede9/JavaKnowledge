package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReplaceNullwithDefaultinMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>(); 
        map.put(1, 1); 
        map.put(2, 2); 
        map.put(3, null); 
        map.put(4, 4); 
        map.put(5, null); 
        map.put(6, null); 
        
        int defaultValue=0;
        
        replacenullwithdefaultvalue(map,defaultValue);
	}

	private static void replacenullwithdefaultvalue(Map<Integer, Integer> map1, int defaultValue) {
		// TODO Auto-generated method stub
		  Map<Object, Object> map = map1.entrySet() 
                  .stream() 
                  .map(entry -> { 
                      if (entry.getValue() == null) 
                          entry.setValue(defaultValue); 
                      return entry; 
                  }) 
                  .collect(Collectors.toMap(Map.Entry::getKey, 
                                            Map.Entry::getValue)); 
  
		System.out.println(map);
	}

}
