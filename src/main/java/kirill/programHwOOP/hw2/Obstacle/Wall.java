package kirill.programHwOOP.hw2.Obstacle;

import kirill.programHwOOP.hw2.Members.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wall extends Obstacle{
    public Wall(int wallHeight){
        super(wallHeight);
    }
}
