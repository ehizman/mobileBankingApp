package africa.tutored.chaptertwoClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMIndexCalculatorTest {

    @Test
    public void testThatCalculatorCanSetWeightInPounds(){
        //given
        Person ehisEdemakhiota = new Person();
        //when
        float weightInPounds = (float) 78.6;
        ehisEdemakhiota.setWeightInPounds(weightInPounds);
        //confirm
        assertEquals(weightInPounds, ehisEdemakhiota.getWeightInPounds());
    }

    @Test
    public void testThatCalculatorCanSetWeightInPoundsTwice() {
        //given
        Person isheoluwaFasoyin = new Person();
        //when
        float weightInPounds = (float) 78.4;
        isheoluwaFasoyin.setWeightInPounds(weightInPounds);
        weightInPounds = (float) 56.4;
        isheoluwaFasoyin.setWeightInPounds(weightInPounds);
        //confirm
        assertEquals((float) 56.4, isheoluwaFasoyin.getWeightInPounds());
    }

    @Test
    public void testThatCalculatorCanSetHeightInInches() {
        //given
        Person ehisEdemakhiota = new Person();
        //when
        float heightInInches = (float) 73.22835;
        ehisEdemakhiota.setHeightInInches(heightInInches);
        //confirm
        assertEquals(heightInInches, ehisEdemakhiota.getHeightInInches());
    }

    @Test
    public void testThatCalculatorCanSetHeightInInchesTwice() {
        //given
        Person isheoluwaFasoyin = new Person();
        //when
        int heightInInches = 23;
        isheoluwaFasoyin.setHeightInInches(heightInInches);
        heightInInches = 18;
        isheoluwaFasoyin.setHeightInInches(heightInInches);
        //confirm
        assertEquals(18, isheoluwaFasoyin.getHeightInInches());
    }

    @Test
    public void testThatCalculatorCanSetHeightInMeters(){
        //given
        Person umarAbdul = new Person();
        //when
        double heightInMeters = 5;
        umarAbdul.setHeightInMeters(heightInMeters);
        //confirm
        assertEquals(heightInMeters, umarAbdul.getHeightInMeters());
    }

    @Test
    public void testThatCalculatorCanSetHeightInMetersTwice(){
        //given
        Person ehisEdemakhiota = new Person();
        //when
        double heightInMeters = 8.55858;
        ehisEdemakhiota.setHeightInMeters(heightInMeters);
        heightInMeters = 10.58848;
        ehisEdemakhiota.setHeightInMeters(heightInMeters);
        //confirm
        assertEquals(heightInMeters, ehisEdemakhiota.getHeightInMeters());
    }

    @Test
    public void testThatCalculatorCanSetWeightInKilogram() {
        //given
        Person janetIshola = new Person();
        //when
        double weightInKilograms = 80;
        janetIshola.setWeightInKilograms(weightInKilograms);
        //confirm
        assertEquals(weightInKilograms, janetIshola.getWeightInKilograms());
    }

    @Test
    public void testThatCalculatorCanSetWeightInKilogramsTwice() {
        //given
        Person samuelZikuorr = new Person();
        //when
        double weightInKilograms = 68.0;
        samuelZikuorr.setWeightInKilograms(weightInKilograms);
        weightInKilograms = 89.7575;
        samuelZikuorr.setWeightInKilograms(weightInKilograms);
        //confirm
        assertEquals(weightInKilograms, samuelZikuorr.getWeightInKilograms());
    }

    @Test
    public void testThatCalculatorCanCalculateBMIWhenOnlyWeightInPoundsAndHeightInInchesAreAvailable(){
        //given
        Person ehisEdemakhiota = new Person();
        //when
        float userInputWeightInPounds = (float) 2;
        float userInputHeightInInches = (float) 2;
        double bmi =  ehisEdemakhiota.calculateBMIWithOnlyWeightInPoundsAndHeightInInches(userInputWeightInPounds,
                userInputHeightInInches);
        //confirm
        assertEquals(351.5, bmi);
    }
    @Test
    public  void testThatCalculatorCanCalculateBMIWhenOnlyWeightInKilogramsAndHeightInMetersAreAvailable(){
        //given
        Person ehisEdemakhiota = new Person();
        //when
        float userInputWeightInKilograms = (float)2;
        float userInputHeightInMeters = (float)2;
        double bmi = ehisEdemakhiota.calculateBMIWithOnlyWeightInKilogramsAndHeightInMeters(userInputWeightInKilograms
                , userInputHeightInMeters);
        //confirm
        assertEquals(0.5, bmi);
    }

    @Test
    public void testThatAnyTwoSetsOfInputAreAvailableBeforeCalculatingBMI() {
        //given
        Person ehisEdemakhiota = new Person();
        //when
        float userInputWeightInPounds = 2;
        float userInputHeightInInches = 2;
        float userInputWeightInKilograms = 0;
        float userInputHeightInMeters = 0;
        double bmi;
        bmi =
                ehisEdemakhiota.calculateBMI(ehisEdemakhiota.calculateBMIWithOnlyWeightInPoundsAndHeightInInches(userInputWeightInPounds, userInputHeightInInches));
        //confirm
        assertEquals(351.5, bmi);
    }
}
