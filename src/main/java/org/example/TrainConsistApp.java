package com.railway.trainconsist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* --------------------------------
   Bogie Binary Search Class
-------------------------------- */
class BogieBinarySearch {

    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                return true; // found
            }

            else if (result < 0) {
                low = mid + 1; // search right half
            }

            else {
                high = mid - 1; // search left half
            }
        }

        return false; // not found
    }
}

/* --------------------------------
   Test Class
-------------------------------- */
public class BogieBinarySearchTest {

    @Test
    void testBinarySearch_BogieFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(BogieBinarySearch.binarySearch(bogies,"BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(BogieBinarySearch.binarySearch(bogies,"BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(BogieBinarySearch.binarySearch(bogies,"BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(BogieBinarySearch.binarySearch(bogies,"BG550"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {

        String[] bogies = {"BG101"};

        assertTrue(BogieBinarySearch.binarySearch(bogies,"BG101"));
    }
}