package FindMyTrainProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMyTrainSystem {
    private Map<String, Station> stations = new HashMap<>();
    private Map<String, Train> trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    public void addStation(Station station) {
        stations.put(station.getStationId(), station);
    }

    public void addTrain(Train train) {
        trains.put(train.getTrainId(), train);
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public List<Schedule> findMyTrain(String startStationId, String endStationId) {
        List<Schedule> res = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getStation().getStationId().equalsIgnoreCase(startStationId)
                    || schedule.getStation().getStationId().equalsIgnoreCase(endStationId)) {
                res.add(schedule);
            }
        }
        return res;
    }

}
