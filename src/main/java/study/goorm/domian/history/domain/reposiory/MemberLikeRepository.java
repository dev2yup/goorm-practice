package study.goorm.domian.history.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.history.domain.entity.MemberLike;

public interface MemberLikeRepository extends JpaRepository<MemberLike, Long> {
}
