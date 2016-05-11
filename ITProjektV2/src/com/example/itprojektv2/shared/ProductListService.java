package com.example.itprojektv2.shared;

import com.google.gwt.user.client.rpc.RemoteService;

/**
 * Synchrones Interface 
 * 
 * 
 * 	- Hier werden die im System verf�gbaren Funktionen deklariert 
 * 	- Es muss das Markerinterface "RemoteService" erweitert werden (f�r RPC) 
 * 	- Die Implementierung der Methoden erfolgt in der Impl-Klasse "ProductListService" auf der Server-Seite 
 *
 * 
 * @author Tilmann Vogel
 *
 */



public interface ProductListService extends RemoteService {

}
