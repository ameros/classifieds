package com.example.classifieds.glue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.classifieds.realestate.commands.AssignAdCommandHandler;

@Component
public class Application {

	private final AssignAdCommandHandler handler;

	@Autowired
	public Application(AssignAdCommandHandler handler) {
		this.handler = handler;
	}

}
