package study.goorm.domian.member.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.member.domain.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
