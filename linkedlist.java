import java.util.LinkedList;
class linkedlist{
  public static void main(String args[] )
   {
    LinkedList<String>animals=new LinkedList<>();
    animals.add("dog");
    animals.add("cat");
    animals.add("cow");
    System.out.println("LinkedList : " +animals);
    
    animals.add(2,"horse");
    System.out.println("LinkedList : " +animals);

    animals.set(1,"lion");
    System.out.println("updated LinkedList : " +animals);
    
    String str=animals.get(3);
    System.out.println("animal at index 3 :" +str);

    String str1=animals.remove(2);
    System.out.println("removed animal is :" +str1);
    
   }
}