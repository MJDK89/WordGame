package com.github.martagor.word.snake.easy.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import word.game.model.WordEntry;
import word.game.repository.GameRepository;
import word.game.service.GameService;

import java.time.LocalDateTime;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameRepository GameRepository;


    @Override
    public void addWord(String word) {
        WordEntry lastWord = GameRepository.findFirstByOrderByTimeDesc();
        if (lastWord == null) {
            WordEntry words = new WordEntry();
            words.setWord(word);
            words.setTime(LocalDateTime.now());
            GameRepository.save(words);

        } else {
            // TODO: 29.09.2017 sprawdzanie czy nowe slowo pasuje do domina

        }
    }

}
