public class OOPSBannerApp6 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "Hello, ";

        for (String name : args) {
            result += name + ", ";
        }

        // remove last ", "
        result = result.substring(0, result.length() - 2);

        result += "!";

        System.out.println(result);
    }
}