package study.goorm.domian.member.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.member.domain.entity.Term;

public interface TermRepository extends JpaRepository<Term, Long> {
}
