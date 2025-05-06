package study.goorm.domian.history.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.history.domain.entity.Hashtag;

public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
}
