package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRandoopTest0 {

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
            System.out.format("%n%s%n", "BookRandoopTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test002");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test003");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test004");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test005");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test006");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (short) 1);
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test007");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test008");
        test.Book book4 = new test.Book("[]  by hi! (52)", "", "[hi!]  by hi! (0)", (int) ' ');
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test009");
        test.Book book4 = new test.Book("", "", "[hi!]  by hi! (1)", (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test010");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test011");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "hi!", "[]  by hi! (52)", (int) ' ');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test012");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "[hi!]  by  (0)", (int) ' ');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test013");
        test.Book book4 = new test.Book("", "[hi!]  by hi! (1)", "hi!", (int) (short) 10);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str5, "[] [hi!]  by hi! (1) by hi! (10)");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test014");
        test.Book book4 = new test.Book("", "[]  by hi! (52)", "hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test015");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "[hi!]  by  (0)", (int) ' ');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)" + "'", str6, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test016");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.Class<?> wildcardClass8 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by  (0)" + "'", str7, "[hi!]  by  (0)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test017");
        test.Book book4 = new test.Book("", "hi!", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) (short) 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test018");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        java.lang.Class<?> wildcardClass8 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test019");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "[hi!]  by  (0)", (int) ' ');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (1)" + "'", str6, "[hi!]  by hi! (1)");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test020");
        test.Book book4 = new test.Book("hi!", "", "[]  by hi! (52)", (int) (short) -1);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test021");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (0)" + "'", str7, "[hi!]  by hi! (0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by hi! (0)" + "'", str8, "[hi!]  by hi! (0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]  by hi! (0)" + "'", str9, "[hi!]  by hi! (0)");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test022");
        test.Book book4 = new test.Book("[]  by hi! (52)", "", "", (int) (byte) 1);
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by hi! (52)]  by  (1)" + "'", str5, "[[]  by hi! (52)]  by  (1)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test023");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "hi!", "hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test024");
        test.Book book4 = new test.Book("", "[]  by hi! (52)", "hi!", (int) (short) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test025");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.Class<?> wildcardClass8 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (1)" + "'", str7, "[hi!]  by hi! (1)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test026");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[]  by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (0)", 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test027");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test028");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test029");
        test.Book book4 = new test.Book("[hi!]  by hi! (0)", "[] [hi!]  by hi! (1) by hi! (10)", "[]  by [hi!]  by hi! (1) (0)", (int) (byte) -1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test030");
        test.Book book4 = new test.Book("[]  by [hi!]  by hi! (1) (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[] [hi!]  by hi! (1) by hi! (10)", (int) ' ');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test031");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test032");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (byte) -1);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test033");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by  (0)" + "'", str6, "[hi!]  by  (0)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test034");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "hi!", (int) '#');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test035");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test036");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "hi!", (int) '#');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)" + "'", str6, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test037");
        test.Book book4 = new test.Book("[]  by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (1)", "[hi!]  by hi! (1)", 10);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by [hi!]  by hi! (1) (0)" + "'", str5, "[]  by [hi!]  by hi! (1) (0)");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test038");
        test.Book book4 = new test.Book("[hi!]  by hi! (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[hi!]  by  (0)", (int) '4');
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (0)" + "'", str5, "[hi!]  by hi! (0)");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test039");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.getId();
        java.lang.Class<?> wildcardClass8 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by hi! (52)" + "'", str6, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test040");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)", "hi!", 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test041");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[[hi!]  by hi! (1)]  by  (0)", "[] [hi!]  by hi! (1) by hi! (10)", (int) '#');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test042");
        test.Book book4 = new test.Book("", "", "[hi!]  by hi! (1)", (int) (byte) 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by [hi!]  by hi! (1) (0)" + "'", str6, "[]  by [hi!]  by hi! (1) (0)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test043");
        test.Book book4 = new test.Book("", "[[]  by hi! (52)]  by  (1)", "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", (int) (byte) 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test044");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "[hi!]  by hi! (1)", (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test045");
        test.Book book4 = new test.Book("", "[] [hi!]  by hi! (1) by hi! (10)", "", (int) '#');
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)" + "'", str5, "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test046");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "[[hi!]  by hi! (1)]  by  (0)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test047");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)]  by  (0)", "[]  by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (0)", (int) (byte) 100);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]  by hi! (1)]  by  (0)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)" + "'", str5, "[[[hi!]  by hi! (1)]  by  (0)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test048");
        test.Book book4 = new test.Book("", "", "[hi!]  by hi! (1)", (int) (byte) 0);
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by [hi!]  by hi! (1) (0)" + "'", str5, "[]  by [hi!]  by hi! (1) (0)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test049");
        test.Book book4 = new test.Book("[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "hi!", "[]  by hi! (52)", (int) (short) -1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)" + "'", str5, "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)" + "'", str6, "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test050");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "[hi!]  by hi! (1)", (int) (short) 10);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)" + "'", str5, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test051");
        test.Book book4 = new test.Book("", "[]  by [hi!]  by hi! (1) (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test052");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        java.lang.Class<?> wildcardClass9 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (1)" + "'", str7, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by hi! (1)" + "'", str8, "[hi!]  by hi! (1)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test053");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[hi!]  by  (0)", "[hi!]  by  (0)", (-1));
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)" + "'", str5, "[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)" + "'", str6, "[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]  by hi! (52)" + "'", str7, "[]  by hi! (52)");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test054");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test055");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[hi!]  by hi! (0)", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by hi! (52)" + "'", str5, "[]  by hi! (52)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test056");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "[hi!]  by  (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test057");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (1)" + "'", str6, "[hi!]  by hi! (1)");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test058");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.toString();
        java.lang.String str10 = book4.getId();
        java.lang.Class<?> wildcardClass11 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (1)" + "'", str7, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by hi! (1)" + "'", str8, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]  by hi! (1)" + "'", str9, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test059");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)", (int) (byte) 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test060");
        test.Book book4 = new test.Book("[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "hi!", "[]  by hi! (52)", (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test061");
        test.Book book4 = new test.Book("[]  by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (1)", "[hi!]  by hi! (1)", 10);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test062");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by hi! (52)" + "'", str6, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]  by hi! (52)" + "'", str7, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]  by hi! (52)" + "'", str8, "[]  by hi! (52)");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test063");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test064");
        test.Book book4 = new test.Book("", "[]  by [hi!]  by hi! (1) (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) (short) 100);
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str5, "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test065");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by  (0)", "[] [hi!]  by hi! (1) by hi! (10)", 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test066");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (short) 1);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test067");
        test.Book book4 = new test.Book("[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "[[]  by hi! (52)]  by  (1)", "", 1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test068");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[hi!]  by hi! (1)", (int) 'a');
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by hi! (52)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by hi! (1) (97)" + "'", str5, "[[]  by hi! (52)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by hi! (1) (97)");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test069");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.getId();
        java.lang.Class<?> wildcardClass10 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (0)" + "'", str7, "[hi!]  by hi! (0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by hi! (0)" + "'", str8, "[hi!]  by hi! (0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test070");
        test.Book book4 = new test.Book("[[]  by hi! (52)]  by  (1)", "[hi!]  by hi! (0)", "[hi!]  by hi! (1)", (int) '#');
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test071");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (short) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test072");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.getId();
        java.lang.String str10 = book4.getId();
        java.lang.Class<?> wildcardClass11 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (0)" + "'", str7, "[hi!]  by hi! (0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by hi! (0)" + "'", str8, "[hi!]  by hi! (0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test073");
        test.Book book4 = new test.Book("[hi!]  by hi! (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[hi!]  by  (0)", (int) '4');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test074");
        test.Book book4 = new test.Book("[]  by hi! (52)", "", "", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by hi! (52)" + "'", str5, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by hi! (52)" + "'", str6, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]  by hi! (52)" + "'", str7, "[]  by hi! (52)");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test075");
        test.Book book4 = new test.Book("[]  by [hi!]  by hi! (1) (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[] [hi!]  by hi! (1) by hi! (10)", (int) ' ');
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)" + "'", str5, "[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)" + "'", str6, "[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test076");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)", "[[hi!]  by hi! (1)]  by  (0)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)", (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test077");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[[hi!]  by hi! (1)]  by  (0)", "[[]  by hi! (52)]  by  (1)", (int) (short) 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test078");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (1)", "[hi!]  by  (0)", (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test079");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[] [hi!]  by hi! (1) by hi! (10)", "[]  by [hi!]  by hi! (1) (0)", (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test080");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "[hi!]  by  (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) (short) 10);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)" + "'", str5, "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str6, "[] [hi!]  by hi! (1) by hi! (10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str7, "[] [hi!]  by hi! (1) by hi! (10)");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test081");
        test.Book book4 = new test.Book("[hi!]  by []  by hi! (52) (-1)", "hi!", "[hi!]  by hi! (1)", (int) (short) 0);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by []  by hi! (52) (-1)" + "'", str5, "[hi!]  by []  by hi! (52) (-1)");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test082");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[]  by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (0)", 100);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test083");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (0)" + "'", str6, "[hi!]  by hi! (0)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test084");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "[hi!]  by  (0)", (int) ' ');
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)" + "'", str5, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)" + "'", str6, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test085");
        test.Book book4 = new test.Book("[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", "[hi!]  by  (0)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)", (int) (byte) -1);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)" + "'", str5, "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test086");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test087");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by  (0)" + "'", str6, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by  (0)" + "'", str7, "[hi!]  by  (0)");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test088");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)]  by  (0)", "[hi!]  by hi! (1)", "[] [hi!]  by hi! (1) by hi! (10)", (int) '4');
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test089");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (byte) -1);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by  (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) by [] [hi!]  by hi! (1) by hi! (10) (-1)" + "'", str5, "[[hi!]  by  (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) by [] [hi!]  by hi! (1) by hi! (10) (-1)");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test090");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "", "[[]  by hi! (52)]  by  (1)", (-1));
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test091");
        test.Book book4 = new test.Book("", "", "[hi!]  by hi! (1)", (int) (byte) 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test092");
        test.Book book4 = new test.Book("[[]  by hi! (52)] [hi!]  by hi! (0) by hi! (1)", "[hi!]  by []  by hi! (52) (-1)", "hi!", 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test093");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by  (0)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)", (int) (byte) 0);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0)" + "'", str5, "[[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0)");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test094");
        test.Book book4 = new test.Book("hi!", "", "[]  by hi! (52)", (int) (short) -1);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by []  by hi! (52) (-1)" + "'", str5, "[hi!]  by []  by hi! (52) (-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test095");
        test.Book book4 = new test.Book("[]  by [hi!]  by hi! (1) (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[] [hi!]  by hi! (1) by hi! (10)", (int) ' ');
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)" + "'", str5, "[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test096");
        test.Book book4 = new test.Book("", "hi!", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", 100);
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str5, "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test097");
        test.Book book4 = new test.Book("[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)", "[hi!]  by hi! (0)", "[hi!]  by hi! (0)", (-1));
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test098");
        test.Book book4 = new test.Book("[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)", "hi!", (int) 'a');
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)" + "'", str5, "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test099");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test100");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (1)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (short) 100);
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)" + "'", str5, "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test101");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        java.lang.String str8 = book4.getId();
        java.lang.String str9 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]  by hi! (0)" + "'", str9, "[hi!]  by hi! (0)");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test102");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[hi!]  by  (0)", (int) '4');
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)" + "'", str5, "[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str6, "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test103");
        test.Book book4 = new test.Book("[[]  by hi! (52)]  by  (1)", "[[hi!]  by hi! (1)]  by  (0)", "[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)", 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test104");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (0)", "[hi!]  by hi! (1)", (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test105");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "[[hi!]  by hi! (1)]  by  (0)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", (int) (short) -1);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] [hi!]  by hi! (1) by hi! (10)] [[hi!]  by hi! (1)]  by  (0) by [[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10) (-1)" + "'", str5, "[[] [hi!]  by hi! (1) by hi! (10)] [[hi!]  by hi! (1)]  by  (0) by [[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10) (-1)");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test106");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (1)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (short) 100);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)" + "'", str5, "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)" + "'", str6, "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by  (0)" + "'", str7, "[hi!]  by  (0)");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test107");
        test.Book book4 = new test.Book("[hi!]  by hi! (0)", "[hi!]  by hi! (0)", "", (int) (short) -1);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (0)" + "'", str5, "[hi!]  by hi! (0)");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test108");
        test.Book book4 = new test.Book("", "hi!", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test109");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "hi!", "[]  by hi! (52)", (int) ' ');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by  (0)" + "'", str6, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by  (0)" + "'", str7, "[hi!]  by  (0)");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test110");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by  (0)", "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test111");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "[[]  by hi! (52)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by hi! (1) (97)", (int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test112");
        test.Book book4 = new test.Book("hi!", "", "[]  by hi! (52)", (int) (short) -1);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by []  by hi! (52) (-1)" + "'", str5, "[hi!]  by []  by hi! (52) (-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by []  by hi! (52) (-1)" + "'", str6, "[hi!]  by []  by hi! (52) (-1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test113");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (1)" + "'", str6, "[hi!]  by hi! (1)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test114");
        test.Book book4 = new test.Book("[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)", "[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", (int) (short) 10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test115");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "hi!", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)", (int) (byte) 10);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] hi! by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (10)" + "'", str5, "[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] hi! by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (10)");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test116");
        test.Book book4 = new test.Book("[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (-1)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "hi!", (int) (short) -1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test117");
        test.Book book4 = new test.Book("", "[] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) by [] [hi!]  by hi! (1) by hi! (10) (100)", "[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)", (int) ' ');
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test118");
        test.Book book4 = new test.Book("[]  by hi! (52)", "", "", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by hi! (52)" + "'", str5, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by hi! (52)" + "'", str6, "[]  by hi! (52)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test119");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "", "", 0);
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by hi! (1)]  by  (0)" + "'", str5, "[[hi!]  by hi! (1)]  by  (0)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test120");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        java.lang.String str8 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test121");
        test.Book book4 = new test.Book("", "hi!", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", 100);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str5, "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str6, "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str7, "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test122");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.toString();
        java.lang.String str10 = book4.getId();
        java.lang.String str11 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (1)" + "'", str7, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by hi! (1)" + "'", str8, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]  by hi! (1)" + "'", str9, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]  by hi! (1)" + "'", str11, "[hi!]  by hi! (1)");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test123");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)]  by  (0)", "[]  by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (0)", (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test124");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[hi!]  by []  by hi! (52) (-1)", "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", (int) (byte) 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test125");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (0)", "[]  by hi! (52)", (-1));
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test126");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.getId();
        java.lang.String str10 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]  by hi! (52)" + "'", str8, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test127");
        test.Book book4 = new test.Book("[hi!]  by hi! (0)", "[[[hi!]  by hi! (1)]  by  (0)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)", "[]  by [hi!]  by hi! (1) (0)", (int) (byte) 10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test128");
        test.Book book4 = new test.Book("[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", 10);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)" + "'", str5, "[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test129");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[hi!]  by hi! (1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", (int) ' ');
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)] [hi!]  by hi! (1) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) (32)" + "'", str5, "[[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)] [hi!]  by hi! (1) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) (32)");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test130");
        test.Book book4 = new test.Book("[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "[hi!]  by hi! (1)", "[hi!]  by  (0)", 0);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test131");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[hi!]  by  (0)", "[hi!]  by  (0)", (-1));
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)" + "'", str5, "[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test132");
        test.Book book4 = new test.Book("", "[[]  by hi! (52)] [hi!]  by hi! (0) by hi! (1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", (int) '4');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test133");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "", "[[]  by hi! (52)] [hi!]  by hi! (0) by hi! (1)", (int) (short) 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test134");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (1)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (short) 100);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)" + "'", str5, "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)" + "'", str6, "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test135");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "hi!", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)", (int) (byte) 10);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str5, "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str6, "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test136");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (1)", "[hi!]  by  (0)", (int) (short) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)" + "'", str6, "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)" + "'", str7, "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by  (0)" + "'", str8, "[hi!]  by  (0)");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test137");
        test.Book book4 = new test.Book("", "", "[hi!]  by hi! (1)", (int) (byte) 0);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by [hi!]  by hi! (1) (0)" + "'", str5, "[]  by [hi!]  by hi! (1) (0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]  by [hi!]  by hi! (1) (0)" + "'", str7, "[]  by [hi!]  by hi! (1) (0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]  by [hi!]  by hi! (1) (0)" + "'", str8, "[]  by [hi!]  by hi! (1) (0)");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test138");
        test.Book book4 = new test.Book("[]  by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (1)", "[hi!]  by hi! (1)", 10);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by [hi!]  by hi! (1) (0)] [hi!]  by hi! (1) by [hi!]  by hi! (1) (10)" + "'", str5, "[[]  by [hi!]  by hi! (1) (0)] [hi!]  by hi! (1) by [hi!]  by hi! (1) (10)");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test139");
        test.Book book4 = new test.Book("[[] [hi!]  by hi! (1) by hi! (10)] [[hi!]  by hi! (1)]  by  (0) by [[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10) (-1)", "[[]  by hi! (52)]  by  (1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) '4');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test140");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by hi! (1)]  by  (0)" + "'", str6, "[[hi!]  by hi! (1)]  by  (0)");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test141");
        test.Book book4 = new test.Book("[[[hi!]  by hi! (1)]  by  (0)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", (-1));
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test142");
        test.Book book4 = new test.Book("[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] [[]  by hi! (52)]  by  (1) by  (1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)", "[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (-1)", 10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test143");
        test.Book book4 = new test.Book("[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", (int) (short) 10);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str5, "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test144");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (short) 1);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (1)" + "'", str6, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (1)" + "'", str7, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by hi! (1)" + "'", str8, "[hi!]  by hi! (1)");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test145");
        test.Book book4 = new test.Book("[hi!]  by []  by hi! (52) (-1)", "hi!", "[hi!]  by hi! (1)", (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test146");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[hi!]  by hi! (1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", (int) ' ');
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)" + "'", str5, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test147");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.getId();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by  (0)" + "'", str6, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by  (0)" + "'", str8, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]  by  (0)" + "'", str9, "[hi!]  by  (0)");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test148");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.toString();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test149");
        test.Book book4 = new test.Book("hi!", "[hi!]  by hi! (0)", "[[hi!]  by hi! (1)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)", (int) (short) -1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test150");
        test.Book book4 = new test.Book("[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "", (int) '#');
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test151");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "[hi!]  by hi! (1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", (int) (short) -1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str5, "[] [hi!]  by hi! (1) by hi! (10)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str6, "[] [hi!]  by hi! (1) by hi! (10)");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test152");
        test.Book book4 = new test.Book("[]  by hi! (52)", "", "", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.getId();
        java.lang.String str9 = book4.getId();
        java.lang.String str10 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by hi! (52)" + "'", str5, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by hi! (52)" + "'", str6, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[]  by hi! (52)]  by  (1)" + "'", str7, "[[]  by hi! (52)]  by  (1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]  by hi! (52)" + "'", str8, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]  by hi! (52)" + "'", str9, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]  by hi! (52)" + "'", str10, "[]  by hi! (52)");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test153");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "", "[hi!]  by  (0)", (int) (short) 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test154");
        test.Book book4 = new test.Book("[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (-1)", "[[]  by hi! (52)] [hi!]  by hi! (0) by hi! (1)", "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test155");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)]  by  (0)", "[hi!]  by hi! (1)", "[]  by [hi!]  by hi! (1) (0)", (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test156");
        test.Book book4 = new test.Book("[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)" + "'", str5, "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test157");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by hi! (0)", "hi!", (int) '#');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.getId();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.getId();
        java.lang.String str10 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)" + "'", str6, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (1)" + "'", str7, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)" + "'", str8, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]  by hi! (1)" + "'", str9, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)" + "'", str10, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test158");
        test.Book book4 = new test.Book("[hi!]  by []  by hi! (52) (-1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)", (int) 'a');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test159");
        test.Book book4 = new test.Book("[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "hi!", "[]  by hi! (52)", (int) (short) -1);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] hi! by []  by hi! (52) (-1)" + "'", str5, "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] hi! by []  by hi! (52) (-1)");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test160");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (1)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (short) 100);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test161");
        test.Book book4 = new test.Book("[[]  by hi! (52)]  by  (1)", "", "[]  by [hi!]  by hi! (1) (0)", (int) (byte) 10);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by hi! (52)]  by  (1)" + "'", str5, "[[]  by hi! (52)]  by  (1)");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test162");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (short) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (1)" + "'", str6, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (1)" + "'", str7, "[hi!]  by hi! (1)");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test163");
        test.Book book4 = new test.Book("[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", "[hi!]  by  (0)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)", (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test164");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (0)", "[hi!]  by hi! (1)", (int) (byte) 0);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (0)" + "'", str5, "[[hi!]  by  (0)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (0)" + "'", str6, "[[hi!]  by  (0)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (0)");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test165");
        test.Book book4 = new test.Book("[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (-1)", "[[]  by hi! (52)]  by  (1)", "[[hi!]  by  (0)] hi! by []  by hi! (52) (32)", (int) (byte) -1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test166");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0)", "[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "[[hi!]  by hi! (1)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)", (int) 'a');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test167");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by  (0)" + "'", str7, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by  (0)" + "'", str8, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test168");
        test.Book book4 = new test.Book("[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)", "[hi!]  by  (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)", (int) (byte) 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test169");
        test.Book book4 = new test.Book("", "[[] [hi!]  by hi! (1) by hi! (10)]  by [[]  by hi! (52)]  by  (1) (-1)", "[[]  by hi! (52)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by hi! (1) (97)", (int) '#');
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test170");
        test.Book book4 = new test.Book("[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", 10);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)" + "'", str5, "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)" + "'", str6, "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test171");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.getId();
        java.lang.String str8 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by hi! (52)" + "'", str6, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test172");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)", "[]  by hi! (52)", 0);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) by []  by hi! (52) (0)" + "'", str5, "[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) by []  by hi! (52) (0)");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test173");
        test.Book book4 = new test.Book("[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", "[[]  by hi! (52)]  by  (1)", "", 1);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] [[]  by hi! (52)]  by  (1) by  (1)" + "'", str5, "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] [[]  by hi! (52)]  by  (1) by  (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] [[]  by hi! (52)]  by  (1) by  (1)" + "'", str6, "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] [[]  by hi! (52)]  by  (1) by  (1)");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test174");
        test.Book book4 = new test.Book("[hi!]  by []  by hi! (52) (-1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) (byte) 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test175");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[hi!]  by hi! (0)", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[]  by hi! (52)] [hi!]  by hi! (0) by hi! (1)" + "'", str5, "[[]  by hi! (52)] [hi!]  by hi! (0) by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[]  by hi! (52)] [hi!]  by hi! (0) by hi! (1)" + "'", str6, "[[]  by hi! (52)] [hi!]  by hi! (0) by hi! (1)");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test176");
        test.Book book4 = new test.Book("", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (short) 100);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test177");
        test.Book book4 = new test.Book("", "[[]  by hi! (52)]  by  (1)", "[[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)] [hi!]  by hi! (1) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) (32)", (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test178");
        test.Book book4 = new test.Book("[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) by []  by hi! (52) (0)", "[[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)] [hi!]  by hi! (1) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) (32)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", (int) ' ');
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test179");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)", "[[] [hi!]  by hi! (1) by hi! (10)] [[hi!]  by hi! (1)]  by  (0) by [[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10) (-1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) '#');
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test180");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[]  by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (0)", 100);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by hi! (1)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)" + "'", str5, "[[hi!]  by hi! (1)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (1)" + "'", str6, "[hi!]  by hi! (1)");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test181");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", (int) (short) 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test182");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "hi!", "[]  by hi! (52)", (int) ' ');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by  (0)" + "'", str6, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[hi!]  by  (0)] hi! by []  by hi! (52) (32)" + "'", str7, "[[hi!]  by  (0)] hi! by []  by hi! (52) (32)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[hi!]  by  (0)] hi! by []  by hi! (52) (32)" + "'", str8, "[[hi!]  by  (0)] hi! by []  by hi! (52) (32)");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test183");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.getId();
        java.lang.String str9 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by hi! (52)" + "'", str5, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]  by hi! (52)" + "'", str7, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test184");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "[[]  by hi! (52)] [hi!]  by  (0) by [hi!]  by  (0) (-1)", "[]  by [hi!]  by hi! (1) (0)", 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test185");
        test.Book book4 = new test.Book("", "", "hi!", (int) '4');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by hi! (52)" + "'", str6, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]  by hi! (52)" + "'", str7, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test186");
        test.Book book4 = new test.Book("hi!", "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] hi! by []  by hi! (52) (-1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", (int) (byte) 10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test187");
        test.Book book4 = new test.Book("[[hi!]  by  (0)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (0)", "[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)", "[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (10) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", (int) '4');
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test188");
        test.Book book4 = new test.Book("[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)", "[[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0)", "", 1);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)] [[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0) by  (1)" + "'", str5, "[[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)] [[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0) by  (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)] [[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0) by  (1)" + "'", str6, "[[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)] [[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0) by  (1)");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test189");
        test.Book book4 = new test.Book("[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test190");
        test.Book book4 = new test.Book("[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "hi!", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)", (int) (byte) 10);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)" + "'", str5, "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test191");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] [[]  by hi! (52)]  by  (1) by  (1)", "[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)", (-1));
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test192");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[[hi!]  by  (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) by [] [hi!]  by hi! (1) by hi! (10) (-1)", "hi!", 10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test193");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "", "[[]  by hi! (52)]  by  (1)", (-1));
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.toString();
        java.lang.Class<?> wildcardClass7 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] [hi!]  by hi! (1) by hi! (10)]  by [[]  by hi! (52)]  by  (1) (-1)" + "'", str5, "[[] [hi!]  by hi! (1) by hi! (10)]  by [[]  by hi! (52)]  by  (1) (-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[] [hi!]  by hi! (1) by hi! (10)]  by [[]  by hi! (52)]  by  (1) (-1)" + "'", str6, "[[] [hi!]  by hi! (1) by hi! (10)]  by [[]  by hi! (52)]  by  (1) (-1)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test194");
        test.Book book4 = new test.Book("[[]  by [hi!]  by hi! (1) (0)] [hi!]  by hi! (1) by [hi!]  by hi! (1) (10)", "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", "[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] [[]  by hi! (52)]  by  (1) by  (1)", (int) '4');
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test195");
        test.Book book4 = new test.Book("hi!", "", "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", (int) '#');
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test196");
        test.Book book4 = new test.Book("[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", "[hi!]  by  (0)", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1)", (int) (byte) -1);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (-1)" + "'", str5, "[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)" + "'", str6, "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test197");
        test.Book book4 = new test.Book("[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] hi! by []  by hi! (52) (-1)", "[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[]  by hi! (52)", (int) (short) 10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test198");
        test.Book book4 = new test.Book("hi!", "", "[]  by hi! (52)", (int) (short) -1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test199");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[hi!]  by  (0)", "[] [hi!]  by hi! (1) by hi! (10)", 100);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by hi! (1)" + "'", str5, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (1)" + "'", str6, "[hi!]  by hi! (1)");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test200");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by hi! (0)" + "'", str6, "[hi!]  by hi! (0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (0)" + "'", str7, "[hi!]  by hi! (0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test201");
        test.Book book4 = new test.Book("hi!", "", "", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.getId();
        java.lang.String str9 = book4.getId();
        java.lang.String str10 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by  (0)" + "'", str7, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test202");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (0)", "[]  by hi! (52)", (-1));
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[hi!]  by  (0)] [hi!]  by hi! (0) by []  by hi! (52) (-1)" + "'", str6, "[[hi!]  by  (0)] [hi!]  by hi! (0) by []  by hi! (52) (-1)");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test203");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[hi!]  by  (0)", "[hi!]  by  (0)", (-1));
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by hi! (52)" + "'", str5, "[]  by hi! (52)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test204");
        test.Book book4 = new test.Book("", "hi!", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test205");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "", "[[]  by hi! (52)]  by  (1)", (-1));
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        java.lang.String str8 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[] [hi!]  by hi! (1) by hi! (10)]  by [[]  by hi! (52)]  by  (1) (-1)" + "'", str5, "[[] [hi!]  by hi! (1) by hi! (10)]  by [[]  by hi! (52)]  by  (1) (-1)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str6, "[] [hi!]  by hi! (1) by hi! (10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str7, "[] [hi!]  by hi! (1) by hi! (10)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str8, "[] [hi!]  by hi! (1) by hi! (10)");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test206");
        test.Book book4 = new test.Book("[hi!]  by hi! (1)", "[] [hi!]  by hi! (1) by hi! (10)", "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test207");
        test.Book book4 = new test.Book("[hi!]  by  (0)", "[hi!]  by hi! (1)", "[hi!]  by  (0)", (int) (short) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[hi!]  by  (0)" + "'", str5, "[hi!]  by  (0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]  by  (0)" + "'", str6, "[hi!]  by  (0)");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test208");
        test.Book book4 = new test.Book("hi!", "", "hi!", 0);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.getId();
        java.lang.String str8 = book4.getId();
        java.lang.Class<?> wildcardClass9 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test209");
        test.Book book4 = new test.Book("[[]  by [hi!]  by hi! (1) (0)] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) by [] [hi!]  by hi! (1) by hi! (10) (32)", "[[hi!]  by  (0)] hi! by []  by hi! (52) (32)", "[[hi!]  by  (0)] [hi!]  by hi! (0) by []  by hi! (52) (-1)", 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test210");
        test.Book book4 = new test.Book("", "[hi!]  by hi! (1)", "hi!", (int) (short) 10);
        java.lang.String str5 = book4.getId();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test211");
        test.Book book4 = new test.Book("", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[] [hi!]  by hi! (1) by hi! (10)", (int) (short) 100);
        java.lang.String str5 = book4.toString();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) by [] [hi!]  by hi! (1) by hi! (10) (100)" + "'", str5, "[] [[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35) by [] [hi!]  by hi! (1) by hi! (10) (100)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test212");
        test.Book book4 = new test.Book("[hi!]  by hi! (0)", "[hi!]  by []  by hi! (52) (-1)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", (int) (byte) 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test213");
        test.Book book4 = new test.Book("", "[[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100)", "[[]  by hi! (52)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by hi! (1) (97)", (int) ' ');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test214");
        test.Book book4 = new test.Book("[[[] [hi!]  by hi! (1) by hi! (10)] [hi!]  by  (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (10)] [[]  by hi! (52)]  by  (1) by  (1)", "[[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by  (0) (52)] [[hi!]  by hi! (1)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [] [hi!]  by hi! (1) by hi! (10) (100) (0) by  (1)", "[[hi!]  by  (0)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (0)", (int) '4');
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test215");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "[hi!]  by  (0)", "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32)", (int) (short) 10);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] [hi!]  by hi! (1) by hi! (10)" + "'", str5, "[] [hi!]  by hi! (1) by hi! (10)");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test216");
        test.Book book4 = new test.Book("[[]  by [hi!]  by hi! (1) (0)] [hi!]  by hi! (1) by [hi!]  by hi! (1) (10)", "", "[[] [] [hi!]  by hi! (1) by hi! (10) by  (35)] [hi!]  by  (0) by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (-1)", (int) '4');
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test217");
        test.Book book4 = new test.Book("[] [hi!]  by hi! (1) by hi! (10)", "[[]  by hi! (52)] [] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100) by [hi!]  by hi! (1) (97)", "[] [] [hi!]  by hi! (1) by hi! (10) by  (35)", (int) '#');
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test218");
        test.Book book4 = new test.Book("hi!", "", "hi!", (int) (byte) 1);
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        java.lang.String str7 = book4.toString();
        java.lang.String str8 = book4.toString();
        java.lang.String str9 = book4.toString();
        java.lang.String str10 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]  by hi! (1)" + "'", str7, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]  by hi! (1)" + "'", str8, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]  by hi! (1)" + "'", str9, "[hi!]  by hi! (1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]  by hi! (1)" + "'", str10, "[hi!]  by hi! (1)");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test219");
        test.Book book4 = new test.Book("[[] hi! by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)] hi! by [[hi!]  by  (0)] [hi!]  by hi! (1) by [hi!]  by  (0) (1) (10)", "hi!", "[hi!]  by hi! (0)", (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test220");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)", "[[[hi!]  by hi! (1)]  by  (0)] []  by [hi!]  by hi! (1) (0) by [hi!]  by hi! (0) (100)", "[]  by hi! (52)", (int) (byte) 100);
        java.lang.String str5 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)" + "'", str5, "[[hi!]  by hi! (1)] [hi!]  by hi! (0) by hi! (35)");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test221");
        test.Book book4 = new test.Book("[]  by hi! (52)", "[] []  by [hi!]  by hi! (1) (0) by [[hi!]  by hi! (1)] [hi!]  by hi! (0) by [hi!]  by  (0) (32) (100)", "[hi!]  by hi! (1)", (int) 'a');
        java.lang.String str5 = book4.getId();
        java.lang.String str6 = book4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]  by hi! (52)" + "'", str5, "[]  by hi! (52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]  by hi! (52)" + "'", str6, "[]  by hi! (52)");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BookRandoopTest0.test222");
        test.Book book4 = new test.Book("[[hi!]  by hi! (1)]  by  (0)", "[[hi!]  by  (0)] [hi!]  by hi! (0) by [hi!]  by hi! (1) (0)", "[hi!]  by hi! (0)", (-1));
    }
}

