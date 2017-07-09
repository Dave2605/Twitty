package core.data;

import core.model.Twitty;

import java.util.List;

/**
 * Created by dave on 08.05.17.
 */
public interface TwittyRepository {
    List<Twitty> findTwitties(long max, int count);
    Twitty findOne(long id);
}
