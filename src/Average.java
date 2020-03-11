class Average {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < args.length; i++) {           
            int n = Integer.parseInt(args[i]);
            num += n;
        }

        double answer = (args.length != 0) ? (double) num / args.length : 0; 
        System.out.println(answer);
    }
}
