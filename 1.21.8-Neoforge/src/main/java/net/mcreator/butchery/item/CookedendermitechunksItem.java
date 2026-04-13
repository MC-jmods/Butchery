package net.mcreator.butchery.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.client.multiplayer.ClientLevel;

import net.mcreator.butchery.procedures.RawendermitechunksPropertyValueProviderProcedure;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

public class CookedendermitechunksItem extends Item {
	public CookedendermitechunksItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.3f).build()));
	}

	public record MultipleProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<MultipleProperty> MAP_CODEC = MapCodec.unit(new MultipleProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable LivingEntity entity, int seed) {
			return (float) RawendermitechunksPropertyValueProviderProcedure.execute(itemStackToRender);
		}

		@Override
		public MapCodec<MultipleProperty> type() {
			return MAP_CODEC;
		}
	}
}