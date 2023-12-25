public class minheaptree<T extends Comparable <T>>{
	private	T[] Heap;
	private	int size;
	private	int maxsize;
	private static final int front = 1;
	public	minheaptree(T[] arr, T node) {
		this.maxsize = arr.length;
		this.size = 0;
		Heap = arr;
		Heap[0] = node;
	}
	private int parent(int pos) {
		return pos / 2;
	}
	private int leftChild(int pos) {
		return (2 * pos);
	}
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		} else {
			return    false;
		}
	}
	private void swap(int fpos, int spos) {
		T temp;
		temp = Heap[fpos];
		Heap[fpos] = Heap [spos];
		Heap[spos] = temp;
	}
	public  void print() {
		for (int i = 1; i <= size / 2; i++) {
			System.out.print("Parent : " + Heap[i] + " Left Child : " + Heap[2 * i] + " Right Child : " + Heap[2 * i + 1]);
			System.out.println();
		}
	}

		private void minHeapify(int pos) {
			//if the node is a non- leaf node and greater than any of its child

			if (! isLeaf(pos)) {
				if (Heap[pos]. compareTo(Heap[leftChild(pos)]) > 0 || Heap [pos].compareTo(Heap[rightChild(pos)]) > 0) {
					//swap the left child and heapify
					//the left child
					if (Heap[leftChild(pos)]. compareTo(Heap[rightChild(pos)]) < 0) {
						swap(pos, leftChild(pos));
						minHeapify(leftChild(pos));
					}
					//swap with the right child and heapify the right child
					else {
						swap(pos, rightChild(pos));
						minHeapify(rightChild(pos));
					}
				}
			}
		}
		public void insert(T element) {
			if (size >= maxsize) {
				return;
			}
			Heap[++size] = element;
			int current = size;
			while (Heap[current ]. compareTo(Heap[parent(current)]) < 0) {
				swap(current, parent(current));
				current = parent(current);
			}

		}
		public T remove() {
			T poped = Heap[front];
			Heap[front] = Heap[size--];
			minHeapify(front);
			return poped;
		}
		public void minHeap(){
		    for(int pos=(size/2); pos>=1; pos--){
		        minHeapify(pos);
		    }
		}

		public static void main(String[] args) {
		    Integer [] a=new Integer[10];
		    
 minheaptree b=new minheaptree(a,6);
 b.insert(7);
 b.insert(5);
 b.insert(9);
 b.insert(3);
 b.insert(10);
 b.insert(8);
 b.insert(18);
 b.insert(1);
 b.insert(4);
 b.print();
 b.remove();
 b.minHeap();
 b.print();
 
		}
	}
	