public class OOPSBannerApp4 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String[] banner = {

            buildLine(" ***** ", " ***** ", " ***** ", " ***** "),
            buildLine("*     *", "*     *", "*     *", "*      "),
            buildLine("*     *", "*     *", "*     *", "*      "),
            buildLine("*     *", "*     *", " ***** ", " ***** "),
            buildLine("*     *", "*     *", "*      ", "      *"),
            buildLine("*     *", "*     *", "*      ", "      *"),
            buildLine(" ***** ", " ***** ", "*      ", " ***** ")

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String buildLine(String a, String b, String c, String d) {
        return String.join("   ", a, b, c, d);
    }
}