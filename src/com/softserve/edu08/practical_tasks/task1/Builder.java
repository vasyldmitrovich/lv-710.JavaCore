package com.softserve.edu08.practical_tasks.task1;

import java.time.LocalDate;

public interface Builder<T> {
    T setModel(String model);

    T setDateOfProduction(LocalDate dateOfProduction);

    T setEngineCapacity(double engineCapacity);

    T setColor(String color);

    T setPassengerCapacity(int passengerCapacity);

    T setAirConditioning(boolean airConditioning);
}
