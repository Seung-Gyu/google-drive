package google.drive.domain.usecase;

import google.drive.domain.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoPolicy {

    @Autowired
    VideoRepository videoRepository;

    public void processVideo(FilesUploaded filesUploaded) {
        Video video = new Video();
        /*
        LOGIC GOES HERE
        */
        // videoRepository.save(video);

    }
}
