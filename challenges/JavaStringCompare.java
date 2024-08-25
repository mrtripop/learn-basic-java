package challenges;

public class JavaStringCompare {

    private JavaStringCompare() {
    }

    public static String getSmallestAndLargest(String s, int k) {
        int length = s.length();
        String[] arrays = new String[s.length() / k * 2];
        for (int i = 0; i < s.length() - k; i += k) {
            String forword = s.substring(i, i + k);
            int begin = (length - 1) - (k - 1) - i;
            int end = length - i;
            String backword = s.substring(begin, end);
            for (int j = 0; j < arrays.length - 1; j++) {
                if (arrays[j] == null) {
                    arrays[j] = forword;
                    arrays[j + 1] = backword;
                    break;
                }
            }
        }
        sort(arrays);
        return arrays[0] + "\n" + arrays[arrays.length - 1];
    }

    private static void sort(String[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                String a = arrays[i];
                String b = arrays[j];
                int compare = a.compareTo(b);
                if (compare > 0) {
                    String temp = b;
                    arrays[j] = a;
                    arrays[i] = temp;
                }
            }
        }
    }
}
