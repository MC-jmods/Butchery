/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.butchery.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class ButcheryModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelspit_roast.LAYER_LOCATION, Modelspit_roast::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_9.LAYER_LOCATION, Modelender_dragon_cut_9::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon.LAYER_LOCATION, Modelender_dragon::createBodyLayer);
		event.registerLayerDefinition(ModelPillager_Disguise.LAYER_LOCATION, ModelPillager_Disguise::createBodyLayer);
		event.registerLayerDefinition(Modelshell_boat.LAYER_LOCATION, Modelshell_boat::createBodyLayer);
		event.registerLayerDefinition(Modelvindicator_disguise.LAYER_LOCATION, Modelvindicator_disguise::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_8.LAYER_LOCATION, Modelender_dragon_cut_8::createBodyLayer);
		event.registerLayerDefinition(Modelravager.LAYER_LOCATION, Modelravager::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_13.LAYER_LOCATION, Modelender_dragon_cut_13::createBodyLayer);
		event.registerLayerDefinition(Modelwolf_fur_suit.LAYER_LOCATION, Modelwolf_fur_suit::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_6.LAYER_LOCATION, Modelender_dragon_cut_6::createBodyLayer);
		event.registerLayerDefinition(Modelpiglin_brute_disguise.LAYER_LOCATION, Modelpiglin_brute_disguise::createBodyLayer);
		event.registerLayerDefinition(Modelstray_necklace.LAYER_LOCATION, Modelstray_necklace::createBodyLayer);
		event.registerLayerDefinition(Modelbloody_butcher_apron.LAYER_LOCATION, Modelbloody_butcher_apron::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_14.LAYER_LOCATION, Modelender_dragon_cut_14::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_7.LAYER_LOCATION, Modelender_dragon_cut_7::createBodyLayer);
		event.registerLayerDefinition(Modelsniffer_carcass.LAYER_LOCATION, Modelsniffer_carcass::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_11.LAYER_LOCATION, Modelender_dragon_cut_11::createBodyLayer);
		event.registerLayerDefinition(Modelwitch_clothes.LAYER_LOCATION, Modelwitch_clothes::createBodyLayer);
		event.registerLayerDefinition(Modelwither.LAYER_LOCATION, Modelwither::createBodyLayer);
		event.registerLayerDefinition(Modeldragon_armor.LAYER_LOCATION, Modeldragon_armor::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_4.LAYER_LOCATION, Modelender_dragon_cut_4::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_5.LAYER_LOCATION, Modelender_dragon_cut_5::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_12.LAYER_LOCATION, Modelender_dragon_cut_12::createBodyLayer);
		event.registerLayerDefinition(Modelunknown.LAYER_LOCATION, Modelunknown::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_2.LAYER_LOCATION, Modelender_dragon_cut_2::createBodyLayer);
		event.registerLayerDefinition(Modelevoker_disguise.LAYER_LOCATION, Modelevoker_disguise::createBodyLayer);
		event.registerLayerDefinition(Modelturtle_shell_chestplate.LAYER_LOCATION, Modelturtle_shell_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_10.LAYER_LOCATION, Modelender_dragon_cut_10::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_headless.LAYER_LOCATION, Modelender_dragon_headless::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_3.LAYER_LOCATION, Modelender_dragon_cut_3::createBodyLayer);
		event.registerLayerDefinition(Modelbutcher_apron.LAYER_LOCATION, Modelbutcher_apron::createBodyLayer);
		event.registerLayerDefinition(Modelplayer_corpse.LAYER_LOCATION, Modelplayer_corpse::createBodyLayer);
		event.registerLayerDefinition(Modelender_dragon_cut_1.LAYER_LOCATION, Modelender_dragon_cut_1::createBodyLayer);
		event.registerLayerDefinition(Modelenderman.LAYER_LOCATION, Modelenderman::createBodyLayer);
		event.registerLayerDefinition(Modelwitch_disguise.LAYER_LOCATION, Modelwitch_disguise::createBodyLayer);
		event.registerLayerDefinition(Modelcash_register.LAYER_LOCATION, Modelcash_register::createBodyLayer);
		event.registerLayerDefinition(Modelwarden_carcass.LAYER_LOCATION, Modelwarden_carcass::createBodyLayer);
		event.registerLayerDefinition(Modelhanging_enderman.LAYER_LOCATION, Modelhanging_enderman::createBodyLayer);
		event.registerLayerDefinition(ModelEvokerDisguise.LAYER_LOCATION, ModelEvokerDisguise::createBodyLayer);
		event.registerLayerDefinition(Modelelder_guardian.LAYER_LOCATION, Modelelder_guardian::createBodyLayer);
	}
}