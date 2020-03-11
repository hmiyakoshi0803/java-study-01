class Hello {
    public static void main(String[] args){
        System.out.println(args.length);
        for (int i=0; i<args.length; i++){
            String s = args[i];
            System.out.println(s);
        }
    }
}