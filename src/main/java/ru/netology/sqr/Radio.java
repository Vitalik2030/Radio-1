package ru.netology.sqr;

public class Radio {
    private int station;

    private int volume;

    public int getStation() {

        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newvolume) {

        volume = newvolume;
    }

    public void setStation(int station) {

        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public void nextStation() {

        if (station > 8) {
            station = 0;
            return;
        }
        this.station = station + 1;
    }

    public void prevCurrentStation() {

        if (station < 1) {
            station = 9;
            return;
        }
        this.station = station - 1;
    }

    public void upCurrentVolume() {
        if (volume < 10) {
            volume = volume + 1;
            return;
        }

        this.volume = 10;
    }

    public void downVolume() {

        if (volume > 0) {
            volume = volume - 1;
            return;
        }
        this.volume = 0;
    }

}
