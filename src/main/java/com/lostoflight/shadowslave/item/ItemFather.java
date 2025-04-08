package com.lostoflight.shadowslave.item;

import net.minecraft.item.Item;

import java.util.function.Function;

public class ItemFather {
    private String Name;
    private Function<Item.Settings, Item> ItemFactory;
    private Item.Settings Settings;


    public String getName()
    {
        return Name;
    }

    public Function<Item.Settings, Item> getItemFactory()
    {
        return ItemFactory;
    }

    public Item.Settings getSettings()
    {
        return Settings;
    }

    /**
     * Este metodo guarda los valores introducidos a la variables que se obtendran para crear el registro del item.
     * @param Name El nombre
     * @param ItemFactory Las configuraciones especiales del item
     * @param Settings Las configuraciones normales
     */
    protected void SetValues(String Name, Function<Item.Settings, Item> ItemFactory, Item.Settings Settings){
        this.Name = Name;
        this.ItemFactory = ItemFactory;
        this.Settings = Settings;
    }
}
