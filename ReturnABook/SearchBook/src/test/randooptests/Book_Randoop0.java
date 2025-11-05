package test.randooptests;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Book_Randoop0 {

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
            System.out.format("%n%s%n", "Book_Randoop0.test001");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "1) test001(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "1) test001(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test002");
        test.Book book1 = new test.Book("hi!");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
// flaky "2) test002(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test004");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test005");
        test.Book book1 = new test.Book("hi!");
        book1.borrow();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test006");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "3) test006(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "2) test006(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test007");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
// flaky "4) test007(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test008");
        test.Book book1 = new test.Book("");
        book1.borrow();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test009");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
// flaky "5) test009(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "3) test009(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "1) test009(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test010");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "6) test010(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "4) test010(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test011");
        test.Book book1 = new test.Book("hi!");
        java.lang.Class<?> wildcardClass2 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test012");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "7) test012(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test013");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str7 = book1.toString();
// flaky "8) test013(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "5) test013(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test014");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "9) test014(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "6) test014(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test015");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "10) test015(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test016");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "11) test016(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "7) test016(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "2) test016(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "1) test016(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "1) test016(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test017");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "12) test017(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "8) test017(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "3) test017(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test018");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "13) test018(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test019");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "14) test019(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test020");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "15) test020(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test021");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "16) test021(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "9) test021(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "4) test021(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "2) test021(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test022");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "17) test022(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test023");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.toString();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
// flaky "18) test023(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c\u2705 Available" + "'", str2, "\u274c\u2705 Available");
// flaky "10) test023(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u2705 Available" + "'", str3, "\u274c\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test024");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "19) test024(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test025");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "20) test025(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "11) test025(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test026");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "21) test026(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "12) test026(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "5) test026(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test027");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test028");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "22) test028(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test029");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "23) test029(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "13) test029(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "6) test029(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test030");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "24) test030(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test031");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "25) test031(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test032");
        test.Book book1 = new test.Book("");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky "26) test032(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c Borrowed" + "'", str4, "\u274c Borrowed");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test033");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "27) test033(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "14) test033(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "7) test033(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "3) test033(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "2) test033(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test034");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test035");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
// flaky "28) test035(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "15) test035(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "8) test035(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "4) test035(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "3) test035(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test036");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "29) test036(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "16) test036(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test037");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        boolean boolean9 = book1.isAvailable();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "30) test037(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test038");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "31) test038(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "17) test038(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "9) test038(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test039");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "32) test039(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test040");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test041");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "33) test041(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "18) test041(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "10) test041(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "5) test041(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "4) test041(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test042");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "34) test042(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "19) test042(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "11) test042(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "6) test042(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test043");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.getTitle();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test044");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        book1.borrow();
        book1.borrow();
// flaky "35) test044(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "20) test044(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "12) test044(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "7) test044(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "5) test044(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test045");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test046");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
// flaky "36) test046(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test047");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
// flaky "37) test047(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "21) test047(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test048");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "38) test048(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "22) test048(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "13) test048(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test049");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "39) test049(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "23) test049(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "14) test049(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "8) test049(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test050");
        test.Book book1 = new test.Book("\u274c\u274c Borrowed");
        java.lang.Class<?> wildcardClass2 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test051");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "40) test051(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test052");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "41) test052(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "24) test052(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test053");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "42) test053(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "25) test053(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "15) test053(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
// flaky "9) test053(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test054");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "43) test054(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "26) test054(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "16) test054(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test055");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "44) test055(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test056");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
// flaky "45) test056(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "27) test056(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "17) test056(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "10) test056(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test057");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "46) test057(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test058");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        java.lang.String str11 = book1.getTitle();
// flaky "47) test058(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "28) test058(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "18) test058(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "11) test058(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test059");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "48) test059(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test060");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        boolean boolean11 = book1.isAvailable();
        java.lang.Class<?> wildcardClass12 = book1.getClass();
// flaky "49) test060(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "29) test060(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "19) test060(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "12) test060(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test061");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.getTitle();
// flaky "50) test061(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "30) test061(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test062");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "51) test062(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test063");
        test.Book book1 = new test.Book("");
        java.lang.Class<?> wildcardClass2 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test064");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        book1.borrow();
// flaky "52) test064(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "31) test064(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "20) test064(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "13) test064(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test065");
        test.Book book1 = new test.Book("\u2705\u2705 Available");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test066");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
        boolean boolean11 = book1.isAvailable();
// flaky "53) test066(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "32) test066(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "21) test066(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "14) test066(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "6) test066(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "1) test066(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "1) test066(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test067");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
// flaky "54) test067(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test068");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
// flaky "55) test068(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c\u2705 Available" + "'", str2, "\u274c\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test069");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.getTitle();
        boolean boolean11 = book1.isAvailable();
        java.lang.Class<?> wildcardClass12 = book1.getClass();
// flaky "56) test069(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "33) test069(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "22) test069(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "15) test069(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "7) test069(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test070");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "57) test070(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "34) test070(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "23) test070(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "16) test070(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test071");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test072");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "58) test072(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "35) test072(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test073");
        test.Book book1 = new test.Book("hi!");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.toString();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "59) test073(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
// flaky "36) test073(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c Borrowed" + "'", str4, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test074");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
// flaky "60) test074(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "37) test074(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "24) test074(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "17) test074(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test075");
        test.Book book1 = new test.Book("\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test076");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.toString();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
// flaky "61) test076(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705 Available" + "'", str2, "\u2705\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test077");
        test.Book book1 = new test.Book("\u274c Borrowed");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.toString();
        book1.borrow();
// flaky "62) test077(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u274c Borrowed" + "'", str3, "\u274c\u274c Borrowed");
// flaky "38) test077(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c\u274c Borrowed" + "'", str4, "\u274c\u274c Borrowed");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test078");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "63) test078(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "39) test078(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "25) test078(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "18) test078(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "8) test078(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test079");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
// flaky "64) test079(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test080");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test081");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
// flaky "65) test081(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test082");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "66) test082(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test083");
        test.Book book1 = new test.Book("");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test084");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
// flaky "67) test084(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "40) test084(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test085");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.toString();
        boolean boolean12 = book1.isAvailable();
        java.lang.String str13 = book1.toString();
// flaky "68) test085(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "41) test085(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "26) test085(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "19) test085(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
// flaky "9) test085(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "2) test085(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u274c Borrowed" + "'", str13, "\u274c Borrowed");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test086");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        book1.borrow();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test087");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "69) test087(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test088");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "70) test088(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "42) test088(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "27) test088(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test089");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.toString();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        book1.borrow();
// flaky "71) test089(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c\u2705 Available" + "'", str2, "\u274c\u2705 Available");
// flaky "43) test089(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u2705 Available" + "'", str3, "\u274c\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c Borrowed" + "'", str5, "\u274c Borrowed");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test090");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "72) test090(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test091");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "73) test091(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test092");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
// flaky "74) test092(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test093");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "75) test093(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "44) test093(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test094");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
// flaky "76) test094(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "45) test094(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "28) test094(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test095");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "77) test095(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "46) test095(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test096");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "78) test096(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "47) test096(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test097");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        boolean boolean10 = book1.isAvailable();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "79) test097(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test098");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        java.lang.String str11 = book1.getTitle();
        boolean boolean12 = book1.isAvailable();
        boolean boolean13 = book1.isAvailable();
// flaky "80) test098(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "48) test098(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "29) test098(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "20) test098(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test099");
        test.Book book1 = new test.Book("\u274c Borrowed");
        book1.borrow();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test100");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        java.lang.String str11 = book1.getTitle();
        java.lang.String str12 = book1.toString();
        java.lang.Class<?> wildcardClass13 = book1.getClass();
// flaky "81) test100(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "49) test100(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "30) test100(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "21) test100(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "10) test100(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u2705 Available" + "'", str12, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test101");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
// flaky "82) test101(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "50) test101(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "31) test101(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "22) test101(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "11) test101(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test102");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test103");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.toString();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
// flaky "83) test103(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "51) test103(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test104");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
        java.lang.String str10 = book1.toString();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "84) test104(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "52) test104(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test105");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "85) test105(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "53) test105(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "32) test105(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test106");
        test.Book book1 = new test.Book("\u2705\u274c Borrowed");
        java.lang.Class<?> wildcardClass2 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test107");
        test.Book book1 = new test.Book("\u274c Borrowed");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.toString();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "86) test107(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u274c Borrowed" + "'", str3, "\u274c\u274c Borrowed");
