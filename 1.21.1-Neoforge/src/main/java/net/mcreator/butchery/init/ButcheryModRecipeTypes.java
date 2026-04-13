package net.mcreator.butchery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.butchery.jei_recipes.TaxidermyRecipe;
import net.mcreator.butchery.jei_recipes.PestleandmortarrecipetypeRecipe;
import net.mcreator.butchery.jei_recipes.MeatgrinderjeiRecipe;
import net.mcreator.butchery.ButcheryMod;

@EventBusSubscriber(modid = ButcheryMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ButcheryModRecipeTypes {
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, "butchery");
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, "butchery");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = ModList.get().getModContainerById("butchery").get().getEventBus();
		event.enqueueWork(() -> {
			RECIPE_TYPES.register(bus);
			SERIALIZERS.register(bus);
			RECIPE_TYPES.register("taxidermy", () -> TaxidermyRecipe.Type.INSTANCE);
			SERIALIZERS.register("taxidermy", () -> TaxidermyRecipe.Serializer.INSTANCE);
			RECIPE_TYPES.register("meatgrinderjei", () -> MeatgrinderjeiRecipe.Type.INSTANCE);
			SERIALIZERS.register("meatgrinderjei", () -> MeatgrinderjeiRecipe.Serializer.INSTANCE);
			RECIPE_TYPES.register("pestleandmortarrecipetype", () -> PestleandmortarrecipetypeRecipe.Type.INSTANCE);
			SERIALIZERS.register("pestleandmortarrecipetype", () -> PestleandmortarrecipetypeRecipe.Serializer.INSTANCE);
		});
	}
}