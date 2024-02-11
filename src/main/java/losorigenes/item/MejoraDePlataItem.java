
package losorigenes.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import losorigenes.init.LosOrigenesModTabs;

import java.util.List;

public class MejoraDePlataItem extends Item {
	public MejoraDePlataItem() {
		super(new Item.Properties().tab(LosOrigenesModTabs.TAB_LOS_ORIGENES).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Se obtiene al comprar la Mejora De Plata"));
	}
}
