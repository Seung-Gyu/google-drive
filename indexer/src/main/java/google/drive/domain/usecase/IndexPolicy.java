package google.drive.domain.usecase;

import google.drive.domain.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexPolicy {

    @Autowired
    IndexRepository indexRepository;

    public void makeIndex(FilesUploaded filesUploaded) {
        Index index = new Index();
        /*
        LOGIC GOES HERE
        */
        // indexRepository.save(index);

    }
}
