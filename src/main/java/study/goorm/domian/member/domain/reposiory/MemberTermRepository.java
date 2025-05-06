package study.goorm.domian.member.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.member.domain.entity.MemberTerm;

public interface MemberTermRepository extends JpaRepository<MemberTerm, Long> {
}
