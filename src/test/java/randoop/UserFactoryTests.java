package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserFactoryTests {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        java.lang.Class<?> wildcardClass1 = userFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("", "", "hi!", userType4, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("", "", "", userType4, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("hi!", "", "hi!", userType4, "");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("", "", "", userType4, "");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("", "hi!", "", userType4, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("hi!", "", "", userType4, "");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("hi!", "", "hi!", userType4, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("", "", "hi!", userType4, "");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("", "hi!", "", userType4, "");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("hi!", "hi!", "hi!", userType4, "");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("", "hi!", "hi!", userType4, "");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("", "hi!", "hi!", userType4, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("hi!", "hi!", "", userType4, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("hi!", "", "", userType4, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("hi!", "hi!", "hi!", userType4, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.mycompany.team3.eecs3311.project.UserFactory userFactory0 = new com.mycompany.team3.eecs3311.project.UserFactory();
        com.mycompany.team3.eecs3311.project.UserType userType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mycompany.team3.eecs3311.project.User user6 = userFactory0.getUser("hi!", "hi!", "", userType4, "");
            org.junit.Assert.fail("Expected exception of type com.mycompany.team3.eecs3311.project.InvalidUserCredentialException; message: Please enter valid email.");
        } catch (com.mycompany.team3.eecs3311.project.InvalidUserCredentialException e) {
        // Expected exception.
        }
    }
}

