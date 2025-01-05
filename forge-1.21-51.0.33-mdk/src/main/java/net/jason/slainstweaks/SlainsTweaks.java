package net.jason.slainstweaks;

import com.mojang.logging.LogUtils;
import net.jason.slainstweaks.block.ModBlocks;
import net.jason.slainstweaks.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// Very important Comment
// The value here should match an entry in the META-INF/mods.toml file
@Mod(SlainsTweaks.MOD_ID)
public class SlainsTweaks {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "slainstweaks";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public SlainsTweaks() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);



        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)  {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.KOI);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.KOI_BUCKET);
            event.accept(ModItems.BUCKLE);
            event.accept(ModItems.SQUID_BUCKET);
            event.accept(ModItems.GLOW_SQUID_BUCKET);
            event.accept(ModItems.YELLOW_FIREFLY_BOTTLE);
            event.accept(ModItems.RED_FIREFLY_BOTTLE);
            event.accept(ModItems.BLUE_FIREFLY_BOTTLE);
            event.accept(ModItems.GREEN_FIREFLY_BOTTLE);
            event.accept(ModItems.LIME_FIREFLY_BOTTLE);
            event.accept(ModItems.LIGHT_BLUE_FIREFLY_BOTTLE);
            event.accept(ModItems.ORANGE_FIREFLY_BOTTLE);
            event.accept(ModItems.PINK_FIREFLY_BOTTLE);
            event.accept(ModItems.MAGENTA_FIREFLY_BOTTLE);
            event.accept(ModItems.PURPLE_FIREFLY_BOTTLE);
            event.accept(ModItems.BROWN_FIREFLY_BOTTLE);
            event.accept(ModItems.CYAN_FIREFLY_BOTTLE);
            event.accept(ModItems.LIGHT_GRAY_FIREFLY_BOTTLE);
            event.accept(ModItems.WHITE_FIREFLY_BOTTLE);
            event.accept(ModItems.GRAY_FIREFLY_BOTTLE);
            event.accept(ModItems.BLACK_FIREFLY_BOTTLE);
            event.accept(ModItems.DEPTH_CHARGE);

        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.CHARRED_BONE);
            event.accept(ModItems.CHARRED_BONE_MEAL);
            event.accept(ModItems.DENT);
            event.accept(ModItems.PRISMARINE_ROD);
            event.accept(ModItems.SILVERFISH_TAIL);
            event.accept(ModItems.BARK);
        }
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.KOI_SPAWN_EGG);
            event.accept(ModItems.FIREFLY_SPAWN_EGG);
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.NETHERITE_HORSE_ARMOR);
            event.accept(ModItems.DEPTH_CHARGE);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.POLISHED_AMETHYST_BRICKS);
            event.accept(ModBlocks.POLISHED_ANDESITE_BRICKS);
            event.accept(ModBlocks.POLISHED_GRANITE_BRICKS);
            event.accept(ModBlocks.POLISHED_DIORITE_BRICKS);
            event.accept(ModBlocks.POLISHED_AMETHYST);
            event.accept(ModBlocks.POLISHED_AMETHYST_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_AMETHYST_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_AMETHYST_SLAB);
            event.accept(ModBlocks.POLISHED_AMETHYST_STAIRS);
            event.accept(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_DIORITE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS);
            event.accept(ModBlocks.POLISHED_GRANITE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS);

        }
    }




    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}