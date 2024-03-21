public class Strings {
    public static void main(String[] args) {
        //Strings comparison
        //Strings aren't primitive, so when compare with == it compares by reference
        //To compare by value, it needs to use equals()
        String str1 = "Hello, this is a instance string";
        String str2 = new String("Hello, this is a instance string");
        String str3 = str1;

        System.out.println("same object? " + (str1 == str2)); // false
        System.out.println("same value? " + str1.equals(str2)); // true
        System.out.println("Same object by reference? " + str3 == str1); // false

        //String methods
        //length(), equals(), equalsIgnoreCase(), compareTo(), trim(), charAt(), concat(), replace()
        //toCharArray(), substring(), indexOf(), lastIndexOf(), startsWith(), endsWith(), split(), transform()
        //isEmpty(), isBlank()

//        char[] arrayOfChars = str1.toCharArray();
//        System.out.println(arrayOfChars[0]);
//
//        String[] splitStr = str1.split(",");
//        System.out.println(splitStr.length);

        //String name = "Duke";
        //String info = STR."My name is \{name}";
        //System.out.println(info);

        // Performance at concatenation
        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        long init = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            // c += a + b + "\n"; // 40ms
            //c.concat(a).concat(b).concat("\n"); // 5ms
            //sb.append(a).append(b).append("\n"); // 0ms
        }

        long end = System.currentTimeMillis();
        System.out.println(end - init);
    }
}
