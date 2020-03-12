public class Caesar {
    /**
    * アルファベットの小文字a〜zをそれぞれ整数0〜25に変換します。 * @param c a〜zのアルファベット
    * @return 0〜25の整数
    */
    public static int char2int(char c) {
        return c - 'a';
    }

    /**
    * 整数0〜25をそれぞれアルファベットの小文字a〜zに変換します。 * @param i 0〜25の整数
    * @return a〜zのアルファベット
    */
    public static char int2char(int i) {
        return (char)((int) 'a' + i);
    }

    /**
    * 文字が小文字のアルファベットならばtrueを返します。
    * @param c 判定対象の文字
    * @return 文字が小文字のアルファベットならばtrue、それ以外ならばfalse
    */
    public static boolean isLowerChar(char c) {
        return Character.isAlphabetic(c) && Character.isLowerCase(c);
    }

    public static char shift(int i, char c) {

        // Convert char to int
        int result1 = char2int(c);

        // Shift
        int result2 = result1 + i;

        // Adjust result2 within 0 and 25
        int result3 = result2 % 26;

        // Convert int to char
        return int2char(result3);

    }


    public static char unshift(int i, char c) {

        return shift(26 - i, c);
    }


    public static String encode(int i, String str) {

        //String resultStr = "";
        StringBuilder resultStr = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            char c1 = (isLowerChar(c)) ? shift(i, c) : c;

            resultStr.append(c1);
        }

        return new String(resultStr);

    }


    public static String decode(int i, String str) {
        
        String resultStr = encode(26 - i, str);
        return resultStr;
    }
}