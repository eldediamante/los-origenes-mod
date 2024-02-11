
package losorigenes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import losorigenes.init.LosOrigenesModTabs;

public class LogoItem extends Item {
	public LogoItem() {
		super(new Item.Properties().tab(LosOrigenesModTabs.TAB_LOS_ORIGENES).stacksTo(64).rarity(Rarity.COMMON));
	}
}
