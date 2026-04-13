package net.mcreator.butchery.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.client.multiplayer.ClientLevel;

import net.mcreator.butchery.procedures.MagmachunksPropertyValueProviderProcedure;
import net.mcreator.butchery.procedures.MagmachunksPlayerFinishesUsingItemProcedure;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

public class MagmachunksItem extends Item {
	public MagmachunksItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(0.3f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		MagmachunksPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}

	public record MultipleProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<MultipleProperty> MAP_CODEC = MapCodec.unit(new MultipleProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable LivingEntity entity, int seed) {
			return (float) MagmachunksPropertyValueProviderProcedure.execute(itemStackToRender);
		}

		@Override
		public MapCodec<MultipleProperty> type() {
			return MAP_CODEC;
		}
	}
}