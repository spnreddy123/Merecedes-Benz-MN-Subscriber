package org.mbusa.rest;

import java.net.URLEncoder;

import org.mbusa.domain.Status;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/mobile/api/")
public class MobileSubscriberController {

	@Value("${subScribURL}")
	String subScribURL;

	@RequestMapping(value = "subScribe", method = RequestMethod.POST)
	public Status subScribe(@RequestBody String contactNumber) {

		RestTemplate restTemplate = new RestTemplate();
		String URL =subScribURL + contactNumber;
		Status status = restTemplate.postForObject(URL, null,
				Status.class);

		return status;

	} 

	@RequestMapping(value = "subScribe/{contactNumber}", method = RequestMethod.GET)
	public Status getSubScribe(
			@PathVariable("contactNumber") String contactNumber) {
		Status st = new Status();

		st.setMessage("You have successfuly sbuscribe your mobile number "
				+ contactNumber);
		return st;

	}

}
