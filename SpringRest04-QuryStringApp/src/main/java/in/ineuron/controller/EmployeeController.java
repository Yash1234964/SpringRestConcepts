package in.ineuron.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@GetMapping("/read")
	public ResponseEntity<String> getEmployee(@RequestParam(defaultValue="10",required=false) Integer id,@RequestParam(defaultValue="Sachin",required=false) String name){
		
		return new ResponseEntity<String>("Customer found with id ::"+id+" "+name,HttpStatus.OK);
	}

}
