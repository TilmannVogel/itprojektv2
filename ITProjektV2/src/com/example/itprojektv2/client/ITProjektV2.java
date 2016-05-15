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
		    
	//Panel zur Darstellung der Navigationsleiste auf der linken Seite 
	VerticalPanel navPanel = new VerticalPanel();
	
	/*
	 * Das navPanel wird dem div-Element "Navigator" aus der HTML-Hostdatei zugeordnet.
	 * Somit erhält es einen Darstellungsort.
	 */
	
	RootPanel.get("Navigator").add(navPanel);
	
	//Erzeugen der Buttons
	Button productButton = new Button("Products");
	Button reportButton = new Button("Create report");
	Button myListButton = new Button("My List");
	
	//Hinzufügen der Buttons zum VerticalPanel
	navPanel.add(productButton);
	navPanel.add(reportButton); 
	navPanel.add(myListButton);
	
	
	/*
	 * ClickHandler für die Buttons hinzufügen. 
	 * Beim Klick auf die Buttons öffnet sich der jeweilige Showcase 
	 * (--> Wird als VerticalPanel im Container "Content" angezeigt)
	 */
	
	productButton.addClickHandler(new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
			//Showcase instantiieren
			Showcase showcase = new ShowProducts(); 
			
			/*
			 * Die Ausgaben werden dem div-Element "Content" aus der HTML-Datei zugeordnet.
			 * Bevor ein neuer Showcase dort eingebettet wird, werden sicherheitshalber alle 
			 * bisherigen Elemente des Elements gelöscht. 
			 */
			RootPanel.get("Content").clear();
	        RootPanel.get("Content").add(showcase);
			}
		});
	
	reportButton.addClickHandler(new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
			Showcase showcase = new CreateReport();
			RootPanel.get("Content").clear();
	        RootPanel.get("Content").add(showcase);
			}
		});
	
	myListButton.addClickHandler(new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
			Showcase showcase = new ShowMyList();
			RootPanel.get("Content").clear();
	        RootPanel.get("Content").add(showcase);
			}
		});
	
	
		
	}
	}
	

