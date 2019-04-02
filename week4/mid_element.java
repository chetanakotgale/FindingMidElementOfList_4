package week4;

import java.util.Scanner;

public class mid_element 
{
		Node head;  // head of list 
		  
	    /* Linked list Node*/
	    class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) 
	        {
	        	data = d; 
	        	next = null; 
	        } 
	    } 
		 public void append(int new_data) 
		    { 
			
		        /*  Allocate the Node & 
		            Put in the data 
		            Set next as null */
		        Node new_node = new Node(new_data); 
		  
		        /*  If the Linked List is empty, then make the 
		              new node as head */
		        if (head == null) 
		        { 
		            head = new Node(new_data); 
		            return ; 
		        } 
		  
		        /*  This new node is going to be the last node, so 
		              make next of it as null */
		        new_node.next = null; 
		  
		        
		        Node last = head;  //assigning head to last
		        while (last.next != null) //iterating it till it reaches the end of the list
		            last = last.next; 
		  
		        /* After reaching the last node change the next of last node */
		        last.next = new_node; 
		     
		        return ; 
		    } 
		 public void display(int mid) //function to display the middle element
		 { 
		        Node tnode = head; //assigning head to tnode
		        int h=0;
		        while (tnode != null) //iterating it till reaches the mid elemt

		        { 
		        	h++;
		        	if(h==mid)
		        	{
		        		System.out.println(tnode.data); //printing the mid value
		        		break;	        	
		        	}
		            tnode = tnode.next; //Assigning next node to tnode
		        } 
		  } 
		 

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			
			mid_element mid_element=new mid_element();
			   		
			        Scanner sc=new Scanner(System.in);
			        int n=sc.nextInt();
			        for(long i=0;i<n;i++)
			        {
			        	int a=sc.nextInt();
			        //	mid_element.append(a);
			        }
			        int mid=n/2+1;
			        System.out.print("mid value in the list " + mid); 
			        mid_element.display(mid); 
			        sc.close();	        
		}
		

	}
