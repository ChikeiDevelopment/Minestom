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
public final class BlueConcrete {
  public static final BlockState BLUE_CONCRETE_0 = new BlockState(NamespaceID.from("minecraft:blue_concrete_0"), (short) 9453, Block.BLUE_CONCRETE);

  static {
    Registries.registerBlockState(BLUE_CONCRETE_0);
  }

  public static void initStates() {
    Block.BLUE_CONCRETE.addBlockState(BLUE_CONCRETE_0);
  }
}