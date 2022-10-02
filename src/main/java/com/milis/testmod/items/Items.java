package com.milis.testmod.items;

import com.milis.testmod.TestMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    //Описание всех предметов
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Регистрирование в игре
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
