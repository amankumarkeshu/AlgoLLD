package snakesAndLadder.Factory;

import snakesAndLadder.Entities.BoardEntity;
import snakesAndLadder.Entities.Ladder;
import snakesAndLadder.Entities.Snake;

public class EntityFactory {

    public static BoardEntity createEntity(EntityENUM entity, int start, int end) {

        switch (entity) {
            case SNAKE : {
                return new Snake(start, end);
            }
            case LADDER : {
                return new Ladder(start, end);
            }
            default : {
                return null;
            }
        }
    }
}
