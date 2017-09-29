package word.game.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {



//    @RequestMapping("{word}")
//    public String word(@PathVariable String word) {
//
//        return "Hello: "+word ;
//    }
    @PostMapping
    public String word(@RequestParam String word) {

        return "Hello: "+word ;
    }
}
