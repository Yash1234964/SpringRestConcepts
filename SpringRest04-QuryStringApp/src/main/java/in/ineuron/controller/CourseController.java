package in.ineuron.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@GetMapping("/info/{id}")
	public ResponseEntity<String> getCourseInfo(@PathVariable Integer id){
		
		String body=null;
		
		if(id==10) {
			body="Sachin";
		}else if(id==7) {
			body="Dhoni";
		}else {
			body="Kohli";
		}
		ResponseEntity<String> entity=new ResponseEntity<String>(body,HttpStatus.OK);
		
		
		return entity;
		
	}

}