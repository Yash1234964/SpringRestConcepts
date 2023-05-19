package in.ineuron.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.request.PassengerInfo;
import in.ineuron.response.Ticket;


@RestController
@RequestMapping("/api/ticket")
public class TicketBookingRestController {
	
	
	@PostMapping("/register")
	public ResponseEntity<Ticket> bookTicket(@RequestBody PassengerInfo passenger) {
		
		Ticket ticket=new Ticket();
		ticket.setFrom(passenger.getFrom());
		ticket.setJourneyDate(passenger.getJourneyDate());
		ticket.setPassengerName(passenger.getFirstName()+" "+passenger.getLastName());
		ticket.setTicketId("12235");
		ticket.setTicketStatus("booked");
		ticket.setTo(passenger.getTo());
		ticket.setTrainNumber(passenger.getTrainNumber());
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}

}
