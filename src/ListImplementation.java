import java.util.*;

class Student{
	 	int rollno;  
	 	String name;  
	 	int age;  
	 	Student(int rollno,String name,int age)
	 	{  
	 		this.rollno=rollno;  
	 		this.name=name;  
	 		this.age=age;  
	 	}  
	 	
	 	public int getRollNumber()
	 	{
	 		return rollno;
	 	}
	 	public String getName()
	 	{
	 		return name;
	 	}
	 	public int getAge()
	 	{
	 		return age;
	 	}
	 	
	 	public void setRollNumber(int roll_no)
	 	{
	 		this.rollno= roll_no;
	 	}
	 	public void setName(String name)
	 	{
	 		this.name = name;
	 	}
	 	public void setAge(int age)
	 	{
	 		this.age = age;
	 	}
	 	public void printList(ArrayList <Student> list3)
	 	{
	 		for(int i=0;i<list3.size();i++)
			{
				//System.out.println(list3.get(i)); this will print its address but not actual data so we need to do by below mentioned way

				 System.out.println(list3.get(i).getRollNumber() +" " + list3.get(i).getName() +" " + list3.get(i).getAge()); 
			}
	 	}
	 	
}


public class ListImplementation {

	public static void main(String[] args) {
		
		ArrayList <String> list1 = new ArrayList <String>();	//can store only string data 
		ArrayList list2 = new ArrayList();						//can store any type of data
		ArrayList <Student> list3 = new ArrayList <Student> (); //can store student type of data (creating user defined list)
		
		  list1.add("Pooja");  
		  list1.add("Aarti");  
		  list1.add("Sushant");  
		  list1.add("Nikhil");  
		  
		  list2.add("Pooja"); //store string data
		  list2.add(101); //store int data
		  list2.add(2.2); //store float data
		  list2.add('A'); //store char data
		 // list2.add(s1);  //store object type of data but it will return hashcode of obj s1
		  
		  System.out.println("Print list1  : "+ list1);
		  System.out.println("Print list2  : "+ list2);
	  
		  
		  Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25);  
		  list3.add(s1);
		  list3.add(s2);
		  list3.add(s3);
		  Iterator itr=list3.iterator();  
		  //traversing elements of ArrayList object 
		  System.out.println("\nPrint list3  : ");
		  while(itr.hasNext())
		  {  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		  
		  System.out.println("\nPrint list3  : using for loop\n ");

		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the age from list3 whose name to be updated:\t");
		  int age1 = sc.nextInt();
		  for(int i=0;i<list3.size();i++)  
          {  
			  //Student st=(Student)itr.next();  
			  //System.out.println(st.rollno+" "+st.name+" "+st.age);   //this can't be worked for user defined data type
			 // System.out.println(list3.get(i).getRollNumber() +" " + list3.get(i).getName() +" " + list3.get(i).getAge()); 
			 
			  if(list3.get(i).getAge() == age1)
			  {
				  System.out.println("element found"); //searching age field wit age=25
				  String mname = list3.get(i).getName();
				  System.out.println("\nUpdating name " +mname+" by newname");
				  
				  System.out.println("Enter the new name");
				  String newName = sc.next();
				  list3.get(i).setName(newName);			//updating name & roll number associated with that age field
				  list3.get(i).setRollNumber(111);
				  
				  System.out.println("Name & Roll number for age= "+age1+" has been updated");
				  
				  break;
			  }
			 
			  
          }
		  
		  System.out.println("\n\nPrinting list3 : after updation");
		  for(int i=0;i<list3.size();i++)  
          { 
			  System.out.println(list3.get(i).getRollNumber() +" " + list3.get(i).getName() +" " + list3.get(i).getAge()); 
          }
		  


		  NormalDatatypeDefinedList1(list1); //performs all operation on list whose data type is known
		  //DatatypeNotDefinedList2(list2);
		  //ForUserDefinedData(list3);
		  
		 /* Get elements from lists
		  String name = list1.get(1);  // from list1 we know data type so store in string 
		  System.out.println(name);
		  
		  Object o = list2.get(1);   // from list2 we dont know data type so store in Object data type
		  System.out.println(o); */ 

	}
	static void printList1(ArrayList <String> list1)
	{
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}

	}
	static void printList2(ArrayList list2)
	{
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}

	}
	static void NormalDatatypeDefinedList1(ArrayList <String> list1)
	{
		System.out.println("\nPerforming all operations on list1");
		System.out.println("\nPrinting original list1");

		  printList1(list1);
		  System.out.println("\nInside NormalDatatypeDefinedList1"); 
		  list1.add(4, "yogesh");
		  System.out.println("\nUpdated list1");

		  printList1(list1);
		  
		  //appending list4 to list1
		  ArrayList<String> list4 = new ArrayList<String>();
		  list4.add("C");
		  list4.add("C++");
		  list1.addAll(list4);
		  System.out.println("\nAfter appending operation..Updated list1");
		  printList1(list1);
		  //append from specified location 
		  list1.addAll(3, list4);
		  System.out.println("\nAfter appending at index 3..Updated list1");
		  printList1(list1);
		  
		  //creating clone(copy) of a list4
		  ArrayList <String> cloneList = (ArrayList<String>) list4.clone();
		  System.out.println("\nAfter cloning..printing cloneList");
		  System.out.println("cloneList\t = "+cloneList);
		  System.out.println("list4\t\t = "+list4);
		  
		  System.out.println("\nChecking element present or not...contains() method");
		  System.out.println(list4.contains("C"));
		  System.out.println(list4.contains("++"));
		  
		  System.out.println("Fetching index of C++ element ="+list4.indexOf("C++"));
		  list4.add("java");
		  list4.add("python");
		  list4.add("java");
		  System.out.println("list4\t\t = "+list4);
		  System.out.println("Fetching last index of java element ="+list4.lastIndexOf("java"));

		  list4.clear();
		  System.out.println("\nPrinting list4...after clearing");
		  System.out.println(list4);
		  
		  //creating new list using asList()
		  ArrayList <Integer> numbers = new ArrayList <Integer> (Arrays.asList(1,2,3,4,5,6));
		  numbers.remove(1);
		  System.out.println("After removing by index 1 from numbers list = "+numbers); //in case of string we can remove by its index & also by its element name too
		  
		  //applyting condition removeIf()
		  ArrayList <Integer> numbersList = new ArrayList <Integer> (Arrays.asList(1,2,3,4,5,6,7,8,9));
		  numbersList.removeIf(num -> num%2 == 0 );
		  System.out.println("After removing even numbers from numbersList = "+numbersList);

		  //printing sublist
		  System.out.println("Original list1\t = "+list1);
		  ArrayList <String> subList = new ArrayList <String> (list1.subList(1, 4));
		  System.out.println("Printing subList= "+subList);

		  //convert an ArrayList to Array
		  Object arr[] = numbersList.toArray();
		  System.out.println("ArrayList converted to Array = "+ Arrays.toString(arr));//now u can access arraylist as array with arr[1], arr[2] likewise
		  
	}
	static void DatatypeNotDefinedList2(ArrayList list2)  
	{
		//note : if I specified in function argument as (ArrayList <String> list2 ) then only String elements can be accessed for the entire function other data type elements cannot.
		  System.out.println("\nInside DatatypeNotDefinedList2");  

		
	}
	static void ForUserDefinedData(ArrayList <Student> list3)  
	{
		  System.out.println("\nInside ForUserDefinedData");  

		
	}

}
