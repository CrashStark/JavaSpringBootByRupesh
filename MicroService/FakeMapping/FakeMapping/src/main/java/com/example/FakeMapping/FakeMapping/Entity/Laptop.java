package com.example.FakeMapping.FakeMapping.Entity;

public class Laptop {
    private int LaptopId;
    private String LaptopName;

    public Laptop(int laptopId, String laptopName) {
        LaptopId = laptopId;
        LaptopName = laptopName;
    }

    public int getLaptopId() {
        return LaptopId;
    }

    public void setLaptopId(int laptopId) {
        LaptopId = laptopId;
    }

    public String getLaptopName() {
        return LaptopName;
    }

    public void setLaptopName(String laptopName) {
        LaptopName = laptopName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "LaptopId=" + LaptopId +
                ", LaptopName='" + LaptopName + '\'' +
                '}';
    }
}
