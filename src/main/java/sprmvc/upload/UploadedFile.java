package sprmvc.upload;

public class UploadedFile {
    private String filePath;
    private String displayPath;
    private String fileSize;
    private String fileName;

    public UploadedFile(String filePath, String displayPath, String fileSize, String fileName) {
        this.filePath = filePath;
        this.displayPath = displayPath;
        this.fileSize = fileSize;
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDisplayPath() {
        return displayPath;
    }

    public void setDisplayPath(String displayPath) {
        this.displayPath = displayPath;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
