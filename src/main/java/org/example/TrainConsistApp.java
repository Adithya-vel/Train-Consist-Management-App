package com.railway.trainconsist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* --------------------------------
   Bogie Search Class
-------------------------------- */
class BogieSearch {

    public static boolean linearSearch(String[] bogieIds, String searchKey) {

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                return true; // match found
            }
        }

        return false; // no match found
    }
}

/* --------------------------------
   Test Class
-------------------------------- */
public class BogieSearchTest {

    @Test
    void testSearch_BogieFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(BogieSearch.linearSearch(bogies,"BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(BogieSearch.linearSearch(bogies,"BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(BogieSearch.linearSearch(bogies,"BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(BogieSearch.linearSearch(bogies,"BG550"));
    }

    @Test
    void testSearch_SingleElementArray() {

        String[] bogies = {"BG101"};

        assertTrue(BogieSearch.linearSearch(bogies,"BG101"));
    }
}