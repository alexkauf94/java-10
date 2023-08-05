public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStations;
    private int maxVolume;

    public Radio() {
        this.maxStations = 9;
        this.maxVolume = 100;
    }

    public Radio(int stationsCount) {
        this.maxStations = stationsCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }

        if (currentStation > maxStations) {
            return;
        }

        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }

        if (currentVolume > maxVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation != maxStations) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStations;
        }
    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}