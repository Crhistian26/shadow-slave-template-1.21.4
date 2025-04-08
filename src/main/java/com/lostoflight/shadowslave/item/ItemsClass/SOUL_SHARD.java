package com.lostoflight.shadowslave.item.ItemsClass;

import com.lostoflight.shadowslave.item.ItemFather;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class SOUL_SHARD extends ItemFather {

    String name = "soul_shard";

    Function<Item.Settings, Item> itemFactory = Item::new;

    Item.Settings settings = new Item.Settings()
            .fireproof()
            .maxCount(32)
            .rarity(Rarity.UNCOMMON);

    public SOUL_SHARD()
    {
        SetValues(name,itemFactory,settings);
    }

}
