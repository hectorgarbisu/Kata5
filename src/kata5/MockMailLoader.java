package kata5;  
public class MockMailLoader implements MailLoader{
    public Mail[] load(){
        Mail[] mails = new Mail[5];
        mails[0] = new Mail("prueba1@gmail1.com");
        mails[1] = new Mail("prueba2@gmail1.com");
        mails[2] = new Mail("prueba3@gmail2.com");
        mails[3] = new Mail("prueba4@gmail3.com");
        mails[4] = new Mail("prueba5@gmail4.com");
        return mails;
    }
}
