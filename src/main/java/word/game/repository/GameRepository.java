package word.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import word.game.model.WordEntry;

@Repository
public interface GameRepository extends JpaRepository<WordEntry, Long> {
    WordEntry findFirstByOrderByTimeDesc();
}