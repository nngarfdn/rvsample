package com.android.rvsample;

public class Fruit {
    private String name;
    private String warna;

    public Fruit(String name, String warna) {
        this.name = name;
        this.warna = warna;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
