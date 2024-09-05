package com.inheritance.assgin3;

public class CommunicationMain {
	public static void main(String[] args) {
		Communication communicationInMail = new MailCommunication();
		communicationInMail.sendMessage();

		MailCommunication mail = (MailCommunication) communicationInMail;
		for (String type : mail.showTypes()) {
			System.out.println("Mail type : "+type);
		}
		
		Communication communicationsms = new SmsCommunication();
		communicationsms.sendMessage();
		SmsCommunication smsClass = (SmsCommunication) communicationsms;
		smsClass.messageLenght();
		
		Communication communicationPhone = new PhoneCommunication();
		communicationPhone.sendMessage();
		PhoneCommunication phone = (PhoneCommunication) communicationPhone;
		phone.callService();
		
		Communication communicationWhatsApp = new WhatsAppCommunication();
		communicationWhatsApp.sendMessage();
		WhatsAppCommunication whatsup = (WhatsAppCommunication) communicationWhatsApp;
		whatsup.otherFeatures();
	}
}
