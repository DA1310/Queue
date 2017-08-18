package QUEUE;



public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Queue q = new dynamic_queue(5);
		q.enqueue(10);
		
		q.enqueue(20);
		
		q.enqueue(30);
		
		q.enqueue(40);
		
		q.enqueue(50);
		
		
		
	
		q.display();
//		q.displayRev();
//		q.display();
//	//	rev_display(q, 0);
//		reverse_queue(q);
//		q.display();
		
		q.RevQueue();
		q.display();
		
		
	}

}

