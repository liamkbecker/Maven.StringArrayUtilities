package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */
    public static String[] reverse(String[] array) {
        String[] returnArray = new String[array.length];

        for(int i = 0; i < array.length; i++){
            int counter = array.length;
            counter = counter - 1;
            counter = counter - i;
            returnArray[counter] = array[i];
        }

        return returnArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */
    public static boolean isPalindromic(String[] array) {
        String[] checkArray = new String[array.length];

        for(int i = 0; i < array.length; i++){
            int counter = array.length;
            counter = counter - 1;
            counter = counter - i;
            checkArray[counter] = array[i];
        }

        if(Arrays.equals(array, checkArray)){
            return true;
        }
        return false;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String currentWord = "";
        char currentChar;

        for(int i = 0; i < array.length; i++){
            
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int returnInt = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                returnInt++;
            }
        }

        return returnInt;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        ArrayList<String> list1 = new ArrayList<String>();

        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                list1.add(array[i]);
            }
        }

        String[] returnArray = new String[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            returnArray[i] = list1.get(i);
        }
        return returnArray;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> list1 = new ArrayList<String>();
        return null;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        return null;

    }


}
