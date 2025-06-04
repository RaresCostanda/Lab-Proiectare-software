package src.main.java.storage;//package storage;

//import datamodel.SensorData;
import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    private static DataRepository instance;
    private List<SensorData> data;

    private DataRepository() {
        data = new ArrayList<>();
    }

    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    public void addData(SensorData sensorData) {
        data.add(sensorData);
    }

    public List<SensorData> getData() {
        return data;
    }
}
