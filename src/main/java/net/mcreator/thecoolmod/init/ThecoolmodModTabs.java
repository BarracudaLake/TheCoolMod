
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecoolmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ThecoolmodModTabs {
	public static CreativeModeTab TAB_THE_COOL_MOD;

	public static void load() {
		TAB_THE_COOL_MOD = new CreativeModeTab("tabthe_cool_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ThecoolmodModBlocks.TEST_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
