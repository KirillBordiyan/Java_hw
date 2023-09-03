package kirill.programHwOOP.hw2.Members;


import kirill.programHwOOP.hw2.Obstacle.Obstacle;

public class Human extends Member{

    public Human(String name, int possibleRunningDistance, int possibleJumpHeight){
        super(name, possibleRunningDistance, possibleJumpHeight);
    }

    @Override
    public void couldRun(Obstacle obstacle) {
        if(obstacle.getObstacleParam() <= 0){
            System.out.println("Must non negative param");
        } else if (obstacle.getObstacleParam()<=possibleRunningDistance){
            System.out.println(name + " can running " + obstacle.getObstacleParam());
        } else{
            System.out.println(name + " can't running " + obstacle.getObstacleParam()
            +", he is out");
            canParticipate = false;
        }
    }

    @Override
    public void couldJump(Obstacle obstacle) {
        if(obstacle.getObstacleParam() <= 0){
            System.out.println("Must non negative param");
        } else if (obstacle.getObstacleParam()<=possibleJumpHeight){
            System.out.println(name + " can jump " + obstacle.getObstacleParam());
        } else{
            System.out.println(name + " can't jump " + obstacle.getObstacleParam()
                    +", he is out");
            canParticipate = false;
        }
    }
}
