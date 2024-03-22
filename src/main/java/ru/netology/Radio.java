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

    public void nextRadioNumber(int nCurrentRadioNumber) {
        int next;
        if (nCurrentRadioNumber == 9) {
            next = 0;
            setCurrentRadioNumber(next);
        } else {
            next = nCurrentRadioNumber + 1;
            setCurrentRadioNumber(next);
        }
    }

    public void prevRadioNumber(int pCurrentRadioNumber) {
        int prev;
        if (pCurrentRadioNumber == 0) {
            prev = 9;
            setCurrentRadioNumber(prev);
        } else {
            prev = pCurrentRadioNumber - 1;
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
