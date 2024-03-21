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
        soundVolume = newSoundVolume;
    }

    public void increaseSoundVolume(int iSoundVolume) {
        int increase;
        if (iSoundVolume < 100) {
            increase = iSoundVolume + 1;
            setSoundVolume(increase);
        } else {
            increase = iSoundVolume;
            setSoundVolume(increase);
        }
    }

    public void decreaseSoundVolume(int dSoundVolume) {
        int decrease;
        if (dSoundVolume > 0) {
            decrease = dSoundVolume - 1;
            setSoundVolume(decrease);
        } else {
            decrease = dSoundVolume;
            setSoundVolume(decrease);
        }
    }

}
