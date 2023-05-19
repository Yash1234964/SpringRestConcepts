package in.ineuron.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ineuron.response.CurrencyResponse;
import reactor.core.Disposable;

@Service("service")
public class CurrencyService {
	
	private static final String REST_END_POINT="http://localhost:9999/SpringRestCurrencyConverterApp/api/currency/getCurrencyExchangeCost/from/INR/to/USD";
	
	
	public void invokeRestApiSync(String from,String to) {
		WebClient webClient=WebClient.create();
		System.out.println("Synchronous call ended");
		CurrencyResponse response = webClient.get().
				                    uri(REST_END_POINT,from,to)
				                    .retrieve().bodyToMono(CurrencyResponse.class).block();
		
		System.out.println(response);
		System.out.println("Synchronous call ended");
	}
	
	public void invokeRestApiASync(String from,String to) {
		WebClient webClient=WebClient.create();
		System.out.println("ASynchronous call ended");
		                           
		webClient.get().
        uri(REST_END_POINT,from,to)
	    .retrieve().bodyToMono(CurrencyResponse.class)
		.subscribe(CurrencyService::myResponse);
		
		
		System.out.println("ASynchronous call ended");
	}
	
	public static void myResponse(CurrencyResponse response) {
		System.out.println(response);
	}

}
