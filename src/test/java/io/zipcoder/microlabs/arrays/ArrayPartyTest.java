package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {
    String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
    ArrayParty arrayParty = new ArrayParty();

    @Test
    public void printArrayTest() {
        //: Given
        String expected = "\nSausage\n" +
                        "Eggs\n" +
                        "Beans\n" +
                        "Bacon\n" +
                        "Tomatoes\n" +
                        "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {
        //: Given
        String expected = "Mushrooms";

        //: When
        String actual = arrayParty.lastElement(breakfast);

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastButOneTest() {
        String expected = "Tomatoes";

        String actual = arrayParty.lastButOne(breakfast);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        String expected = "\nMushrooms\n" +
                        "Tomatoes\n" +
                        "Bacon\n" +
                        "Beans\n" +
                        "Eggs\n" +
                        "Sausage";

        String actual = arrayParty.reverse(breakfast);

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest() {
        String[] palindrome = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};

        String expectedFalse = "False";
        String expectedTrue = "True";

        String actualFalse = arrayParty.isPalindrome(breakfast);
        String actualTrue = arrayParty.isPalindrome(palindrome);

        Assert.assertEquals(expectedFalse, actualFalse);
        Assert.assertEquals(expectedTrue, actualTrue);
    }

    @Test
    public void compressTest() {
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};

        String expected = "1\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "4";

        String actual = arrayParty.compress(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void packTest() {
        Character[] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
        String expected = "aaaa, b, cc, aa, d, eeee";

        String actual = arrayParty.pack(letters);

        Assert.assertEquals(expected, actual);
    }
}
