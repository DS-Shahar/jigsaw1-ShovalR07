package lesson1;
	import java.util.*;
	public class listlevel2 {
		public static Scanner input = new Scanner(System.in);
		public static Node<Integer> BuildNode(Node<Integer> a) 
		{
	        Node<Integer> current = a;
	        while (current != null && current.getNext() != null) 
	        {
	            Node<Integer> runner = current;
	            while (runner.getNext() != null) 
	            {
	                if (runner.getNext().getValue() == current.getValue()) 
	                {
	                    runner.setNext(runner.getNext().getNext());
	                } 
	                else 
	                {
	                    runner = runner.getNext();
	                }
	            }
	            current = current.getNext();
	        }

	        return a;
	    }
		
		
		public static Node<Integer> EvenNode(Node<Integer> a) 
		{
			 Node<Integer> head = null; 
			 Node<Integer> p = null;
	        int i=1;
	        while (a != null) 
	        {
	        	if(i%2==0)
	        	{
	        		Node<Integer> newNode = new Node<>(a.getValue());
	        		 if (head == null)
	        		 {
	                     head = newNode;
	                     p = head;  
	                 }
	        		 else 
	        		 {
	                    
	                     p.setNext(newNode);
	                     p = p.getNext();  
	                 }
	        	}
	        	a = a.getNext();
	            i++;
	       }
	        return head;
		}
		
		
		public static void main(String[] args) {	
			Node<Integer> a = new Node<Integer>(7);
			Node<Integer> b = new Node<Integer>(2);
			Node<Integer> c = new Node<Integer>(7);
			Node<Integer> d = new Node<Integer>(5);
			Node<Integer> e = new Node<Integer>(2);
			a.setNext(b);
			b.setNext(c);
			c.setNext(d);
			d.setNext(e);
			System.out.println(EvenNode(a));
		}
}