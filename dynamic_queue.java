package QUEUE;

public class dynamic_queue extends Queue {
	public dynamic_queue(int cap)
	{
		super(cap);
	}
	@Override
	public void enqueue(int item) throws Exception
	{
		if (size== this.data.length)
		{
			int[] oa = this.data;
			
			int[] na = new int[2*this.data.length];
			for(int i=0;i<size ; i++)
			{
				
				na[i]=oa[(front+i)%oa.length];
				
			}
			front =0;
			data=na;
		}
		super.enqueue(item);
	}

}
