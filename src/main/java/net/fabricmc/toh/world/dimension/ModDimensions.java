package net.fabricmc.toh.world.dimension;

import net.fabricmc.toh.toh;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> DEMON_REALM_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(toh.MOD_ID, "demon_realm"));
    public static final RegistryKey<DimensionType> DEMON_REALM_TYPE = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            DEMON_REALM_KEY.getValue());


    public static void register() {
        toh.LOGGER.debug("Registering Dimensions for " + toh.MOD_ID);
    }
}