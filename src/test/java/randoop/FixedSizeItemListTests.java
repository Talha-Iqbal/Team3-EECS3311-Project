package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedSizeItemListTests {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.add(physicalItem2);
        java.lang.Class<?> wildcardClass4 = fixedSizeItemList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.remove(physicalItem2);
        java.lang.Class<?> wildcardClass4 = fixedSizeItemList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.remove(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem5 = null;
        fixedSizeItemList1.add(physicalItem5);
        java.lang.Class<?> wildcardClass7 = fixedSizeItemList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.remove(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem5 = null;
        fixedSizeItemList1.add(physicalItem5);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedSizeItemList1.add(physicalItem7);
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException; message: You have reached max capacity of 1 rented items.");
        } catch (com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.add(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList5 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedSizeItemList1.add(physicalItem6);
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException; message: You have reached max capacity of 1 rented items.");
        } catch (com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.add(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedSizeItemList1.add(physicalItem5);
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException; message: You have reached max capacity of 1 rented items.");
        } catch (com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.remove(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem5 = null;
        fixedSizeItemList1.add(physicalItem5);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList7 = fixedSizeItemList1.getItemList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.add(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList5 = fixedSizeItemList1.getItemList();
        java.lang.Class<?> wildcardClass6 = physicalItemList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.remove(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        java.lang.Class<?> wildcardClass5 = physicalItemList4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.add(physicalItem2);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem4 = null;
        fixedSizeItemList1.remove(physicalItem4);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = null;
        fixedSizeItemList1.add(physicalItem7);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedSizeItemList1.add(physicalItem9);
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException; message: You have reached max capacity of 1 rented items.");
        } catch (com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.remove(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        java.lang.Class<?> wildcardClass5 = fixedSizeItemList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) '#');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList(0);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedSizeItemList1.add(physicalItem2);
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException; message: You have reached max capacity of 0 rented items.");
        } catch (com.mycompany.team3.eecs3311.project.ExceedMaxListCapacityException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList(10);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList2 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem3 = null;
        fixedSizeItemList1.remove(physicalItem3);
        java.lang.Class<?> wildcardClass5 = fixedSizeItemList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) 'a');
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.remove(physicalItem2);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem4 = null;
        fixedSizeItemList1.remove(physicalItem4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) ' ');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (short) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList2 = fixedSizeItemList1.getItemList();
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList3 = fixedSizeItemList1.getItemList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.add(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList5 = fixedSizeItemList1.getItemList();
        java.lang.Class<?> wildcardClass6 = fixedSizeItemList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.mycompany.team3.eecs3311.project.FixedSizeItemList fixedSizeItemList1 = new com.mycompany.team3.eecs3311.project.FixedSizeItemList((int) (byte) 1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem2 = null;
        fixedSizeItemList1.add(physicalItem2);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList4 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem5 = null;
        fixedSizeItemList1.remove(physicalItem5);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList7 = fixedSizeItemList1.getItemList();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem8 = null;
        fixedSizeItemList1.remove(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList7);
    }
}

