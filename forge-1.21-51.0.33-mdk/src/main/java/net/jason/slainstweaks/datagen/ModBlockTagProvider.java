package net.jason.slainstweaks.datagen;

import net.jason.slainstweaks.SlainsTweaks;
import net.jason.slainstweaks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SlainsTweaks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.POLISHED_AMETHYST.get())
                .add(ModBlocks.POLISHED_AMETHYST_BRICKS.get())
                .add(ModBlocks.POLISHED_ANDESITE_BRICKS.get())
                .add(ModBlocks.POLISHED_DIORITE_BRICKS.get())
                .add(ModBlocks.POLISHED_GRANITE_BRICKS.get());


    }
}