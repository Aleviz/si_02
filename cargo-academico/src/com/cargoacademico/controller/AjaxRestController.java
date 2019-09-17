package com.cargoacademico.controller;


import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ajaxrest")
public class AjaxRestController {
	
	
	@RequestMapping(value="demo2/{fullName}" , method = RequestMethod.GET, produces = {
			MimeTypeUtils.TEXT_PLAIN_VALUE	})
	public ResponseEntity<String> demo2(@PathVariable("fullName") String fullName){
		try {
			ResponseEntity<String> responseEntity = new ResponseEntity<String>("HI "+fullName, HttpStatus.OK);
			return responseEntity;
		} catch (Exception e) {
			return new ResponseEntity<String> (HttpStatus.BAD_REQUEST);
			// TODO: handle exception
		}
	}

}