// flaky "54) test107(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c\u274c Borrowed" + "'", str4, "\u274c\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test108");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "87) test108(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "55) test108(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test109");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
// flaky "88) test109(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "56) test109(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "33) test109(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test110");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "89) test110(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "57) test110(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "34) test110(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test111");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        book1.borrow();
        boolean boolean12 = book1.isAvailable();
        java.lang.String str13 = book1.getTitle();
// flaky "90) test111(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "58) test111(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "35) test111(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "23) test111(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test112");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "91) test112(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test113");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "92) test113(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "59) test113(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test114");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.toString();
        book1.borrow();
        book1.borrow();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "93) test114(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705 Available" + "'", str2, "\u2705\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test115");
        test.Book book1 = new test.Book("\u274c Borrowed");
        book1.borrow();
        java.lang.String str3 = book1.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test116");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.getTitle();
        java.lang.String str11 = book1.toString();
// flaky "94) test116(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "60) test116(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "36) test116(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "24) test116(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test117");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.toString();
// flaky "95) test117(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "61) test117(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "37) test117(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test118");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        java.lang.String str11 = book1.getTitle();
        boolean boolean12 = book1.isAvailable();
        java.lang.String str13 = book1.toString();
        java.lang.String str14 = book1.toString();
// flaky "96) test118(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "62) test118(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "38) test118(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "25) test118(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "12) test118(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u274c Borrowed" + "'", str13, "\u274c Borrowed");
// flaky "3) test118(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u274c Borrowed" + "'", str14, "\u274c Borrowed");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test119");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "97) test119(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test120");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.toString();
        book1.borrow();
// flaky "98) test120(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "63) test120(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "39) test120(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "26) test120(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
// flaky "13) test120(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test121");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.toString();
        java.lang.Class<?> wildcardClass12 = book1.getClass();
// flaky "99) test121(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "64) test121(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "40) test121(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "27) test121(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
// flaky "14) test121(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test122");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
// flaky "100) test122(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "65) test122(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test123");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        boolean boolean9 = book1.isAvailable();
// flaky "101) test123(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "66) test123(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "41) test123(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test124");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
// flaky "102) test124(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u274c Borrowed" + "'", str3, "\u2705\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test125");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "103) test125(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "67) test125(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "42) test125(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "28) test125(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
// flaky "15) test125(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test126");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "104) test126(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "68) test126(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test127");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "105) test127(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test128");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "106) test128(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test129");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.String str11 = book1.getTitle();
// flaky "107) test129(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test130");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "108) test130(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "69) test130(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "43) test130(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "29) test130(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "16) test130(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test131");
        test.Book book1 = new test.Book("\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "109) test131(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705 Available" + "'", str3, "\u2705\u2705 Available");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test132");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "110) test132(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "70) test132(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test133");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test134");
        test.Book book1 = new test.Book("\u274c Borrowed");
        boolean boolean2 = book1.isAvailable();
        book1.borrow();
        java.lang.String str4 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "111) test134(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c\u274c Borrowed" + "'", str4, "\u274c\u274c Borrowed");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test135");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.toString();
        book1.borrow();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
// flaky "112) test135(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705 Available" + "'", str2, "\u2705\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test136");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "113) test136(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test137");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.toString();
// flaky "114) test137(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "71) test137(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
// flaky "44) test137(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test138");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
// flaky "115) test138(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "72) test138(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test139");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        boolean boolean10 = book1.isAvailable();
        boolean boolean11 = book1.isAvailable();
