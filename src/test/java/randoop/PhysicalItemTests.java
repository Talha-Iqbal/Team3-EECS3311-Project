package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PhysicalItemTests {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        boolean boolean8 = physicalItem7.getEnableStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getItemTypeString();
        java.lang.String str9 = physicalItem7.getAuthor();
        java.lang.String str10 = physicalItem7.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "book" + "'", str8.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getEnableStatusDisplay();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            physicalItem7.setDateBorrowed(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.get(int)\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "yes" + "'", str8.equals("yes"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getAuthor();
        boolean boolean9 = physicalItem7.getPurchasableStatus();
        java.lang.String str10 = physicalItem7.getIdString();
        java.lang.String str11 = physicalItem7.getTitle();
        java.lang.String str12 = physicalItem7.getPurchaseStatusDisplay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "97" + "'", str10.equals("97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "yes" + "'", str12.equals("yes"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getItemTypeString();
        java.lang.String str9 = physicalItem7.getAuthor();
        java.lang.Class<?> wildcardClass10 = physicalItem7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "book" + "'", str8.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getEnableStatusDisplay();
        java.lang.String str9 = physicalItem7.getEnableStatusCsv();
        java.lang.Class<?> wildcardClass10 = physicalItem7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "yes" + "'", str8.equals("yes"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "TRUE" + "'", str9.equals("TRUE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getAuthor();
        boolean boolean9 = physicalItem7.getPurchasableStatus();
        java.lang.String str10 = physicalItem7.getPurchaseStatusDisplay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "yes" + "'", str10.equals("yes"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getAuthor();
        boolean boolean9 = physicalItem7.getPurchasableStatus();
        java.lang.String str10 = physicalItem7.getIdString();
        java.lang.String str11 = physicalItem7.getLocation();
        boolean boolean12 = physicalItem7.getPurchasableStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "97" + "'", str10.equals("97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getAuthor();
        boolean boolean9 = physicalItem7.getPurchasableStatus();
        java.lang.String str10 = physicalItem7.getIdString();
        java.lang.String str11 = physicalItem7.getLocation();
        java.lang.String str12 = physicalItem7.getTitle();
        java.lang.String str13 = physicalItem7.getItemTypeString();
        java.lang.String str14 = physicalItem7.getIdString();
        java.lang.Class<?> wildcardClass15 = physicalItem7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "97" + "'", str10.equals("97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "book" + "'", str13.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "97" + "'", str14.equals("97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getAuthor();
        boolean boolean9 = physicalItem7.getPurchasableStatus();
        java.lang.String str10 = physicalItem7.getIdString();
        java.lang.String str11 = physicalItem7.getLocation();
        java.lang.String str12 = physicalItem7.getTitle();
        java.lang.String str13 = physicalItem7.getItemTypeString();
        boolean boolean14 = physicalItem7.getEnableStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "97" + "'", str10.equals("97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "book" + "'", str13.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getAuthor();
        boolean boolean9 = physicalItem7.getPurchasableStatus();
        boolean boolean10 = physicalItem7.getEnableStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getEnableStatusDisplay();
        java.lang.String str9 = physicalItem7.getEnableStatusCsv();
        java.util.Calendar calendar10 = physicalItem7.getDateBorrowed();
        java.lang.String str11 = physicalItem7.getLocation();
        boolean boolean12 = physicalItem7.getPurchasableStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "yes" + "'", str8.equals("yes"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "TRUE" + "'", str9.equals("TRUE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-62201761200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/New_York\",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=3,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=333,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-18000000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getEnableStatusDisplay();
        java.lang.String str9 = physicalItem7.getEnableStatusCsv();
        java.util.Calendar calendar10 = physicalItem7.getDateBorrowed();
        java.lang.String str11 = physicalItem7.getLocation();
        java.lang.String str12 = physicalItem7.getLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "yes" + "'", str8.equals("yes"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "TRUE" + "'", str9.equals("TRUE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(calendar10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-62201761200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/New_York\",offset=-18000000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/New_York,offset=-18000000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=3,MONTH=10,WEEK_OF_YEAR=48,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=333,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=-18000000,DST_OFFSET=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.mycompany.team3.eecs3311.project.ItemType itemType6 = null;
        com.mycompany.team3.eecs3311.project.PhysicalItem physicalItem7 = new com.mycompany.team3.eecs3311.project.PhysicalItem("", "hi!", (int) 'a', "", true, true, itemType6);
        java.lang.String str8 = physicalItem7.getItemTypeString();
        java.lang.String str9 = physicalItem7.getAuthor();
        java.lang.String str10 = physicalItem7.getEnableStatusDisplay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "book" + "'", str8.equals("book"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "yes" + "'", str10.equals("yes"));
    }
}

