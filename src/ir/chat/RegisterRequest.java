package ir.chat;

/**
 * Created by Hamed on 9/19/2015.
 */
public class RegisterRequest {
    String username;
    String password;
    String sessionID;

    public RegisterRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void request()
    {
        //connect to server

        //get server's public key

        //generate symmetric key and send it to server using server's public key

        //send username and password to server using symmetric key

        //get response from server and act accordingly
    }
}
