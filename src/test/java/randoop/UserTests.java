package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTests {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        java.lang.Class<?> wildcardClass7 = physicalItemList6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = null;
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            user5.addItem(physicalItem7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.mycompany.team3.eecs3311.project.PhysicalItem.setDateBorrowed(java.util.Calendar)\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem6 = null;
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            user5.addItem(physicalItem6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.mycompany.team3.eecs3311.project.PhysicalItem.setDateBorrowed(java.util.Calendar)\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.lang.String str6 = user5.getTypeString();
        java.lang.String str7 = user5.getEmail();
        java.lang.String str8 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "visitor" + "'", str6.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.getTypeString();
        java.lang.String str9 = user5.getTypeString();
        java.lang.String str10 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "visitor" + "'", str9.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.lang.String str6 = user5.getTypeString();
        int int7 = user5.getId();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem8 = null;
        user5.removeItem(physicalItem8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "visitor" + "'", str6.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("", "hi!", "", userType3, (int) (short) 10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("", "visitor", "", userType3, (int) (short) 1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "hi!", "hi!", userType3, (int) (short) 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.getTypeString();
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList9 = user5.getRentedItems();
        java.lang.String str10 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.getTypeString();
        int int9 = user5.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("", "visitor", "", userType3, (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        java.lang.String str7 = user5.getTypeString();
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem8 = null;
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            user5.addItem(physicalItem8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.mycompany.team3.eecs3311.project.PhysicalItem.setDateBorrowed(java.util.Calendar)\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "visitor" + "'", str7.equals("visitor"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.getTypeString();
        java.lang.String str9 = user5.getTypeString();
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList10 = user5.getRentedItems();
        java.lang.String str11 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "visitor" + "'", str9.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("", "visitor", "", userType3, (int) (short) 1);
        java.lang.String str6 = user5.getTypeString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "visitor" + "'", str6.equals("visitor"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "visitor", "hi!", userType3, (int) (short) 100);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.getTypeString();
        java.lang.String str9 = user5.getTypeString();
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList10 = user5.getRentedItems();
        java.lang.String str11 = user5.getTypeString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "visitor" + "'", str9.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "visitor" + "'", str11.equals("visitor"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.lang.String str6 = user5.getTypeString();
        int int7 = user5.getId();
        int int8 = user5.getId();
        java.lang.String str9 = user5.getName();
        java.lang.String str10 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "visitor" + "'", str6.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "hi!", "hi!", userType3, 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "hi!", "hi!", userType3, (int) (short) 0);
        int int6 = user5.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.mycompany.team3.eecs3311.project.UserType userType3 = null;
        com.mycompany.team3.eecs3311.project.User user5 = new com.mycompany.team3.eecs3311.project.User("hi!", "", "hi!", userType3, (int) (byte) -1);
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList6 = user5.getRentedItems();
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.getTypeString();
        java.util.List<com.mycompany.team3.eecs3311.project.PhysicalItem> physicalItemList9 = user5.getRentedItems();
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "visitor" + "'", str8.equals("visitor"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }
}

