import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Book1_Randoop0 {

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
            System.out.format("%n%s%n", "Book1_Randoop0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test002");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass4 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test003");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass3 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test004");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass4 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test005");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass3 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test006");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test007");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass4 = book1_1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test008");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test009");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test010");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test011");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test012");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass4 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test013");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass3 = book1_1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test014");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        boolean boolean6 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test015");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test016");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test017");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test018");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test019");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test020");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass4 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test021");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test022");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass4 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test023");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test024");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass3 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test025");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test026");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test027");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test028");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test029");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test030");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test031");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test032");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test033");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test034");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test035");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test036");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test037");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test038");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test039");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test040");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test041");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test042");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test043");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test044");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test045");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test046");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test047");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test048");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test049");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test050");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass3 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test051");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test052");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test053");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test054");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test055");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test056");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test057");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.Class<?> wildcardClass2 = book1_1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test058");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test059");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test060");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test061");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test062");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test063");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test064");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test065");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test066");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test067");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test068");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test069");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test070");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test071");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test072");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test073");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test074");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test075");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test076");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test077");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test078");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test079");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test080");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test081");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test082");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        boolean boolean11 = book1_1.getStatus();
        boolean boolean12 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test083");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test084");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test085");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test086");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test087");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass4 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test088");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test089");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test090");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test091");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test092");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test093");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test094");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean11 = book1_1.getStatus();
        java.lang.String str12 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test095");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass4 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test096");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test097");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test098");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test099");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test100");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test101");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test102");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test103");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test104");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test105");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test106");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test107");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test108");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test109");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test110");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test111");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test112");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test113");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test114");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test115");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test116");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean10 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test117");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test118");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test119");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test120");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test121");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test122");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test123");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test124");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test125");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test126");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test127");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test128");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test129");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test130");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test131");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test132");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test133");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test134");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test135");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test136");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test137");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test138");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test139");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test140");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test141");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test142");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.String str11 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test143");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test144");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test145");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test146");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test147");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test148");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        boolean boolean3 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test149");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test150");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test151");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test152");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test153");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test154");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test155");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test156");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test157");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.String str11 = book1_1.getTitle();
        boolean boolean12 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test158");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test159");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test160");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test161");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test162");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test163");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test164");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test165");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean11 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test166");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test167");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test168");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test169");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test170");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test171");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean10 = book1_1.getStatus();
        java.lang.String str11 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test172");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test173");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test174");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test175");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test176");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        boolean boolean11 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass12 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test177");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test178");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test179");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test180");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test181");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test182");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test183");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test184");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test185");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test186");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test187");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test188");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test189");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test190");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test191");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test192");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test193");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test194");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test195");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test196");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test197");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test198");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str12 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test199");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test200");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test201");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test202");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test203");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test204");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test205");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test206");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test207");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        boolean boolean11 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test208");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean10 = book1_1.getStatus();
        boolean boolean11 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test209");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test210");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test211");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test212");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test213");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean11 = book1_1.getStatus();
        boolean boolean12 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test214");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean12 = book1_1.getStatus();
        boolean boolean13 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test215");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test216");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test217");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test218");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test219");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test220");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test221");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test222");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test223");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test224");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test225");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test226");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test227");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.String str11 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass12 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test228");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test229");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test230");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test231");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test232");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test233");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test234");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test235");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test236");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean11 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test237");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test238");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test239");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test240");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test241");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test242");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test243");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test244");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test245");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        java.lang.String str10 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test246");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test247");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test248");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test249");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.String str11 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test250");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test251");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test252");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str11 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean13 = book1_1.getStatus();
        boolean boolean14 = book1_1.getStatus();
        boolean boolean15 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test253");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test254");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test255");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test256");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        java.lang.String str10 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test257");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test258");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test259");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test260");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test261");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test262");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test263");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test264");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test265");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str11 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test266");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str11 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass13 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test267");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test268");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test269");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test270");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test271");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test272");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        boolean boolean7 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test273");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test274");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean11 = book1_1.getStatus();
        boolean boolean12 = book1_1.getStatus();
        boolean boolean13 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test275");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test276");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test277");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test278");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test279");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test280");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test281");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str11 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean13 = book1_1.getStatus();
        boolean boolean14 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test282");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        boolean boolean11 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test283");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        java.lang.String str8 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test284");
        test.Book1 book1_1 = new test.Book1("");
        book1_1.markAsBorrowed();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test285");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test286");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test287");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test288");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test289");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test290");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test291");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test292");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test293");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test294");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean10 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str12 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test295");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass7 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test296");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test297");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass5 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test298");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test299");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test300");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        boolean boolean11 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test301");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test302");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test303");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.String str11 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test304");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        java.lang.String str11 = book1_1.getTitle();
        java.lang.String str12 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test305");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str5 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test306");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test307");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.String str9 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test308");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test309");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean11 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass12 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test310");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        boolean boolean5 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test311");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test312");
        test.Book1 book1_1 = new test.Book1("hi!");
        java.lang.String str2 = book1_1.getTitle();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test313");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test314");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test315");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test316");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str11 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass13 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test317");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.Class<?> wildcardClass6 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test318");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        java.lang.String str6 = book1_1.getTitle();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        boolean boolean10 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test319");
        test.Book1 book1_1 = new test.Book1("hi!");
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test320");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        java.lang.String str10 = book1_1.getTitle();
        boolean boolean11 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test321");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        java.lang.String str9 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean11 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test322");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        java.lang.String str10 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test323");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test324");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.Class<?> wildcardClass8 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test325");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test326");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        boolean boolean7 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str11 = book1_1.getTitle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test327");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        boolean boolean4 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass10 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test328");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean9 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        java.lang.String str11 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str13 = book1_1.getTitle();
        boolean boolean14 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test329");
        test.Book1 book1_1 = new test.Book1("hi!");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean5 = book1_1.getStatus();
        boolean boolean6 = book1_1.getStatus();
        java.lang.String str7 = book1_1.getTitle();
        java.lang.String str8 = book1_1.getTitle();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass11 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test330");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        java.lang.Class<?> wildcardClass9 = book1_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test331");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        boolean boolean3 = book1_1.getStatus();
        boolean boolean4 = book1_1.getStatus();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean7 = book1_1.getStatus();
        boolean boolean8 = book1_1.getStatus();
        book1_1.markAsBorrowed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test332");
        test.Book1 book1_1 = new test.Book1("");
        java.lang.String str2 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str4 = book1_1.getTitle();
        java.lang.String str5 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str7 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        java.lang.String str9 = book1_1.getTitle();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Book1_Randoop0.test333");
        test.Book1 book1_1 = new test.Book1("");
        boolean boolean2 = book1_1.getStatus();
        java.lang.String str3 = book1_1.getTitle();
        java.lang.String str4 = book1_1.getTitle();
        boolean boolean5 = book1_1.getStatus();
        java.lang.String str6 = book1_1.getTitle();
        book1_1.markAsBorrowed();
        boolean boolean8 = book1_1.getStatus();
        boolean boolean9 = book1_1.getStatus();
        boolean boolean10 = book1_1.getStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}

