package net.timeless.jurassicraft.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class JCItemRegistry
{
    public static ItemPlasterAndBandage plaster_and_bandage;
    public static ItemDinosaurSpawnEgg spawn_egg;
    public static ItemFossil fossil;

    public static ItemDNA dna;
    public static ItemDinosaurEgg egg;
    public static ItemPaleoPad paleo_pad;
    public static ItemSoftTissue soft_tissue;

    public static ItemDinosaurMeat dino_meat;
    public static ItemDinosaurSteak dino_steak;

    public static ItemBluePrint blue_print;
    public static ItemJurassiCraftSign jc_sign;

    public void register()
    {
        plaster_and_bandage = new ItemPlasterAndBandage();
        spawn_egg = new ItemDinosaurSpawnEgg();
        fossil = new ItemFossil();
        dna = new ItemDNA();
        egg = new ItemDinosaurEgg();
        paleo_pad = new ItemPaleoPad();
        dino_meat = new ItemDinosaurMeat();
        dino_steak = new ItemDinosaurSteak();
        blue_print = new ItemBluePrint();
        jc_sign = new ItemJurassiCraftSign();
        soft_tissue = new ItemSoftTissue();

        registerItem(blue_print, "Blue Print");
        registerItem(jc_sign, "JurassiCraft Sign");
        registerItem(plaster_and_bandage, "Plaster And Bandage");
        registerItem(spawn_egg, "Dino Spawn Egg");
        registerItem(fossil, "Fossil");
        registerItem(dna, "DNA");
        registerItem(egg, "Dino Egg");
        registerItem(paleo_pad, "Paleo Pad");
        registerItem(soft_tissue, "Soft Tissue");

        registerItem(dino_meat, "Dinosaur Meat");
        registerItem(dino_steak, "Dinosaur Steak");
    }

    public void registerItem(Item item, String name)
    {
        GameRegistry.registerItem(item, name.toLowerCase().replaceAll(" ", "_"));
    }
}
