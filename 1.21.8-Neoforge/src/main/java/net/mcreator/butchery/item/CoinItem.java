package net.mcreator.butchery.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.client.multiplayer.ClientLevel;

import net.mcreator.butchery.procedures.CoinpropertyvalueproviderProcedure;

import javax.annotation.Nullable;

import java.util.function.Consumer;

import com.mojang.serialization.MapCodec;

public class CoinItem extends Item {
	public CoinItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.butchery.coin.description_0"));
		componentConsumer.accept(Component.translatable("item.butchery.coin.description_1"));
	}

	public record AmountProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<AmountProperty> MAP_CODEC = MapCodec.unit(new AmountProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable LivingEntity entity, int seed) {
			return (float) CoinpropertyvalueproviderProcedure.execute(itemStackToRender);
		}

		@Override
		public MapCodec<AmountProperty> type() {
			return MAP_CODEC;
		}
	}
}