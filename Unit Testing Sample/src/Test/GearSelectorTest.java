package Test;
import CarSystem.GearSelector;

import static org.junit.jupiter.api.Assertions.*;

class GearSelectorTest {

    /** Pruebas con valores basicos dentro de rango */

    @org.junit.jupiter.api.Test
    void Gear1(){
        GearSelector selector = new GearSelector();
        assertTrue(selector.determineGear(22) == '1');

    }

    @org.junit.jupiter.api.Test
    void Gear2(){
        GearSelector selector = new GearSelector();
        assertTrue(selector.determineGear(47) == '2');
    }

    @org.junit.jupiter.api.Test
    void Gear3(){
        GearSelector selector = new GearSelector();
        assertTrue(selector.determineGear(77) == '3');
    }

    @org.junit.jupiter.api.Test
    void Gear4(){
        GearSelector selector = new GearSelector();
        assertTrue(selector.determineGear(94) == '4');
    }

    @org.junit.jupiter.api.Test
    void Gear5(){
        GearSelector selector = new GearSelector();
        assertTrue(selector.determineGear(119) == '5');
    }




    /** Pruebas con valores de frontero (limites) */

    @org.junit.jupiter.api.Test
    void speedZero(){
        GearSelector selector = new GearSelector();
        assertEquals('N',selector.determineGear(0));
    }

    @org.junit.jupiter.api.Test
    void speedUnderThirty(){
        GearSelector selector = new GearSelector();
        assertEquals('1',selector.determineGear(29));
    }

    @org.junit.jupiter.api.Test
    void speedThirty(){
        GearSelector selector = new GearSelector();
        assertEquals('2',selector.determineGear(30));
    }

    @org.junit.jupiter.api.Test
    void speedUnderFiftyFive(){
        GearSelector selector = new GearSelector();
        assertEquals('2',selector.determineGear(54));
    }

    @org.junit.jupiter.api.Test
    void speedFiftyFive(){
        GearSelector selector = new GearSelector();
        assertEquals('3',selector.determineGear(55));
    }

    @org.junit.jupiter.api.Test
    void speedUnderEighty(){
        GearSelector selector = new GearSelector();
        assertEquals('3',selector.determineGear(79));
    }

    @org.junit.jupiter.api.Test
    void speedEighty(){
        GearSelector selector = new GearSelector();
        assertEquals('4',selector.determineGear(80));
    }

    @org.junit.jupiter.api.Test
    void speedUnderOneHundred(){
        GearSelector selector = new GearSelector();
        assertEquals('4',selector.determineGear(99));
    }
    @org.junit.jupiter.api.Test
    void speedOneHundred(){
        GearSelector selector = new GearSelector();
        assertEquals('5',selector.determineGear(100));
    }

    @org.junit.jupiter.api.Test
    void speedUnderOneHundredThirty(){
        GearSelector selector = new GearSelector();
        assertEquals('5',selector.determineGear(129));
    }
}