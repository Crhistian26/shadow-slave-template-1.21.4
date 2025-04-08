package com.lostoflight.shadowslave.item.ItemsClass;

import com.lostoflight.shadowslave.item.ItemFather;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.util.Rarity;

import java.util.List;
import java.util.function.Function;

public class SOUL_FRUIT extends ItemFather {

    String name = "soul_fruit";

    Function<Item.Settings, Item> itemFactory = Item::new;

    FoodComponent foodComponent = new FoodComponent.Builder()
            .nutrition(20)
            .alwaysEdible()
            .saturationModifier(10)

            .build();

    ConsumableComponent consumableComponent = ConsumableComponent.builder()
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                            new StatusEffectInstance(StatusEffects.REGENERATION, 60 * 20, 4),
                            new StatusEffectInstance(StatusEffects.ABSORPTION,60 * 20,4)
                            )
                    )

            )
            .build();


    Item.Settings settings = new Item.Settings()
            .fireproof()
            .maxCount(32)
            .rarity(Rarity.RARE)
            .food(foodComponent,consumableComponent)
            ;

    public SOUL_FRUIT()
    {
        SetValues(name,itemFactory,settings);
    }

}