// flaky "116) test139(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test140");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test141");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        book1.borrow();
        book1.borrow();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test142");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test143");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
// flaky "117) test143(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "73) test143(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test144");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.getTitle();
        java.lang.String str12 = book1.getTitle();
        java.lang.Class<?> wildcardClass13 = book1.getClass();
// flaky "118) test144(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "74) test144(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "45) test144(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "30) test144(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "17) test144(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "4) test144(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "2) test144(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test145");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        book1.borrow();
// flaky "119) test145(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "75) test145(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "46) test145(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test146");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "120) test146(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "76) test146(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "47) test146(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "31) test146(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "18) test146(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test147");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test148");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        book1.borrow();
// flaky "121) test148(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test149");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
// flaky "122) test149(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "77) test149(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "48) test149(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "32) test149(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "19) test149(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test150");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        book1.borrow();
        book1.borrow();
// flaky "123) test150(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "78) test150(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "49) test150(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "33) test150(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "20) test150(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test151");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        book1.borrow();
// flaky "124) test151(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "79) test151(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "50) test151(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "34) test151(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "21) test151(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "5) test151(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test152");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "125) test152(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test153");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        book1.borrow();
// flaky "126) test153(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test154");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "127) test154(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "80) test154(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test155");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
// flaky "128) test155(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test156");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        java.lang.String str11 = book1.getTitle();
        boolean boolean12 = book1.isAvailable();
        java.lang.String str13 = book1.toString();
        java.lang.String str14 = book1.getTitle();
// flaky "129) test156(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "81) test156(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "51) test156(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "35) test156(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "22) test156(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u274c Borrowed" + "'", str13, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test157");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "130) test157(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "82) test157(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test158");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        boolean boolean5 = book1.isAvailable();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "131) test158(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "83) test158(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test159");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
// flaky "132) test159(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "84) test159(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test160");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.getTitle();
        java.lang.String str12 = book1.getTitle();
        java.lang.String str13 = book1.toString();
        java.lang.String str14 = book1.getTitle();
        boolean boolean15 = book1.isAvailable();
// flaky "133) test160(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "85) test160(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "52) test160(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "36) test160(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "23) test160(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "6) test160(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "3) test160(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "1) test160(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u2705 Available" + "'", str13, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test161");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        book1.borrow();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test162");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
// flaky "134) test162(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "86) test162(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test163");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "135) test163(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "87) test163(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "53) test163(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test164");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        book1.borrow();
        boolean boolean11 = book1.isAvailable();
// flaky "136) test164(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "88) test164(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test165");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "137) test165(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "89) test165(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test166");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        boolean boolean10 = book1.isAvailable();
        java.lang.String str11 = book1.toString();
// flaky "138) test166(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "90) test166(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test167");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705 Available" + "'", str3, "\u2705 Available");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test168");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        book1.borrow();
        book1.borrow();
