package study.goorm.domian.cloth.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.cloth.domain.entity.ClothImage;

public interface ClothImageRepositiry extends JpaRepository<ClothImage, Long> {
}
