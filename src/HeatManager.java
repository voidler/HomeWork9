public class HeatManager extends Engine{


    public int getHours() {
        return  hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxWorkTemperature() {
        return  (power*hours);
    }

    int maxWorkTemperature;
    int hours;
}
