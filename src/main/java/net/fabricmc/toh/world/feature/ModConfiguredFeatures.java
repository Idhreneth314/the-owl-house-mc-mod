package net.fabricmc.toh.world.feature;

import net.fabricmc.toh.block.ModBlocks;
import net.fabricmc.toh.toh;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOILING_PINE_TREE =
            ConfiguredFeatures.register("boiling_pine_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.BOILING_PINE_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.BOILING_PINE_LEAVES),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(4)),
                    new TwoLayersFeatureSize(4, 1, 3)).build());
    public static final RegistryEntry<PlacedFeature> BOILING_PINE_CHECKED = PlacedFeatures.register("boiling_pine_checked",
            ModConfiguredFeatures.BOILING_PINE_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.BOILING_PINE_SAPLING)));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BOILING_PINE_SPAWN =
            ConfiguredFeatures.register("boiling_pine_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BOILING_PINE_CHECKED, 0.5f)),
                            BOILING_PINE_CHECKED));


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BOGWOOD_CEDAR_TREE =
            ConfiguredFeatures.register("bogwood_cedar_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.BOGWOOD_CEDAR_LOG),
                    new StraightTrunkPlacer(7, 8, 5),
                    BlockStateProvider.of(ModBlocks.BOGWOOD_CEDAR_LEAVES),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(5)),
                    new TwoLayersFeatureSize(4, 1, 3)).build());


    public static final RegistryEntry<PlacedFeature> BOGWOOD_CEDAR_CHECKED = PlacedFeatures.register("bogwood_cedar_checked",
            ModConfiguredFeatures.BOGWOOD_CEDAR_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.BOGWOOD_CEDAR_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BOGWOOD_CEDAR_SPAWN =
            ConfiguredFeatures.register("bogwood_cedar_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BOGWOOD_CEDAR_CHECKED, 0.5f)),
                            BOGWOOD_CEDAR_CHECKED));


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PRICKLY_FIR_TREE =
            ConfiguredFeatures.register("prickly_fir_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.PRICKLY_FIR_LOG),
                    new StraightTrunkPlacer(6, 7, 4),
                    BlockStateProvider.of(ModBlocks.PRICKLY_FIR_LEAVES),
                    new SpruceFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(5)),
                    new TwoLayersFeatureSize(4, 1, 0)).build());


    public static final RegistryEntry<PlacedFeature> PRICKLY_FIR_CHECKED = PlacedFeatures.register("prickly_fir_checked",
            ModConfiguredFeatures.PRICKLY_FIR_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.PRICKLY_FIR_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PRICKLY_FIR_SPAWN =
            ConfiguredFeatures.register("prickly_fir_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(PRICKLY_FIR_CHECKED, 0.5f)),
                            PRICKLY_FIR_CHECKED));


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PALISTROM_TREE =
            ConfiguredFeatures.register("palistrom_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.PALISTROM_LOG),
                    new StraightTrunkPlacer(4, 5, 3),
                    BlockStateProvider.of(ModBlocks.PALISTROM_LEAVES),
                        new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(2), 6),
                    new TwoLayersFeatureSize(2, 1, 2)).build());


    public static final RegistryEntry<PlacedFeature> PALISTROM_CHECKED = PlacedFeatures.register("palistrom_checked",
            ModConfiguredFeatures.PALISTROM_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.PALISTROM_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PALISTROM_SPAWN =
            ConfiguredFeatures.register("palistrom_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(PALISTROM_CHECKED, 0.5f)),
                            PALISTROM_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> WRINKLING_OAK_TREE =
            ConfiguredFeatures.register("wrinkling_oak_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.WRINKLING_OAK_LOG),
                    new StraightTrunkPlacer(3, 4, 2),
                    BlockStateProvider.of(ModBlocks.WRINKLING_OAK_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(2, 1, 2)).build());


    public static final RegistryEntry<PlacedFeature> WRINKLING_OAK_CHECKED = PlacedFeatures.register("wrinkling_oak_checked",
            ModConfiguredFeatures.WRINKLING_OAK_TREE, List.of(PlacedFeatures.wouldSurvive(ModBlocks.WRINKLING_OAK_SAPLING)));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> WRINKLING_OAK_SPAWN =
            ConfiguredFeatures.register("wrinkling_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(WRINKLING_OAK_CHECKED, 0.5f)),
                            WRINKLING_OAK_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + toh.MOD_ID);
    }
}