package hms.ctap.idea.plugin.util;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;
import java.net.URL;

/**
 * IconUtil - Loads the jetty icon
 * @author Gui Keller
 */
public class IconUtil {

    private static final IconUtil INSTANCE = new IconUtil();

    private IconUtil(){
        super();
    }

    public static IconUtil getInstance(){
        return INSTANCE;
    }

    public Icon getIcon(){
        return new ImageIcon(getClass().getResource("/resources/ctap-runner/images/"+"runner-icon.png"));
    }

    public static class ServiceClassIcon {
        public static final Icon Service = IconLoader.getIcon("/hms/ctap/idea/plugin/icons/service.png");
        public static final Icon SMS_MO = IconLoader.getIcon("/hms/ctap/idea/plugin/icons/sms.png");
        public static final Icon SMS_DR = IconLoader.getIcon("/hms/ctap/idea/plugin/icons/service.png");
        public static final Icon USSD_MO = IconLoader.getIcon("/hms/ctap/idea/plugin/icons/service.png");
        public static final Icon CAS_NOTIFY = IconLoader.getIcon("/hms/ctap/idea/plugin/icons/service.png");
        public static final Icon SUBSCRIPTION_NOTIFY = IconLoader.getIcon("/hms/ctap/idea/plugin/icons/service.png");

        public static final Icon LBS = IconLoader.getIcon("/hms/ctap/idea/plugin/icons/lbs.png");
    }

}
