public class OOPSBannerApp3 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        System.out.println(buildLine(
                " ***** ", " ***** ", " ***** ", " ***** "
        ));

        System.out.println(buildLine(
                "*     *", "*     *", "*     *", "*      "
        ));

        System.out.println(buildLine(
                "*     *", "*     *", "*     *", "*      "
        ));

        System.out.println(buildLine(
                "*     *", "*     *", " ***** ", " ***** "
        ));

        System.out.println(buildLine(
                "*     *", "*     *", "*      ", "      *"
        ));

        System.out.println(buildLine(
                "*     *", "*     *", "*      ", "      *"
        ));

        System.out.println(buildLine(
                " ***** ", " ***** ", "*      ", " ***** "
        ));
    }

    public static String buildLine(String a, String b, String c, String d) {
        return String.join("   ", a, b, c, d);
    }
}