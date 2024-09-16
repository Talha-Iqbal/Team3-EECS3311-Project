package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegisterUserCommandTests {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        javax.swing.JTextField jTextField0 = null;
        javax.swing.JTextField jTextField1 = null;
        javax.swing.JPasswordField jPasswordField2 = null;
        javax.swing.JComboBox<com.mycompany.team3.eecs3311.project.UserType> userTypeJComboBox3 = null;
        javax.swing.JTextField jTextField4 = null;
        com.mycompany.team3.eecs3311.project.RegisterUserCommand registerUserCommand6 = new com.mycompany.team3.eecs3311.project.RegisterUserCommand(jTextField0, jTextField1, jPasswordField2, userTypeJComboBox3, jTextField4, false);
        java.lang.Class<?> wildcardClass7 = registerUserCommand6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        javax.swing.JTextField jTextField0 = null;
        javax.swing.JTextField jTextField1 = null;
        javax.swing.JPasswordField jPasswordField2 = null;
        javax.swing.JComboBox<com.mycompany.team3.eecs3311.project.UserType> userTypeJComboBox3 = null;
        javax.swing.JTextField jTextField4 = null;
        com.mycompany.team3.eecs3311.project.RegisterUserCommand registerUserCommand6 = new com.mycompany.team3.eecs3311.project.RegisterUserCommand(jTextField0, jTextField1, jPasswordField2, userTypeJComboBox3, jTextField4, true);
        java.lang.Class<?> wildcardClass7 = registerUserCommand6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

