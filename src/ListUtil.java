import java.util.List;
import java.util.ArrayList;

class ListUtil {
    public static List<String> makeList(int numOfArray, String str){

        List<String> list = new ArrayList<>();

        for (int i=0; i < numOfArray; i++) {
            list.add(str);
        }

        return list;
    }

    public static <T> List<T> makeListGeneric(int numOfArray, T arg){

        List<T> list = new ArrayList<T>();

        for (int i=0; i < numOfArray; i ++) {
            list.add(arg);
        }

        return list;

    }

    public static int evenDoubleTotal(List<Integer> list){

        int total = 0;

        for (int i=0; i < list.size(); i++) {

            int num = list.get(i);

            if (num%2 == 0) {
                total += Math.pow(num, 2);
            }
        }

        return total;
    }
}