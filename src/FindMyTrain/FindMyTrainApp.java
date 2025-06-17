package FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class FindMyTrainApp {
    public static void main(String[] args) {
        FindMyTrainSystem trainSystem = new FindMyTrainSystem();

        Station station1 = new Station("ST1", "MODASA");
        Station station2 = new Station("ST2", "AHMEDABAD");

        Train train1 = new Train("TR101", "BULLS", "PASSENGER");
        Train train2 = new Train("TR102", "APPLIES", "MAAL-GAADI");

        Platform platform1 = new Platform(1);
        Platform platform2 = new Platform(2);

        platform1.setTrain(train1);
        platform2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(platform1);
        platformList.add(platform2);
        station1.setPlatformList(platformList);


        Schedule schedule1 = new Schedule(train1, station1, "11PM", "12PM", platform1);
        Schedule schedule2 = new Schedule(train2, station2, "9PM", "10PM", platform2);

        trainSystem.addStation(station1);
        trainSystem.addStation(station2);

        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);

        trainSystem.addSchedule(schedule1);
        trainSystem.addSchedule(schedule2);

        List<Schedule> myTrain = trainSystem.findMyTrain("ST2", "ST5");
        for (Schedule schedule : myTrain) {
            System.out.println(schedule.getTrain());
        }

    }
}
