import java.util.*;
// counts the occurances of keywords in a string
public class CountKeywords {
public static void main(String[] args) {

String text =  "It took a long time to code this, it took a short time to type this ";

MyHashedMap<String, Integer> map = new MyHashedMap<>();


String[] words = text.split("[ \n\t\r.,;:!?(){}]");
for (int i = 0; i < words.length; i++) {
String key = words[i].toLowerCase();

if (key.length() > 0) {
if (!map.containsKey(key)) {
map.put(key, 1);
}
else {
int value = map.get(key);
value++;
map.put(key, value);
}
}
}

Set<MyHashedMap.Entry<String, Integer>> entrySet = map.entrySet();


for (MyMap.Entry<String, Integer> entry: entrySet)
System.out.println(entry.getKey() + "\t" + entry.getValue());
}
}
