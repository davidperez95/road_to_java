public class ParseValues {
    public static void main(String[] args) {
        // String to primitive
        String strNumber = "35";
        int number = Integer.parseInt(strNumber);

        String strDouble = "1.2";
        double realDouble = Double.parseDouble(strDouble);

        String trueValue = "true";
        boolean realBoolean = Boolean.parseBoolean(trueValue);

        // Primitive to string
        int normalNumber = 35;
        String numberToString = Integer.toString(normalNumber);

        // Double.toString()
        // Boolean.toString()

        int i = 30000;
        short s = (short) i;

        long l = i;
        char c = (char) i;

        float f = (float) i;
    }
}
