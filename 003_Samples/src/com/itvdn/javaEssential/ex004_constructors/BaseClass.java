package com.itvdn.javaEssential.ex004_constructors;

/**
 * Наследование.
 */
public class BaseClass {
    public int baseNumber;

    // Конструктор по умолчанию.
    public BaseClass() {
    }

    // Пользовательский конструктор.
    protected BaseClass(int number) {
        this.baseNumber = number;
    }
}
