package com.softserve.hw05;

public enum Department {

    DEVELOPMENT_DEPARTMENT("Development department", 1001),
    QUALITY_ASSURANCE_DEPARTMENT("Quality Assurance department", 2001),
    PROJECT_MANAGEMENT_DEPARTMENT("Project Management department", 3001);

    private String depName;
    private int depNumber;

    private Department(String depName, int depNumber) {
        this.depName = depName;
        this.depNumber = depNumber;
    }

    public String getDepName() {
        return this.depName;
    }

    public int getDepNumber() {
        return this.depNumber;
    }
}
