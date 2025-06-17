package FindMyTrainProject;

public class Train {
    private String trainId;
    private String trainName;
    private String trainType;

    public Train(String trainId, String trainName, String trainType) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.trainType = trainType;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", trainName='" + trainName + '\'' +
                ", trainType='" + trainType + '\'' +
                '}';
    }
}
