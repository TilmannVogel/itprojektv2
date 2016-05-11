package com.example.itprojektv2.shared;

import com.google.gwt.user.client.rpc.RemoteService;

/**
 * Synchrones Interface 
 * 
 * 
 * 	- Hier werden die im System verfügbaren Funktionen deklariert 
 * 	- Es muss das Markerinterface "RemoteService" erweitert werden (für RPC) 
 * 	- Die Implementierung der Methoden erfolgt in der Impl-Klasse "ProductListService" auf der Server-Seite 
 *
 * 
 * @author Tilmann Vogel
 *
 */



public interface ProductListService extends RemoteService {

}
