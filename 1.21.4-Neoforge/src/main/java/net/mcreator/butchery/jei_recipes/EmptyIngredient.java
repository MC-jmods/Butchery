package net.mcreator.butchery.jei_recipes;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.common.crafting.IngredientType;
import net.neoforged.neoforge.common.crafting.ICustomIngredient;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.crafting.display.SlotDisplay;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.Holder;

import java.util.stream.Stream;

import com.mojang.serialization.MapCodec;

@EventBusSubscriber(modid = "butchery", bus = EventBusSubscriber.Bus.MOD)
public class EmptyIngredient implements ICustomIngredient {
	public static final EmptyIngredient INSTANCE = new EmptyIngredient();
	public static final MapCodec<EmptyIngredient> CODEC = MapCodec.unit(INSTANCE);
	public static final StreamCodec<RegistryFriendlyByteBuf, EmptyIngredient> STREAM_CODEC = StreamCodec.unit(INSTANCE);
	public static final IngredientType<EmptyIngredient> TYPE = new IngredientType<>(CODEC, STREAM_CODEC);

	private EmptyIngredient() {
	}

	@Override
	public Stream<Holder<Item>> items() {
		return Stream.of(Items.AIR.builtInRegistryHolder());
	}

	@Override
	public boolean test(ItemStack stack) {
		return false;
	}

	@Override
	public boolean isSimple() {
		return true;
	}

	@Override
	public IngredientType<?> getType() {
		return TYPE;
	}

	@Override
	public SlotDisplay display() {
		return SlotDisplay.Empty.INSTANCE;
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof EmptyIngredient;
	}

	@Override
	public int hashCode() {
		return EmptyIngredient.class.hashCode();
	}

	@Override
	public String toString() {
		return "EmptyIngredient";
	}

	public static Ingredient create() {
		return new Ingredient(INSTANCE);
	}

	@SubscribeEvent
	public static void registerIngredientType(RegisterEvent event) {
		if (event.getRegistryKey().equals(NeoForgeRegistries.Keys.INGREDIENT_TYPES)) {
			event.register(NeoForgeRegistries.Keys.INGREDIENT_TYPES, ResourceLocation.fromNamespaceAndPath("butchery", "empty"), () -> TYPE);
		}
	}
}