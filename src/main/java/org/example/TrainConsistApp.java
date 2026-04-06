package com.railway.trainconsist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* --------------------------------
   Custom Runtime Exception
-------------------------------- */
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

/* --------------------------------
   Goods Bogie Class
-------------------------------- */
class GoodsBogie {

    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }

    public void assignCargo(String cargoType) {

        try {

            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe cargo: Petroleum cannot be assigned to Rectangular bogie");
            }

            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Cargo assignment validation completed.");
        }
    }
}

/* --------------------------------
   Test Class
-------------------------------- */
public class GoodsBogieTest {

    @Test
    void testCargo_SafeAssignment() {

        GoodsBogie bogie = new GoodsBogie("Cylindrical");
        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {

        GoodsBogie bogie = new GoodsBogie("Rectangular");
        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {

        GoodsBogie bogie = new GoodsBogie("Rectangular");
        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {

        GoodsBogie bogie1 = new GoodsBogie("Rectangular");
        bogie1.assignCargo("Petroleum");

        GoodsBogie bogie2 = new GoodsBogie("Cylindrical");
        bogie2.assignCargo("Grain");

        assertEquals("Grain", bogie2.getCargo());
    }

    @Test
    void testCargo_FinallyBlockExecution() {

        GoodsBogie bogie = new GoodsBogie("Cylindrical");
        bogie.assignCargo("Coal");

        assertEquals("Coal", bogie.getCargo());
    }
}