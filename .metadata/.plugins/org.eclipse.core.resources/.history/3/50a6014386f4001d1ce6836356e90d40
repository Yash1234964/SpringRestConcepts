package in.ineuron.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/controller")
public class ActorOperationsController {

	
	public ResponseEntity<String> displayMessage(){
		String body=null;
		LocalDateTime ldt=LocalDateTime.now();
		int hour=ldt.getHour();
		if(hour < 12)
			body="Good Morning";
		else if(hour <16)
			body="Good Afternoon";
		else if(hour<20)
			body="Good Evening";
		else 
			body="Good Night";
		return new ResponseEntity<String>(body,HttpStatus.OK);
	}
}
