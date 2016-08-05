package sprmvc.upload;

import java.util.List;

public interface UploadList {
    void addFile(UploadedFile file);

    List<UploadedFile> returnFiles();
}
