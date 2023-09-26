public class Main {
    public static void main(String[] args) {
        System.out.println(getStringLength("Dog"));
        System.out.println(getStringLength2("Kitten"));
    }

    // BAD
    private static int getStringLength(String string) {
        int stringLength = 0;
        stringLength = string.length();
        return stringLength;
    }

    // GOOD
    private static int getStringLength2(String string) {
        return string.length();
    }
}