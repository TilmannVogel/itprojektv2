package com.example.itprojektv2.shared;



/**
 * Asynchrones Interface 
 * 
 * Dieses Interface stellt die Methoden für die clientseitigen, asynchronen Funktionsaufrufe bereit. 
 * Es wird nur clientseitig benötigt. 
 *  
 * Asynchrone Methoden: 
 * 		- Da die Methodenaufrufe ASYNCHRON erfolgen, darf es keine Rückgabewerte geben --> void 
 * 		- Keine Implementierung 
 * 		- Um zu sehen, ob der Aufruf erfolgreich war, wird das AsyncCallback-Objekt als Parameter übergeben
 * 		- Die Methoden des Objekts onfailure/onsuccess geben an was bei der Antwort passiert und müssen im Normalfall überschrieben werden. 
 * 
 *  @author Tilmann Vogel
 *
 */


public interface ProductListServiceAsync {

}
