package StandardExamSelfPracticePro1.April2017_Prob2.prob2;

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
	
	public String nextMessage() {
		String str = "";
		try {
			str = queue.dequeue();
		} catch (EmptyQueueException e) {
		
		}
		return str;
	}
}
