package com.example.itprojektv2.shared;



/**
 * Asynchrones Interface 
 * 
 * Dieses Interface stellt die Methoden f�r die clientseitigen, asynchronen Funktionsaufrufe bereit. 
 * Es wird nur clientseitig ben�tigt. 
 *  
 * Asynchrone Methoden: 
 * 		- Da die Methodenaufrufe ASYNCHRON erfolgen, darf es keine R�ckgabewerte geben --> void 
 * 		- Keine Implementierung 
 * 		- Um zu sehen, ob der Aufruf erfolgreich war, wird das AsyncCallback-Objekt als Parameter �bergeben
 * 		- Die Methoden des Objekts onfailure/onsuccess geben an was bei der Antwort passiert und m�ssen im Normalfall �berschrieben werden. 
 * 
 *  @author Tilmann Vogel
 *
 */


public interface ProductListServiceAsync {

}
