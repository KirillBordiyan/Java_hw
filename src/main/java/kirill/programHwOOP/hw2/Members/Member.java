package kirill.programHwOOP.hw2.Members;

import kirill.programHwOOP.hw2.Obstacle.Obstacle;
import kirill.programHwOOP.hw2.Obstacle.Tradmill;
import kirill.programHwOOP.hw2.Obstacle.Wall;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Member {

    public String name;
    protected int possibleRunningDistance;
    protected int possibleJumpHeight;
    protected boolean canParticipate;

    Member(String name, int possibleRunningDistance, int possibleJumpHeight){
        this.name = name;
        this.possibleRunningDistance = possibleRunningDistance;
        this.possibleJumpHeight = possibleJumpHeight;
        this.canParticipate = true;
    }

    protected abstract void couldRun(Obstacle obstacle);
    protected abstract void couldJump(Obstacle obstacle);

    public void anyObstacleChallenge(Obstacle obstacle){
        if(obstacle.getClass().equals(Wall.class)){
            couldJump(obstacle);
        }else if(obstacle.getClass().equals(Tradmill.class)){
            couldRun(obstacle);
        }
    }
}
