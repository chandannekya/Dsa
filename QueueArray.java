import java.util.*;
class QueueA<T> {
	T[] data;
	int front, rear;
	int length;
	QueueA(T[] a) {
		data = a;
		front = 0;
		rear = -1;
		length = a.length;
	}
	//insertion
	void enque(T a) {
		if (rear >= length - 1) {
			System.out.println(" Queue Overflow ");
		} else {
			rear++;
			data[rear] = a;
		}
	}
	T deque() {
		T x = null;
		if (isEmpty()) {
			System.out.println("Queue Underflow ");
			return null;
		} else {
			x = data[front ];
			front++;
			return x;
		}
	}
	boolean isEmpty(){
		if (front > rear) {
			return   true;
		} else {
			return false;
		}
	}
	void printQueue() {
		if (! isEmpty()) {
			for (int i = front; i <= rear; i++) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}

}
public class QueueArray{
	public static void main(String[] args) {
		String a[] = new String [5];
		QueueA<String> Qa = new QueueA<String>(a);
		Qa.enque("Ram");
		Qa.printQueue();
		Qa.enque("Shyam");
		Qa.printQueue();
		Qa.enque("Nasm");
		Qa.printQueue();
		Qa.enque("Bhasm ");
		Qa.printQueue();
		Qa.enque("Rams");
		Qa.printQueue();
		Qa.enque("Liyoo");
		Qa.deque();
		Qa.printQueue();
		Qa.deque();
		Qa.printQueue();
		Qa.deque();
		Qa.printQueue();
	
		Qa.deque();
		Qa.printQueue();
		Qa.deque();
		Qa.printQueue();
		Qa.deque();
		
		System.out.println("Queue is Empty : "  + Qa.isEmpty());

	}
}