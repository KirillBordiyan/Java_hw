package kirill.programHwOOP.hw2.Members;

import kirill.programHwOOP.hw2.Obstacle.Obstacle;

public class Cat extends Member{
    public Cat(String name, int possibleRunningDistance, int possibleJumpHeight){
        super(name, possibleRunningDistance, possibleJumpHeight);
    }

    @Override
    public void couldRun(Obstacle obstacle) {
        if(obstacle.getObstacleParam() <0){
            System.out.println("Must non negative param");
        } else if (obstacle.getObstacleParam()<possibleRunningDistance){
            System.out.println(name + " can running " + obstacle.getObstacleParam());
            canParticipate = false;
        } else{
            System.out.println(name + " can't running " + obstacle.getObstacleParam()
                    +", he is out");
        }
    }

    @Override
    public void couldJump(Obstacle obstacle) {
        if(obstacle.getObstacleParam() <0){
            System.out.println("Must non negative param");
        } else if (obstacle.getObstacleParam()<possibleRunningDistance){
            System.out.println(this.getClass() + name + " can jump " + obstacle.getObstacleParam());
            canParticipate = false;
        } else{
            System.out.println(name + " can't jump " + obstacle.getObstacleParam()
                    +", he is out");
        }
    }
}
