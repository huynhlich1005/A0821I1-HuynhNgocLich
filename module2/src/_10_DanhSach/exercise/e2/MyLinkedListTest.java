package DanhSach.exercise.e2;

public class MyLinkedListTest {
    public static void main(String[] avgs) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2,"lich");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(2);
        System.out.println(list.indexOf("lich"));
    }
}
