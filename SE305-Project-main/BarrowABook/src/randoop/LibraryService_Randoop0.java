package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LibraryService_Randoop0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test001");
        test.LibraryService libraryService0 = new test.LibraryService();
        java.lang.Class<?> wildcardClass1 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test002");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass5 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test004");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass3 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test005");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass7 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test006");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test007");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass7 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test008");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass5 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test009");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test010");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass3 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test011");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass5 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test012");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass7 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test013");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass7 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test014");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test015");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test016");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test017");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test018");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test019");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test020");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass7 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test021");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test022");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass7 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test023");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass7 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test024");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test025");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test026");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass5 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test027");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test028");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test029");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test030");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test031");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test032");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test033");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test034");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test035");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test036");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test037");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test038");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test039");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test040");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test041");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test042");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test043");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test044");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test045");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test046");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test047");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test048");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test049");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test050");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test051");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test052");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test053");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test054");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test055");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test056");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test057");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test058");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test059");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test060");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test061");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test062");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test063");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test064");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test065");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test066");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test067");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test068");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test069");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test070");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test071");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test072");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test073");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test074");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test075");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test076");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test077");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test078");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test079");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test080");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test081");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test082");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test083");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test084");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass25 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test085");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test086");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass7 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test087");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test088");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test089");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test090");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test091");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test092");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test093");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test094");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test095");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test096");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test097");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test098");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test099");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test100");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test101");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test102");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test103");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test104");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test105");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test106");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test107");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test108");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test109");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test110");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test111");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test112");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test113");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test114");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test115");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test116");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test117");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test118");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test119");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test120");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test121");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test122");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test123");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test124");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test125");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test126");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test127");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test128");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test129");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass25 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test130");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass25 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test131");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test132");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test133");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test134");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test135");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test136");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test137");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test138");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test139");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test140");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass25 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test141");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test142");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test143");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test144");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass27 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test145");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test146");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test147");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test148");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test149");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test150");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test151");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test152");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test153");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test154");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test155");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test156");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test157");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test158");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test159");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test160");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test161");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test162");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test163");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test164");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass25 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test165");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test166");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test167");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test168");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test169");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test170");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test171");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test172");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass29 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test173");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test174");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test175");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test176");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test177");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test178");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test179");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test180");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test181");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test182");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test183");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test184");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test185");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test186");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test187");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test188");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass31 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test189");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass29 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test190");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test191");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test192");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test193");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass29 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test194");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test195");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test196");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test197");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test198");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test199");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test200");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test201");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test202");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test203");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test204");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test205");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass29 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test206");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test207");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test208");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test209");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test210");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass9 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test211");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test212");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test213");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test214");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass35 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test215");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test216");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test217");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test218");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test219");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test220");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test221");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test222");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test223");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test224");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test225");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test226");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test227");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test228");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test229");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test230");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test231");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass27 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test232");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test233");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test234");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test235");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass27 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test236");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass31 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test237");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test238");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass33 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test239");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test240");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test241");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test242");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test243");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test244");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test245");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test246");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test247");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test248");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test249");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass33 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test250");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test251");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass27 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test252");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test253");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass11 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test254");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test255");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass33 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test256");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass15 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test257");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass29 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test258");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test259");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass17 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test260");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test261");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test262");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test263");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test264");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass21 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test265");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test266");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test267");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test268");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test269");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test270");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test271");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test272");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test273");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test274");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test275");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test276");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test277");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass23 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test278");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test279");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass19 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test280");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass13 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LibraryService_Randoop0.test281");
        test.LibraryService libraryService0 = new test.LibraryService();
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("hi!");
        libraryService0.borrowBook("");
        java.lang.Class<?> wildcardClass31 = libraryService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}

