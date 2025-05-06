package study.goorm.domian.history.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.history.domain.entity.HashtagHistory;

public interface HashtagHistoryRepository extends JpaRepository<HashtagHistory, Long> {
}
