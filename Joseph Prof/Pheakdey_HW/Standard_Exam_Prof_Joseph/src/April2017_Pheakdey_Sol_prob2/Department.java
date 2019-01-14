package April2017_Pheakdey_Sol_prob2;

public abstract class Department {
	
	private StringQueue queue = new StringQueue();
	
	public StringQueue getQueue() {
		return queue;
	}
	
	//implement
	
	public abstract String getName();
	
	public void addMessage(String msg) {
		queue.enqueue(msg);
	}
	
//	public String nextMessage() throws EmptyQueueException {
//		if(queue == null) {
//			throw new EmptyQueueException();
//		}
//		
//		return queue.dequeue();
//	}
	
	public String nextMessage() {
		String str = "";
		try {
			str = queue.dequeue();
		} catch (EmptyQueueException e) {
			//e.printStackTrace();
		}
		return str;
	}
	
}
