package net.lordnermal826.ilovenyc.item;

import net.lordnermal826.ilovenyc.Ilovenyc;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ilovenyc.MOD_ID);

    public static final RegistryObject<Item> CHOPPED_CHEESE = ITEMS.register("chopped_cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
