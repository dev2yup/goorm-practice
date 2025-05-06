package study.goorm.domian.folder.domain.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import study.goorm.domian.folder.domain.entity.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {

}