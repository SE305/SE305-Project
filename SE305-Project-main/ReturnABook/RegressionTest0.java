package library.testproject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        library.data.InMemoryDataStore inMemoryDataStore0 = null;
        library.business.ReturnService returnService1 = new library.business.ReturnService(inMemoryDataStore0);
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = returnService1.processReturn("hi!", "", localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"members\" because \"this.store\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        library.data.InMemoryDataStore inMemoryDataStore0 = null;
        library.business.ReturnService returnService1 = new library.business.ReturnService(inMemoryDataStore0);
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = returnService1.processReturn("", "hi!", localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"members\" because \"this.store\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        library.data.InMemoryDataStore inMemoryDataStore0 = null;
        library.business.ReturnService returnService1 = new library.business.ReturnService(inMemoryDataStore0);
        java.lang.Class<?> wildcardClass2 = returnService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        library.data.InMemoryDataStore inMemoryDataStore0 = null;
        library.business.ReturnService returnService1 = new library.business.ReturnService(inMemoryDataStore0);
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = returnService1.processReturn("", "", localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"members\" because \"this.store\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        library.data.InMemoryDataStore inMemoryDataStore0 = null;
        library.business.ReturnService returnService1 = new library.business.ReturnService(inMemoryDataStore0);
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = returnService1.processReturn("hi!", "hi!", localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"members\" because \"this.store\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

