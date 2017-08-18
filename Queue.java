package QUEUE;

public class Queue {

	protected int[] data;
	protected int front ;
	protected int size ;
	
	public Queue( int cap)
	{
		this.data = new int [cap];
		this.front=0;
		this.size=0;
	}
	public void enqueue (int item) throws Exception
	{
		if(this.size == this.data.length)
		{
			throw new Exception("Queue is full");
		}
		else
		{
		 int tail;
		 tail = (this.size + this.front) % this.data.length;
		 this.data[tail]=item;
		 size ++;
		}
	}
	public int front()
	{
		return data[front] ;
	}
	public int dequeue() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("Queue is empty");
		}
		else 
		{
			int rv=this.data[this.front];
			this.data[this.front]=0;
			front = (front+1)%this.data.length;
			size--;
			return rv;
		}
	}
	public int size()
	{
		return this.size;
	}
	
	public boolean isempty()
	{
		return this.size==0;
	}

	public void display()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0; i<this.size ; i++)
		{
			
			 int index= (front + i)%this.data.length;
			System.out.print(this.data[index] + " \t");
          
        }
		 System.out.println(".");
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
 
	public void displayRev() throws Exception {
		displayRev(0);
	}
	private void displayRev(int count) throws Exception {
		if(count==this.size) {
		    return;
		}
		int item = this.dequeue();
		this.enqueue(item);
		displayRev(count+1);
		System.out.print(item + "\t");
	}
	
	public void RevQueue() throws Exception{
		if(this.size()==0) {
			return;
		}
		int item = this.dequeue();
		RevQueue();
		this.enqueue(item);
	}
}
