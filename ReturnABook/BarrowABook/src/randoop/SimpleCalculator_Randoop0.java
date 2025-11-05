import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimpleCalculator_Randoop0 {

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
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test002");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = simpleCalculator0.divide(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test003");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test004");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.add((int) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test005");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.subtract((-1), (-97));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test006");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((-97), 96);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test007");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.subtract((-97), 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-207) + "'", int9 == (-207));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test008");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.subtract((-1), (-97));
        int int21 = simpleCalculator0.add((-97), 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test009");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test010");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        java.lang.Class<?> wildcardClass7 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test011");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test012");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.add((-1), 0);
        int int12 = simpleCalculator0.subtract(109, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test013");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test014");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.add(51, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test015");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test016");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.add(0, 10);
        int int18 = simpleCalculator0.subtract((int) (short) 0, 110);
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test017");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.divide((int) (short) 10, (-97));
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test018");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.add(51, (int) (short) 1);
        int int15 = simpleCalculator0.add((-68), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test019");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test020");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test021");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test022");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.multiply(0, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test023");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.add((-1), 0);
        int int12 = simpleCalculator0.subtract(109, (int) (short) 100);
        int int15 = simpleCalculator0.subtract(96, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 95 + "'", int15 == 95);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test024");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((int) '#', (int) (short) -1);
        int int21 = simpleCalculator0.add(101, (-7567));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7466) + "'", int21 == (-7466));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test025");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        int int21 = simpleCalculator0.multiply(97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test026");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add(1, (-867133440));
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133439) + "'", int15 == (-867133439));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test027");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply(0, (-867133537));
        int int9 = simpleCalculator0.divide((-58), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test028");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.subtract((-1), (-97));
        int int21 = simpleCalculator0.add((-131), (-867133440));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test029");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = simpleCalculator0.subtract((-207), 86713344);
        int int18 = simpleCalculator0.subtract((-867133491), (-7567));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867125924) + "'", int18 == (-867125924));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test030");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.subtract((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test031");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.multiply(867133591, (-867133440));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 692692992 + "'", int12 == 692692992);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test032");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.divide((-1010), 86713455);
        int int24 = simpleCalculator0.add((int) (byte) 10, 867133491);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133501 + "'", int24 == 867133501);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test033");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test034");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.divide((int) ' ', (-101));
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test035");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add(1, (-867133440));
        int int18 = simpleCalculator0.divide((-101), (-1923));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133439) + "'", int15 == (-867133439));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test036");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test037");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        java.lang.Class<?> wildcardClass7 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test038");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.add(0, 10);
        int int18 = simpleCalculator0.multiply((-36), 98);
        int int21 = simpleCalculator0.divide((-7480), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3528) + "'", int18 == (-3528));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220) + "'", int21 == (-220));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test039");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.divide(1, (-1));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test040");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide((-1769916224), (-36));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test041");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test042");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.multiply((int) (short) -1, 49164339);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test043");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) '#', (-9312));
        int int18 = simpleCalculator0.multiply(86713455, 1769916224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test044");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.divide((-1010), 86713455);
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test045");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add((int) (short) 100, 110);
        int int12 = simpleCalculator0.add((int) '#', 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 69 + "'", int12 == 69);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test046");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.subtract(76, (-867133439));
        int int18 = simpleCalculator0.subtract((-976), 4213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test047");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((-3528), (-1010));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3563280 + "'", int12 == 3563280);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test048");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.multiply((int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = simpleCalculator0.divide((-58), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test049");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.subtract((-867133537), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867133537) + "'", int12 == (-867133537));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test050");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply((-76), (int) (short) -1);
        int int18 = simpleCalculator0.add((-10), (-68));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test051");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        int int21 = simpleCalculator0.divide(96, (-68));
        int int24 = simpleCalculator0.divide((-15300), (-520200));
        int int27 = simpleCalculator0.multiply(98, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test052");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.subtract(76, (-867133439));
        int int18 = simpleCalculator0.subtract((-15200), (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test053");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply((-76), (int) (short) -1);
        int int18 = simpleCalculator0.multiply(20580, (-49164339));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test054");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test055");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide((-68), (int) (byte) 100);
        int int12 = simpleCalculator0.subtract((-111), (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test056");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.multiply((int) (byte) 100, (-1));
        int int12 = simpleCalculator0.multiply((-1), (-2020));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test057");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test058");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.multiply((-31), 346346496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2146806784) + "'", int12 == (-2146806784));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test059");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add((int) (short) 100, 110);
        int int12 = simpleCalculator0.multiply((-23318356), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = simpleCalculator0.divide(757717952, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test060");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.subtract((int) (byte) -1, 100);
        int int12 = simpleCalculator0.multiply((-2146806784), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 67686400 + "'", int12 == 67686400);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test061");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.add(568480, 110);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test062");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test063");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.subtract(20580, (-867133439));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test064");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.divide((-36), 33);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test065");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply(0, (-867133537));
        int int9 = simpleCalculator0.divide(0, (-1769916224));
        int int12 = simpleCalculator0.add((-9280), 2243220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2233940 + "'", int12 == 2233940);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test066");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        int int12 = simpleCalculator0.multiply((-9312), (-9312));
        int int15 = simpleCalculator0.subtract(867133515, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test067");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add(101, (-2020));
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test068");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.divide(76, 692692992);
        int int21 = simpleCalculator0.divide((-867154019), 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7955541) + "'", int21 == (-7955541));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test069");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply((-76), (int) (short) -1);
        int int18 = simpleCalculator0.multiply(20580, (-49164339));
        int int21 = simpleCalculator0.multiply(568480, (-86713457));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1526379168) + "'", int21 == (-1526379168));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test070");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.add((int) 'a', (int) (byte) 0);
        int int15 = simpleCalculator0.divide((-520200), (-7466));
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test071");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-110), (-867133491));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 867133381 + "'", int9 == 867133381);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test072");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        int int12 = simpleCalculator0.multiply((-9312), (-9312));
        int int15 = simpleCalculator0.divide((-100), 1152037484);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test073");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.add(867133491, (int) (byte) 100);
        int int27 = simpleCalculator0.divide(86713344, 9347);
        int int30 = simpleCalculator0.subtract((int) 'a', (-520200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9277 + "'", int27 == 9277);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520297 + "'", int30 == 520297);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test074");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.add((-1), 0);
        int int12 = simpleCalculator0.add((int) 'a', (-2020));
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test075");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.add(0, 10);
        int int18 = simpleCalculator0.subtract((int) (short) 0, 110);
        int int21 = simpleCalculator0.multiply((-867133491), (-9280));
        int int24 = simpleCalculator0.divide(51, 86713457);
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test076");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.divide((-867133571), (-7600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test077");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.add((-1), 0);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test078");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        int int12 = simpleCalculator0.divide((-3), 86713344);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test079");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.divide((int) (short) 10, (-97));
        int int18 = simpleCalculator0.subtract((int) (byte) -1, 0);
        int int21 = simpleCalculator0.add(0, (-520200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-520200) + "'", int21 == (-520200));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test080");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test081");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.divide(86698157, 867133515);
        int int24 = simpleCalculator0.divide((-6), 867154019);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test082");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.add((-1), 0);
        int int12 = simpleCalculator0.subtract(109, (int) (short) 100);
        int int15 = simpleCalculator0.subtract((-110), 867133501);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133611) + "'", int15 == (-867133611));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test083");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.subtract((int) (byte) -1, 100);
        int int12 = simpleCalculator0.subtract(1810185236, (-1010));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1810186246 + "'", int12 == 1810186246);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test084");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.multiply(0, 0);
        int int18 = simpleCalculator0.multiply(867133667, (-97));
        int int21 = simpleCalculator0.subtract((-173426797), 9277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173436074) + "'", int21 == (-173436074));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test085");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test086");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.divide(692692992, 2);
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test087");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (byte) 1, 96);
        int int24 = simpleCalculator0.subtract((-867125924), (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test088");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.add((int) (byte) 1, (int) ' ');
        int int15 = simpleCalculator0.multiply((int) (short) 1, (-6858340));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6858340) + "'", int15 == (-6858340));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test089");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test090");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.subtract((-101), (-86));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test091");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.multiply(0, 0);
        int int18 = simpleCalculator0.multiply(867133667, (-97));
        int int21 = simpleCalculator0.divide(34, (-1923));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test092");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.add(51, (-97));
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test093");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(20580, (-685834));
        int int9 = simpleCalculator0.add(96, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 196 + "'", int9 == 196);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test094");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add(101, (-2020));
        int int12 = simpleCalculator0.add(0, 1693566793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1693566793 + "'", int12 == 1693566793);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test095");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.divide((-867133439), 9);
        int int12 = simpleCalculator0.subtract(0, 867154019);
        int int15 = simpleCalculator0.subtract(867154019, (-976));
        int int18 = simpleCalculator0.subtract((-101), (-121));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test096");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.divide(51, 109);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test097");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        int int21 = simpleCalculator0.add((-86713551), 94);
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test098");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply((-76), (-7480));
        int int9 = simpleCalculator0.subtract((-86713457), 2243220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-88956677) + "'", int9 == (-88956677));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test099");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract(568590, 20580);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 548010 + "'", int12 == 548010);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test100");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.add((int) (byte) -1, (int) '4');
        int int21 = simpleCalculator0.divide(101, (-101));
        int int24 = simpleCalculator0.add(1810185236, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810185237 + "'", int24 == 1810185237);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test101");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.multiply((-46), (-152));
        int int27 = simpleCalculator0.divide(9277, (int) 'a');
        int int30 = simpleCalculator0.divide(86713455, 20580);
        int int33 = simpleCalculator0.add(25, 69);
        java.lang.Class<?> wildcardClass34 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4213 + "'", int30 == 4213);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94 + "'", int33 == 94);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test102");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply((-76), (int) (short) -1);
        int int18 = simpleCalculator0.add((-10), (-68));
        int int21 = simpleCalculator0.add((-346346486), (-96348159));
        int int24 = simpleCalculator0.add((-1769916224), 867133591);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-442694645) + "'", int21 == (-442694645));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-902782633) + "'", int24 == (-902782633));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test103");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, (-49164339));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49164339) + "'", int6 == (-49164339));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test104");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((-46), (-867133537));
        int int18 = simpleCalculator0.add((int) (short) 10, 867133501);
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test105");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = simpleCalculator0.add(757717952, (-867133491));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-109415539) + "'", int15 == (-109415539));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test106");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (byte) 1, 96);
        int int24 = simpleCalculator0.subtract(25, 867133591);
        int int27 = simpleCalculator0.multiply((-173426797), (-110));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1897078486 + "'", int27 == 1897078486);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test107");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.multiply((int) (short) 10, (-685834));
        int int21 = simpleCalculator0.subtract(867154019, 1925360681);
        int int24 = simpleCalculator0.multiply(100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test108");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.subtract(131, 0);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 131 + "'", int15 == 131);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test109");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.divide(692692992, (-1010));
        int int21 = simpleCalculator0.add((-5189), (-867133439));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867138628) + "'", int21 == (-867138628));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test110");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add((int) (short) 100, 110);
        int int12 = simpleCalculator0.subtract(867133591, (-15200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 867148791 + "'", int12 == 867148791);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test111");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply(0, (-867133537));
        int int9 = simpleCalculator0.divide(0, (-1769916224));
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test112");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test113");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.divide(100, (-867133440));
        int int21 = simpleCalculator0.multiply((-1769916127), 843);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1685643349) + "'", int21 == (-1685643349));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test114");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.divide(692692992, (-1010));
        int int21 = simpleCalculator0.multiply((-36), (-867133571));
        int int24 = simpleCalculator0.divide(101, 9);
        int int27 = simpleCalculator0.subtract(101, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test115");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.divide(76, 692692992);
        int int21 = simpleCalculator0.subtract(51, (-665254));
        int int24 = simpleCalculator0.multiply(131, 867133667);
        int int27 = simpleCalculator0.add((-86713342), 867154019);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1925360681 + "'", int24 == 1925360681);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 780440677 + "'", int27 == 780440677);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test116");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        int int21 = simpleCalculator0.divide(867133501, (-867138628));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test117");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.divide((-867133439), 9);
        int int12 = simpleCalculator0.subtract(0, 867154019);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = simpleCalculator0.divide(20580, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test118");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.multiply((int) (byte) 100, (-1));
        int int12 = simpleCalculator0.subtract(1152037484, 153);
        int int15 = simpleCalculator0.multiply(867133667, 42260032);
        int int18 = simpleCalculator0.multiply((-36), 867133491);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037331 + "'", int12 == 1152037331);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1754528448 + "'", int15 == 1754528448);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1152034604) + "'", int18 == (-1152034604));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test119");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.multiply(0, 210);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test120");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.add(1152037484, (int) '4');
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037536 + "'", int12 == 1152037536);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test121");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide((-68), (int) (byte) 100);
        int int12 = simpleCalculator0.divide(0, (-121));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test122");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        int int12 = simpleCalculator0.divide((int) (short) 0, 34);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test123");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.multiply((int) (short) 10, (-685834));
        int int21 = simpleCalculator0.subtract(867154019, 1925360681);
        int int24 = simpleCalculator0.add((-3), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test124");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.subtract((int) '#', (int) (short) 10);
        int int15 = simpleCalculator0.subtract(2, 86713344);
        int int18 = simpleCalculator0.subtract(757717952, 2877446);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 754840506 + "'", int18 == 754840506);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test125");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.add((int) 'a', (int) (byte) 0);
        int int15 = simpleCalculator0.divide((-520200), (-7466));
        int int18 = simpleCalculator0.subtract((-100), 2243220);
        int int21 = simpleCalculator0.subtract((-86713342), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2243320) + "'", int18 == (-2243320));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713342) + "'", int21 == (-86713342));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test126");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.divide(692692992, (-1010));
        int int21 = simpleCalculator0.multiply((-36), (-867133571));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test127");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.add((int) (byte) -1, (int) '4');
        int int21 = simpleCalculator0.subtract((int) (byte) 1, 32);
        int int24 = simpleCalculator0.add(520297, 1810185236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test128");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.divide(67686400, (-111));
        int int21 = simpleCalculator0.multiply(867133381, 867133420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1730079900 + "'", int21 == 1730079900);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test129");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.add(0, 10);
        int int18 = simpleCalculator0.divide((-2020), (-10));
        int int21 = simpleCalculator0.divide(34, 42260032);
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test130");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.multiply((int) (short) -1, 867133491);
        int int12 = simpleCalculator0.multiply((-111), (-3528));
        int int15 = simpleCalculator0.divide(0, (-3));
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test131");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.multiply((-46), (-152));
        int int27 = simpleCalculator0.divide(9277, (int) 'a');
        int int30 = simpleCalculator0.divide(86713455, 20580);
        int int33 = simpleCalculator0.add(25, 69);
        int int36 = simpleCalculator0.add(2233940, 1152037538);
        int int39 = simpleCalculator0.multiply((-86713457), 1730079900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4213 + "'", int30 == 4213);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94 + "'", int33 == 94);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1154271478 + "'", int36 == 1154271478);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1474273060 + "'", int39 == 1474273060);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test132");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.divide((int) (short) 10, (-97));
        int int18 = simpleCalculator0.divide(4213, (-7567));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test133");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.divide((-36), 33);
        int int18 = simpleCalculator0.divide((-207), 33);
        int int21 = simpleCalculator0.add((-867133440), 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133431) + "'", int21 == (-867133431));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test134");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((-97), 96);
        int int15 = simpleCalculator0.divide((-15300), 1693566793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test135");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply(0, (-867133537));
        int int9 = simpleCalculator0.divide(25, (-1923));
        int int12 = simpleCalculator0.multiply(548010, 3563280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1497046880) + "'", int12 == (-1497046880));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test136");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.subtract((-1), (-97));
        int int21 = simpleCalculator0.add((-131), (-867133440));
        int int24 = simpleCalculator0.multiply((int) (byte) 0, (-3528));
        int int27 = simpleCalculator0.subtract((-86713651), 2233940);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-88947591) + "'", int27 == (-88947591));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test137");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.add((int) (byte) -1, (int) '4');
        int int21 = simpleCalculator0.divide(101, (-101));
        int int24 = simpleCalculator0.subtract((int) (short) 1, (int) (short) -1);
        int int27 = simpleCalculator0.divide(9, (-68));
        int int30 = simpleCalculator0.multiply((-52), 86713457);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-214132468) + "'", int30 == (-214132468));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test138");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.divide(757717952, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-50514530) + "'", int12 == (-50514530));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test139");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.divide((int) (short) 10, (-97));
        int int18 = simpleCalculator0.subtract((int) (byte) -1, 0);
        int int21 = simpleCalculator0.divide((-9312), 867133515);
        int int24 = simpleCalculator0.subtract(1237148863, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1237148811 + "'", int24 == 1237148811);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test140");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((-46), (-867133537));
        int int18 = simpleCalculator0.add((int) (short) 10, 867133501);
        int int21 = simpleCalculator0.multiply(2, (-86713457));
        int int24 = simpleCalculator0.add(86713344, 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86713475 + "'", int24 == 86713475);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test141");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.divide((int) ' ', (-101));
        int int15 = simpleCalculator0.add(1152037484, (-6858340));
        int int18 = simpleCalculator0.multiply((-31), 9277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-287587) + "'", int18 == (-287587));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test142");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.subtract((-6), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test143");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = simpleCalculator0.add((int) (byte) -1, (-111));
        int int18 = simpleCalculator0.subtract((-68), 49164339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-112) + "'", int15 == (-112));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-49164407) + "'", int18 == (-49164407));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test144");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide(100, 98);
        int int21 = simpleCalculator0.subtract((-86713551), (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713651) + "'", int21 == (-86713651));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test145");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.divide((-100), 32);
        int int21 = simpleCalculator0.subtract(520297, 51);
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 520246 + "'", int21 == 520246);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test146");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-110), (int) (short) 0);
        int int12 = simpleCalculator0.divide(1769916224, (-86713342));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test147");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((-46), (-867133537));
        int int18 = simpleCalculator0.add((int) (short) 10, 867133501);
        int int21 = simpleCalculator0.add(110, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test148");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.divide((int) ' ', (-101));
        int int15 = simpleCalculator0.add(1152037484, (-6858340));
        int int18 = simpleCalculator0.divide(4213, 867133667);
        int int21 = simpleCalculator0.subtract(0, 86713457);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test149");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((-152), (-867154019));
        int int24 = simpleCalculator0.add((-6867620), 1152037484);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1336575288) + "'", int21 == (-1336575288));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1145169864 + "'", int24 == 1145169864);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test150");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.add(25, 867133591);
        int int6 = simpleCalculator0.subtract((-46), (int) (byte) -1);
        int int9 = simpleCalculator0.divide(520297, (-867133491));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 867133616 + "'", int3 == 867133616);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-45) + "'", int6 == (-45));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test151");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.multiply(867133381, 1693566793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1155286483) + "'", int21 == (-1155286483));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test152");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add((int) (short) 100, 110);
        int int12 = simpleCalculator0.subtract(757717952, 867133515);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test153");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.divide((-866613314), 692692992);
        int int18 = simpleCalculator0.add((int) (short) -1, (-111));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test154");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.add((int) (byte) -1, (int) '4');
        int int21 = simpleCalculator0.subtract((int) (byte) 1, 32);
        int int24 = simpleCalculator0.divide((-86713457), (-2020));
        int int27 = simpleCalculator0.divide((int) (byte) 0, 42260032);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test155");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.multiply((-76), (int) (byte) 100);
        int int18 = simpleCalculator0.subtract((-867133440), 692692992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test156");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide((-1769916224), (-36));
        int int21 = simpleCalculator0.add(867133591, 76);
        int int24 = simpleCalculator0.divide(42927, (-7955541));
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test157");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.subtract((-86713342), 86713455);
        int int21 = simpleCalculator0.subtract((-1494342816), 1787380221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test158");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        int int12 = simpleCalculator0.divide((-3), 86713344);
        int int15 = simpleCalculator0.divide((-15300), 867133511);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test159");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.divide((int) (byte) -1, 69);
        int int21 = simpleCalculator0.add((-747485824), 867133420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 119647596 + "'", int21 == 119647596);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test160");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.add(86713457, (-15300));
        int int21 = simpleCalculator0.subtract(867133616, 196);
        int int24 = simpleCalculator0.divide(86698157, (-7955541));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133420 + "'", int21 == 867133420);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test161");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.divide(692692992, 2);
        int int21 = simpleCalculator0.divide(1237148864, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test162");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.divide((int) (short) 10, (-97));
        int int18 = simpleCalculator0.divide((int) 'a', (-207));
        int int21 = simpleCalculator0.multiply(0, (-867133440));
        int int24 = simpleCalculator0.divide((-1923), (-520185));
        int int27 = simpleCalculator0.multiply((-346346486), 1237148864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2130112384 + "'", int27 == 2130112384);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test163");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.divide((int) (short) 10, (-173426914));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test164");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.divide((int) '#', (int) ' ');
        int int18 = simpleCalculator0.add(34, (-1010));
        int int21 = simpleCalculator0.multiply(568480, (-6));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test165");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = simpleCalculator0.add((-6858340), (-9280));
        int int18 = simpleCalculator0.divide(897963264, 94);
        int int21 = simpleCalculator0.multiply(32, 867133667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1978473568 + "'", int21 == 1978473568);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test166");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.divide((-1010), 86713455);
        int int24 = simpleCalculator0.add((-173436074), (int) ' ');
        int int27 = simpleCalculator0.add(21975629, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-173436042) + "'", int24 == (-173436042));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21975739 + "'", int27 == 21975739);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test167");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        int int21 = simpleCalculator0.subtract((-111), (-111));
        int int24 = simpleCalculator0.multiply(1769916224, (int) (short) 100);
        int int27 = simpleCalculator0.subtract(0, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 897963264 + "'", int24 == 897963264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-34) + "'", int27 == (-34));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test168");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        int int21 = simpleCalculator0.subtract((-111), (-111));
        int int24 = simpleCalculator0.multiply(1769916224, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 897963264 + "'", int24 == 897963264);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test169");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.divide(67686400, (-111));
        int int21 = simpleCalculator0.add((-3528), 109413727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 109410199 + "'", int21 == 109410199);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test170");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-110), (int) (short) 0);
        int int12 = simpleCalculator0.multiply((int) ' ', (-152));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4864) + "'", int12 == (-4864));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test171");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (byte) 1, 96);
        int int24 = simpleCalculator0.subtract(25, 867133591);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = simpleCalculator0.divide((-1923), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test172");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        int int21 = simpleCalculator0.add((-86713551), 94);
        int int24 = simpleCalculator0.subtract((int) (short) 100, 1700666764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1700666664) + "'", int24 == (-1700666664));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test173");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.add((int) 'a', (int) (byte) 0);
        int int15 = simpleCalculator0.multiply((-68), 110);
        int int18 = simpleCalculator0.subtract(86713457, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86713381 + "'", int18 == 86713381);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test174");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.add((-76), (-76));
        int int27 = simpleCalculator0.multiply((-6858340), 3563280);
        int int30 = simpleCalculator0.divide(42927, (-867138628));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test175");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.add((-76), (-76));
        int int27 = simpleCalculator0.multiply((-6858340), 3563280);
        int int30 = simpleCalculator0.subtract((-867133566), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-867133666) + "'", int30 == (-867133666));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test176");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract(9, (-100));
        int int15 = simpleCalculator0.divide(76, 692692992);
        int int18 = simpleCalculator0.add((int) 'a', (-867133439));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test177");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.add((-97), (-867133440));
        int int12 = simpleCalculator0.subtract(1145179144, 100);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test178");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        int int21 = simpleCalculator0.subtract((-111), (-111));
        int int24 = simpleCalculator0.multiply((-685834), 867133616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1520179488 + "'", int24 == 1520179488);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test179");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.multiply(0, 210);
        int int18 = simpleCalculator0.subtract(1810185236, 1810185237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test180");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.subtract((int) '#', (int) (short) 10);
        int int15 = simpleCalculator0.add(520297, (-867133611));
        int int18 = simpleCalculator0.add((-287587), (-3410880));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3698467) + "'", int18 == (-3698467));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test181");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.divide((int) ' ', (-101));
        int int15 = simpleCalculator0.add(1152037484, (-6858340));
        int int18 = simpleCalculator0.divide(4213, 867133667);
        int int21 = simpleCalculator0.subtract((-173426914), 1810705533);
        int int24 = simpleCalculator0.subtract((-173436042), 67686400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1984132447) + "'", int21 == (-1984132447));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-241122442) + "'", int24 == (-241122442));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test182");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.add(867133667, (-121));
        int int21 = simpleCalculator0.multiply((-2020), 867133501);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 736984748 + "'", int21 == 736984748);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test183");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        int int12 = simpleCalculator0.divide((-3), 86713344);
        int int15 = simpleCalculator0.subtract((-520200), (-15));
        int int18 = simpleCalculator0.subtract((-867133666), 1152037538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2019171204) + "'", int18 == (-2019171204));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test184");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.add((int) (byte) -1, (int) '4');
        int int21 = simpleCalculator0.divide(101, (-101));
        int int24 = simpleCalculator0.subtract((int) (short) 1, (int) (short) -1);
        int int27 = simpleCalculator0.divide(9, (-68));
        java.lang.Class<?> wildcardClass28 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test185");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.add(1152037484, (int) '4');
        int int15 = simpleCalculator0.subtract((-173426914), (-1806625));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037536 + "'", int12 == 1152037536);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-171620289) + "'", int15 == (-171620289));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test186");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.subtract(76, (-867133439));
        int int18 = simpleCalculator0.subtract((-15200), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = simpleCalculator0.divide(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test187");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.multiply(0, 0);
        int int18 = simpleCalculator0.divide(19670, (-76));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-258) + "'", int18 == (-258));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test188");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.subtract((-1700666664), (-241122442));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1459544222) + "'", int15 == (-1459544222));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test189");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (byte) 1, 96);
        int int24 = simpleCalculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = simpleCalculator0.divide(9277, 11);
        int int30 = simpleCalculator0.subtract((-442694645), 568480);
        java.lang.Class<?> wildcardClass31 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test190");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.add((-1), 0);
        int int12 = simpleCalculator0.add((int) 'a', (-2020));
        int int15 = simpleCalculator0.multiply(49164339, (-173426797));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1813700023) + "'", int15 == (-1813700023));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test191");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add((int) (short) 100, 110);
        int int12 = simpleCalculator0.subtract(95, 0);
        int int15 = simpleCalculator0.multiply((-867138628), (-15200));
        int int18 = simpleCalculator0.multiply(100, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test192");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.subtract(0, 867133515);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133515) + "'", int15 == (-867133515));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test193");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.divide((-173436074), 96);
        int int24 = simpleCalculator0.divide(67686400, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6153309 + "'", int24 == 6153309);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test194");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.subtract(76, (-867133439));
        int int18 = simpleCalculator0.multiply(33, 213009);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test195");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = simpleCalculator0.add((int) (byte) -1, (-111));
        int int18 = simpleCalculator0.divide(110, (-1526379168));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-112) + "'", int15 == (-112));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test196");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.divide(51, 109);
        int int18 = simpleCalculator0.multiply(1152037538, 21975629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 378379962 + "'", int18 == 378379962);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test197");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.add((-1), 0);
        int int12 = simpleCalculator0.subtract(109, (int) (short) 100);
        int int15 = simpleCalculator0.multiply((-101), (int) (short) 10);
        int int18 = simpleCalculator0.multiply(86713344, 1700666764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-290738176) + "'", int18 == (-290738176));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test198");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.divide((int) (short) 10, (-97));
        int int18 = simpleCalculator0.divide((int) 'a', (-207));
        int int21 = simpleCalculator0.multiply(0, (-867133440));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test199");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.add((int) 'a', (int) (byte) 0);
        int int15 = simpleCalculator0.multiply((-68), 110);
        int int18 = simpleCalculator0.add(1371450554, (-49164339));
        int int21 = simpleCalculator0.add(1152037331, (-867133342));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test200");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        int int21 = simpleCalculator0.divide(96, (-68));
        int int24 = simpleCalculator0.divide((-15300), (-520200));
        int int27 = simpleCalculator0.add((-49164339), (-9433));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-49173772) + "'", int27 == (-49173772));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test201");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.divide((-867133439), 9);
        int int12 = simpleCalculator0.divide((-2146806852), 1145179044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test202");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.multiply((-46), (-152));
        int int27 = simpleCalculator0.divide(9277, (int) 'a');
        int int30 = simpleCalculator0.divide(86713455, 20580);
        int int33 = simpleCalculator0.add(25, 69);
        int int36 = simpleCalculator0.subtract(96, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4213 + "'", int30 == 4213);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94 + "'", int33 == 94);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 96 + "'", int36 == 96);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test203");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.multiply(1322286215, 867133501);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2139980843 + "'", int18 == 2139980843);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test204");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-110), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test205");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.subtract((int) '#', (int) (short) 10);
        int int15 = simpleCalculator0.subtract(2, 86713344);
        int int18 = simpleCalculator0.multiply(1700666860, (-15200));
        int int21 = simpleCalculator0.multiply(866523750, 1693566793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test206");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.multiply(34, (-685834));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test207");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((-46), (-867133537));
        int int18 = simpleCalculator0.add((int) (short) 10, 867133501);
        int int21 = simpleCalculator0.add((-3528), (-7567));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test208");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.add((-97), (-867133440));
        int int12 = simpleCalculator0.subtract(86713344, (-111));
        int int15 = simpleCalculator0.multiply((int) (short) 100, (-152));
        int int18 = simpleCalculator0.add((-1685643349), (-1336575288));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test209");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.subtract((int) '#', (int) (short) 10);
        int int15 = simpleCalculator0.subtract(2, 86713344);
        int int18 = simpleCalculator0.multiply(20, 1154271478);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1610593080 + "'", int18 == 1610593080);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test210");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.multiply((-68), (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test211");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test212");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.add((-867133515), 1154271478);
        int int18 = simpleCalculator0.multiply(0, (-1964453610));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test213");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.divide((-58), 568480);
        int int21 = simpleCalculator0.divide(86713457, (-109415563));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test214");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.add(51, (int) (short) 1);
        int int15 = simpleCalculator0.add(1700666764, 96);
        int int18 = simpleCalculator0.add(96, 67686400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666860 + "'", int15 == 1700666860);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67686496 + "'", int18 == 67686496);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test215");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.add(0, 10);
        int int18 = simpleCalculator0.divide((-2020), (-10));
        int int21 = simpleCalculator0.add(1271882624, (-2243320));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639304 + "'", int21 == 1269639304);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test216");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.add((int) (byte) 1, (int) ' ');
        int int15 = simpleCalculator0.subtract(754840506, (-1984132447));
        int int18 = simpleCalculator0.multiply(1, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test217");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.add((int) (byte) 100, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120 + "'", int21 == 120);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test218");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.subtract((-1), (-97));
        int int21 = simpleCalculator0.multiply(0, 287137963);
        int int24 = simpleCalculator0.subtract(109410199, 866523750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-757113551) + "'", int24 == (-757113551));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test219");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.divide(86713381, (-3528));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24578) + "'", int9 == (-24578));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test220");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.add(867133491, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test221");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = simpleCalculator0.subtract((-207), 86713344);
        int int18 = simpleCalculator0.subtract(119647596, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test222");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = simpleCalculator0.subtract((-207), 86713344);
        int int18 = simpleCalculator0.divide((-96348159), 1013244259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test223");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.add(0, (-1010));
        int int21 = simpleCalculator0.add(1271882624, 119647596);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1010) + "'", int18 == (-1010));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1391530220 + "'", int21 == 1391530220);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test224");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.divide(210, (-976));
        int int21 = simpleCalculator0.subtract(0, (-110));
        int int24 = simpleCalculator0.divide(213009, (-241122442));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test225");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.divide((int) '#', (int) ' ');
        int int18 = simpleCalculator0.add(34, (-1010));
        int int21 = simpleCalculator0.multiply(568480, (-6));
        int int24 = simpleCalculator0.add((-2146806784), 1693566793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-453239991) + "'", int24 == (-453239991));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test226");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.subtract(867133420, 1269639304);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test227");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.divide(867133546, (-442694645));
        int int21 = simpleCalculator0.subtract((-36), 1145179144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test228");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.subtract(20580, (-867133439));
        int int21 = simpleCalculator0.add((-1769916224), (-2243320));
        int int24 = simpleCalculator0.multiply((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1772159544) + "'", int21 == (-1772159544));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test229");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.divide(7955592, 6992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1137 + "'", int15 == 1137);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test230");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.add((int) 'a', (int) (byte) 0);
        int int15 = simpleCalculator0.divide((-520200), (-7466));
        int int18 = simpleCalculator0.multiply((-86713457), 692692992);
        int int21 = simpleCalculator0.divide(867133667, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8671336 + "'", int21 == 8671336);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test231");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.subtract((-1), (-97));
        int int21 = simpleCalculator0.add((-131), (-867133440));
        int int24 = simpleCalculator0.multiply((int) (byte) 0, (-3528));
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test232");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.divide((-1010), 1152037484);
        int int24 = simpleCalculator0.subtract((-2146806852), 1610593080);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 537567364 + "'", int24 == 537567364);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test233");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.subtract((-86713342), 86713455);
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test234");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        int int21 = simpleCalculator0.subtract((int) (short) 100, 98);
        int int24 = simpleCalculator0.add((-1813700023), (-747485824));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1733781449 + "'", int24 == 1733781449);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test235");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.add(0, 10);
        int int18 = simpleCalculator0.subtract((int) (short) 0, 110);
        int int21 = simpleCalculator0.multiply((-867133491), (-9280));
        int int24 = simpleCalculator0.multiply((int) (short) -1, (-1923));
        int int27 = simpleCalculator0.multiply(1610593080, (-609787));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1923 + "'", int24 == 1923);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1435799528) + "'", int27 == (-1435799528));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test236");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.add(32, (-9312));
        int int12 = simpleCalculator0.divide(3563280, (-442694645));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9280) + "'", int9 == (-9280));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test237");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract(10, 346346496);
        int int18 = simpleCalculator0.divide(520201, (-1685643349));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-346346486) + "'", int15 == (-346346486));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test238");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.divide(86698157, 867133515);
        int int24 = simpleCalculator0.add(21975629, (-867133431));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-845157802) + "'", int24 == (-845157802));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test239");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.divide(210, (-976));
        int int21 = simpleCalculator0.subtract(0, (-110));
        int int24 = simpleCalculator0.divide((int) (byte) -1, 867133667);
        int int27 = simpleCalculator0.subtract(17, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test240");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.add((int) (byte) -1, (int) '4');
        int int21 = simpleCalculator0.subtract((int) (byte) 1, 32);
        int int24 = simpleCalculator0.divide((-86713457), (-2020));
        int int27 = simpleCalculator0.add((-88956677), (-867138628));
        java.lang.Class<?> wildcardClass28 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-956095305) + "'", int27 == (-956095305));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test241");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.add(568480, 110);
        int int15 = simpleCalculator0.subtract((-867154019), 67686496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-934840515) + "'", int15 == (-934840515));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test242");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.subtract(96, 97);
        int int15 = simpleCalculator0.multiply((-45), (-23318356));
        int int18 = simpleCalculator0.multiply(19670, 0);
        int int21 = simpleCalculator0.subtract(52, 867133381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133329) + "'", int21 == (-867133329));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test243");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (byte) 1, 96);
        int int24 = simpleCalculator0.multiply(2, (-1010));
        int int27 = simpleCalculator0.subtract((-7955541), (-110));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2020) + "'", int24 == (-2020));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7955431) + "'", int27 == (-7955431));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test244");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.divide((-173436074), 96);
        int int24 = simpleCalculator0.divide((-1806625), (-1559826432));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test245");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.divide((-173436074), 96);
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test246");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.divide((-1237148864), 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8085940) + "'", int9 == (-8085940));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test247");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.add((int) (short) 100, 1754528448);
        int int24 = simpleCalculator0.add(1, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1754528548 + "'", int21 == 1754528548);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test248");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.add(51, (-97));
        int int15 = simpleCalculator0.divide(9, 867133591);
        int int18 = simpleCalculator0.subtract(9, (-109415563));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109415572 + "'", int18 == 109415572);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test249");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.multiply((int) (short) 10, 0);
        int int12 = simpleCalculator0.subtract(114096, 9347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104749 + "'", int12 == 104749);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test250");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        int int21 = simpleCalculator0.divide(96, (-68));
        int int24 = simpleCalculator0.divide((-15300), (-520200));
        int int27 = simpleCalculator0.subtract(0, (-866613314));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 866613314 + "'", int27 == 866613314);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test251");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.add((-867133515), 1154271478);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test252");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.subtract((int) '#', (int) (short) 10);
        int int15 = simpleCalculator0.multiply((-86713457), (-2146806784));
        int int18 = simpleCalculator0.add((-86713342), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-341775360) + "'", int15 == (-341775360));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-86713376) + "'", int18 == (-86713376));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test253");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add((int) (short) 100, 110);
        int int12 = simpleCalculator0.subtract(95, 0);
        int int15 = simpleCalculator0.multiply(2243220, 1145169864);
        int int18 = simpleCalculator0.add(520246, (-845157802));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-844637556) + "'", int18 == (-844637556));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test254");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.add(0, 10);
        int int18 = simpleCalculator0.subtract((int) (short) 0, 110);
        int int21 = simpleCalculator0.multiply((-867133491), (-9280));
        int int24 = simpleCalculator0.multiply((-1769916224), (-173426797));
        int int27 = simpleCalculator0.multiply((-7480), (-76));
        java.lang.Class<?> wildcardClass28 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 568480 + "'", int27 == 568480);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test255");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.multiply((-46), (-152));
        int int27 = simpleCalculator0.multiply(867133491, 202);
        int int30 = simpleCalculator0.divide(1787380221, (-86713551));
        int int33 = simpleCalculator0.divide((-845157802), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-932693954) + "'", int27 == (-932693954));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-20) + "'", int30 == (-20));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-26411181) + "'", int33 == (-26411181));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test256");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = simpleCalculator0.add((-6858340), (-9280));
        int int18 = simpleCalculator0.divide(897963264, 94);
        int int21 = simpleCalculator0.divide((-1700666664), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-170066666) + "'", int21 == (-170066666));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test257");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((-110), (-68));
        int int9 = simpleCalculator0.add(6992, 1152037538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152044530 + "'", int9 == 1152044530);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test258");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.divide((-867133439), 9);
        int int12 = simpleCalculator0.multiply((-96348159), (-9280));
        int int15 = simpleCalculator0.divide(1272748659, (-2243320));
        int int18 = simpleCalculator0.add(1810185237, (-453239991));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-567) + "'", int15 == (-567));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1356945246 + "'", int18 == 1356945246);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test259");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.add(0, 10);
        int int18 = simpleCalculator0.subtract((int) (short) 0, 110);
        int int21 = simpleCalculator0.multiply((-867133491), (-9280));
        int int24 = simpleCalculator0.multiply(98, 210);
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20580 + "'", int24 == 20580);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test260");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.divide((-36), 33);
        int int18 = simpleCalculator0.divide((-31), 119647579);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test261");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.divide((-867133439), 9);
        int int12 = simpleCalculator0.subtract(0, 867154019);
        int int15 = simpleCalculator0.subtract(210, (-241122442));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 241122652 + "'", int15 == 241122652);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test262");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.divide((-100), 32);
        int int21 = simpleCalculator0.subtract(520297, 51);
        int int24 = simpleCalculator0.multiply(757944224, 568590);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 520246 + "'", int21 == 520246);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1807123776) + "'", int24 == (-1807123776));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test263");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.divide((-866613314), 692692992);
        int int18 = simpleCalculator0.add(1693566793, 867154995);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1734245508) + "'", int18 == (-1734245508));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test264");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        int int12 = simpleCalculator0.divide((int) (short) 0, 34);
        int int15 = simpleCalculator0.divide((-1494342816), (-68));
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21975629 + "'", int15 == 21975629);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test265");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.multiply((int) (short) 10, (-685834));
        int int21 = simpleCalculator0.divide((-76), (-3528));
        int int24 = simpleCalculator0.divide((-86713342), 1137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-76265) + "'", int24 == (-76265));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test266");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.subtract(76, (-867133439));
        int int18 = simpleCalculator0.subtract((-15200), (int) (short) 100);
        int int21 = simpleCalculator0.multiply(86713455, 391608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1671243464 + "'", int21 == 1671243464);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test267");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.add(2, 86713455);
        int int24 = simpleCalculator0.add((int) (byte) 100, 49164339);
        int int27 = simpleCalculator0.subtract(120, 120);
        java.lang.Class<?> wildcardClass28 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86713457 + "'", int21 == 86713457);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49164439 + "'", int24 == 49164439);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test268");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        int int21 = simpleCalculator0.divide(96, (-68));
        int int24 = simpleCalculator0.divide((-15300), (-520200));
        int int27 = simpleCalculator0.divide(1237148864, 33);
        int int30 = simpleCalculator0.add((-1700666664), (-934840515));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37489359 + "'", int27 == 37489359);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1659460117 + "'", int30 == 1659460117);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test269");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.multiply(34, (-685834));
        int int21 = simpleCalculator0.add(1700666860, 1237148863);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1357151573) + "'", int21 == (-1357151573));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test270");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.multiply((-76), (int) (byte) 100);
        int int18 = simpleCalculator0.subtract(100, (-1));
        int int21 = simpleCalculator0.multiply((-5), 378379962);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test271");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.divide(76, 692692992);
        int int21 = simpleCalculator0.subtract(51, (-665254));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test272");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((-152), (-867154019));
        int int24 = simpleCalculator0.subtract(0, (-4864));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1336575288) + "'", int21 == (-1336575288));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4864 + "'", int24 == 4864);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test273");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.add((int) (short) 100, 1754528448);
        int int24 = simpleCalculator0.divide(1923, 6992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1754528548 + "'", int21 == 1754528548);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test274");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply(0, (-867133537));
        int int9 = simpleCalculator0.add((-2146806784), 0);
        int int12 = simpleCalculator0.subtract(520297, 96);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test275");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.add((-609787), 1237148765);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236538978 + "'", int15 == 1236538978);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test276");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.add((int) (byte) -1, (int) '4');
        int int21 = simpleCalculator0.subtract((int) (byte) 1, 32);
        int int24 = simpleCalculator0.divide((-86713457), (-2020));
        int int27 = simpleCalculator0.add(101, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 197 + "'", int27 == 197);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test277");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.multiply((int) (byte) 100, (-1));
        int int12 = simpleCalculator0.subtract(1152037484, 153);
        int int15 = simpleCalculator0.multiply(95, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037331 + "'", int12 == 1152037331);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3325 + "'", int15 == 3325);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test278");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.divide(2233940, (-86713551));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test279");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.add((int) 'a', 1);
        int int15 = simpleCalculator0.multiply((-111), (-1919));
        int int18 = simpleCalculator0.subtract(1810186246, (-867133329));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1617647721) + "'", int18 == (-1617647721));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test280");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.divide((int) (short) 10, (-97));
        int int18 = simpleCalculator0.subtract((int) (byte) -1, 0);
        int int21 = simpleCalculator0.multiply((-1152034604), (-934840515));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1838369148) + "'", int21 == (-1838369148));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test281");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test282");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide((-1769916224), (-36));
        int int21 = simpleCalculator0.add((-9312), (-121));
        int int24 = simpleCalculator0.multiply((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test283");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.divide(95, (int) (byte) 10);
        int int27 = simpleCalculator0.subtract((-6867620), 1013244259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1020111879) + "'", int27 == (-1020111879));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test284");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide((-1769916224), (-36));
        int int21 = simpleCalculator0.add(867133591, 76);
        int int24 = simpleCalculator0.divide(42927, (-7955541));
        int int27 = simpleCalculator0.divide((-15), (-1152034604));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test285");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add((int) (short) 100, 110);
        int int12 = simpleCalculator0.subtract(95, 0);
        int int15 = simpleCalculator0.multiply((-867138628), (-15200));
        int int18 = simpleCalculator0.add(1897078486, (-26411181));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1870667305 + "'", int18 == 1870667305);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test286");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.subtract((-1), (-97));
        int int21 = simpleCalculator0.subtract(37489359, (-11095));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37500454 + "'", int21 == 37500454);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test287");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.add((-111), (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test288");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.divide((-36), 33);
        int int18 = simpleCalculator0.divide((-207), 33);
        int int21 = simpleCalculator0.add(97, (-1769916224));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916127) + "'", int21 == (-1769916127));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test289");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.add(867133491, (int) (byte) 100);
        int int27 = simpleCalculator0.divide(86713344, 9347);
        int int30 = simpleCalculator0.subtract((-36), (-520185));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9277 + "'", int27 == 9277);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520149 + "'", int30 == 520149);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test290");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.divide((-36), 33);
        int int18 = simpleCalculator0.divide((-207), 33);
        int int21 = simpleCalculator0.multiply((-11095), 1145179044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1248231612) + "'", int21 == (-1248231612));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test291");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (byte) 1, 96);
        int int24 = simpleCalculator0.subtract(25, 867133591);
        int int27 = simpleCalculator0.divide((-362406912), (-433567285));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test292");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((-110), (-68));
        int int9 = simpleCalculator0.add((-20), (-1555994343));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1555994363) + "'", int9 == (-1555994363));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test293");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.divide((-867133439), 9);
        int int12 = simpleCalculator0.multiply((-96348159), (-9280));
        int int15 = simpleCalculator0.divide((-5), 202);
        int int18 = simpleCalculator0.divide(110, 853334016);
        int int21 = simpleCalculator0.divide(67686496, 867154995);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test294");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((int) '#', (int) (short) -1);
        int int21 = simpleCalculator0.subtract((int) (short) 0, (-1769916224));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916224 + "'", int21 == 1769916224);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test295");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply(0, (-867133537));
        int int9 = simpleCalculator0.divide(25, (-1923));
        java.lang.Class<?> wildcardClass10 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test296");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.divide((-1010), 86713455);
        int int24 = simpleCalculator0.add((-173436074), (int) ' ');
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-173436042) + "'", int24 == (-173436042));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test297");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.divide((-173436074), 96);
        int int24 = simpleCalculator0.subtract(25, 37489359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test298");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.add((-1), 1237148864);
        int int12 = simpleCalculator0.add((-20), (-112));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1237148863 + "'", int9 == 1237148863);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-132) + "'", int12 == (-132));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test299");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.divide((int) ' ', (-101));
        int int15 = simpleCalculator0.add(1152037484, (-6858340));
        int int18 = simpleCalculator0.divide(4213, 867133667);
        int int21 = simpleCalculator0.subtract((-4864), (-1357151573));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1357146709 + "'", int21 == 1357146709);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test300");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.divide((-100), 32);
        int int21 = simpleCalculator0.divide(19670, 3325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test301");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.add(25, 867133591);
        int int6 = simpleCalculator0.add((-1984132447), (-49164407));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 867133616 + "'", int3 == 867133616);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2033296854) + "'", int6 == (-2033296854));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test302");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        int int21 = simpleCalculator0.subtract((int) (short) 100, 98);
        int int24 = simpleCalculator0.multiply(537567364, 210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1219996744 + "'", int24 == 1219996744);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test303");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test304");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide((-68), (int) (byte) 100);
        int int12 = simpleCalculator0.subtract((-111), (int) (short) 10);
        int int15 = simpleCalculator0.multiply(108673896, (-111));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 822099432 + "'", int15 == 822099432);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test305");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.subtract((-86713342), 86713455);
        int int21 = simpleCalculator0.subtract(1, (-152));
        int int24 = simpleCalculator0.multiply((-3), 867133501);
        int int27 = simpleCalculator0.multiply((-258), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1693566793 + "'", int24 == 1693566793);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2064 + "'", int27 == 2064);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test306");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        int int21 = simpleCalculator0.divide(96, (-68));
        int int24 = simpleCalculator0.divide((-15300), (-520200));
        int int27 = simpleCalculator0.add((-171620289), 665305);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-170954984) + "'", int27 == (-170954984));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test307");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.add(2, 86713455);
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86713457 + "'", int21 == 86713457);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test308");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.subtract((-1), 9);
        int int18 = simpleCalculator0.multiply(18, (-867138628));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1571373880 + "'", int18 == 1571373880);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test309");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.divide((-173436074), 96);
        int int24 = simpleCalculator0.multiply((-240317368), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1738066976) + "'", int24 == (-1738066976));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test310");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.divide((-866613314), 692692992);
        int int18 = simpleCalculator0.multiply((-442694645), (-1357151573));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 236472665 + "'", int18 == 236472665);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test311");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.divide((-867133439), 9);
        int int12 = simpleCalculator0.subtract(0, 867154019);
        int int15 = simpleCalculator0.subtract(867154019, (-976));
        int int18 = simpleCalculator0.add((-171620289), 51);
        int int21 = simpleCalculator0.divide(1269639304, (-1769916127));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test312");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide(0, 10);
        int int12 = simpleCalculator0.add(0, 86713457);
        int int15 = simpleCalculator0.add(1520179488, (-1459544222));
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713457 + "'", int12 == 86713457);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60635266 + "'", int15 == 60635266);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test313");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.divide(2243220, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test314");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.divide((int) (byte) -1, 69);
        int int21 = simpleCalculator0.add(6992, 2020);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9012 + "'", int21 == 9012);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test315");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract(9, (-100));
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test316");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide(100, 98);
        int int21 = simpleCalculator0.multiply(3563280, 867133546);
        int int24 = simpleCalculator0.subtract(86713381, 1730079900);
        int int27 = simpleCalculator0.subtract(86713381, 568480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1643366519) + "'", int24 == (-1643366519));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 86144901 + "'", int27 == 86144901);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test317");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.subtract((int) (byte) -1, 100);
        int int12 = simpleCalculator0.divide(153, 21975629);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test318");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.add((-97), (-867133440));
        int int12 = simpleCalculator0.subtract(1145179144, 100);
        int int15 = simpleCalculator0.multiply((-2146806784), 287137963);
        int int18 = simpleCalculator0.add((-1772159544), (-241122442));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-362406912) + "'", int15 == (-362406912));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2013281986) + "'", int18 == (-2013281986));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test319");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.divide(10, 1);
        int int15 = simpleCalculator0.divide((-7466), 67686400);
        int int18 = simpleCalculator0.divide(0, 6992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test320");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.multiply((int) (short) -1, 867133491);
        int int12 = simpleCalculator0.subtract((-86), (-109415563));
        int int15 = simpleCalculator0.add(0, 757944224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test321");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((-68), (int) (byte) 10);
        int int21 = simpleCalculator0.divide(96, (-68));
        int int24 = simpleCalculator0.divide((-15300), (-520200));
        int int27 = simpleCalculator0.subtract(51, (-7955541));
        int int30 = simpleCalculator0.add((-2033296854), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7955592 + "'", int27 == 7955592);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2033296844) + "'", int30 == (-2033296844));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test322");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.divide((-220), (int) '#');
        int int24 = simpleCalculator0.divide(6992, (-68));
        int int27 = simpleCalculator0.multiply((-844637556), 1237148811);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2132911612) + "'", int27 == (-2132911612));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test323");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 0, (int) 'a');
        int int12 = simpleCalculator0.divide((int) ' ', (-101));
        int int15 = simpleCalculator0.add(1152037484, (-6858340));
        int int18 = simpleCalculator0.divide(4213, 867133667);
        int int21 = simpleCalculator0.multiply((-9433), 346346496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1383615488 + "'", int21 == 1383615488);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test324");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.divide((-867133439), 9);
        int int12 = simpleCalculator0.subtract(0, 867154019);
        int int15 = simpleCalculator0.subtract(867154019, (-976));
        int int18 = simpleCalculator0.add((-171620289), 51);
        int int21 = simpleCalculator0.add((int) (short) 100, (-1497046880));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1497046780) + "'", int21 == (-1497046780));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test325");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply(0, (-867133537));
        int int9 = simpleCalculator0.divide(25, (-1923));
        int int12 = simpleCalculator0.multiply((-15300), 34);
        int int15 = simpleCalculator0.subtract(1152037484, (-109415563));
        int int18 = simpleCalculator0.divide(1810186246, (-78));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test326");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.subtract((-86713342), 86713455);
        int int21 = simpleCalculator0.subtract(1, (-152));
        int int24 = simpleCalculator0.divide(9552800, 1391530220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test327");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply((-76), (int) (short) -1);
        int int18 = simpleCalculator0.multiply(20580, (-49164339));
        int int21 = simpleCalculator0.multiply(568480, (-86713457));
        int int24 = simpleCalculator0.divide((-1), (-2146806784));
        int int27 = simpleCalculator0.subtract((-15200), (-956095305));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1526379168) + "'", int21 == (-1526379168));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 956080105 + "'", int27 == 956080105);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test328");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((-46), (-867133537));
        int int18 = simpleCalculator0.add((int) (short) 10, 867133501);
        int int21 = simpleCalculator0.multiply(2, (-86713457));
        int int24 = simpleCalculator0.subtract(9552800, 96);
        int int27 = simpleCalculator0.add((-109415539), (-3463464));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9552704 + "'", int24 == 9552704);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-112879003) + "'", int27 == (-112879003));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test329");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.multiply((-76), (int) (byte) 100);
        int int18 = simpleCalculator0.multiply(109, 20580);
        int int21 = simpleCalculator0.add(33, 8671336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2243220 + "'", int18 == 2243220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8671369 + "'", int21 == 8671369);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test330");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.subtract((-86713342), 86713455);
        int int21 = simpleCalculator0.subtract(1, (-152));
        int int24 = simpleCalculator0.subtract((-6867620), 1474273060);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1481140680) + "'", int24 == (-1481140680));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test331");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.divide((int) (byte) -1, 69);
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test332");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.divide(100, (-867133440));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test333");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.add((int) (short) 100, 110);
        int int12 = simpleCalculator0.subtract(95, 0);
        int int15 = simpleCalculator0.subtract((-86), 757944224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-757944310) + "'", int15 == (-757944310));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test334");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.multiply((int) (byte) 1, (-1010));
        int int15 = simpleCalculator0.subtract(76, (-867133439));
        int int18 = simpleCalculator0.divide(1219996744, 1219996744);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test335");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.subtract((-7955541), (-867133515));
        int int18 = simpleCalculator0.multiply((-341775360), (-109415539));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1985610752) + "'", int18 == (-1985610752));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test336");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.add((int) '#', (int) (short) -1);
        int int21 = simpleCalculator0.subtract((-76), (int) (byte) 10);
        int int24 = simpleCalculator0.multiply((-5), 86713457);
        int int27 = simpleCalculator0.add((-2146806852), 0);
        int int30 = simpleCalculator0.multiply(2064, 736984748);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2146806852) + "'", int27 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 718097088 + "'", int30 == 718097088);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test337");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.add((int) 'a', (int) (byte) 0);
        int int15 = simpleCalculator0.divide((-520200), (-7466));
        int int18 = simpleCalculator0.multiply((-86713457), 692692992);
        int int21 = simpleCalculator0.subtract(1271882624, 3400);
        int int24 = simpleCalculator0.add(287137963, 1);
        int int27 = simpleCalculator0.multiply((-49173772), (-171620238));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1145651032) + "'", int27 == (-1145651032));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test338");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.add((int) 'a', (int) (byte) 0);
        int int15 = simpleCalculator0.divide((-520200), (-7466));
        int int18 = simpleCalculator0.multiply((-86713457), 692692992);
        int int21 = simpleCalculator0.subtract(1271882624, 3400);
        int int24 = simpleCalculator0.divide(780440677, 867133667);
        int int27 = simpleCalculator0.subtract(0, (-1481140680));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1481140680 + "'", int27 == 1481140680);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test339");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.add(33, (-7600));
        int int21 = simpleCalculator0.add(2, 86713455);
        int int24 = simpleCalculator0.add((int) (byte) 100, 49164339);
        java.lang.Class<?> wildcardClass25 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86713457 + "'", int21 == 86713457);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49164439 + "'", int24 == 49164439);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test340");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.divide(692692992, 2);
        int int21 = simpleCalculator0.add((-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test341");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.multiply(867133511, (-7955431));
        int int15 = simpleCalculator0.divide(1754528448, 1152037536);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test342");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide((-68), (int) (byte) 100);
        int int12 = simpleCalculator0.subtract((-111), (int) (short) 10);
        int int15 = simpleCalculator0.multiply((-7600), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 258400 + "'", int15 == 258400);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test343");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.multiply((-76), (int) (byte) 100);
        int int18 = simpleCalculator0.multiply(109, 20580);
        int int21 = simpleCalculator0.divide(76, (-7466));
        java.lang.Class<?> wildcardClass22 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2243220 + "'", int18 == 2243220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test344");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(20580, (-685834));
        int int9 = simpleCalculator0.add(1152037536, 2);
        int int12 = simpleCalculator0.add(3563280, (-685834));
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152037538 + "'", int9 == 1152037538);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2877446 + "'", int12 == 2877446);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test345");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.multiply(1474273060, (-867133566));
        int int15 = simpleCalculator0.divide(1494342816, (-4864));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-307225) + "'", int15 == (-307225));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test346");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.subtract(0, (int) 'a');
        int int18 = simpleCalculator0.add((int) (byte) -1, (int) '4');
        int int21 = simpleCalculator0.subtract((int) (byte) 1, 32);
        int int24 = simpleCalculator0.divide((-86713457), (-2020));
        int int27 = simpleCalculator0.add((-88956677), (-867138628));
        int int30 = simpleCalculator0.subtract((-9280), (-26411181));
        int int33 = simpleCalculator0.divide(537567364, 1700666764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-956095305) + "'", int27 == (-956095305));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26401901 + "'", int30 == 26401901);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test347");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.divide((-6), (-757113551));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test348");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (byte) 1, 96);
        int int24 = simpleCalculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = simpleCalculator0.divide(9277, 11);
        int int30 = simpleCalculator0.subtract((-442694645), 568480);
        int int33 = simpleCalculator0.subtract(1237148863, 98);
        int int36 = simpleCalculator0.add(1520179488, 866523750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1237148765 + "'", int33 == 1237148765);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1908264058) + "'", int36 == (-1908264058));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test349");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.multiply((int) (short) -1, 867133491);
        int int12 = simpleCalculator0.subtract((-86), (-109415563));
        int int15 = simpleCalculator0.subtract((-6858340), (-173436042));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 166577702 + "'", int15 == 166577702);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test350");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.add((-97), (-867133440));
        int int12 = simpleCalculator0.subtract(86713344, (-111));
        int int15 = simpleCalculator0.multiply((int) (short) 100, (-152));
        int int18 = simpleCalculator0.divide((-1248231612), 1754528548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test351");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        java.lang.Class<?> wildcardClass4 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test352");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.multiply(867133511, (-7955431));
        int int15 = simpleCalculator0.add((-1248231612), 1700666764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 452435152 + "'", int15 == 452435152);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test353");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.add(568480, 110);
        int int15 = simpleCalculator0.subtract(1787380221, 86713457);
        java.lang.Class<?> wildcardClass16 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test354");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = simpleCalculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = simpleCalculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = simpleCalculator0.multiply((-46), (-152));
        int int27 = simpleCalculator0.divide(9277, (int) 'a');
        int int30 = simpleCalculator0.add(780440677, 956080105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1736520782 + "'", int30 == 1736520782);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test355");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.subtract(101, 0);
        int int12 = simpleCalculator0.subtract((-207), (-76));
        int int15 = simpleCalculator0.divide((int) (byte) 100, 95);
        int int18 = simpleCalculator0.divide(210, (-976));
        int int21 = simpleCalculator0.add((-109415539), (-111));
        int int24 = simpleCalculator0.add((-757113551), (-1807123776));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1730729969 + "'", int24 == 1730729969);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test356");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.multiply(0, 210);
        int int18 = simpleCalculator0.add((-23318356), 1037464303);
        int int21 = simpleCalculator0.subtract(1322286215, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1014145947 + "'", int18 == 1014145947);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1322286197 + "'", int21 == 1322286197);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test357");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.add(51, (-97));
        int int15 = simpleCalculator0.multiply(1978473568, 1810185237);
        int int18 = simpleCalculator0.divide((-402505884), (-173426797));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test358");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.add((-97), (-867133440));
        int int12 = simpleCalculator0.subtract(86713344, (-111));
        int int15 = simpleCalculator0.multiply((int) (short) 100, (-152));
        int int18 = simpleCalculator0.add(3563280, 867133491);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 870696771 + "'", int18 == 870696771);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test359");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.add(568480, 110);
        int int15 = simpleCalculator0.divide(51, 101);
        int int18 = simpleCalculator0.multiply((-902782633), (-7466));
        int int21 = simpleCalculator0.divide(210, (-170954984));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1371450554 + "'", int18 == 1371450554);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test360");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.add(86713457, (-15300));
        int int21 = simpleCalculator0.subtract((-173426797), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426797) + "'", int21 == (-173426797));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test361");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.divide((int) (short) 10, (-97));
        int int18 = simpleCalculator0.add((-346346486), (-1838369148));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2110251662 + "'", int18 == 2110251662);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test362");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.divide((int) '#', 100);
        int int12 = simpleCalculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = simpleCalculator0.multiply(100, (int) (byte) 0);
        int int18 = simpleCalculator0.add(98, (int) (byte) 0);
        int int21 = simpleCalculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = simpleCalculator0.multiply((-867133439), (-68));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1164468292) + "'", int24 == (-1164468292));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test363");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide(100, 98);
        int int21 = simpleCalculator0.multiply(897963264, 109415477);
        int int24 = simpleCalculator0.subtract(119647579, (-86713551));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-298772224) + "'", int21 == (-298772224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 206361130 + "'", int24 == 206361130);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test364");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.add(568480, 110);
        int int15 = simpleCalculator0.subtract(1787380221, 86713457);
        int int18 = simpleCalculator0.multiply(8671336, (-1481140680));
        int int21 = simpleCalculator0.multiply(178159040, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test365");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide((-1769916224), (-36));
        int int21 = simpleCalculator0.add((-9312), (-121));
        int int24 = simpleCalculator0.subtract((-867133439), (-867133666));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 227 + "'", int24 == 227);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test366");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply(0, (-867133537));
        int int9 = simpleCalculator0.divide(25, (-1923));
        int int12 = simpleCalculator0.multiply((-15300), 34);
        int int15 = simpleCalculator0.multiply((-1734245508), 568480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86605184 + "'", int15 == 86605184);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test367");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.subtract((int) (byte) -1, 100);
        int int12 = simpleCalculator0.add((-9433), (-341775360));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test368");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.add(568480, 110);
        int int15 = simpleCalculator0.subtract(1787380221, 86713457);
        int int18 = simpleCalculator0.add((-68), (-2146806784));
        int int21 = simpleCalculator0.divide((-1813700023), (-50514530));
        int int24 = simpleCalculator0.divide((-1145179180), 4864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-235439) + "'", int24 == (-235439));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test369");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.subtract(20580, (-867133439));
        int int21 = simpleCalculator0.divide((-609787), (-31));
        int int24 = simpleCalculator0.multiply((-50514530), (-867133666));
        int int27 = simpleCalculator0.subtract((-1526379168), 1152037331);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1616550797 + "'", int27 == 1616550797);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test370");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.divide(51, 109);
        int int18 = simpleCalculator0.add(0, (-1919));
        int int21 = simpleCalculator0.subtract(1145179044, (-7567));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1145186611 + "'", int21 == 1145186611);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test371");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.divide((int) (short) 0, 101);
        int int9 = simpleCalculator0.add((-1), 0);
        int int12 = simpleCalculator0.subtract(109, (int) (short) 100);
        int int15 = simpleCalculator0.subtract((-36), (-31));
        int int18 = simpleCalculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = simpleCalculator0.divide(1152037536, 37489359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test372");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.subtract((int) (byte) -1, 110);
        int int18 = simpleCalculator0.divide((-1769916224), (-36));
        int int21 = simpleCalculator0.add((-9312), (-121));
        int int24 = simpleCalculator0.divide(20, 109415477);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test373");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.divide(33, (int) 'a');
        int int9 = simpleCalculator0.subtract((-1), (int) (short) 0);
        int int12 = simpleCalculator0.subtract((int) '#', (int) (short) 10);
        int int15 = simpleCalculator0.add(520297, (-867133611));
        int int18 = simpleCalculator0.subtract((-1923), (-109415650));
        int int21 = simpleCalculator0.subtract(780440677, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109413727 + "'", int18 == 109413727);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 780440642 + "'", int21 == 780440642);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test374");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = simpleCalculator0.multiply(9, (int) (short) 1);
        int int15 = simpleCalculator0.divide((-36), 33);
        int int18 = simpleCalculator0.subtract((-609787), (-867133537));
        int int21 = simpleCalculator0.multiply(452435152, (-362406912));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 866523750 + "'", int18 == 866523750);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1341734912) + "'", int21 == (-1341734912));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test375");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.subtract(20580, (-867133439));
        int int21 = simpleCalculator0.multiply(1237148864, (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 255644480 + "'", int21 == 255644480);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test376");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply(1, 1);
        int int6 = simpleCalculator0.multiply((-7567), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-733999) + "'", int6 == (-733999));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test377");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.multiply((int) (short) -1, 49164339);
        int int12 = simpleCalculator0.add(86698157, 21975739);
        java.lang.Class<?> wildcardClass13 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 108673896 + "'", int12 == 108673896);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test378");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.subtract((int) 'a', (-1));
        int int15 = simpleCalculator0.subtract((-46), (-867133537));
        int int18 = simpleCalculator0.add((int) (short) 10, 867133501);
        int int21 = simpleCalculator0.add((-3528), (-7567));
        int int24 = simpleCalculator0.divide((-346346486), (int) (short) 100);
        int int27 = simpleCalculator0.add((int) (short) 0, (-757113551));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-757113551) + "'", int27 == (-757113551));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test379");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = simpleCalculator0.add((-97), (-867133440));
        int int12 = simpleCalculator0.subtract(1145179144, 100);
        int int15 = simpleCalculator0.subtract(1237148811, (-240317368));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1477466179 + "'", int15 == 1477466179);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test380");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(33, 98);
        int int9 = simpleCalculator0.divide(97, (int) (byte) 10);
        int int12 = simpleCalculator0.add(51, (-97));
        int int15 = simpleCalculator0.multiply(1978473568, 1810185237);
        int int18 = simpleCalculator0.subtract((-1555994343), (-101));
        java.lang.Class<?> wildcardClass19 = simpleCalculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1555994242) + "'", int18 == (-1555994242));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test381");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.add((int) (byte) 1, 100);
        int int15 = simpleCalculator0.multiply(86713344, (-10));
        int int18 = simpleCalculator0.divide(1219996744, 109415572);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test382");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.multiply((-97), (int) (short) 0);
        int int12 = simpleCalculator0.divide((int) (short) 100, 10);
        int int15 = simpleCalculator0.add((int) '#', (-111));
        int int18 = simpleCalculator0.multiply(1, (int) ' ');
        int int21 = simpleCalculator0.divide((-1010), 86713455);
        int int24 = simpleCalculator0.add((-173436074), (int) ' ');
        int int27 = simpleCalculator0.subtract(34, (-88956677));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-173436042) + "'", int24 == (-173436042));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 88956711 + "'", int27 == 88956711);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "SimpleCalculator_Randoop0.test383");
        SimpleCalculator.SimpleCalculator simpleCalculator0 = new SimpleCalculator.SimpleCalculator();
        int int3 = simpleCalculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = simpleCalculator0.add(0, 0);
        int int9 = simpleCalculator0.add(0, (int) (short) -1);
        int int12 = simpleCalculator0.multiply((int) (short) 0, (-68));
        int int15 = simpleCalculator0.add((int) (short) 0, 86713344);
        int int18 = simpleCalculator0.divide(67686400, (-111));
        int int21 = simpleCalculator0.multiply((-1010), 2064);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2084640) + "'", int21 == (-2084640));
    }
}

