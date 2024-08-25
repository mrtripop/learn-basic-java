package challenges.string;

public class BasicString {

    public String sub(String S, int start, int end) {
        return S.substring(start, end - 1);
    }

    /**
     * Challenge:
     * https://www.hackerrank.com/challenges/java-strings-introduction/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * 
     * @param a
     * @param b
     */
    public void introduction(String a, String b) {
        // sum word length
        int length = a.length() + b.length();
        System.out.println(length);
        // a is before b?
        int lexicographically = a.compareTo(b);
        if (lexicographically > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // capitalize
        String A = a.substring(0, 1).toUpperCase() + a.substring(1);
        String B = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.printf("%s %s%n", A, B);
    }

}
