package challenges.javaStringCompare;

public class JavaStringCompareTest {

    public JavaStringCompareTest() {
        System.out.println("");
        System.out.println("========== Java String Compare =========");
    }

    public void testWelcomeToJava() {
        // arrange
        String s = "welcometojava";
        int k = 3;
        // action
        String result = JavaStringCompare.getSmallestAndLargest(s, k);
        // assert
        String expect = "ava\nwel";
        System.out.println("-------- 1 ---------");
        System.out.printf("Result: %b, expect: %s, actual: %s%n", expect.equals(result), expect, result);
        assert true == expect.equals(result);
    }

    public void testHelloWorldJava() {
        // arrange
        String s = "HelloWorldJava";
        int k = 4;
        // Hell, Java
        // oWor, orld
        // ldJa, lloW
        // [Hell, Java, oWor, orld, ldJa, lloW]
        // [Hell, Java, ldJa, lloW, oWor, orld]
        // Hell\noWor

        // action
        String result = JavaStringCompare.getSmallestAndLargest(s, k);
        // assert
        String expect = "Hell\norld";
        System.out.println("-------- 2 ---------");
        System.out.printf("Result: %b, expect: %s, actual: %s%n", expect.equals(result), expect, result);
        assert true == expect.equals(result);
    }

    public void testLongText() {
        // arrange
        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int k = 30;

        // [ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl, FlajfsdlfhsdlfhDSLFHSDLFHdlfhs,
        // fhsdlhkfsdlfLHDFLSDKFHsdfhsdlk, hsdkfhsdkfhsdfhsdfjeaDFHSDLFHD,
        // fhsdlfhsLFDLSFHSDLFHsdkfhsdkfh, fhsdlkfhsdlfhsLFDLSFHSDLFHsdkf,
        // sdkfhsdfhsdfjeaDFHSDLFHDFlajfs, LFHsdlfhsdlhkfsdlfLHDFLSDKFHsd]

        // [ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl, FlajfsdlfhsdlfhDSLFHSDLFHdlfhs,
        // LFHsdlfhsdlhkfsdlfLHDFLSDKFHsd, fhsdlhkfsdlfLHDFLSDKFHsdfhsdlk,
        // fhsdlfhsLFDLSFHSDLFHsdkfhsdkfh, fhsdlkfhsdlfhsLFDLSFHSDLFHsdkf,
        // hsdkfhsdkfhsdfhsdfjeaDFHSDLFHD, sdkfhsdfhsdfjeaDFHSDLFHDFlajfs]

        // action
        String result = JavaStringCompare.getSmallestAndLargest(s, k);
        // assert
        String expect = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl\nsdlkfhsdlfhsLFDLSFHSDLFHsdkfhs";
        System.out.println("-------- 3 ---------");
        System.out.printf("Result: %b%n, expect: %s%n, actual: %s%n", expect.equals(result), expect, result);
        assert true == expect.equals(result);
    }

}
