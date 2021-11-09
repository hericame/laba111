import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new List();
        list.add(123);
        list.add(456);

        list.printList();
        list.printList();

        int res = list.pop();
        System.out.println();
        list.printList();
        System.out.println();
        System.out.println(res);
    }
}
