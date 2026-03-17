public class OOPSBannerApp5 {
    public static void main(String[] args) {
        String[] bannerLines = {
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", "H", "E", "L", "L", "O", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", " ", " ", "W", "O", "R", "L", "D", " ", " ", "*"),
            String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}