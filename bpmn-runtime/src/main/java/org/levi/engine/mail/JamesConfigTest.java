package org.levi.engine.mail;

/**
 * Created by IntelliJ IDEA.
 * UserDaoImpl: keheliya
 * Date: Apr 18, 2011
 * Time: 7:58:46 PM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */
public class JamesConfigTest
{
  public static void main(String[] args)
    throws Exception
  {
    // CREATE CLIENT INSTANCES
    MailClient erandaClient = new MailClient("eranda", "localhost");
    MailClient ishanClient = new MailClient("ishan", "localhost");
    //MailClient umaClient = new MailClient("uma", "localhost");

    // CLEAR EVERYBODY'S INBOX
    erandaClient.checkInbox(MailClient.CLEAR_MESSAGES);
    ishanClient.checkInbox(MailClient.CLEAR_MESSAGES);
    //umaClient.checkInbox(MailClient.CLEAR_MESSAGES);
    Thread.sleep(500); // Let the server catch up

    // SEND A COUPLE OF MESSAGES
    erandaClient.sendMessage(
      "ishan@localhost",
      "Testing ishan from eranda",
      "This is a test message");
    ishanClient.sendMessage(
      "eranda@localhost",
      "Testing eranda from ishan",
      "This is gork's test message");
    Thread.sleep(500); // Let the server catch up

    // LIST MESSAGES FOR Eranda and Ishan
      erandaClient.checkInbox(MailClient.SHOW_MESSAGES);
    ishanClient.checkInbox(MailClient.SHOW_AND_CLEAR);
  }
}