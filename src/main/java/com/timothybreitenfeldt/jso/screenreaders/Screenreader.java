package com.timothybreitenfeldt.jso.screenreaders;

public abstract class Screenreader {

    private String name;
    protected static final String ARCHITECTURE = System.getProperty("sun.arch.data.model");

    public Screenreader(String name) {
        this.name = name;
    }

    public abstract boolean isRunning();

    public abstract void speak(String text);

    public abstract void speak(String text, boolean interrupt);

    public abstract void silence();

    public void braille(String text) {}

    public void output(String text, boolean interrupt) {
        this.speak(text, interrupt);
        this.braille(text);
    }

    public void output(String text) {
        this.speak(text);
        this.braille(text);
    }

    public String getName() {
        return this.name;
    }

}
