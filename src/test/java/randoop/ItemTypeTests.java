package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ItemTypeTests {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.mycompany.team3.eecs3311.project.ItemType itemType0 = null;
        java.lang.String str1 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "book" + "'", str1.equals("book"));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.mycompany.team3.eecs3311.project.ItemType itemType1 = com.mycompany.team3.eecs3311.project.ItemType.parseItemType("cd");
        org.junit.Assert.assertTrue("'" + itemType1 + "' != '" + com.mycompany.team3.eecs3311.project.ItemType.CD + "'", itemType1.equals(com.mycompany.team3.eecs3311.project.ItemType.CD));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.mycompany.team3.eecs3311.project.ItemType itemType0 = com.mycompany.team3.eecs3311.project.ItemType.BOOK;
        java.lang.String str1 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType0);
        java.lang.String str2 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType0);
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + com.mycompany.team3.eecs3311.project.ItemType.BOOK + "'", itemType0.equals(com.mycompany.team3.eecs3311.project.ItemType.BOOK));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "book" + "'", str1.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "book" + "'", str2.equals("book"));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.mycompany.team3.eecs3311.project.ItemType itemType0 = com.mycompany.team3.eecs3311.project.ItemType.MAGAZINE;
        java.lang.String str1 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType0);
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + com.mycompany.team3.eecs3311.project.ItemType.MAGAZINE + "'", itemType0.equals(com.mycompany.team3.eecs3311.project.ItemType.MAGAZINE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "magazine" + "'", str1.equals("magazine"));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.mycompany.team3.eecs3311.project.ItemType itemType1 = com.mycompany.team3.eecs3311.project.ItemType.parseItemType("hi!");
        java.lang.String str2 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str3 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str4 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str5 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str6 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        org.junit.Assert.assertTrue("'" + itemType1 + "' != '" + com.mycompany.team3.eecs3311.project.ItemType.BOOK + "'", itemType1.equals(com.mycompany.team3.eecs3311.project.ItemType.BOOK));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "book" + "'", str2.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "book" + "'", str3.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "book" + "'", str4.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "book" + "'", str5.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "book" + "'", str6.equals("book"));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.mycompany.team3.eecs3311.project.ItemType itemType0 = com.mycompany.team3.eecs3311.project.ItemType.CD;
        java.lang.String str1 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType0);
        java.lang.String str2 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType0);
        java.lang.String str3 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType0);
        java.lang.String str4 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType0);
        org.junit.Assert.assertTrue("'" + itemType0 + "' != '" + com.mycompany.team3.eecs3311.project.ItemType.CD + "'", itemType0.equals(com.mycompany.team3.eecs3311.project.ItemType.CD));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "cd" + "'", str1.equals("cd"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "cd" + "'", str2.equals("cd"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "cd" + "'", str3.equals("cd"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "cd" + "'", str4.equals("cd"));
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        com.mycompany.team3.eecs3311.project.ItemType itemType1 = com.mycompany.team3.eecs3311.project.ItemType.parseItemType("book");
        java.lang.String str2 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str3 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str4 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str5 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str6 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        org.junit.Assert.assertTrue("'" + itemType1 + "' != '" + com.mycompany.team3.eecs3311.project.ItemType.BOOK + "'", itemType1.equals(com.mycompany.team3.eecs3311.project.ItemType.BOOK));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "book" + "'", str2.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "book" + "'", str3.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "book" + "'", str4.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "book" + "'", str5.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "book" + "'", str6.equals("book"));
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        com.mycompany.team3.eecs3311.project.ItemType itemType1 = com.mycompany.team3.eecs3311.project.ItemType.parseItemType("magazine");
        java.lang.String str2 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str3 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        org.junit.Assert.assertTrue("'" + itemType1 + "' != '" + com.mycompany.team3.eecs3311.project.ItemType.MAGAZINE + "'", itemType1.equals(com.mycompany.team3.eecs3311.project.ItemType.MAGAZINE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "magazine" + "'", str2.equals("magazine"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "magazine" + "'", str3.equals("magazine"));
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        com.mycompany.team3.eecs3311.project.ItemType itemType1 = com.mycompany.team3.eecs3311.project.ItemType.parseItemType("");
        java.lang.String str2 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str3 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str4 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        java.lang.String str5 = com.mycompany.team3.eecs3311.project.ItemType.parseString(itemType1);
        org.junit.Assert.assertTrue("'" + itemType1 + "' != '" + com.mycompany.team3.eecs3311.project.ItemType.BOOK + "'", itemType1.equals(com.mycompany.team3.eecs3311.project.ItemType.BOOK));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "book" + "'", str2.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "book" + "'", str3.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "book" + "'", str4.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "book" + "'", str5.equals("book"));
    }
}

