package com.milis.testmod.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import com.milis.testmod.items.Items;
public class Tabs {
    public static final CreativeModeTab TEST_TAB = new CreativeModeTab("testtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.ZIRCON.get());
        }
    };
}