// flaky "139) test168(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "91) test168(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test169");
        test.Book book1 = new test.Book("\u2705\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        book1.borrow();
// flaky "140) test169(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u274c\u2705 Available" + "'", str2, "\u2705\u274c\u2705 Available");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test170");
        test.Book book1 = new test.Book("\u274c\u2705 Available");
        java.lang.Class<?> wildcardClass2 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test171");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.getTitle();
        java.lang.Class<?> wildcardClass12 = book1.getClass();
// flaky "141) test171(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "92) test171(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "54) test171(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "37) test171(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "24) test171(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "7) test171(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "4) test171(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test172");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "142) test172(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "93) test172(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test173");
        test.Book book1 = new test.Book("\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test174");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        boolean boolean10 = book1.isAvailable();
// flaky "143) test174(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test175");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "144) test175(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test176");
        test.Book book1 = new test.Book("\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.toString();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "145) test176(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705 Available" + "'", str3, "\u2705\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test177");
        test.Book book1 = new test.Book("\u2705\u274c Borrowed");
        book1.borrow();
        java.lang.String str3 = book1.toString();
// flaky "146) test177(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u274c\u274c Borrowed" + "'", str3, "\u2705\u274c\u274c Borrowed");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test178");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.toString();
// flaky "147) test178(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "94) test178(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test179");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
// flaky "148) test179(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "95) test179(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c Borrowed" + "'", str5, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test180");
        test.Book book1 = new test.Book("\u2705\u274c\u274c Borrowed");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test181");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.toString();
        boolean boolean12 = book1.isAvailable();
        book1.borrow();
// flaky "149) test181(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "96) test181(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "55) test181(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "38) test181(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
// flaky "25) test181(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test182");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.toString();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
// flaky "150) test182(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "97) test182(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "56) test182(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test183");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "151) test183(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test184");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        java.lang.String str11 = book1.getTitle();
        java.lang.Class<?> wildcardClass12 = book1.getClass();
// flaky "152) test184(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "98) test184(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "57) test184(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "39) test184(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test185");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
// flaky "153) test185(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "99) test185(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test186");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "154) test186(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "100) test186(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "58) test186(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test187");
        test.Book book1 = new test.Book("hi!");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.String str7 = book1.toString();
// flaky "155) test187(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "101) test187(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test188");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.String str9 = book1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "156) test188(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test189");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        book1.borrow();
// flaky "157) test189(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test190");
        test.Book book1 = new test.Book("\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.toString();
        boolean boolean4 = book1.isAvailable();
        boolean boolean5 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "158) test190(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705 Available" + "'", str3, "\u2705\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test191");
        test.Book book1 = new test.Book("\u274c Borrowed");
        book1.borrow();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test192");
        test.Book book1 = new test.Book("");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "159) test192(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705 Available" + "'", str3, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test193");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        boolean boolean5 = book1.isAvailable();
        book1.borrow();
// flaky "160) test193(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test194");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.toString();
        book1.borrow();
        java.lang.String str4 = book1.toString();
// flaky "161) test194(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705 Available" + "'", str2, "\u2705\u2705 Available");
// flaky "102) test194(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705\u274c Borrowed" + "'", str4, "\u2705\u274c Borrowed");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test195");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "162) test195(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "103) test195(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "59) test195(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test196");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
// flaky "163) test196(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "104) test196(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "60) test196(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test197");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.String str9 = book1.getTitle();
        book1.borrow();
// flaky "164) test197(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test198");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
// flaky "165) test198(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test199");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        book1.borrow();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "166) test199(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "105) test199(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "61) test199(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test200");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
// flaky "167) test200(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test201");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "168) test201(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "106) test201(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test202");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.Class<?> wildcardClass2 = book1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test203");
        test.Book book1 = new test.Book("\u2705\u274c\u2705 Available");
        java.lang.String str2 = book1.toString();
// flaky "169) test203(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u274c\u2705\u2705 Available" + "'", str2, "\u2705\u274c\u2705\u2705 Available");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test204");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        boolean boolean11 = book1.isAvailable();
        boolean boolean12 = book1.isAvailable();
        java.lang.String str13 = book1.getTitle();
// flaky "170) test204(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "107) test204(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "62) test204(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "40) test204(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test205");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.getTitle();
        java.lang.String str12 = book1.getTitle();
        java.lang.String str13 = book1.toString();
        java.lang.String str14 = book1.getTitle();
        java.lang.String str15 = book1.toString();
        java.lang.String str16 = book1.toString();
// flaky "171) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "108) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "63) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "41) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "26) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "8) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "5) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "2) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u2705 Available" + "'", str13, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky "1) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u2705 Available" + "'", str15, "\u2705 Available");
// flaky "1) test205(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u2705 Available" + "'", str16, "\u2705 Available");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test206");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "172) test206(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test207");
        test.Book book1 = new test.Book("\u274c\u2705 Available");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test208");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "173) test208(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "109) test208(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "64) test208(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test209");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        book1.borrow();
        java.lang.String str11 = book1.toString();
// flaky "174) test209(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "110) test209(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "65) test209(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "42) test209(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "27) test209(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "9) test209(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test210");
        test.Book book1 = new test.Book("hi!");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        boolean boolean4 = book1.isAvailable();
// flaky "175) test210(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test211");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.toString();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        book1.borrow();
// flaky "176) test211(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "111) test211(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "66) test211(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test212");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
// flaky "177) test212(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test213");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.getTitle();
        boolean boolean7 = book1.isAvailable();
// flaky "178) test213(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "112) test213(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test214");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "179) test214(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "113) test214(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "67) test214(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test215");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "180) test215(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test216");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.toString();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.toString();
// flaky "181) test216(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c\u2705 Available" + "'", str2, "\u274c\u2705 Available");
// flaky "114) test216(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u2705 Available" + "'", str3, "\u274c\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c Borrowed" + "'", str5, "\u274c Borrowed");
// flaky "68) test216(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c\u274c Borrowed" + "'", str6, "\u274c\u274c Borrowed");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test217");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        book1.borrow();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "182) test217(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test218");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        boolean boolean11 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        book1.borrow();
// flaky "183) test218(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "115) test218(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "69) test218(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "43) test218(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test219");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
// flaky "184) test219(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "116) test219(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test220");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test221");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        book1.borrow();
// flaky "185) test221(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "117) test221(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test222");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.toString();
        book1.borrow();
        java.lang.String str7 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "186) test222(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c Borrowed" + "'", str5, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test223");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "187) test223(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test224");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        boolean boolean9 = book1.isAvailable();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "188) test224(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "118) test224(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "70) test224(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "44) test224(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "28) test224(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "10) test224(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test225");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        java.lang.String str10 = book1.toString();
        boolean boolean11 = book1.isAvailable();
// flaky "189) test225(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "119) test225(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test226");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        book1.borrow();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "190) test226(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "120) test226(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test227");
        test.Book book1 = new test.Book("\u2705\u2705\u274c Borrowed");
        java.lang.String str2 = book1.getTitle();
        book1.borrow();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705\u274c Borrowed" + "'", str2, "\u2705\u2705\u274c Borrowed");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test228");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "191) test228(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test229");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        book1.borrow();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test230");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "192) test230(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test231");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "193) test231(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test232");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test233");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.getTitle();
        boolean boolean9 = book1.isAvailable();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "194) test233(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test234");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.toString();
        book1.borrow();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.getTitle();
// flaky "195) test234(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705 Available" + "'", str2, "\u2705\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test235");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        book1.borrow();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "196) test235(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "121) test235(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "71) test235(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "45) test235(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test236");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        boolean boolean8 = book1.isAvailable();
// flaky "197) test236(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "122) test236(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test237");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
        book1.borrow();
// flaky "198) test237(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "123) test237(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "72) test237(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
// flaky "46) test237(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "29) test237(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test238");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        boolean boolean9 = book1.isAvailable();
        boolean boolean10 = book1.isAvailable();
        java.lang.String str11 = book1.getTitle();
        boolean boolean12 = book1.isAvailable();
// flaky "199) test238(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test239");
        test.Book book1 = new test.Book("\u2705\u274c\u2705\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test240");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "200) test240(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test241");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        java.lang.String str10 = book1.getTitle();
        book1.borrow();
        java.lang.Class<?> wildcardClass12 = book1.getClass();
// flaky "201) test241(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test242");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
// flaky "202) test242(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test243");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
// flaky "203) test243(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "124) test243(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "73) test243(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "47) test243(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "30) test243(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "11) test243(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test244");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        java.lang.String str10 = book1.toString();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "204) test244(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "125) test244(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "74) test244(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "48) test244(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test245");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.String str9 = book1.getTitle();
        boolean boolean10 = book1.isAvailable();
        book1.borrow();
        boolean boolean12 = book1.isAvailable();
