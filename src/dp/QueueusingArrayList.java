package dp;
import java.util.ArrayList;
public class QueueusingArrayList {
	ArrayList<Integer> queue = new ArrayList<Integer>();
	int front=0,rear=-1;
	
	public QueueusingArrayList(ArrayList<Integer> queue, int front, int rear) {
		super();
		this.queue = queue;
		this.front = front;
		this.rear = rear;
	}
	public void add(int val) {
		queue.add(val);
		rear++;
	}
	public int pop() {
		rear--;
		return queue.remove(front);
	}
	public int peek() {
		return queue.get(front);
	}
	public void printQueue() {
		for(int i= front;i<=rear;i++) {
			System.out.println(queue.get(i));
		}
	}
	public void deleteElement(Integer e) {
		for(int i=front;i<=rear;i++) {
			if(queue.get(i)==e)
			{
				queue.remove(i);
				rear--;
			}
			
		}
	}
}
