package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginUserCommandTests {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        javax.swing.JTextField jTextField0 = null;
        javax.swing.JPasswordField jPasswordField1 = null;
        com.mycompany.team3.eecs3311.project.LoginUserCommand loginUserCommand2 = new com.mycompany.team3.eecs3311.project.LoginUserCommand(jTextField0, jPasswordField1);
        java.lang.Class<?> wildcardClass3 = loginUserCommand2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
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
}

