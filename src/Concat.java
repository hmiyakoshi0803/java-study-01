package src;

class Concat {
    public static void main(String[] args) {

        String resultStr = do_concat(args);
        System.out.println(resultStr);
    }

    public static String do_concat(String[] strs) {
        String concatStr = "";

        for (int i = 0; i < strs.length; i++) {           
            String s = strs[i];
            concatStr = concatStr.concat(s);
        }

        return concatStr;

    }
}