// flaky "205) test245(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test246");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "206) test246(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "126) test246(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test247");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.getTitle();
        book1.borrow();
// flaky "207) test247(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test248");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test249");
        test.Book book1 = new test.Book("\u274c\u274c Borrowed");
        boolean boolean2 = book1.isAvailable();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test250");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "208) test250(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test251");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        boolean boolean10 = book1.isAvailable();
        boolean boolean11 = book1.isAvailable();
// flaky "209) test251(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test252");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test253");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test254");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        book1.borrow();
        boolean boolean11 = book1.isAvailable();
// flaky "210) test254(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test255");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c Borrowed" + "'", str2, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
// flaky "211) test255(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c\u2705 Available" + "'", str4, "\u274c\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "127) test255(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c\u2705 Available" + "'", str6, "\u274c\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test256");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        boolean boolean9 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "212) test256(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "128) test256(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test257");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        java.lang.String str10 = book1.toString();
        boolean boolean11 = book1.isAvailable();
// flaky "213) test257(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "129) test257(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test258");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
// flaky "214) test258(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "130) test258(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
// flaky "75) test258(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test259");
        test.Book book1 = new test.Book("");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.toString();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "215) test259(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705 Available" + "'", str3, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "131) test259(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test260");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.toString();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        book1.borrow();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "216) test260(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "132) test260(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "76) test260(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
// flaky "49) test260(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test261");
        test.Book book1 = new test.Book("\u2705\u2705 Available");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705\u2705 Available" + "'", str5, "\u2705\u2705 Available");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test262");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
// flaky "217) test262(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "133) test262(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "77) test262(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
// flaky "50) test262(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test263");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        boolean boolean10 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
// flaky "218) test263(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test264");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "219) test264(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "134) test264(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "78) test264(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "51) test264(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test265");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.toString();
        book1.borrow();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
// flaky "220) test265(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c\u2705 Available" + "'", str2, "\u274c\u2705 Available");
// flaky "135) test265(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u2705 Available" + "'", str3, "\u274c\u2705 Available");
// flaky "79) test265(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c\u274c Borrowed" + "'", str5, "\u274c\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test266");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        book1.borrow();
// flaky "221) test266(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test267");
        test.Book book1 = new test.Book("");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test268");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
// flaky "222) test268(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test269");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
// flaky "223) test269(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "136) test269(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test270");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        boolean boolean11 = book1.isAvailable();
        boolean boolean12 = book1.isAvailable();
// flaky "224) test270(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "137) test270(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "80) test270(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "52) test270(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test271");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
// flaky "225) test271(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "138) test271(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "81) test271(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test272");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "226) test272(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "139) test272(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test273");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        book1.borrow();
        boolean boolean7 = book1.isAvailable();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "227) test273(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "140) test273(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test274");
        test.Book book1 = new test.Book("");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        boolean boolean7 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test275");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        boolean boolean5 = book1.isAvailable();
        book1.borrow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test276");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.toString();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.getTitle();
        boolean boolean7 = book1.isAvailable();
// flaky "228) test276(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c\u2705 Available" + "'", str2, "\u274c\u2705 Available");
// flaky "141) test276(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u2705 Available" + "'", str3, "\u274c\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c Borrowed" + "'", str5, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test277");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.toString();
        boolean boolean12 = book1.isAvailable();
        java.lang.String str13 = book1.getTitle();
        java.lang.String str14 = book1.toString();
// flaky "229) test277(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "142) test277(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "82) test277(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "53) test277(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
// flaky "31) test277(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "12) test277(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u274c Borrowed" + "'", str14, "\u274c Borrowed");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test278");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        java.lang.String str10 = book1.getTitle();
        boolean boolean11 = book1.isAvailable();
        book1.borrow();
// flaky "230) test278(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test279");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        boolean boolean11 = book1.isAvailable();
        java.lang.String str12 = book1.toString();
        java.lang.Class<?> wildcardClass13 = book1.getClass();
// flaky "231) test279(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "143) test279(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "83) test279(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "54) test279(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "32) test279(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u274c Borrowed" + "'", str12, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test280");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
// flaky "232) test280(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "144) test280(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
// flaky "84) test280(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test281");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.getTitle();
        java.lang.String str12 = book1.toString();
// flaky "233) test281(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "145) test281(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "85) test281(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "55) test281(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "33) test281(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "13) test281(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "6) test281(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "3) test281(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u2705 Available" + "'", str12, "\u2705 Available");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test282");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "234) test282(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "146) test282(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test283");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
// flaky "235) test283(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c\u2705 Available" + "'", str2, "\u274c\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test284");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
// flaky "236) test284(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "147) test284(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test285");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "237) test285(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test286");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
// flaky "238) test286(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "148) test286(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test287");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        book1.borrow();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c Borrowed" + "'", str2, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
// flaky "239) test287(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c\u2705 Available" + "'", str4, "\u274c\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "149) test287(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c\u2705 Available" + "'", str6, "\u274c\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test288");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.toString();
        book1.borrow();
// flaky "240) test288(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "150) test288(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "86) test288(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test289");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
// flaky "241) test289(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "151) test289(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
// flaky "87) test289(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
// flaky "56) test289(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test290");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test291");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test292");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
// flaky "242) test292(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "152) test292(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "88) test292(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "57) test292(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test293");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705 Available" + "'", str3, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test294");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "243) test294(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "153) test294(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "89) test294(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "58) test294(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "34) test294(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test295");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
// flaky "244) test295(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "154) test295(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "90) test295(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "59) test295(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test296");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        book1.borrow();
        java.lang.String str11 = book1.getTitle();
        java.lang.String str12 = book1.toString();
// flaky "245) test296(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "155) test296(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u274c Borrowed" + "'", str12, "\u274c Borrowed");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test297");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.toString();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "246) test297(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c Borrowed" + "'", str5, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test298");
        test.Book book1 = new test.Book("");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test299");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "247) test299(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "156) test299(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "91) test299(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "60) test299(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "35) test299(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "14) test299(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test300");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test301");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        java.lang.String str5 = book1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
