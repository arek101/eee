package net.mcreator.fuftest;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

@Elementsfuftest.ModElement.Tag
public class MCreatorWwwwwwwwwwww extends Elementsfuftest.ModElement {
	public MCreatorWwwwwwwwwwww(Elementsfuftest instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwwwwwwwwwwww") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.SMOOTH_RED_SANDSTONE_SLAB, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
