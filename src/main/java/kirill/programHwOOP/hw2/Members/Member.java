package kirill.programHwOOP.hw2.Members;

import kirill.programHwOOP.hw2.Obstacle.Obstacle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Member<T> {

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

    //todo переписать на прием объекта Obstacle
    public abstract void couldRun(Obstacle obstacle);
    public abstract void couldJump(Obstacle obstacle);

}
