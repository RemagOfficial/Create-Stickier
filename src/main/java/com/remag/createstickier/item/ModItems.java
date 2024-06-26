package com.remag.createstickier.item;

import com.remag.createstickier.CreateStickier;
import com.remag.createstickier.tab.ModCreativeModeTab;
import com.simibubi.create.content.contraptions.glue.SuperGlueItem;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.remag.createstickier.CreateStickier.REGISTRATE;
import static com.remag.createstickier.tab.ModCreativeModeTab.addToTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, CreateStickier.MODID);

    public static final RegistryEntry<SuperGlueItem> STICKIER_SUPERGLUE;

    static {
        assert ModCreativeModeTab.CREATE_STICKIER_TAB.getKey() != null;
        STICKIER_SUPERGLUE = REGISTRATE.item("stickier_superglue", SuperGlueItem::new)
                .properties(p -> p.durability(250)
                        .stacksTo(1))
                .tab(ModCreativeModeTab.CREATE_STICKIER_TAB.getKey())
                .register();
    }
    //(ITEMS.register("stickier_superglue",
            // () -> new SuperGlueItem(new Item.Properties().durability(250))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
