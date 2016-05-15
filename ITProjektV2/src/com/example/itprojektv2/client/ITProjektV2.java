package com.example.itprojektv2.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * EntryPoint Klasse 
 * 
 * (ist in itprojektv2.gwt.xml so festgelegt) 
 * 
 * onModuleLoad()
 * 	- Muss implementiert werden, da vom Interface EntryPoint bereitgestellt
 * 	- Stellt den Startpunkt der GWT Anwendung dar 
 * 
 */

public class ITProjektV2 implements EntryPoint {

	@Override
	public void onModuleLoad() {
		    Button b = new Button("Click me", new ClickHandler() {
		      public void onClick(ClickEvent event) {
		        Window.alert("Hello, AJAX");
		      }
		    });

		    RootPanel.get().add(b);
		  }
		
	}
	

