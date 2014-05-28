package net.pixelight.modularmachines.common.config;

import java.io.File;

/**
 * @author Royalixor.
 */
public class MMConfiguration {

    public static File mainConfigFile;

    public static void init(String configPath) {
        mainConfigFile = new File(configPath + "main.cfg");
    }

}
