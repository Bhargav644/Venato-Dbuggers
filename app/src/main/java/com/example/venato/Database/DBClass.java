package com.example.venato.Database;

public class DBClass {
    double readUnreadRatio;

    public DBClass(){}
    public DBClass(double readUnreadRatio, double behaviouralScore, double financialScore, double creditScoreWithPercentage, double creditScoreWithoutPercentage, double lastBattery, double batteryScore, double appScore, double dueScore, double clearanceScore, double callScore, String systemId) {
        this.readUnreadRatio = readUnreadRatio;
        this.behaviouralScore = behaviouralScore;
        this.financialScore = financialScore;
        this.creditScoreWithPercentage = creditScoreWithPercentage;
        this.creditScoreWithoutPercentage = creditScoreWithoutPercentage;
        this.lastBattery = lastBattery;
        this.batteryScore = batteryScore;
        this.appScore = appScore;
        this.dueScore = dueScore;
        this.clearanceScore = clearanceScore;
        this.callScore = callScore;
        this.systemId = systemId;
    }

    double behaviouralScore;
    double financialScore;
    double creditScoreWithPercentage;
    double creditScoreWithoutPercentage;
    double lastBattery;
    double batteryScore;
    double appScore;
    double dueScore;
    double clearanceScore;
    double callScore;
    String systemId;


    public double getReadUnreadRatio() {
        return readUnreadRatio;
    }

    public double getBehaviouralScore() {
        return behaviouralScore;
    }

    public double getFinancialScore() {
        return financialScore;
    }

    public double getCreditScoreWithPercentage() {
        return creditScoreWithPercentage;
    }

    public double getCreditScoreWithoutPercentage() {
        return creditScoreWithoutPercentage;
    }

    public double getLastBattery() {
        return lastBattery;
    }

    public double getBatteryScore() {
        return batteryScore;
    }

    public double getAppScore() {
        return appScore;
    }

    public double getDueScore() {
        return dueScore;
    }

    public double getClearanceScore() {
        return clearanceScore;
    }

    public double getCallScore() {
        return callScore;
    }

    public String getSystemId() {
        return systemId;
    }

    //setters
    public void setReadUnreadRatio(double readUnreadRatio) {
        this.readUnreadRatio = readUnreadRatio;


    }

    public void setBehaviouralScore(double behaviouralScore) {
        this.behaviouralScore = behaviouralScore;
        if(Double.isNaN(behaviouralScore)){
            this.behaviouralScore=0;
        }
    }

    public void setFinancialScore(double financialScore) {
        this.financialScore = financialScore;
        if(Double.isNaN(financialScore)){
            this.financialScore=0;
        }
    }

    public void setCreditScoreWithPercentage(double creditScoreWithPercentage) {
        this.creditScoreWithPercentage = creditScoreWithPercentage;
        if(Double.isNaN(creditScoreWithPercentage)) {
            this.creditScoreWithPercentage = 0;
        }

    }

    public void setCreditScoreWithoutPercentage(double creditScoreWithoutPercentage) {
        this.creditScoreWithoutPercentage = creditScoreWithoutPercentage;
        if(Double.isNaN(creditScoreWithoutPercentage)) {
            this.creditScoreWithoutPercentage = 0;
        }

    }

    public void setLastBattery(double lastBattery) {
        this.lastBattery = lastBattery;

    }

    public void setBatteryScore(double batteryScore) {
        this.batteryScore = batteryScore;

    }

    public void setAppScore(double appScore) {
        this.appScore = appScore;

    }

    public void setDueScore(double dueScore) {
        this.dueScore = dueScore;
        if(Double.isNaN(DBClass.this.dueScore)){
            this.dueScore=0;
        }

    }

    public void setClearanceScore(double clearanceScore) {
        this.clearanceScore = clearanceScore;

    }

    public void setCallScore(double callScore) {
        this.callScore = callScore;

    }
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
