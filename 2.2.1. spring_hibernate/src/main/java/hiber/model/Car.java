package hiber.model;

import javax.persistence.*;


@Entity
@Table (name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private int series;

    @Column
    private String model;


    public Car(){
    }

    public Car(int series, String model){
        this.series=series;
        this.model=model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                 +
                '}';
    }
}
