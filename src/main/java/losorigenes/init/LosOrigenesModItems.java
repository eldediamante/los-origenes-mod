
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package losorigenes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import losorigenes.item.MejoraDeSuggarItem;
import losorigenes.item.MejoraDePlataItem;
import losorigenes.item.MejoraDePiedraItem;
import losorigenes.item.MejoraDeOroItem;
import losorigenes.item.MejoraDeMaderaItem;
import losorigenes.item.MejoraDeBronceItem;
import losorigenes.item.LogoItem;

import losorigenes.LosOrigenesMod;

public class LosOrigenesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LosOrigenesMod.MODID);
	public static final RegistryObject<Item> LOGO = REGISTRY.register("logo", () -> new LogoItem());
	public static final RegistryObject<Item> MEJORA_DE_MADERA = REGISTRY.register("mejora_de_madera", () -> new MejoraDeMaderaItem());
	public static final RegistryObject<Item> MEJORA_DE_PIEDRA = REGISTRY.register("mejora_de_piedra", () -> new MejoraDePiedraItem());
	public static final RegistryObject<Item> MEJORA_DE_BRONCE = REGISTRY.register("mejora_de_bronce", () -> new MejoraDeBronceItem());
	public static final RegistryObject<Item> MEJORA_DE_PLATA = REGISTRY.register("mejora_de_plata", () -> new MejoraDePlataItem());
	public static final RegistryObject<Item> MEJORA_DE_ORO = REGISTRY.register("mejora_de_oro", () -> new MejoraDeOroItem());
	public static final RegistryObject<Item> MEJORA_DE_SUGGAR = REGISTRY.register("mejora_de_suggar", () -> new MejoraDeSuggarItem());
}
