public class Radio {
    private int amountOfStations;
    private int numberMaxStation;
    private int numberMinStation;
    private int numberStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
        this.numberMaxStation = this.amountOfStations - 1;
        this.numberMinStation = 0;
        this.numberStation = this.numberMinStation;
    }

    public Radio() {
        this.amountOfStations = 10;
        this.numberMaxStation = 9;
        this.numberMinStation = 0;
        this.numberStation = this.numberMinStation;

    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation > numberMaxStation) {
            return;
        }
        if (newNumberStation < numberMinStation) {
            return;
        }
        numberStation = newNumberStation;

    }

    public void next() {
        if (numberStation == numberMaxStation) {
            numberStation = numberMinStation;
        } else {
            numberStation++;
        }

    }

    public void prev() {
        if (numberStation == numberMinStation) {
            numberStation = numberMaxStation;
        } else {
            numberStation = numberStation - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            volume = maxVolume;
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        volume = newVolume;
    }

    public void nextVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        } else {
            volume = maxVolume;
        }


    }

    public void minusVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }

    }
}
