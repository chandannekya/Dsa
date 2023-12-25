
import java.util.*;
import java.io.*;
class JLinkedList <T> {
	Node head;
	class Node {
		T data;
		Node next;
		Node() {
			data = null;
			next = null;
		}
		Node(T d) {
			data = d;
			next = null;
		}
	}
	JLinkedList() {
		head = new Node();
	}
	public void insertFront(T data) {
		//create a new node with given data
		Node newNode = new Node(data);
		newNode.next = this.head.next;
		//make the new node as the first node
		this.head.next = newNode;

	}
	public void insertEnd(T data) {
		Node newNode = new Node(data);
		newNode.next = null;
		Node temp = this.head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void insertAny(T data, T key) {
		Node newNode = new Node(data);
		newNode.next = null;
		Node temp = this.head;
		boolean status = false;
		while (temp != null) {
			if (temp.data == key) {
				status = true;
				break;
			}
			temp = temp.next;
		}
		if (status) {
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	public void printlist() {
		Node currNode = this.head.next;
		System.out.print("LinkedList : ");
		// Traverse through the Link list
		while (currNode != null) {
			//print the data of current list
			System.out.print(currNode.data + "   ");
			//Next Node
			currNode = currNode.next;
		}
		System.out.println();
	}
	public void merge(JLinkedList<T> l2) {
		Node l1Node = this.head;
		Node l2Node = l2.head;
		while (l1Node.next != null) {
			l1Node = l1Node.next;
		}
		l1Node.next = l2Node.next;
		//free(l2.head);

	}
	public T deleteFront() {
		T x = null;
		Node temp = this.head.next, prev = null;
		if (temp != null) {
			x = temp.data;
			this.head.next = temp.next;
		}
		return x;
	}
	public T deleteEnd() {
		T x = null;
		Node temp = this.head.next, prev = null;
		if (temp != null) {
			while (temp != null) {
				prev = temp;
				temp = temp.next;
			}
			x = temp.data;
			prev.next = null;
		}
		return x;
	}
	public void deleteAny(T key) {
		Node temp = this.head.next, prev = null;
		while (temp != null) {
			if (temp.data == key) {
				prev.next = temp.next;
				System.out.println(key + " position element deleted");
				break;
			} 
			else {
				prev = temp;
				temp = temp.next;
			}
		}}
		public Node remove(Node n) {
			Node current = n;
			Node next = n.next;
			Node prev = null;
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			this.head.next = prev;
			return next;
		}
		public void reverse() {
			Node currNode = this.head.next;
			System.out.print("Reversed List : ");
			remove(currNode);
		}

	}
	public class LinkedList {
		public static void main(String[] args) {
			JLinkedList<Integer>  list = new JLinkedList <Integer>();
			list.insertEnd(9);
			list.insertFront(7);
			list.insertAny(2, 7);
			list.printlist();
			JLinkedList<Integer> l2 = new JLinkedList<Integer>();
			l2.insertFront(8);
			l2.insertEnd(5);
			l2.insertEnd(4);
			l2.merge(list);
			l2.deleteAny(7);
			list.reverse();
			l2.printlist();
		}
	}