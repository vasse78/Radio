public class Radio {
    private int numberStation;
    private int volume;

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;

    }

    public void next() {
        if (numberStation == 9) {
            numberStation = 0;
        } else {
            numberStation++;
        }

    }

    public void prev() {
        if (numberStation == 0) {
            numberStation = 9;
        } else {
            numberStation = numberStation - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            volume = 100;
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void nextVolume() {
        if (volume < 100) {
            volume = volume + 1;
        } else {
            volume = 100;
        }


    }

    public void minusVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }

    }
}
