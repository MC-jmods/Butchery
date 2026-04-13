package net.mcreator.butchery.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.mcreator.butchery.jei_recipes.TaxidermyRecipe;
import net.mcreator.butchery.jei_recipes.PestleandmortarrecipetypeRecipe;
import net.mcreator.butchery.jei_recipes.MeatgrinderjeiRecipe;
import net.mcreator.butchery.ButcheryMod;

@Mod.EventBusSubscriber(modid = ButcheryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ButcheryModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "butchery");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("taxidermy", () -> TaxidermyRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("meatgrinderjei", () -> MeatgrinderjeiRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("pestleandmortarrecipetype", () -> PestleandmortarrecipetypeRecipe.Serializer.INSTANCE);
		});
	}
}