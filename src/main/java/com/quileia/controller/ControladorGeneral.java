package com.quileia.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class ControladorGeneral {

	@InitBinder
	public void miBinder(WebDataBinder binder) {

		StringTrimmerEditor metodoTrim = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, metodoTrim);
	}

}
