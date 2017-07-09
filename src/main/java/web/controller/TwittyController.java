package web.controller;

import core.data.TwittyRepository;
import core.model.Twitty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/twitties")
public class TwittyController {

    @Autowired
    private TwittyRepository twittyRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Twitty> twitties(@RequestParam(value = "max", defaultValue = "100") long max,
                                 @RequestParam(value = "count", defaultValue = "20") int count) {
        return twittyRepository.findTwitties(max, count);
    }

    @RequestMapping(value="/{twittyId}", method=RequestMethod.GET)
    public Twitty twitty(@PathVariable("twittyId") long twittyId) {
        return twittyRepository.findOne(twittyId);
    }
}
