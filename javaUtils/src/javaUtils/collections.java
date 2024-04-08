package javaUtils;
	
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class collections {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("LinkedList created.");
        
        
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("ArrayList created.");
        
       
        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println("HashMap created.");
        
     
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("HashSet created.");
        
       
        linkedList.add("Hii");
        linkedList.add("Hello");
        System.out.println("Data added to LinkedList.");
        arrayList.add("arraylist 1");
        arrayList.add("arraylist 2");
        System.out.println("Data added to ArrayList.");
        
      
        System.out.println("LinkedList contents: " + linkedList);
        System.out.println("ArrayList contents: " + arrayList);
        
        
        hashMap.put(1, "first value");
        hashMap.put(2, "second value");
        System.out.println("Data added to HashMap.");
        
        System.out.println("HashMap contents: " + hashMap);
        
        hashSet.add("Data1");
        hashSet.add("Data2");
        System.out.println("Data added to HashSet.");
        
        System.out.println("HashSet contents: " + hashSet);
        
        boolean foundInLinkedList = linkedList.contains("Data1");
        boolean foundInArrayList = arrayList.contains("Data2");
        
        if (foundInLinkedList) {
            System.out.println("Hii found in LinkedList.");
        } else {
            System.out.println("Hii not found in LinkedList.");
        }
        
        if (foundInArrayList) {
            System.out.println("arraylist 1 found in ArrayList.");
        } else {
            System.out.println("arraylist 1 not found in ArrayList.");
        }
        
        
        boolean foundInHashMap = hashMap.containsValue("Value1");
        
        if (foundInHashMap) {
            System.out.println("firstvalue found in HashMap.");
        } else {
            System.out.println("firstvalue not found in HashMap.");
        }
        
        
        boolean foundInHashSet = hashSet.contains("Data2");
        
        if (foundInHashSet) {
            System.out.println("Data2 found in HashSet.");
        } else {
            System.out.println("Data2 not found in HashSet.");
        }
        
       
        linkedList.remove("Hii");
        arrayList.remove("arraylist 1");
        System.out.println("Data removed from LinkedList and ArrayList.");
        
        System.out.println("Modified LinkedList contents: " + linkedList);
        System.out.println("Modified ArrayList contents: " + arrayList);
        
        hashMap.remove(1);
        System.out.println("Data removed from HashMap.");
        
        
        System.out.println("Modified HashMap contents: " + hashMap);
        
        hashSet.remove("Data1");
        System.out.println("Data removed from HashSet.");
        
        System.out.println("Modified HashSet contents: " + hashSet);
}
}
