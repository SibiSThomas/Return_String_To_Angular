package study.Service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class HelloService implements I_HelloService {

	@Override
	public String greet(String name) {

//To return string to angular
		ObjectMapper mapper = new ObjectMapper();
		  try {
			return mapper.writeValueAsString("Hello "+ name);
			
		} catch (JsonProcessingException e) {
						
		}
		return "Hello "+ name;
	}
}
