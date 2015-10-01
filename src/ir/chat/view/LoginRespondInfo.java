package ir.chat.view;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Hamed on 9/20/2015.
 */
@XmlRootElement
public class LoginRespondInfo extends RespondInfo {
    String sessionID;

    public String getSessionID() {
        return sessionID;
    }

    @XmlElement
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    @Override
    public String toString() {
        return "LoginRespondInfo{" +
                "succeed=" + succeed +
                ", message='" + message + '\'' +
                ", sessionID='" + sessionID + '\'' +
                '}';
    }
}
