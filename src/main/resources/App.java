import com.twilio.Twilio; 
import com.twilio.rest.api.v2010.account.Message; 
import com.twilio.rest.api.v2010.account.MessageCreator; 
import com.twilio.type.PhoneNumber; 
 
import java.math.BigDecimal; 
import java.net.URI; 
import java.util.ArrayList; 
import java.util.List; 
 
public class App { 
    private final static String ACCOUNT_SID = "AC0b0ea7eb42a948256da95fcef1571ca1"; 
    private final static String AUTH_TOKEN = "bddb0ad5fe6f8bd65a8146346b0effbf"; 
 
    public static void main(String[] args) { 
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
         
        MessageCreator messageCreator = Message.creator( 
            "AC0b0ea7eb42a948256da95fcef1571ca1", 
            new PhoneNumber("+15512295964") 
        ); 
    
         
        Message message = messageCreator.create(); 
        System.out.println(message.getSid()); 
    } 
}