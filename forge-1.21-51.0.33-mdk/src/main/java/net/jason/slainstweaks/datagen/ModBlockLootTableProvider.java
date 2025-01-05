package net.jason.slainstweaks.datagen;

import net.jason.slainstweaks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider( HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.POLISHED_AMETHYST.get());
        dropSelf(ModBlocks.POLISHED_AMETHYST_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_ANDESITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_DIORITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_GRANITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_AMETHYST_BRICK_SLAB.get());
        dropSelf(ModBlocks.POLISHED_AMETHYST_BRICK_STAIRS.get());
        dropSelf(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB.get());
        dropSelf(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS.get());
        dropSelf(ModBlocks.POLISHED_DIORITE_BRICK_SLAB.get());
        dropSelf(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS.get());
        dropSelf(ModBlocks.POLISHED_AMETHYST_SLAB.get());
        dropSelf(ModBlocks.POLISHED_AMETHYST_STAIRS.get());
        dropSelf(ModBlocks.POLISHED_GRANITE_BRICK_SLAB.get());
        dropSelf(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
