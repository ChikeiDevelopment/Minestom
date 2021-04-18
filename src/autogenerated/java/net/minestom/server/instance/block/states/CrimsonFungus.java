package net.minestom.server.instance.block.states;

import java.lang.Deprecated;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.block.BlockState;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

/**
 * AUTOGENERATED
 */
@Deprecated(
    since = "forever",
    forRemoval = false
)
public final class CrimsonFungus {
  public static final BlockState CRIMSON_FUNGUS_0 = new BlockState(NamespaceID.from("minecraft:crimson_fungus_0"), (short) 14996, Block.CRIMSON_FUNGUS);

  static {
    Registries.registerBlockState(CRIMSON_FUNGUS_0);
  }

  public static void initStates() {
    Block.CRIMSON_FUNGUS.addBlockState(CRIMSON_FUNGUS_0);
  }
}