package FindMyTrainProject;

import java.util.ArrayList;
import java.util.List;

public class FindMyTrainApp {
    public static void main(String[] args) {

        // Creating System Obj
        FindMyTrainSystem trainSystem = new FindMyTrainSystem();

        // Creating Stations
        Station station1 = new Station("ST1", "MODASA");
        Station station2 = new Station("ST2", "AHMEDABAD");

        // Creating Trains
        Train train1 = new Train("TR101", "BULLS", "PASSENGER");
        Train train2 = new Train("TR102", "APPLIES", "MAAL-GAADI");

        // Creating Platforms
        Platform platform1 = new Platform(1);
        Platform platform2 = new Platform(2);

        // Setting Trains To Platform
        platform1.setTrain(train1);
        platform2.setTrain(train2);

        // Creating Platform List
        List<Platform> platformList = new ArrayList<>();
        platformList.add(platform1);
        platformList.add(platform2);

        // Add Platforms To Station
        station1.setPlatformList(platformList);

        // Creating Schedules
        Schedule schedule1 = new Schedule(train1, station1, "11PM", "12PM", platform1);
        Schedule schedule2 = new Schedule(train2, station1, "9PM", "10PM", platform2);

        // Now Add All In The System
        trainSystem.addStation(station1);
        trainSystem.addStation(station2);

        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);

        trainSystem.addSchedule(schedule1);
        trainSystem.addSchedule(schedule2);

        // Finding Train By StationId
        /*List<Schedule> myTrain = trainSystem.findMyTrain("ST1", "ST5");
        if (myTrain.isEmpty()) {
            System.out.println("No Trains Are There In Station..");
        } else {
            for (Schedule schedule : myTrain) {
                System.out.println(schedule.getTrain());
            }
        }*/


        // Checking Trains On Station By Station Name

        List<Schedule> trainList = trainSystem.findMyTrainByStationName("MODASA");
        if (trainList.isEmpty()) {
            System.out.println("No Trains Are There In Station..");
        } else {
            int i = 1;
            for (Schedule train : trainList) {

                System.out.println((i++) + "." + train.getTrain() + "\n  Time Of Arrival: " + train.getArrivalTime() + ", Time Of Departure: " + train.getDepartureTime());
            }
        }
    }
}
