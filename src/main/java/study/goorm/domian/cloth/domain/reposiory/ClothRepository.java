package study.goorm.domian.cloth.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.cloth.domain.entity.Cloth;

public interface ClothRepository extends JpaRepository<Cloth, Long> {
}
