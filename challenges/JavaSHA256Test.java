package challenges;

public class JavaSHA256Test {

    private JavaSHA256 javaSHA256 = new JavaSHA256();

    public JavaSHA256Test() {
        System.out.println("========= Java SHA256 Test ========");
    }

    public void testCryptographicHash_hashHelloWorld() {
        String text = "HelloWorld";
        // action
        String hashed = javaSHA256.hash(text);
        // assert
        String expect = "872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4";
        System.out.printf("Result: %b, expect: %s, actual: %s%n", expect.equals(hashed), expect, hashed);
        assert true == expect.equals(hashed);
    }

}
