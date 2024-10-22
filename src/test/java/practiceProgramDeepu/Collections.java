package practiceProgramDeepu;



	import java.util.ArrayList;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.TreeSet;

	
	public class Collections
	{

		public static void main (String[] args)
		{
			/*ArrayList arr=new ArrayList();
			arr.add(10);
			arr.add(30);
			arr.add(30);
			arr.add(null);
			arr.add("hii");
			arr.add("string");
			System.out.println(arr);
			arr.add(2,"hell0");
			System.out.println(arr);
			ArrayList<Integer> arr1=new ArrayList<Integer>();
			arr1.add(80);
			arr1.add(20);
			arr1.add(5);
			Collections.sort(arr1);
			System.out.println(arr1);
			//arr1.addAll(arr);
			System.out.println(arr1);
			if(arr.contains("hii"))
			{
				System.out.println("hii is present");
			}
			else 
			{
				System.out.println("hii is not present");
			}
			System.out.println(arr.remove(2));
			for(Object obj:arr)
			{
				System.out.println(obj);
			}*/
			
			//LinkedList
			
			/*LinkedList<Object> list=new LinkedList<Object>();
			list.add(10);
			list.add(20);
			list.add("hii");
			list.add(10);
			list.add(null);
			list.add(null);
			System.out.println(list);
			list.add(2,"bubloo");
			System.out.println(list);
			list.addFirst("namste");
			list.addLast("byee");
			System.out.println(list);
			list.remove(1);
			list.removeFirst();
			list.removeLast();
			System.out.println(list.get(4));
			System.out.println(list.getFirst());
			System.out.println(list.getLast());*/
			
			//PriorityQueue
			
			/*PriorityQueue<Character> q=new PriorityQueue<Character>();;
			q.add('A');
			q.add('B');
			q.add('C');
			System.out.println(q);
			System.out.println(q.poll());
			System.out.println(q);
			System.out.println(q.peek());
			System.out.println(q);*/
			
			/*HashSet<Object> set =new HashSet<Object>();
			set.add(10);
			set.add("hiii");
			set.add(30);
			set.add(null);
			set.add("");
			set.add(20);
			set.add(null);
			set.add("hellooo");
			set.add(30);
			System.out.println(set);
			System.out.println(set.size());
			System.out.println(set.contains("hellooo"));
			System.out.println(set.isEmpty());

			System.out.println(set.remove(10));
			Iterator<Object> i=set.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			ArrayList<Object> name = new ArrayList<Object>(set);
			System.out.println(name.get(1));
			System.out.println(name);
			set.clear();
			System.out.println(set);
			for(Object object1:name)
			{
				System.out.println(object1);
			}*/
			
			
			//LinkedHashSet
			
			
			/*LinkedHashSet<Object> set =new LinkedHashSet<Object>();
			set.add(10);
			set.add("hiii");
			set.add(30);
			set.add(null);
			set.add("");
			set.add(20);
			set.add(null);
			set.add("hellooo");
			set.add(30);
			System.out.println(set);
			System.out.println(set.size());
			System.out.println(set.contains("hellooo"));
			System.out.println(set.isEmpty());

			System.out.println(set.remove(10));
			Iterator<Object> i=set.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			ArrayList<Object> name = new ArrayList<Object>(set);
			System.out.println(name.get(1));
			System.out.println(name);
			set.clear();
			System.out.println(set);
			for(Object object1:name)
			{
				System.out.println(object1);
			}*/
			
			
			TreeSet<Integer> set = new TreeSet<Integer>();
			//set.add(null);
			set.add(10);
			set.add(5);
			set.add(2);
			set.add(3);
			set.add(1);
			System.out.println(set);
			System.out.println(set.descendingSet());
//			Iterator<Integer> i=set.iterator();
//			while(i.hasNext())
//			{
//				System.out.println(i.next());
//			}
//			
			
			
			
			}

		
		}





