package challenges.varargs;

public class VarargsTest {

    /*
     * Reference problem:
     * https://www.hackerrank.com/challenges/simple-addition-varargs/problem
     * 
     * Knowledge reference: https://stackoverflow.com/a/44183911
     */

    private Add add = new Add();

    public VarargsTest() {
        System.out.println("\n====== Java Varargs Test ======");
    }

    public void testVarargs() {
        // arrange
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;

        // action
        String r1 = add.add(n1, n2);
        String r2 = add.add(n1, n2, n3);
        String r3 = add.add(n1, n2, n3, n4, n5);
        String r4 = add.add(n1, n2, n3, n4, n5, n6);

        // expect
        String e1 = "1+2=3";
        String e2 = "1+2+3=6";
        String e3 = "1+2+3+4+5=15";
        String e4 = "1+2+3+4+5+6=21";

        // assert
        assert e1.equals(r1);
        assert e2.equals(r2);
        assert e3.equals(r3);
        assert e4.equals(r4);
    }
}
