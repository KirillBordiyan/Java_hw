package kirill.programHwOOP.hw2.Obstacle;

import lombok.Getter;

@Getter
public abstract class Obstacle {

    protected int obstacleParam;

    Obstacle(int obstacleParam){
        this.obstacleParam = obstacleParam;
    }

}
