package web.model;

public class Car {

    private String model;
    private int series;
    private int hP;

    public Car(String model, int series, int hP) {
        this.model = model;
        this.series = series;
        this.hP = hP;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int gethP() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", hP=" + hP +
                '}';
    }
}
