package africa.tutored.chaptertwoClass;

public class Person {
    float weightInPounds;
    float heightInInches;
    double heightInMeters;
    double weightInKilograms;
    double bmi;

    public void setWeightInPounds(float weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public float getWeightInPounds() {
        return weightInPounds;
    }

    public void setHeightInInches(float heightInInches) {
        this.heightInInches = heightInInches;
    }

    public float getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public void setWeightInKilograms(double weightInKilograms) {
        this.weightInKilograms = weightInKilograms;
    }

    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    public double calculateBMIWithOnlyWeightInPoundsAndHeightInInches(float userInputWeightInPounds,
                                                                      float userInputHeightInInches){

        weightInPounds = userInputWeightInPounds;
        heightInInches = userInputHeightInInches;
        bmi = (weightInPounds * 703)/Math.pow(2, heightInInches);
        return bmi;
    }


    public double calculateBMIWithOnlyWeightInKilogramsAndHeightInMeters(float userInputWeightInKilograms,
                                                                    float userInputHeightInInches) {
        weightInKilograms = userInputWeightInKilograms;
        heightInInches = userInputHeightInInches;
        bmi = weightInKilograms / Math.pow(2,heightInInches);
        return bmi;
    }

    public double calculateBMI(double calculateBMIWithOnlyWeightInPoundsAndHeightInInches) {
    }
}
