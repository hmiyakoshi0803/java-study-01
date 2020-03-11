class Concat {
    public static void main(String[] args) {
        String str = "";

        for (int i = 0; i < args.length; i++) {           
            String s = args[i];
            str = str.concat(s);
        }
        System.out.println(str);
    }
}