// flaky "248) test301(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705\u274c Borrowed" + "'", str5, "\u2705\u274c Borrowed");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test302");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
// flaky "249) test302(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "157) test302(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "92) test302(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test303");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.toString();
// flaky "250) test303(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "158) test303(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "93) test303(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test304");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
        book1.borrow();
// flaky "251) test304(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "159) test304(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "94) test304(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test305");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test306");
        test.Book book1 = new test.Book("\u2705\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705 Available" + "'", str3, "\u2705\u2705 Available");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705\u2705 Available" + "'", str4, "\u2705\u2705 Available");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test307");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705 Available" + "'", str3, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test308");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "252) test308(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test309");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test310");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.toString();
        book1.borrow();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "253) test310(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c\u2705 Available" + "'", str2, "\u274c\u2705 Available");
// flaky "160) test310(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u2705 Available" + "'", str3, "\u274c\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test311");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        book1.borrow();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "254) test311(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test312");
        test.Book book1 = new test.Book("");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        boolean boolean5 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test313");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        book1.borrow();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
// flaky "255) test313(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "161) test313(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test314");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.toString();
        java.lang.String str12 = book1.toString();
// flaky "256) test314(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "162) test314(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "95) test314(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "61) test314(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
// flaky "36) test314(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u274c Borrowed" + "'", str11, "\u274c Borrowed");
// flaky "15) test314(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u274c Borrowed" + "'", str12, "\u274c Borrowed");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test315");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.getTitle();
// flaky "257) test315(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "163) test315(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "96) test315(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test316");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
// flaky "258) test316(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "164) test316(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test317");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        book1.borrow();
// flaky "259) test317(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "165) test317(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test318");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
// flaky "260) test318(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u274c Borrowed" + "'", str3, "\u2705\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test319");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
// flaky "261) test319(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test320");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        boolean boolean11 = book1.isAvailable();
// flaky "262) test320(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "166) test320(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "97) test320(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "62) test320(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "37) test320(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test321");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        boolean boolean10 = book1.isAvailable();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "263) test321(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "167) test321(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test322");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "264) test322(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "168) test322(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test323");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
// flaky "265) test323(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "169) test323(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test324");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.Class<?> wildcardClass7 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "266) test324(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "170) test324(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test325");
        test.Book book1 = new test.Book("\u2705\u274c Borrowed");
        java.lang.String str2 = book1.toString();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
// flaky "267) test325(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u274c\u2705 Available" + "'", str2, "\u2705\u274c\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test326");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.getTitle();
        boolean boolean10 = book1.isAvailable();
// flaky "268) test326(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test327");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
        java.lang.String str10 = book1.toString();
// flaky "269) test327(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "171) test327(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "98) test327(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "63) test327(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test328");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        boolean boolean7 = book1.isAvailable();
// flaky "270) test328(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "172) test328(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test329");
        test.Book book1 = new test.Book("");
        book1.borrow();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        boolean boolean5 = book1.isAvailable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "271) test329(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c Borrowed" + "'", str4, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test330");
        test.Book book1 = new test.Book("hi!");
        book1.borrow();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "272) test330(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c Borrowed" + "'", str4, "\u274c Borrowed");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test331");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.getTitle();
        java.lang.String str12 = book1.getTitle();
        boolean boolean13 = book1.isAvailable();
        boolean boolean14 = book1.isAvailable();
        java.lang.Class<?> wildcardClass15 = book1.getClass();
// flaky "273) test331(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "173) test331(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "99) test331(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "64) test331(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "38) test331(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "16) test331(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "7) test331(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test332");
        test.Book book1 = new test.Book("\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "274) test332(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705 Available" + "'", str3, "\u2705\u2705 Available");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test333");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
// flaky "275) test333(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "174) test333(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "100) test333(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "65) test333(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test334");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        book1.borrow();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "276) test334(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test335");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        java.lang.String str10 = book1.toString();
// flaky "277) test335(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "175) test335(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "101) test335(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "66) test335(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test336");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
// flaky "278) test336(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "176) test336(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
// flaky "102) test336(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test337");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "279) test337(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test338");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "280) test338(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "177) test338(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "103) test338(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
// flaky "67) test338(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test339");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky "281) test339(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c Borrowed" + "'", str5, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test340");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.getTitle();
        java.lang.String str12 = book1.getTitle();
        boolean boolean13 = book1.isAvailable();
        java.lang.String str14 = book1.toString();
        boolean boolean15 = book1.isAvailable();
// flaky "282) test340(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "178) test340(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "104) test340(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "68) test340(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "39) test340(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "17) test340(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "8) test340(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "4) test340(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u2705 Available" + "'", str14, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test341");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
// flaky "283) test341(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "179) test341(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test342");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.toString();
        book1.borrow();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
// flaky "284) test342(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705 Available" + "'", str2, "\u2705\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test343");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
        java.lang.String str10 = book1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1.getClass();
// flaky "285) test343(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test344");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.toString();
        java.lang.Class<?> wildcardClass5 = book1.getClass();
// flaky "286) test344(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u274c Borrowed" + "'", str3, "\u2705\u274c Borrowed");
// flaky "180) test344(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705\u274c Borrowed" + "'", str4, "\u2705\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test345");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.toString();
        book1.borrow();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "287) test345(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705 Available" + "'", str2, "\u2705\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test346");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        book1.borrow();
