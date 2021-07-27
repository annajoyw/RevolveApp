package com.revolve.models;

public class Battery{
    private String ModelName;
    private String id;
    private double BatteryWeightInKg;
    private decimal CurrentTotalValue;

    public String getModelName() {
        return ModelName;
    }

    public String getId() {
        return id;
    }

    public double getBatteryWeightInKg() {
        return BatteryWeightInKg;
    }

    public decimal getCurrentTotalValue() {
        return CurrentTotalValue;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBatteryWeightInKg(double batteryWeightInKg) {
        BatteryWeightInKg = batteryWeightInKg;
    }

    public void setCurrentTotalValue(decimal currentTotalValue) {
        CurrentTotalValue = currentTotalValue;
    }
}