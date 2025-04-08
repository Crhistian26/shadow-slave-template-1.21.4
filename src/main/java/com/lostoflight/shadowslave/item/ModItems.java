package com.lostoflight.shadowslave.item;

import com.lostoflight.shadowslave.ShadowSlave;
import com.lostoflight.shadowslave.item.ItemsClass.SOUL_FRUIT;
import com.lostoflight.shadowslave.item.ItemsClass.SOUL_SHARD;
import com.lostoflight.shadowslave.item.ToolsClass.SWORD_SOULSHARD;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;



public class ModItems {

    //Item soul before register with the class SOUL_SHARD
    private static final SOUL_SHARD class_soul_shard = new SOUL_SHARD();
    //Item SOUL later of register
    public static final Item SOUL_SHARD =
            register(
                    class_soul_shard.getName(),
                    class_soul_shard.getItemFactory(),
                    class_soul_shard.getSettings()
            );


    //Item soul fruit register with the class SOUL_FRUIT
    private static final SOUL_FRUIT class_soul_fruit = new SOUL_FRUIT();

    public static final Item SOUL_FRUIT=
            register(
                    class_soul_fruit.getName(),
                    class_soul_fruit.getItemFactory(),
                    class_soul_fruit.getSettings()
            );

    private static final SWORD_SOULSHARD class_sword_soulshard = new SWORD_SOULSHARD();

    public static final Item SWORD_SOULSHARD =
            register(
                    class_sword_soulshard.getName(),
                    class_sword_soulshard.getItemFactory(),
                    class_sword_soulshard.getSettings()
            );




    //region Initializers the ModItems

    //The class with the magic
    public static Item register(String name, @NotNull Function<Item.Settings, Item> itemFactory, Item.@NotNull Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ShadowSlave.MOD_ID, name));
        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        //Register the item in the game.
        Registry.register(Registries.ITEM, itemKey, item);
        //Return game.
        return item;
    }

    //The class that will register the object group
    public static void registerItemGroup(Item item, RegistryKey<ItemGroup> Group){
        ItemGroupEvents.modifyEntriesEvent(Group)
                .register((itemGroup) -> itemGroup.add(item));
    }

    //Start class ModItems in the class main
    public static void initialize() {
        registerItemGroup(SOUL_SHARD, ItemGroups.INGREDIENTS);
        registerItemGroup(SOUL_FRUIT, ItemGroups.FOOD_AND_DRINK);
        registerItemGroup(SWORD_SOULSHARD, ItemGroups.COMBAT);
    }
    //endregion
}