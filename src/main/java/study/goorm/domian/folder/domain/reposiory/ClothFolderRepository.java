package study.goorm.domian.folder.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.folder.domain.entity.ClothFolder;

public interface ClothFolderRepository extends JpaRepository<ClothFolder, Long> {
}