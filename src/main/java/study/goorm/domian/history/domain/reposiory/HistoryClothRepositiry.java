package study.goorm.domian.history.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.history.domain.entity.HistoryCloth;

public interface HistoryClothRepositiry extends JpaRepository<HistoryCloth, Long> {
}
