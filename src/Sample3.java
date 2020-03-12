class Sample3 {

    public static void main (String args[]) {

        // Test 1: expected value is 'd'
        char c1 = Caesar.shift(3, 'a');
        System.out.println(c1);

        // Test 2: expected value is 'r'
        char c2 = Caesar.shift(2, 'p');
        System.out.println(c2);

        // Test 3: expected value is 'c'        
        char c3 = Caesar.shift(3, 'z');
        System.out.println(c3);

        // Test 4: expected value is "k nqxg lcxc!"
        String encoded = Caesar.encode(2, "i love java!");
        System.out.println(encoded);

        // Test 5: expected value is "i love java!"
        String encoded2 = Caesar.encode(0, "i love java!");
        System.out.println(encoded2);

        // Test 6: expected value is "i love java!"
        String decoded = Caesar.decode(2, encoded);
        System.out.println(decoded);

        // Test 7: expected value is "i love java!"
        String decoded2 = Caesar.decode(0, encoded2);
        System.out.println(decoded2);
    }
}