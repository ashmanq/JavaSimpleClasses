public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drinkFromWaterBottle(){
        this.volume -= 10;
        return this.volume;
    }

    public int fillWaterBottle(){
        this.volume = 100;
        return this.volume;
    }

    public int emptyWaterBottle(){
        this.volume = 0;
        return this.volume;
    }
}
