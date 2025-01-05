package net.jason.slainstweaks.datagen;

import net.jason.slainstweaks.SlainsTweaks;
import net.jason.slainstweaks.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModitemModelProvider extends ItemModelProvider {
    public ModitemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SlainsTweaks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.KOI_BUCKET.get());
        basicItem(ModItems.KOI.get());
        basicItem(ModItems.KOI_SPAWN_EGG.get());
        basicItem(ModItems.BUCKLE.get());
        basicItem(ModItems.BLACK_FIREFLY_BOTTLE.get());
        basicItem(ModItems.SQUID_BUCKET.get());
        basicItem(ModItems.BLUE_FIREFLY_BOTTLE.get());
        basicItem(ModItems.BROWN_FIREFLY_BOTTLE.get());
        basicItem(ModItems.RED_FIREFLY_BOTTLE.get());
        basicItem(ModItems.YELLOW_FIREFLY_BOTTLE.get());
        basicItem(ModItems.CHARRED_BONE.get());
        basicItem(ModItems.CHARRED_BONE_MEAL.get());
        basicItem(ModItems.CYAN_FIREFLY_BOTTLE.get());
        basicItem(ModItems.FIREFLY_SPAWN_EGG.get());
        basicItem(ModItems.WHITE_FIREFLY_BOTTLE.get());
        basicItem(ModItems.PURPLE_FIREFLY_BOTTLE.get());
        basicItem(ModItems.PRISMARINE_ROD.get());
        basicItem(ModItems.PINK_FIREFLY_BOTTLE.get());
        basicItem(ModItems.DENT.get());
        basicItem(ModItems.DEPTH_CHARGE.get());
        basicItem(ModItems.MAGENTA_FIREFLY_BOTTLE.get());
        basicItem(ModItems.NETHERITE_HORSE_ARMOR.get());
        basicItem(ModItems.SILVERFISH_TAIL.get());
        basicItem(ModItems.GRAY_FIREFLY_BOTTLE.get());
        basicItem(ModItems.LIGHT_GRAY_FIREFLY_BOTTLE.get());
        basicItem(ModItems.LIME_FIREFLY_BOTTLE.get());
        basicItem(ModItems.LIGHT_BLUE_FIREFLY_BOTTLE.get());
        basicItem(ModItems.GLOW_SQUID_BUCKET.get());
        basicItem(ModItems.ORANGE_FIREFLY_BOTTLE.get());
        basicItem(ModItems.GREEN_FIREFLY_BOTTLE.get());




    }
}
