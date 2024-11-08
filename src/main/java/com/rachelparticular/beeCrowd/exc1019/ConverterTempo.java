package com.rachelparticular.beeCrowd.exc1019;

public class ConverterTempo {
    private final int segHour = 3600;
    private final int segMin = 60;

    private int seg;
    private int min;
    private int hour;

    public ConverterTempo(int seg) { // 4500
        converterTempo(seg);
    }

    private void converterTempo(int seg) {
        this.hour = seg / segHour;
        this.min = (seg % segHour) / segMin;
        this.seg = ((seg % segHour) % segMin);
    }

    public int getSeg() {
        return seg;
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public String result(){
        return String.format("%d:%d:%d%n", getHour(), getMin(), getSeg());
    }
}
