package net.jason.slainstweaks.datagen;

import net.jason.slainstweaks.block.ModBlocks;
import net.jason.slainstweaks.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder{
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_AMETHYST_BRICKS.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.POLISHED_AMETHYST.get())
                .unlockedBy(getHasName(ModItems.KOI_BUCKET.get()), has(ModItems.KOI_BUCKET.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHARRED_BONE_MEAL.get(), 3)
                .requires(ModItems.CHARRED_BONE.get())
                .unlockedBy(getHasName(ModItems.CHARRED_BONE.get()), has(ModItems.CHARRED_BONE.get())).save(pRecipeOutput);

    }
}
