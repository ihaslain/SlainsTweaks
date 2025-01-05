package net.jason.slainstweaks.datagen;

import net.jason.slainstweaks.block.ModBlocks;
import net.jason.slainstweaks.SlainsTweaks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.model.generators.ModelFile;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SlainsTweaks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.POLISHED_DIORITE_BRICKS);
        blockWithItem(ModBlocks.POLISHED_AMETHYST_BRICKS);

        blockWithItem(ModBlocks.POLISHED_GRANITE_BRICKS);
        blockWithItem(ModBlocks.POLISHED_AMETHYST);

        blockWithItem(ModBlocks.POLISHED_ANDESITE_BRICKS);

        stairsBlock(ModBlocks.POLISHED_AMETHYST_STAIRS.get(), blockTexture(ModBlocks.POLISHED_AMETHYST.get()));
        slabBlock(ModBlocks.POLISHED_AMETHYST_SLAB.get(), blockTexture(ModBlocks.POLISHED_AMETHYST.get()), blockTexture(ModBlocks.POLISHED_AMETHYST.get()));

        blockItem(ModBlocks.POLISHED_AMETHYST_STAIRS);
        blockItem(ModBlocks.POLISHED_AMETHYST_SLAB);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("slainstweaks:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("slainstweaks:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}