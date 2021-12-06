package DanhSach.exercise.e1;

public class TextMyList {
    public static void main(String[] avgs){

        MyList<String> list = new MyList<>();
        list.add("chuc");
        list.add("mung");
        list.add("nam");
        list.add("moi");

        print(list.getData());
        System.out.println(list.indexOf("mung"));
        System.out.println(list.indexOf("cu"));
        list.remove(0);
        list.add("rat",0);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("chuc"));
        System.out.println(clone.contains("cu"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());
    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}
