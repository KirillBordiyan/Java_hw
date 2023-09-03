package kirill.programHwOOP.hw2;

import kirill.programHwOOP.hw2.Members.Cat;
import kirill.programHwOOP.hw2.Members.Human;
import kirill.programHwOOP.hw2.Members.Member;
import kirill.programHwOOP.hw2.Members.Robot;
import kirill.programHwOOP.hw2.Obstacle.Obstacle;
import kirill.programHwOOP.hw2.Obstacle.Tradmill;
import kirill.programHwOOP.hw2.Obstacle.Wall;

import java.sql.Array;
import java.util.Arrays;

public class ProgramHw2main {
    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new Wall(5),
                new Tradmill(150),
                new Tradmill(190),
                new Wall(40)};

        Member[] members = {
                new Human("h1", 150, 20),
                new Human("h2", 130, 40),
                new Cat("c1", 300, 110),
                new Robot("R1", 500, 50)};

        for(Member member: members) {
            for(Obstacle obstacle: obstacles){
                if (member.isCanParticipate()) {
                    member.anyObstacleChallenge(obstacle);
                }
            }
            System.out.println("=========================");
        }
    }
}


/*
1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса, но есть общий класс родитель.
Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.

2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.

3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет.
 */