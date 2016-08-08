package sprmvc.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sprmvc.upload.Upload;
import sprmvc.upload.UploadList;
import sprmvc.upload.UploadedFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @Autowired
    UploadList filesList;

    @RequestMapping(method = RequestMethod.GET)
    public String uploadForm(Model model){
        model.addAttribute("files",filesList.returnFiles());
        return "upload";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String uploadFile(@RequestPart MultipartFile file, Model model) throws IOException {

        String fileName = file.getOriginalFilename();
        String fileSize = Long.toString(file.getSize());

        File checkFile = new File(Upload.ROOT+fileName);
        if (checkFile.exists())
            checkFile.delete();

        throw new IOException();

//        Files.copy(file.getInputStream(), Paths.get(Upload.ROOT,fileName));
//
//        UploadedFile uploadedFile = new UploadedFile(Upload.ROOT+fileName,"/uploads/"+fileName,fileSize,fileName);
//        filesList.addFile(uploadedFile);
//        model.addAttribute("files",filesList.returnFiles());
//
//        return "upload";
    }

}
