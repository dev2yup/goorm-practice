package study.goorm.domian.history.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.history.domain.entity.HistoryImage;

public interface HistoryImageRepository extends JpaRepository<HistoryImage, Long> {
}
