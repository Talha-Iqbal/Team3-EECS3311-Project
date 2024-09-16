package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentItemCommandTests {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.mycompany.team3.eecs3311.project.PhysicalItemWindow physicalItemWindow1 = null;
        com.mycompany.team3.eecs3311.project.RentItemCommand rentItemCommand3 = new com.mycompany.team3.eecs3311.project.RentItemCommand("hi!", physicalItemWindow1, false);
        java.lang.Class<?> wildcardClass4 = rentItemCommand3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.mycompany.team3.eecs3311.project.PhysicalItemWindow physicalItemWindow1 = null;
        com.mycompany.team3.eecs3311.project.RentItemCommand rentItemCommand3 = new com.mycompany.team3.eecs3311.project.RentItemCommand("", physicalItemWindow1, false);
        java.lang.Class<?> wildcardClass4 = rentItemCommand3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.mycompany.team3.eecs3311.project.PhysicalItemWindow physicalItemWindow1 = null;
        com.mycompany.team3.eecs3311.project.RentItemCommand rentItemCommand3 = new com.mycompany.team3.eecs3311.project.RentItemCommand("hi!", physicalItemWindow1, true);
        java.lang.Class<?> wildcardClass4 = rentItemCommand3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.mycompany.team3.eecs3311.project.PhysicalItemWindow physicalItemWindow1 = null;
        com.mycompany.team3.eecs3311.project.RentItemCommand rentItemCommand3 = new com.mycompany.team3.eecs3311.project.RentItemCommand("", physicalItemWindow1, true);
        java.lang.Class<?> wildcardClass4 = rentItemCommand3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

