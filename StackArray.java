import java.util.*;
class StackA<T> {
	T[] data;
	int length;
	int top;
	// constructor
	StackA(T[] a) {
		data = a;
		length = a.length;
		top = -1;
	}
	void push(T a) {
		if (top < length - 1) {
			top++;
			data[top] = a;
		} else {
			System.out.println("Stack Over flow");
		}
	}
	T pop() {
		T a = null;
		if (top == -1) {
			System.out.println("Stack Underflow ");
		} else {
			a = data[top];
			top--;
		}
		return a;
	}
boolean isEmpty(){
    if(top ==-1){
        return true;
    }
    else{
        return false;}
}
void printStack(){
    if(top ==-1){
        System.out.println("Stack Empty");
    }
    else {
        for(int i=top; i>=0; i--){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}

}

public class Main {
	public static void main(String[] args) {
Integer a[]=new Integer [2];
StackA<Integer> st=new StackA<Integer>(a);
st.push(6);
st.push(7);
st.printStack();
st.push(4);
st.printStack();
st.pop();
st.printStack();
st.pop();
st.pop();
System.out.println(" is empty " +  st.isEmpty());
	}
}