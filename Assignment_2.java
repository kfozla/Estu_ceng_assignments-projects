import java.util.Random;
public class Assignment_2 {
    private static final int[] YEARS = new int[] {
            1881, 1893, 1900, 1910, 1919, 1923, 1930, 1932, 1934, 1938
    };
    private static final String[] QUOTES = new String[] {
            "Teachers are the one and only people who save nations.",
            "Everything we see in the world is the creative work of women.",
            "Our true mentor in life is science.",
            "The future is in the skies.",
            "Peace at home, peace in the world."
    };
    private static int getRandomYear() {
        return YEARS[new Random().nextInt(YEARS.length)];
    }
    private static String getRandomQuote() {
        return QUOTES[new Random().nextInt(QUOTES.length)];
    }
    public static void main(String[] args) {
        int year = getRandomYear();
        switch (year){

            case 1881:
                System.out.println("1881:\n Mustafa was born in Salonika.");
                break;

            case 1893:
                System.out.println("1893:\n Mustafa was given the additional name Kemal at military school.");
                break;

            case 1919:
                System.out.println("1919:\n  Mustafa Kemal landed in Samsun.");
                break;

            case 1923:
                System.out.println("1923:\n  Mustafa Kemal was elected as the first president of the Republic of Turkey.");
                break;

            case 1932:
                System.out.println("1932:\n  Mustafa Kemal founded the Turkish Linguistic Society.");
                break;

            case 1934:
                System.out.println("1934:\n  The Grand National Assembly of Turkey granted him the surname Atatürk.");
                break;

            case 1938:
                System.out.println("1938:\n  Atatürk died in Istanbul.");
                break;

            default:
                System.out.println(getRandomQuote());

        }
    }
}