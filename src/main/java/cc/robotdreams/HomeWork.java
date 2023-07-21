package cc.robotdreams;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {

    private final List<String> homeWork = new ArrayList<>();

    public void addHomeWork(String homework) {
        this.homeWork.add(homework);
    }

    public List<String> getHomeWork() {
        return this.homeWork;
    }
}
