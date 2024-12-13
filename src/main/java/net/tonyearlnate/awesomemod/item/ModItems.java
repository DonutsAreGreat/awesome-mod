package net.tonyearlnate.awesomemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.tonyearlnate.awesomemod.AwesomeMod;

public class ModItems {
    public static final Item PINK_KITIUM = registerItem("pink_kitium", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AwesomeMod.MOD_ID,"pink_kitium")))));
    public static final Item BLUE_KITIUM = registerItem("blue_kitium", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AwesomeMod.MOD_ID,"blue_kitium")))));
    public static final Item ENERGIZED_KITIUM = registerItem("energized_kitium", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AwesomeMod.MOD_ID,"energized_kitium")))));
	public static final Item LIGHTNING_IN_A_BOTTLE = registerItem("lightning_in_a_bottle", new Item(new Item.Settings()
			.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AwesomeMod.MOD_ID,"lightning_in_a_bottle")))));
			

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AwesomeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AwesomeMod.LOGGER.info("Registering Mod Items for " + AwesomeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LIGHTNING_IN_A_BOTTLE);
        });
    }
}
