package challenges.varargs;

public class Add {

    public String add(int... args) {
        StringBuilder builder = new StringBuilder();
        int summary = 0;
        for (int i = 0; i < args.length; i++) {
            int n = args[i];
            summary += n;
            if (i == 0) {
                builder.append(n);
            } else {
                builder.append("+" + n);
            }
        }
        builder.append("=" + summary);
        String result = builder.toString();
        System.out.println("Result: " + result);
        return result;
    }

}
