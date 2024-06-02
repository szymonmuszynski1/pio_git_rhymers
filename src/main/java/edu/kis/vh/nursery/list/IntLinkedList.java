package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca listę dwukierunkową liczb całkowitych.
 */
public class IntLinkedList {

    public static final int ERROR_VALUE = -1;
    private Node last;
    private int i;

    
    /**
     * Klasa reprezentująca węzeł listy dwukierunkowej.
     */
    class Node {

        private final int value;
        private Node prev;
    	private Node next;

        /**
         * Konstruktor węzła listy dwukierunkowej, jedynym nadawanym atrybutem jest jego wartość.
         * @param i - ten parametr przypisywany jest do pola value.
         */
        public Node(int i) {
            value = i;
        }

    	/**
    	 * Metoda pozwalająca otrzymać węzeł (Node) spod pola prev.
    	 * @return - zwracana wartość to węzeł spod pola prev.
    	 */
    	public Node getPrev() {
    		return prev;
    	}

    	/**
    	 * Metoda ustawiająca węzeł na pole prev.
    	 * @param prev - ustawiany węzeł na pole prev.
    	 */
    	public void setPrev(Node prev) {
    		this.prev = prev;
    	}

    	/**
    	 * Metoda pozwalająca otrzymać węzeł spod pola next.
    	 * @return - zwracana wartość to węzeł spod pola next.
    	 */
    	public Node getNext() {
    		return next;
    	}

    	/**
    	 * Metoda ustawiająca węzeł na pole next. 
    	 * @param next - węzeł, który zostanie ustawiony na pole next.
    	 */
    	public void setNext(Node next) {
    		this.next = next;
    	}

    	
    	/**
    	 * Metoda pozwalająca otrzymać wartość liczbową zapisaną w danym węzle.
    	 * @return - zwracana wartość to liczba całkowita zapisana w danym węzle.
    	 */
    	public int getValue() {
    		return value;
    	}
    }
    
    /**
     * Metoda wpychająca węzeł na koniec listy dwukierunkowej.
     * @param i - ten parametr jest wartością, którą przyjmuje nowopowstały węzeł.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    
    /**
     * Metoda sprawdzająca czy lista dwukierunkowa jest pusta.
     * @return - true, gdy lista jest pusta, natomiast false, gdy lista nie jest pusta.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Metoda sprawdzająca czy lista jest pełna.
     * @return - zawsze zwracana jest false.
     */
    public boolean isFull() {
        return false;
    }

    
    /**
     * Metoda sprawdzająca jaką wartość ma ostatni na liście węzeł.
     * @return - zwracana jest wartość ostatniego węzła listy.
     */
    public int top() {
        if (isEmpty())
            return ERROR_VALUE;
        return last.getValue();
    }

    /**
     * Metoda sprawdzająca jaką wartość ma ostatni na liście węzeł, przy równoczesnym usunięciu go z listy.
     * @return - zwracana jest wartość ostatniego węzła listy.
     */
    public int pop() {
        if (isEmpty())
            return ERROR_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
// TODO:
// - add method that is an equivalent of top and pop methods but for the first element,
// - add method for pushing an element to the list's beginning.