// flaky "288) test346(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "181) test346(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test347");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test348");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
// flaky "289) test348(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "182) test348(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test349");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "290) test349(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test350");
        test.Book book1 = new test.Book("\u2705\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
// flaky "291) test350(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705\u274c Borrowed" + "'", str3, "\u2705\u2705\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705\u2705 Available" + "'", str4, "\u2705\u2705 Available");
// flaky "183) test350(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705\u2705\u274c Borrowed" + "'", str5, "\u2705\u2705\u274c Borrowed");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test351");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
// flaky "292) test351(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "184) test351(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test352");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
// flaky "293) test352(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "185) test352(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test353");
        test.Book book1 = new test.Book("\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705 Available" + "'", str3, "\u2705 Available");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test354");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        java.lang.String str11 = book1.toString();
        java.lang.String str12 = book1.toString();
// flaky "294) test354(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "186) test354(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "105) test354(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "69) test354(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "40) test354(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "18) test354(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "9) test354(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u2705 Available" + "'", str11, "\u2705 Available");
// flaky "5) test354(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u2705 Available" + "'", str12, "\u2705 Available");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test355");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        java.lang.String str8 = book1.getTitle();
// flaky "295) test355(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test356");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "296) test356(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "187) test356(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test357");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
// flaky "297) test357(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "188) test357(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
// flaky "106) test357(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
// flaky "70) test357(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test358");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.getTitle();
        java.lang.String str9 = book1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "298) test358(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test359");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705 Available" + "'", str3, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test360");
        test.Book book1 = new test.Book("\u2705\u2705 Available");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test361");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.getTitle();
        java.lang.Class<?> wildcardClass3 = book1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c Borrowed" + "'", str2, "\u274c Borrowed");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test362");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
        book1.borrow();
        book1.borrow();
        java.lang.String str10 = book1.toString();
// flaky "299) test362(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "189) test362(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test363");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
// flaky "300) test363(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "190) test363(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "107) test363(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "71) test363(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "41) test363(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "19) test363(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test364");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "301) test364(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "191) test364(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test365");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        book1.borrow();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.Class<?> wildcardClass9 = book1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "302) test365(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test366");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "303) test366(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "192) test366(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test367");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
        book1.borrow();
        boolean boolean12 = book1.isAvailable();
// flaky "304) test367(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "193) test367(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "108) test367(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "72) test367(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test368");
        test.Book book1 = new test.Book("\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        java.lang.Class<?> wildcardClass6 = book1.getClass();
// flaky "305) test368(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u274c Borrowed" + "'", str3, "\u2705\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test369");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        book1.borrow();
// flaky "306) test369(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "194) test369(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "109) test369(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "73) test369(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test370");
        test.Book book1 = new test.Book("hi!");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        boolean boolean7 = book1.isAvailable();
// flaky "307) test370(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
// flaky "195) test370(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c Borrowed" + "'", str4, "\u274c Borrowed");
// flaky "110) test370(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u274c Borrowed" + "'", str5, "\u274c Borrowed");
// flaky "74) test370(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test371");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.getTitle();
// flaky "308) test371(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test372");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.getTitle();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "309) test372(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test373");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        book1.borrow();
        java.lang.String str7 = book1.toString();
        book1.borrow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "310) test373(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test374");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705 Available" + "'", str3, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test375");
        test.Book book1 = new test.Book("\u274c Borrowed");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        boolean boolean4 = book1.isAvailable();
// flaky "311) test375(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u274c Borrowed" + "'", str3, "\u274c\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test376");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        boolean boolean8 = book1.isAvailable();
        book1.borrow();
        java.lang.String str10 = book1.toString();
// flaky "312) test376(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "196) test376(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test377");
        test.Book book1 = new test.Book("");
        book1.borrow();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
// flaky "313) test377(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c Borrowed" + "'", str4, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test378");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        java.lang.String str8 = book1.getTitle();
        book1.borrow();
        java.lang.String str10 = book1.getTitle();
        book1.borrow();
// flaky "314) test378(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test379");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        book1.borrow();
        book1.borrow();
// flaky "315) test379(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "197) test379(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "111) test379(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "75) test379(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test380");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
// flaky "316) test380(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "198) test380(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test381");
        test.Book book1 = new test.Book("\u2705 Available");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.toString();
        java.lang.Class<?> wildcardClass4 = book1.getClass();
// flaky "317) test381(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705\u2705 Available" + "'", str2, "\u2705\u2705 Available");
// flaky "199) test381(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705 Available" + "'", str3, "\u2705\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test382");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.toString();
// flaky "318) test382(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "200) test382(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "112) test382(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "76) test382(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "42) test382(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "20) test382(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
// flaky "10) test382(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test383");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        book1.borrow();
// flaky "319) test383(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "201) test383(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "113) test383(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test384");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        book1.borrow();
        book1.borrow();
// flaky "320) test384(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "202) test384(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "114) test384(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test385");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        boolean boolean9 = book1.isAvailable();
        java.lang.String str10 = book1.toString();
        java.lang.String str11 = book1.getTitle();
// flaky "321) test385(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "203) test385(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test386");
        test.Book book1 = new test.Book("\u274c Borrowed");
        java.lang.String str2 = book1.getTitle();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u274c Borrowed" + "'", str2, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c Borrowed" + "'", str3, "\u274c Borrowed");
// flaky "322) test386(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c\u2705 Available" + "'", str4, "\u274c\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test387");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.getTitle();
        book1.borrow();
        java.lang.Class<?> wildcardClass12 = book1.getClass();
// flaky "323) test387(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "204) test387(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "115) test387(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "77) test387(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "43) test387(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test388");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
// flaky "324) test388(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test389");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        book1.borrow();
        java.lang.String str12 = book1.toString();
        java.lang.String str13 = book1.getTitle();
// flaky "325) test389(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "205) test389(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "116) test389(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "78) test389(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "44) test389(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u274c Borrowed" + "'", str12, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test390");
        test.Book book1 = new test.Book("\u2705\u2705 Available");
        book1.borrow();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705 Available" + "'", str3, "\u2705\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test391");
        test.Book book1 = new test.Book("\u2705\u2705 Available");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        boolean boolean4 = book1.isAvailable();
        book1.borrow();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test392");
        test.Book book1 = new test.Book("");
        book1.borrow();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test393");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        boolean boolean10 = book1.isAvailable();
        boolean boolean11 = book1.isAvailable();
