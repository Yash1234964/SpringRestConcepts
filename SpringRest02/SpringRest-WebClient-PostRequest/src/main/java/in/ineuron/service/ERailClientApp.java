package in.ineuron.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ineuron.request.PassengerInfo;
import in.ineuron.response.Ticket;

@Service("service")
public class ERailClientApp {

	public void invokeRestApi() {
		
		WebClient client=WebClient.create();
		String REST_END_URL="http://localhost:9999/SpringRest-TicketBookingProviderApp/api/ticket/register";
		
		PassengerInfo body=new PassengerInfo();
		
		body.setFirstName("Yash");
		body.setFrom("Bengaluru");
		body.setJourneyDate("23/07/23");
		body.setLastName("Raj");
		body.setTo("Bhagalpur");
		body.setTrainNumber("7894");
		
		Ticket ticket = client.post().uri(REST_END_URL).accept(MediaType.APPLICATION_JSON)
		                .body(BodyInserters.fromValue(body)).retrieve().bodyToMono(Ticket.class).block();
		
		System.out.println(ticket);
		
	}
	
}
