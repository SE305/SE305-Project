import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRepository_Randoop0 {

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
            System.out.format("%n%s%n", "BookRepository_Randoop0.test001");
        test.BookRepository bookRepository0 = new test.BookRepository();
        java.lang.Class<?> wildcardClass1 = bookRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test002");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = book1_4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test003");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = book1_2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test004");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass5 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test005");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = book1_2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test006");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test008");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass7 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test009");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test010");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test011");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book1_6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test012");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass3 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test013");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test014");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass7 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test015");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = book1_4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test016");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test017");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = book1_4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test018");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test019");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass5 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test020");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test021");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test022");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test023");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass7 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test024");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass3 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test025");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass7 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test026");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test027");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test028");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test029");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test030");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test031");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass7 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test032");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test033");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book1_6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test034");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test035");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book1_6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test036");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book1_6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test037");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test038");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test039");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test040");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test041");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test042");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test043");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book1_6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test044");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test045");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test046");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test047");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test048");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test049");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test050");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test051");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test052");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test053");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test054");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test055");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test056");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test057");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test058");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test059");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test060");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test061");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test062");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book1_6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test063");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test064");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test065");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test066");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test067");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test068");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test069");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test070");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test071");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test072");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test073");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test074");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test075");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test076");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass7 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test077");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test078");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test079");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test080");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test081");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test082");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test083");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test084");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test085");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test086");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test087");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test088");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass5 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test089");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test090");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test091");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test092");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test093");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test094");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test095");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test096");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test097");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test098");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test099");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test100");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test101");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test102");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test103");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test104");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test105");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test106");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test107");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test108");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test109");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test110");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test111");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test112");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test113");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test114");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test115");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test116");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test117");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test118");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test119");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test120");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test121");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test122");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test123");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test124");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test125");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test126");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass29 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test127");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test128");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test129");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test130");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test131");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = book1_26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test132");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test133");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test134");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test135");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test136");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test137");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test138");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test139");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test140");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test141");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test142");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test143");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test144");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book1_24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test145");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test146");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test147");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test148");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test149");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test150");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test151");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test152");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test153");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test154");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test155");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test156");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test157");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test158");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test159");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test160");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test161");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test162");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test163");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test164");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test165");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test166");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test167");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test168");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test169");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test170");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test171");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass29 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test172");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test173");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test174");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test175");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test176");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test177");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test178");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test179");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test180");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test181");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test182");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = book1_30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test183");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test184");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test185");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test186");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test187");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test188");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = book1_28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test189");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test190");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test191");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test192");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass29 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test193");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass31 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test194");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test195");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass11 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test196");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test197");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test198");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test199");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test200");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = book1_26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test201");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test202");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test203");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test204");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test205");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test206");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test207");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test208");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book1_24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test209");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test210");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test211");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test212");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test213");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test214");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test215");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test216");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test217");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass31 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test218");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test219");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test220");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test221");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test222");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test223");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test224");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = book1_30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test225");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test226");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test227");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test228");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test229");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = book1_30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test230");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test231");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass27 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test232");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test233");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test234");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test235");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test236");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test237");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test238");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test239");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test240");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test241");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test242");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        test.Book1 book1_30 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test243");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test244");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass9 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test245");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test246");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test247");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test248");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test249");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test250");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test251");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test252");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test253");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book1_24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test254");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test255");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test256");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = book1_26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test257");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test258");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test259");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test260");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test261");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test262");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test263");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book1_24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test264");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test265");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test266");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test267");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test268");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("");
        test.Book1 book1_32 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
        org.junit.Assert.assertNull(book1_32);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test269");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test270");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test271");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book1_24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test272");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test273");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test274");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test275");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test276");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test277");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test278");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test279");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test280");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test281");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test282");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test283");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test284");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test285");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test286");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test287");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test288");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test289");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test290");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        test.Book1 book1_30 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test291");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test292");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test293");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test294");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test295");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book1_10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test296");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass27 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test297");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book1_14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test298");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test299");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test300");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test301");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("");
        test.Book1 book1_32 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
        org.junit.Assert.assertNull(book1_32);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test302");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book1_20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test303");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test304");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test305");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = book1_26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test306");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test307");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book1_8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test308");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test309");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test310");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test311");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test312");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test313");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test314");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = book1_26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test315");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test316");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("hi!");
        test.Book1 book1_32 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass33 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
        org.junit.Assert.assertNull(book1_32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test317");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = book1_28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test318");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test319");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book1_24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test320");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = book1_26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test321");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test322");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test323");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book1_24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test324");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test325");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        test.Book1 book1_30 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test326");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("hi!");
        test.Book1 book1_32 = bookRepository0.searchBook("");
        test.Book1 book1_34 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
        org.junit.Assert.assertNull(book1_32);
        org.junit.Assert.assertNull(book1_34);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test327");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass5 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test328");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test329");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test330");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test331");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test332");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test333");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass15 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test334");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass27 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test335");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        test.Book1 book1_30 = bookRepository0.searchBook("");
        test.Book1 book1_32 = bookRepository0.searchBook("");
        test.Book1 book1_34 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
        org.junit.Assert.assertNull(book1_32);
        org.junit.Assert.assertNull(book1_34);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test336");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test337");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test338");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass19 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test339");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test340");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test341");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book1_22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test342");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test343");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book1_24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test344");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book1_18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test345");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("");
        test.Book1 book1_30 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
        org.junit.Assert.assertNull(book1_30);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test346");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test347");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test348");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test349");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book1_12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test350");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test351");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass27 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test352");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test353");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("hi!");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test354");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("hi!");
        test.Book1 book1_26 = bookRepository0.searchBook("");
        test.Book1 book1_28 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNull(book1_26);
        org.junit.Assert.assertNull(book1_28);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test355");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test356");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book1_16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test357");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test358");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test359");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass17 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test360");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("hi!");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        test.Book1 book1_24 = bookRepository0.searchBook("");
        java.lang.Class<?> wildcardClass25 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNull(book1_24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test361");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("hi!");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test362");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("");
        test.Book1 book1_22 = bookRepository0.searchBook("");
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test363");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass21 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test364");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("");
        test.Book1 book1_4 = bookRepository0.searchBook("");
        test.Book1 book1_6 = bookRepository0.searchBook("hi!");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass13 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRepository_Randoop0.test365");
        test.BookRepository bookRepository0 = new test.BookRepository();
        test.Book1 book1_2 = bookRepository0.searchBook("hi!");
        test.Book1 book1_4 = bookRepository0.searchBook("hi!");
        test.Book1 book1_6 = bookRepository0.searchBook("");
        test.Book1 book1_8 = bookRepository0.searchBook("");
        test.Book1 book1_10 = bookRepository0.searchBook("hi!");
        test.Book1 book1_12 = bookRepository0.searchBook("");
        test.Book1 book1_14 = bookRepository0.searchBook("hi!");
        test.Book1 book1_16 = bookRepository0.searchBook("hi!");
        test.Book1 book1_18 = bookRepository0.searchBook("");
        test.Book1 book1_20 = bookRepository0.searchBook("hi!");
        test.Book1 book1_22 = bookRepository0.searchBook("hi!");
        java.lang.Class<?> wildcardClass23 = bookRepository0.getClass();
        org.junit.Assert.assertNull(book1_2);
        org.junit.Assert.assertNull(book1_4);
        org.junit.Assert.assertNull(book1_6);
        org.junit.Assert.assertNull(book1_8);
        org.junit.Assert.assertNull(book1_10);
        org.junit.Assert.assertNull(book1_12);
        org.junit.Assert.assertNull(book1_14);
        org.junit.Assert.assertNull(book1_16);
        org.junit.Assert.assertNull(book1_18);
        org.junit.Assert.assertNull(book1_20);
        org.junit.Assert.assertNull(book1_22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }
}

