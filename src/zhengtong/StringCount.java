package zhengtong;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author JackG
 * count the most repeated letters
 *
 */
public class StringCount {
	private Map<String, Integer> mapStringCount = new  HashMap<String, Integer>();
	private String finalKey = "";
	private int finalCount = 0;
	public StringCount(String data){
		char result[] = data.toLowerCase().toCharArray();
		for (int i = 0; i < result.length; i++) {
			String strLetter  = String.valueOf(result[i]);
			Integer count = mapStringCount.get(strLetter);
			if(count == null){
				mapStringCount.put(strLetter, 0);
			}else{
				mapStringCount.put(strLetter, count + 1);
			}
		}
		
		for (String key : mapStringCount.keySet()) {
			System.out.println(key + ":" + mapStringCount.get(key));
			if(mapStringCount.get(key) > finalCount){
				finalCount = mapStringCount.get(key);
				finalKey = key;
			}else if(mapStringCount.get(key) == finalCount){
				finalKey += key;
			}
		}
		
	}
	
	public String getRepeatLetters(){
		return finalKey;
	}
	
	public int getRepeatLettersCount(){
		return finalCount;
		
	}
	
	public static void main(String[] args) {
		String data = "aacdsafljwoeirFuesfdsafjgfWjesuyrasFasgdfdsa";
		
		StringCount stringCount = new StringCount(data);
		
		System.out.println(stringCount.getRepeatLetters());
		System.out.println(stringCount.getRepeatLettersCount());
	}

}/* Output:
f:6
g:1
d:3
e:2
c:0
a:6
o:0
l:0
j:2
i:0
w:1
u:1
s:6
r:1
y:0
fas
6
*///
