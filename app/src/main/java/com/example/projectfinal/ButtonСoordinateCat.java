package com.example.projectfinal;

public class ButtonСoordinateCat {
    int nextCat;
    int x;
    int y;
    ButtonСoordinateCat(int cat, int x, int y) {
        this.x = x;
        this.y = y;
        this.nextCat = cat; }
    public int getNextCat() {
        return nextCat;
    }
    public void setNextCat(int nextCat) {
        this.nextCat = nextCat;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }}