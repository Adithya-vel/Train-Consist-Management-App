package com.railway.trainconsist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* --------------------------------
   Train Search Class
-------------------------------- */
class TrainSearch {

    public static boolean searchBogie(String[] bogieIds, String key) {

        // Defensive check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Train has no bogies to search");
        }

        // Linear search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}

/* --------------------------------
   Test Class
-------------------------------- */
public class TrainSearchTest {

    @Test
    void testSearch_BogieFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412"};

        assertTrue(TrainSearch.searchBogie(bogies,"BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412"};

        assertFalse(TrainSearch.searchBogie(bogies,"BG999"));
    }

    @Test
    void testSearch_EmptyTrainThrowsException() {

        String[] bogies = {};

        assertThrows(IllegalStateException.class,
                () -> TrainSearch.searchBogie(bogies,"BG101"));
    }

    @Test
    void testSearch_ExceptionMessageValidation() {

        String[] bogies = {};

        Exception exception = assertThrows(IllegalStateException.class,
                () -> TrainSearch.searchBogie(bogies,"BG101"));

        assertEquals("Train has no bogies to search", exception.getMessage());
    }

    @Test
    void testSearch_SingleElementArray() {

        String[] bogies = {"BG101"};

        assertTrue(TrainSearch.searchBogie(bogies,"BG101"));
    }
}