package net.mcreator.butchery.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.client.multiplayer.ClientLevel;

import net.mcreator.butchery.procedures.SpongepropertyvalueproviderProcedure;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

public class SpongeItem extends Item {
	public SpongeItem(Item.Properties properties) {
		super(properties.durability(4062));
	}

	public record WetnessProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<WetnessProperty> MAP_CODEC = MapCodec.unit(new WetnessProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable LivingEntity entity, int seed) {
			return (float) SpongepropertyvalueproviderProcedure.execute(itemStackToRender);
		}

		@Override
		public MapCodec<WetnessProperty> type() {
			return MAP_CODEC;
		}
	}
}