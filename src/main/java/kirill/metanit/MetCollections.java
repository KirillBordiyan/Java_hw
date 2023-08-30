package kirill.metanit;

import java.util.*;

public class MetCollections {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);





        ExpCol array = new ExpCol();
        array.list.add("1");
        array.list.add("5");
        array.list.add("4");
        array.list.add("3");
        array.list.add("2");

        array.list.forEach(System.out::println); //equals for each

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("1");
        al1.add("2");
        al1.add("4");
        al1.add("5");
        al1.add("3");
        al1.add("2");


        ArrayList<String> al = new ArrayList<String>(al1);
        al.add("123123");
        System.out.println(al1);
        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add(0, "9");
        al2.add(1,"10");
        al2.addAll(2,al);
        System.out.println(al2);
    }
}


class ExpCol {



    //лист из нескольких вариантов
    List<String> list = new ArrayList<>();
    List<String> list2 = new LinkedList<>(list);
    List<String> list3 = new Stack<>(); //depr
    List<String> list4 = new Vector<>(); //depr



    //самостоятельные классы
    ArrayList<String> arrayList = new ArrayList<>();
    LinkedList<String > ll = new LinkedList<>();
    Stack<String> listS = new Stack<>(); //depr
    Vector<String> listV = new Vector<>(); //depr
    Vector<String > vs = new Stack<>();


    //queueQ
    Queue<String> ad = new ArrayDeque<>();
    Queue<String> qp = new PriorityQueue<>();
    Queue<String> ql = new LinkedList<>();

    //deq
    Deque<String> da = new ArrayDeque<>();
    Deque<String> dl = new LinkedList<>();

    //самостоятельные queue
    PriorityQueue<String> pq = new PriorityQueue<>();
    ArrayDeque<String> arrayDeque = new ArrayDeque<>();

    //set
    Set<String> set = new HashSet<>();
    Set<String> setl = new LinkedHashSet<>();
    Set<String> setT = new TreeSet<>();
    SortedSet<String> ss = new TreeSet<>();

    //самостоятельные set
    HashSet<String > hs = new HashSet<>();
    LinkedHashSet<String> lhs = new LinkedHashSet<>();
    TreeSet<String > ths = new TreeSet<>();


    Iterable<String> it = new ArrayList<>();
    Iterable<String> itll = new LinkedList<>();
    Iterable<String> itad = new ArrayDeque<>();

    Collection<String> col = new ArrayList<>();//аналогично


    //т.е можно создавать объекты интерфейсов на основе существующих классов, которые реализуют методы этих интерфейсов
}
