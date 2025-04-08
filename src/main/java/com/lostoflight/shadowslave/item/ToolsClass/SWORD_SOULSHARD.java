package com.lostoflight.shadowslave.item.ToolsClass;

import com.lostoflight.shadowslave.item.ItemFather;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Function;

public class SWORD_SOULSHARD extends ItemFather {

    String name = "sword_soulshard";
    TagKey<Block> TagKey = BlockTags.INCORRECT_FOR_WOODEN_TOOL;
    int Durability = 2500;
    float SpeedMining = 0.0f;
    float AttackDamageBonus = 4.0f;
    int EnchantmentValue = 10;
    TagKey<Item> RepairItem = null;


    Item.Settings settings = new Item.Settings()
            .fireproof();

    ToolMaterial ToolStats = new ToolMaterial(TagKey,Durability,SpeedMining,AttackDamageBonus,EnchantmentValue,RepairItem);

    Function<Item.Settings, Item> itemFactory =
            settings -> new SwordItem(ToolStats,5f,-2.0f,settings);


    public SWORD_SOULSHARD()
    {
        SetValues(name,itemFactory,settings);
    }




}
