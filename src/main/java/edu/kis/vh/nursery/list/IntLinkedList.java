package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int ERROR_VALUE = -1;
    private Node last;
    private int i;

    class Node {

        private final int value;
        private Node prev;
    	private Node next;

        public Node(int i) {
            value = i;
        }

    	public Node getPrev() {
    		return prev;
    	}

    	public void setPrev(Node prev) {
    		this.prev = prev;
    	}

    	public Node getNext() {
    		return next;
    	}

    	public void setNext(Node next) {
    		this.next = next;
    	}

    	public int getValue() {
    		return value;
    	}
    }
    
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return ERROR_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return ERROR_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
