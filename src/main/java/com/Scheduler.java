package com;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler 
{

	@Scheduled(fixedDelay = 1000L)
	public void schduler() 
	{
		try
		{
			System.out.println("Project start:::");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
