package net.jason.slainstweaks.item;

import net.jason.slainstweaks.SlainsTweaks;
import net.jason.slainstweaks.item.custom.FuelItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlainsTweaks.MOD_ID);

    public static final RegistryObject<Item> KOI = ITEMS.register("koi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KOI)));
    public static final RegistryObject<Item> KOI_BUCKET = ITEMS.register("koi_bucket",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHARRED_BONE = ITEMS.register("charred_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KOI_SPAWN_EGG = ITEMS.register("koi_spawn_egg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHARRED_BONE_MEAL = ITEMS.register("charred_bone_meal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DENT = ITEMS.register("dent",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor",
           () ->  new AnimalArmorItem(ArmorMaterials.NETHERITE, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1).fireResistant()));
    public static final RegistryObject<Item> PRISMARINE_ROD = ITEMS.register("prismarine_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUCKLE = ITEMS.register("buckle",
            () -> new Item(new Item.Properties().stacksTo(1)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.slainstweaks.buckle"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });


    public static final RegistryObject<Item> SQUID_BUCKET = ITEMS.register("squid_bucket",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YELLOW_FIREFLY_BOTTLE = ITEMS.register("yellow_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEPTH_CHARGE = ITEMS.register("depth_charge",
            () -> new Item (new Item.Properties()));
    public static final RegistryObject<Item> FIREFLY_SPAWN_EGG = ITEMS.register("firefly_spawn_egg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_FIREFLY_BOTTLE = ITEMS.register("red_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_FIREFLY_BOTTLE = ITEMS.register("blue_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_FIREFLY_BOTTLE = ITEMS.register("light_blue_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_FIREFLY_BOTTLE = ITEMS.register("orange_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_FIREFLY_BOTTLE = ITEMS.register("green_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_FIREFLY_BOTTLE = ITEMS.register("lime_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_FIREFLY_BOTTLE = ITEMS.register("pink_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_FIREFLY_BOTTLE = ITEMS.register("magenta_firefly_bottle",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_FIREFLY_BOTTLE = ITEMS.register("purple_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_FIREFLY_BOTTLE = ITEMS.register("brown_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_FIREFLY_BOTTLE = ITEMS.register("cyan_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_FIREFLY_BOTTLE = ITEMS.register("white_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_FIREFLY_BOTTLE = ITEMS.register("light_gray_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAY_FIREFLY_BOTTLE = ITEMS.register("gray_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_FIREFLY_BOTTLE = ITEMS.register("black_firefly_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOW_SQUID_BUCKET = ITEMS.register("glow_squid_bucket",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BARK = ITEMS.register("bark",
            () -> new FuelItem(new Item.Properties(), 300));



    public static final RegistryObject<Item> SILVERFISH_TAIL = ITEMS.register("silverfish_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SILVERFISH_TAIL)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}