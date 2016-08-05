package sprmvc.upload;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UploadedFiles implements UploadList{
    private ArrayList<UploadedFile> filesList;

    public UploadedFiles() {
        filesList = new ArrayList<>();
    }

    @Override
    public void addFile(UploadedFile file) {
        filesList.add(0,file);
    }

    @Override
    public List<UploadedFile> returnFiles() {
        return filesList;
    }
}
