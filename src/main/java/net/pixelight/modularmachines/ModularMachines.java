package net.pixelight.modularmachines;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.pixelight.modularmachines.common.config.MMConfiguration;
import net.pixelight.modularmachines.common.lib.Reference;

/**
 * @author Royalixor.
 */

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
public class ModularMachines {

    @Mod.Instance(Reference.ID)
    public static ModularMachines instance;

    @SidedProxy(clientSide = "net.pixelight.modularmachines.ClientProxy", serverSide = "net.pixelight.modularmachines.CommonProxy")
    public static CommonProxy proxy;

    public static String configPath;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        configPath = event.getModConfigurationDirectory() + "/ModularMachines/";
        MMConfiguration.init(configPath);
    }

}
