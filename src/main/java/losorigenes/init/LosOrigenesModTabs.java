
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package losorigenes.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LosOrigenesModTabs {
	public static CreativeModeTab TAB_LOS_ORIGENES;

	public static void load() {
		TAB_LOS_ORIGENES = new CreativeModeTab("tablos_origenes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LosOrigenesModItems.LOGO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
