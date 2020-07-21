package noobanidus.mods.overworldrespawn.mixins;

import net.minecraft.server.management.PlayerList;
import noobanidus.mods.overworldrespawn.OverworldRespawn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(PlayerList.class)
@SuppressWarnings("unused")
public class MixinPlayerList {
  @ModifyVariable(method = "recreatePlayerEntity", at = @At(value = "HEAD"), ordinal = 0)
  private int recreatePlayerEntity(int dimension) {
    return 0;
  }
}
