public class Obj<T> {
    private Obj next = null;
    private T elem;

    public Obj(T elem) { this.elem = elem; }
    public Obj() {}

    public Obj getNext() { return next; }
    public T getElem() { return elem; }

    public void setNext(Obj next) { this.next = next; }
    public void setElem(T elem) { this.elem = elem; }
}
