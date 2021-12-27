package com.lindsaySenia.droidFactory;

public class Droid {
    private String serialNumber;
    private String modelType;
    private String purpose;

    public Droid(String serialNumber, String modelType, String purpose) {
        this.serialNumber = serialNumber;
        this.modelType = modelType;
        this.purpose = purpose;
    }

    public void speak() {
        System.out.println("Beep Boop");
    }

    public String getSerialNumber() { return serialNumber; }
    public String getModelType() { return modelType; }
    public String getPurpose() { return purpose; }
    public void setModelType(String newModel) { this.modelType = newModel; }
    public void setPurpose(String newPurpose) { this.purpose = newPurpose; }

    @Override
    public String toString() {
        return "Droid{ \n" + "Serial Number: " + serialNumber + "\n Model Type: " + modelType + "\n Purpose: " + purpose + "\n }";
    }



}
