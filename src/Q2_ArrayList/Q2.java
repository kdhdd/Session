package Q2_ArrayList;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<100; i++) {
            list.add(i+1);
        }

        for (int i=0; i<list.size(); i++) {
            if (list.get(i)%2==1)
                list.remove(i);
        }

        System.out.println(list);
    }
}
