package noobanidus.mods.overworldrespawn;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
@Mod(modid = OverworldRespawn.MODID, name = OverworldRespawn.MODNAME, version = OverworldRespawn.VERSION)
@SuppressWarnings("WeakerAccess")
public class OverworldRespawn {
  public static final String MODID = "overworldrespawn";
  public static final String MODNAME = "Overworld Respawn";
  public static final String VERSION = "GRADLE:VERSION";

  public static Logger LOG = LogManager.getLogger(MODID);

  public OverworldRespawn() {
  }

  @SuppressWarnings("unused")
  @Mod.Instance(OverworldRespawn.MODID)
  public static OverworldRespawn instance;
}
