package com.example.itprojektv2.server;

import com.example.itprojektv2.shared.ProductListService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


/**
 * Implementierungsklasse des Synchronen & Asynchronen Interfaces. 
 * 
 * 	- Sie enthält sämtliche Applikationslogik, sowie die Verknüpfung mit den Mappern.
 * 	- Sie erweitert die Klasse "RemoteServiceServlet", dadurch werden Anfragen automatisch serialisiert bzw. deserialisiert.  
 *
 * @author Tilmann Vogel
 *
 */

public class ProductListServiceImpl extends RemoteServiceServlet implements ProductListService {

}

