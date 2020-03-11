import java.util.List;
import java.util.Arrays;

class Sample2 {
    public static void main (String args[]){

        // Example1 expected answer is [Java, Java, Java]
        List<String> strList1 = ListUtil.makeList(3, "Java");
        System.out.println(strList1);

        // Example2 expected answer is [hello, hello]
        List<String> strList2 = ListUtil.makeList(2, "hello");
        System.out.println(strList2);


        // Example3 expected answer is [Javava, Javava, Javava]
        List<String> strList = ListUtil.makeListGeneric(3, "Javava");
        System.out.println(strList);

        // Exampl4 expected answer is [true, true]
        List<Boolean> boolList = ListUtil.makeListGeneric(2, true);
        System.out.println(boolList);

        // Example5 expected answer is [3, 3, 3, 3]
        List<Integer> intList = ListUtil.makeListGeneric(4, 3);
        System.out.println(intList);

        // Example6 expected answer is 20
        int total1 = ListUtil.evenDoubleTotal(Arrays.asList(1, 2, 3, 4));
        System.out.println(total1);

        // Example7 expexted answer is 100
        int total2 = ListUtil.evenDoubleTotal(Arrays.asList(5, 6, 7, 8));
        System.out.println(total2);

    }
}