public class List<T> {
    private Obj<T> head = null;
    private static int size = 0;

    public List(T elem) { this.head = new Obj(elem); size++; }
    public List() {}

    public void add(T elem){
        if(this.head == null)
            this.head = new Obj(elem);
        else {
            Obj<T> tmp = new Obj(elem);
            this.head.setNext(tmp);
        }

        size++;
    }

    public T pop() {
        Obj<T> tmp = head, res;
        T result;
        while (tmp.getNext().getNext() != null)
            tmp = tmp.getNext();

        res = tmp.getNext();
        result = res.getElem();

        tmp.setNext(null);
        size--;
        return result;
    }

    public T getElem() {
        Obj<T> tmp = head;
        T result;
        while (tmp.getNext().getNext() != null)
            tmp = tmp.getNext();

        return tmp.getElem();
    }

    public void printList() {
        Obj<T> tmp = head;
        while(tmp != null) {
            System.out.print(tmp.getElem() + " ");
            tmp = tmp.getNext();
        }
    }
}
