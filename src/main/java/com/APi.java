package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APi 
{

	@GetMapping("/test")
	public String getRequest()
	{
		String response = "Something Went Wrong for build";
		try
		{
			response = "get Your Request Thank You";
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return response;
	}
}