// flaky "326) test393(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "206) test393(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test394");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
// flaky "327) test394(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "207) test394(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "117) test394(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "79) test394(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test395");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        book1.borrow();
        java.lang.String str6 = book1.getTitle();
        book1.borrow();
// flaky "328) test395(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "208) test395(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test396");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        book1.borrow();
        book1.borrow();
        java.lang.String str10 = book1.getTitle();
// flaky "329) test396(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test397");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        boolean boolean7 = book1.isAvailable();
        java.lang.Class<?> wildcardClass8 = book1.getClass();
// flaky "330) test397(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "209) test397(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test398");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "331) test398(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test399");
        test.Book book1 = new test.Book("\u2705 Available");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.toString();
        book1.borrow();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "332) test399(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2705\u2705 Available" + "'", str3, "\u2705\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "210) test399(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705\u274c Borrowed" + "'", str7, "\u2705\u274c Borrowed");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test400");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        book1.borrow();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "333) test400(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "211) test400(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "118) test400(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test401");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.getTitle();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        book1.borrow();
        java.lang.String str10 = book1.toString();
        boolean boolean11 = book1.isAvailable();
        java.lang.String str12 = book1.toString();
// flaky "334) test401(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky "212) test401(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
// flaky "119) test401(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
// flaky "80) test401(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "45) test401(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u274c Borrowed" + "'", str12, "\u274c Borrowed");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test402");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
        book1.borrow();
        java.lang.String str12 = book1.toString();
        boolean boolean13 = book1.isAvailable();
        book1.borrow();
// flaky "335) test402(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "213) test402(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "120) test402(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "81) test402(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
// flaky "46) test402(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u274c Borrowed" + "'", str12, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test403");
        test.Book book1 = new test.Book("\u274c Borrowed");
        book1.borrow();
        java.lang.String str3 = book1.toString();
        java.lang.String str4 = book1.getTitle();
        boolean boolean5 = book1.isAvailable();
// flaky "336) test403(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u274c\u274c Borrowed" + "'", str3, "\u274c\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u274c Borrowed" + "'", str4, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test404");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.toString();
        java.lang.String str10 = book1.getTitle();
        java.lang.String str11 = book1.getTitle();
        boolean boolean12 = book1.isAvailable();
        book1.borrow();
// flaky "337) test404(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "214) test404(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "121) test404(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky "82) test404(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test405");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.toString();
// flaky "338) test405(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "215) test405(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "122) test405(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
// flaky "83) test405(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
// flaky "47) test405(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u274c Borrowed" + "'", str9, "\u274c Borrowed");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test406");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        book1.borrow();
// flaky "339) test406(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "216) test406(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test407");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        boolean boolean4 = book1.isAvailable();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        boolean boolean7 = book1.isAvailable();
        java.lang.String str8 = book1.toString();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
        book1.borrow();
        java.lang.Class<?> wildcardClass12 = book1.getClass();
// flaky "340) test407(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky "217) test407(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky "123) test407(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2705 Available" + "'", str8, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "84) test407(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2705 Available" + "'", str10, "\u2705 Available");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test408");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        boolean boolean9 = book1.isAvailable();
        java.lang.Class<?> wildcardClass10 = book1.getClass();
// flaky "341) test408(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "218) test408(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "124) test408(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test409");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.getTitle();
        java.lang.String str7 = book1.toString();
        boolean boolean8 = book1.isAvailable();
        book1.borrow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "342) test409(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "219) test409(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test410");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        boolean boolean3 = book1.isAvailable();
        book1.borrow();
        boolean boolean5 = book1.isAvailable();
        java.lang.String str6 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "343) test410(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u274c Borrowed" + "'", str6, "\u274c Borrowed");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test411");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        boolean boolean8 = book1.isAvailable();
        java.lang.String str9 = book1.toString();
        boolean boolean10 = book1.isAvailable();
        java.lang.String str11 = book1.getTitle();
        boolean boolean12 = book1.isAvailable();
        java.lang.String str13 = book1.toString();
// flaky "344) test411(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "220) test411(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "125) test411(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "85) test411(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u2705 Available" + "'", str9, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "48) test411(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u2705 Available" + "'", str13, "\u2705 Available");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test412");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        book1.borrow();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.toString();
        java.lang.String str8 = book1.toString();
        boolean boolean9 = book1.isAvailable();
        boolean boolean10 = book1.isAvailable();
// flaky "345) test412(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "221) test412(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "126) test412(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u274c Borrowed" + "'", str7, "\u274c Borrowed");
// flaky "86) test412(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u274c Borrowed" + "'", str8, "\u274c Borrowed");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test413");
        test.Book book1 = new test.Book("hi!");
        java.lang.String str2 = book1.toString();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.toString();
        java.lang.String str5 = book1.toString();
        boolean boolean6 = book1.isAvailable();
        java.lang.String str7 = book1.getTitle();
        book1.borrow();
        java.lang.String str9 = book1.getTitle();
        java.lang.String str10 = book1.toString();
// flaky "346) test413(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u2705 Available" + "'", str2, "\u2705 Available");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "222) test413(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2705 Available" + "'", str4, "\u2705 Available");
// flaky "127) test413(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "87) test413(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u274c Borrowed" + "'", str10, "\u274c Borrowed");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book_Randoop0.test414");
        test.Book book1 = new test.Book("hi!");
        boolean boolean2 = book1.isAvailable();
        java.lang.String str3 = book1.getTitle();
        java.lang.String str4 = book1.getTitle();
        java.lang.String str5 = book1.toString();
        java.lang.String str6 = book1.toString();
        java.lang.String str7 = book1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky "347) test414(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u2705 Available" + "'", str5, "\u2705 Available");
// flaky "223) test414(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2705 Available" + "'", str6, "\u2705 Available");
// flaky "128) test414(Book_Randoop0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u2705 Available" + "'", str7, "\u2705 Available");
    }
}
