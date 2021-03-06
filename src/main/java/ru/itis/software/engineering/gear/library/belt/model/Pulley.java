package ru.itis.software.engineering.gear.library.belt.model;

/**
 * Абстрактный класс для шкивов
 */
public abstract class Pulley {

    /**
     * Диаметр шкива
     */
    protected double diameter;
    /**
     * Ширина шкива
     */
    protected double width;
    /**
     * Мощность на валу
     */
    protected double shaftPower;
    /**
     * Угловая скорость вала
     */
    protected double shaftAngularVelocity;
    /**
     * Частота вращения
     */
    protected double rotationSpeed;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getShaftPower() {
        return shaftPower;
    }

    public void setShaftPower(double shaftPower) {
        this.shaftPower = shaftPower;
    }

    public double getShaftAngularVelocity() {
        return shaftAngularVelocity;
    }

    public void setShaftAngularVelocity(double shaftAngularVelocity) {
        this.shaftAngularVelocity = shaftAngularVelocity;
    }

    public double getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(double rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }
}
