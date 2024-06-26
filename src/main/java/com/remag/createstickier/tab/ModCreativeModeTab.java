package com.remag.createstickier.tab;

import com.remag.createstickier.CreateStickier;
import com.remag.createstickier.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateStickier.MODID);

    public static final List<Supplier<? extends ItemLike>> CREATE_STICKIER_TABS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> CREATE_STICKIER_TAB = TABS.register("create_stickier_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.create_stickier_tab"))
                    .icon(ModItems.STICKIER_SUPERGLUE.get().asItem()::getDefaultInstance)
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STICKIER_SUPERGLUE.get());
                    })
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        CREATE_STICKIER_TABS.add(itemLike);
        return itemLike;
    }

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
