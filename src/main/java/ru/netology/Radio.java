package ru.netology;

public class Radio {
    private int currentRadioNumber;
    private int soundVolume;

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentRadioNumber(int newCurrentRadioNumber) {
        if (newCurrentRadioNumber < 0) {
            return;
        }
        if (newCurrentRadioNumber > 9) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;
    }

    public void nextRadioNumber() {
        int next;
        if (currentRadioNumber == 9) {
            next = 0;
            setCurrentRadioNumber(next);
        } else {
            next = currentRadioNumber + 1;
            setCurrentRadioNumber(next);
        }
    }

    public void prevRadioNumber() {
        int prev;
        if (currentRadioNumber == 0) {
            prev = 9;
            setCurrentRadioNumber(prev);
        } else {
            prev = currentRadioNumber - 1;
            setCurrentRadioNumber(prev);
        }
    }

    public int getSoundVolume() {

        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > 100) {
            soundVolume = 100;
        } else {
            if (newSoundVolume < 0) {
                soundVolume = 0;
            } else {
                soundVolume = newSoundVolume;
            }
        }

    }

    public void increaseSoundVolume() {
        int increase = soundVolume + 1;
        setSoundVolume(increase);
    }

    public void decreaseSoundVolume() {
        int decrease = soundVolume - 1;
        setSoundVolume(decrease);
    }

}