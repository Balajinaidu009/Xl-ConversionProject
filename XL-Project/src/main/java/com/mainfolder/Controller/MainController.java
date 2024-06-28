package com.mainfolder.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mainfolder.ServiceLayer.XL_ServiceClass;

@RestController
public class MainController {
	@Value("${input.folder.path}")
	private String inputfolderPath;
	
	@Value("${output.folder.path}")
	private String outfolderPath;

	
	@Autowired
	private XL_ServiceClass sevice;

    @PostMapping("/processFolder")
    public ResponseEntity<String> processFolder() {
    	ResponseEntity<String> changetextFormateInXL = sevice.changetextFormateInXL(inputfolderPath,outfolderPath);

    	return changetextFormateInXL;
    }
      

   

   
   
    
    

 

}
   
