import java.util.Map;
import java.util.HashMap;


//real time example
class Book
{
	int id;
	String name, author, publisher;
	int quantity;
	Book(int id, String name, String author, String pub, int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = pub;
		this.quantity = quantity;
	}
}
public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "pooja");
		hm.put(2, "aarti");
		hm.put(3, "sushant");
		hm.put(1, "nikhil");
		
		System.out.println("now iterating hashmap ..."+hm);
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() +"  " + m.getValue());
		}
		
		hm.putIfAbsent(4, "Yogesh");
		System.out.println("after putIfAbsent()");
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		HashMap <Integer, String> map = new HashMap<Integer, String>();
		map.put(5,"dipti");
		map.putAll(hm); 			//copyting one hashmap hm into another hashmap map
		System.out.println("Printing all values after putAll()");
		for(Map.Entry m: map.entrySet())
		{
			 System.out.println(m.getKey()+" "+m.getValue());    
		}
		//map.remove(5); or map.remove(5,"dipti")
		//map.replace(5, "pooja");   or map.replace(5, "dipti", "pooja");   //replace dipti with new name pooja or map.replaceAll((k,v) -> "Ajay");  
	    
		
		//real time example
		System.out.println("----- Realtime example -----");
		HashMap <Integer, Book> books = new HashMap<Integer, Book> ();
		Book b1 = new Book(1,"pooja","author1","pub1",5);
		Book b2 = new Book(2,"aarti","author2","pub2",4);
		Book b3 = new Book(3,"rudra","author3","pub3",6);
		
		books.put(1,b1);
		books.put(2, b2);
		books.put(3, b3);
		
		for(Map.Entry <Integer,Book> m :books.entrySet())
		{
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println(b.id+"\t"+b.name+"\t"+b.author+"\t"+b.publisher+b.quantity);
			//System.out.println(m.getKey()+" "+m.getValue());//this will print null value like Book@1f89ab83
			//also we cannot write for(Map.Entry m :books.entrySet()) directly as we have userdefined hashmap
		}
		

		
	     
	}

}
