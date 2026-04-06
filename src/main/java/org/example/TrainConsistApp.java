package com.railway.trainconsist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* -------------------------------
   Custom Exception Class
-------------------------------- */
class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

/* -------------------------------
   Passenger Bogie Class
-------------------------------- */
class PassengerBogie {

    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

/* -------------------------------
   Test Class
-------------------------------- */
public class PassengerBogieTest {

    @Test
    void testException_ValidCapacityCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 72);

        assertEquals("Sleeper", bogie.getType());
        assertEquals(72, bogie.getCapacity());
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception exception = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("AC", -10)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        Exception exception = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("First Class", 0)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception exception = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("Sleeper", 0)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("AC Chair", 60);

        assertEquals("AC Chair", bogie.getType());
        assertEquals(60, bogie.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws InvalidCapacityException {

        PassengerBogie bogie1 = new PassengerBogie("Sleeper", 72);
        PassengerBogie bogie2 = new PassengerBogie("AC Chair", 60);

        assertEquals(72, bogie1.getCapacity());
        assertEquals(60, bogie2.getCapacity());
    }
}