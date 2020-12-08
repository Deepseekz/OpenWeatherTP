package com.example.openweathertp;

public class Main {
    private double temp;
    private double feels_like;

    public Main(double temp, double feels_like) {
        this.temp = temp;
        this.feels_like = feels_like;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }
}
