package google.drive.infra;

import google.drive.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fileInfos", path = "fileInfos")
public interface FileInfoRepository
    extends PagingAndSortingRepository<FileInfo, Long> {}
