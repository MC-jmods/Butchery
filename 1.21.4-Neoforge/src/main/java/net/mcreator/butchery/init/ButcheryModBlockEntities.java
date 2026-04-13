/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.butchery.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.butchery.block.entity.ZombievillagercorpseBlockEntity;
import net.mcreator.butchery.block.entity.ZombiepiglincorpseBlockEntity;
import net.mcreator.butchery.block.entity.ZombiehorseheadmountBlockEntity;
import net.mcreator.butchery.block.entity.ZombiehorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.ZombiecorpseBlockEntity;
import net.mcreator.butchery.block.entity.ZoglincarcassBlockEntity;
import net.mcreator.butchery.block.entity.WoodenspitrotisserieBlockEntity;
import net.mcreator.butchery.block.entity.WolfskeletonBlockEntity;
import net.mcreator.butchery.block.entity.WolfcarcassBlockEntity;
import net.mcreator.butchery.block.entity.WitherskeletoncorpseBlockEntity;
import net.mcreator.butchery.block.entity.WithercarcassBlockEntity;
import net.mcreator.butchery.block.entity.WitchcorpseBlockEntity;
import net.mcreator.butchery.block.entity.WhitecatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.WhiteLlamaCarcassBlockEntity;
import net.mcreator.butchery.block.entity.WarpedbutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.WarpedbutcherdisplayBlockEntity;
import net.mcreator.butchery.block.entity.WardencarcassBlockEntity;
import net.mcreator.butchery.block.entity.VindicatorcorpseBlockEntity;
import net.mcreator.butchery.block.entity.VillagercorpseBlockEntity;
import net.mcreator.butchery.block.entity.TurtlecarcassBlockEntity;
import net.mcreator.butchery.block.entity.TaxidermytableBlockEntity;
import net.mcreator.butchery.block.entity.TabbycatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.StridercarcassBlockEntity;
import net.mcreator.butchery.block.entity.StraycorpseBlockEntity;
import net.mcreator.butchery.block.entity.SquidcarcassBlockEntity;
import net.mcreator.butchery.block.entity.SprucebutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.SpruceButcherdisplayBlockEntity;
import net.mcreator.butchery.block.entity.SpidercarcassBlockEntity;
import net.mcreator.butchery.block.entity.SnowfoxcarcassBlockEntity;
import net.mcreator.butchery.block.entity.SniffercarcassblockBlockEntity;
import net.mcreator.butchery.block.entity.SkinrackBlockEntity;
import net.mcreator.butchery.block.entity.SkeletonhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.SkeletoncorpseBlockEntity;
import net.mcreator.butchery.block.entity.SkeletonBlockEntity;
import net.mcreator.butchery.block.entity.SiamesecatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.SheepskeletonBlockEntity;
import net.mcreator.butchery.block.entity.SheepcarcassBlockEntity;
import net.mcreator.butchery.block.entity.RepairedIrongolemlegsBlockEntity;
import net.mcreator.butchery.block.entity.RepairedIrongolemheadBlockEntity;
import net.mcreator.butchery.block.entity.RepairedIrongolembodyBlockEntity;
import net.mcreator.butchery.block.entity.RepairedIrongolemarmsBlockEntity;
import net.mcreator.butchery.block.entity.RepairedIrongolemBlockEntity;
import net.mcreator.butchery.block.entity.RegularblackhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.RegularWhitehorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.RegularGrayhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.RegularDarkbrownhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.RegularCreamyhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.RegularChestnuthorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.RegularBrownhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.RedmooshroomcarcassBlockEntity;
import net.mcreator.butchery.block.entity.RedcatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.RavagerBlockEntity;
import net.mcreator.butchery.block.entity.RagdollcatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.RabbitcarcassBlockEntity;
import net.mcreator.butchery.block.entity.PolarbearskeletonBlockEntity;
import net.mcreator.butchery.block.entity.PolarbearcarcassBlockEntity;
import net.mcreator.butchery.block.entity.PlayercorpseBlockEntity;
import net.mcreator.butchery.block.entity.PillagercorpseBlockEntity;
import net.mcreator.butchery.block.entity.PigskeletonBlockEntity;
import net.mcreator.butchery.block.entity.PiglinskeletonBlockEntity;
import net.mcreator.butchery.block.entity.PiglincorpseBlockEntity;
import net.mcreator.butchery.block.entity.PiglinbrutecorpseBlockEntity;
import net.mcreator.butchery.block.entity.PigheadBlockEntity;
import net.mcreator.butchery.block.entity.PigcarcassBlockEntity;
import net.mcreator.butchery.block.entity.PhantomskeletonBlockEntity;
import net.mcreator.butchery.block.entity.PhantomcarcassBlockEntity;
import net.mcreator.butchery.block.entity.PestleandmortarBlockEntity;
import net.mcreator.butchery.block.entity.PersiancatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.PandaskeletonBlockEntity;
import net.mcreator.butchery.block.entity.PandacarcassBlockEntity;
import net.mcreator.butchery.block.entity.OrangefrogcarcassBlockEntity;
import net.mcreator.butchery.block.entity.OcelotskeletonBlockEntity;
import net.mcreator.butchery.block.entity.OcelotcarcassBlockEntity;
import net.mcreator.butchery.block.entity.OakbutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.OakbutcherdisplayBlockEntity;
import net.mcreator.butchery.block.entity.MuleskeletonBlockEntity;
import net.mcreator.butchery.block.entity.MuleheadmountBlockEntity;
import net.mcreator.butchery.block.entity.MulecarcassBlockEntity;
import net.mcreator.butchery.block.entity.MooshroomskeletonBlockEntity;
import net.mcreator.butchery.block.entity.MetaltrayBlockEntity;
import net.mcreator.butchery.block.entity.MetalbutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.MediummagmacubecarcassBlockEntity;
import net.mcreator.butchery.block.entity.MeatgrinderBlockEntity;
import net.mcreator.butchery.block.entity.MangrovebutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.MagmacubecarcassBlockEntity;
import net.mcreator.butchery.block.entity.LlamaskeletonBlockEntity;
import net.mcreator.butchery.block.entity.JunglebutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.JunglebutcherdisplayBlockEntity;
import net.mcreator.butchery.block.entity.JelliecatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.IrongolemlegsBlockEntity;
import net.mcreator.butchery.block.entity.IrongolemheadBlockEntity;
import net.mcreator.butchery.block.entity.IrongolembodyBlockEntity;
import net.mcreator.butchery.block.entity.IrongolemarmsBlockEntity;
import net.mcreator.butchery.block.entity.IrongolemBlockEntity;
import net.mcreator.butchery.block.entity.HuskcorpseBlockEntity;
import net.mcreator.butchery.block.entity.HoglinskeletonBlockEntity;
import net.mcreator.butchery.block.entity.HoglincarcassBlockEntity;
import net.mcreator.butchery.block.entity.HangingendermancarcassBlockEntity;
import net.mcreator.butchery.block.entity.HangingdrainedendermancarcassBlockEntity;
import net.mcreator.butchery.block.entity.GuardiancarcassBlockEntity;
import net.mcreator.butchery.block.entity.GreenfrogcarcassBlockEntity;
import net.mcreator.butchery.block.entity.GrayllamacarcassBlockEntity;
import net.mcreator.butchery.block.entity.GrayfrogcarcassBlockEntity;
import net.mcreator.butchery.block.entity.GoatskeletonBlockEntity;
import net.mcreator.butchery.block.entity.GoatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.GlowsquidcarcassBlockEntity;
import net.mcreator.butchery.block.entity.FreezerBlockEntity;
import net.mcreator.butchery.block.entity.FoxskeletonBlockEntity;
import net.mcreator.butchery.block.entity.FoxcarcassBlockEntity;
import net.mcreator.butchery.block.entity.EvokercorpseBlockEntity;
import net.mcreator.butchery.block.entity.EndermancarcassBlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut9BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut8BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut7BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut6BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut5BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut4BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut3BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut2BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut1BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut14BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut13BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut12BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut11BlockEntity;
import net.mcreator.butchery.block.entity.Enderdragoncut10BlockEntity;
import net.mcreator.butchery.block.entity.EnderdragoncarcassheadlessBlockEntity;
import net.mcreator.butchery.block.entity.EnderdragoncarcassBlockEntity;
import net.mcreator.butchery.block.entity.ElderguardiancarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrownedcorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedzombievillagerBlockEntity;
import net.mcreator.butchery.block.entity.DrainedzombiecorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedzoglincarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedwitchcorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedvillagerBlockEntity;
import net.mcreator.butchery.block.entity.DrainedstridercarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedsniffercarcassblockBlockEntity;
import net.mcreator.butchery.block.entity.DrainedredmooshroomcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedrabbitcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedplayercorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedpiglincorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedpigcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedphantomcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedpandacarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedocelotcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedmulecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedhuskcorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedhoglincarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedguardiancarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedgoatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedfoxcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedevokercorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedendermancarcassBlockEntity;
import net.mcreator.butchery.block.entity.DraineddrownedcorpseBlockEntity;
import net.mcreator.butchery.block.entity.DraineddonkeycarcassBlockEntity;
import net.mcreator.butchery.block.entity.DraineddolphincarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedcreepercarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedcowcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedchickencarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedcamelcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedbrownmooshroomcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedbrownllamacarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedblackcatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedbatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedallblackcatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedZombiepiglincorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedZombiehorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedWolfcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedWhitellamacarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedWhitehorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedWhitecatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedVindicatorcorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedTurtlecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedTabbycatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedSnowfoxcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedSiamesecatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedSheepcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedRegularblackhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedRegularDarkbrownhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedRegularCreamyhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedRegularChestnuthorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedRegularBrownhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedRedcatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedRagdollcatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedPolarbearcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedPillagercorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedPiglinbrutecorpseBlockEntity;
import net.mcreator.butchery.block.entity.DrainedPersiancatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedJelliecatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedGrayllamacarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedGrayhorsecarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedCreamyllamacarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedCalicocatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DrainedBritishshorthaircatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.DonkeyskeletonBlockEntity;
import net.mcreator.butchery.block.entity.DonkeycarcassBlockEntity;
import net.mcreator.butchery.block.entity.DolphinskeletonBlockEntity;
import net.mcreator.butchery.block.entity.DolphincarcassBlockEntity;
import net.mcreator.butchery.block.entity.DarkoakbutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.DarkoakbutcherdisplayBlockEntity;
import net.mcreator.butchery.block.entity.CrimsonbutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.CrimsonbutcherdisplayBlockEntity;
import net.mcreator.butchery.block.entity.CreeperskeletonBlockEntity;
import net.mcreator.butchery.block.entity.CreepercarcassBlockEntity;
import net.mcreator.butchery.block.entity.CreamyllamacarcassBlockEntity;
import net.mcreator.butchery.block.entity.CowskeletonBlockEntity;
import net.mcreator.butchery.block.entity.CowcarcassBlockEntity;
import net.mcreator.butchery.block.entity.ChickenskeletonBlockEntity;
import net.mcreator.butchery.block.entity.ChickencarcassBlockEntity;
import net.mcreator.butchery.block.entity.CavespidercarcassBlockEntity;
import net.mcreator.butchery.block.entity.CatskeletonBlockEntity;
import net.mcreator.butchery.block.entity.CatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.CashregisterblockBlockEntity;
import net.mcreator.butchery.block.entity.CamelskeletonBlockEntity;
import net.mcreator.butchery.block.entity.CamelcarcassBlockEntity;
import net.mcreator.butchery.block.entity.CalicocatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.BrownmooshroomcarcassBlockEntity;
import net.mcreator.butchery.block.entity.BrownllamacarcassBlockEntity;
import net.mcreator.butchery.block.entity.BritishshorthaircatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.BrainBlockEntity;
import net.mcreator.butchery.block.entity.BloodpuddleBlockEntity;
import net.mcreator.butchery.block.entity.BloodgrateBlockEntity;
import net.mcreator.butchery.block.entity.BlackcatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.BirchbutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.BirchbutcherdisplayBlockEntity;
import net.mcreator.butchery.block.entity.BatskeletonBlockEntity;
import net.mcreator.butchery.block.entity.BatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.BasinBlockEntity;
import net.mcreator.butchery.block.entity.AllblackcatcarcassBlockEntity;
import net.mcreator.butchery.block.entity.AcaciabutcherstableBlockEntity;
import net.mcreator.butchery.block.entity.AcaciabutcherdisplayBlockEntity;
import net.mcreator.butchery.ButcheryMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ButcheryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ButcheryMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OakbutcherstableBlockEntity>> OAK_BUTCHERS_TABLE = register("oak_butchers_table", ButcheryModBlocks.OAK_BUTCHERS_TABLE, OakbutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AcaciabutcherstableBlockEntity>> ACACIA_BUTCHERS_TABLE = register("acacia_butchers_table", ButcheryModBlocks.ACACIA_BUTCHERS_TABLE, AcaciabutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BirchbutcherstableBlockEntity>> BIRCH_BUTCHERS_TABLE = register("birch_butchers_table", ButcheryModBlocks.BIRCH_BUTCHERS_TABLE, BirchbutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CrimsonbutcherstableBlockEntity>> CRIMSON_BUTCHERS_TABLE = register("crimson_butchers_table", ButcheryModBlocks.CRIMSON_BUTCHERS_TABLE, CrimsonbutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkoakbutcherstableBlockEntity>> DARK_OAK_BUTCHERS_TABLE = register("dark_oak_butchers_table", ButcheryModBlocks.DARK_OAK_BUTCHERS_TABLE,
			DarkoakbutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<JunglebutcherstableBlockEntity>> JUNGLE_BUTCHERS_TABLE = register("jungle_butchers_table", ButcheryModBlocks.JUNGLE_BUTCHERS_TABLE, JunglebutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MangrovebutcherstableBlockEntity>> MANGROVE_BUTCHERS_TABLE = register("mangrove_butchers_table", ButcheryModBlocks.MANGROVE_BUTCHERS_TABLE,
			MangrovebutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SprucebutcherstableBlockEntity>> SPRUCE_BUTCHERS_TABLE = register("spruce_butchers_table", ButcheryModBlocks.SPRUCE_BUTCHERS_TABLE, SprucebutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WarpedbutcherstableBlockEntity>> WARPED_BUTCHERS_TABLE = register("warped_butchers_table", ButcheryModBlocks.WARPED_BUTCHERS_TABLE, WarpedbutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetalbutcherstableBlockEntity>> METAL_BUTCHERS_TABLE = register("metal_butchers_table", ButcheryModBlocks.METAL_BUTCHERS_TABLE, MetalbutcherstableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BloodgrateBlockEntity>> BLOOD_GRATE = register("blood_grate", ButcheryModBlocks.BLOOD_GRATE, BloodgrateBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MeatgrinderBlockEntity>> MEAT_GRINDER = register("meat_grinder", ButcheryModBlocks.MEAT_GRINDER, MeatgrinderBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SkinrackBlockEntity>> SKIN_RACK = register("skin_rack", ButcheryModBlocks.SKIN_RACK, SkinrackBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BasinBlockEntity>> BASIN = register("basin", ButcheryModBlocks.BASIN, BasinBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BloodpuddleBlockEntity>> BLOOD_PUDDLE = register("blood_puddle", ButcheryModBlocks.BLOOD_PUDDLE, BloodpuddleBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PigcarcassBlockEntity>> PIG_CARCASS = register("pig_carcass", ButcheryModBlocks.PIG_CARCASS, PigcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PigheadBlockEntity>> PIG_HEAD = register("pig_head", ButcheryModBlocks.PIG_HEAD, PigheadBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedpigcarcassBlockEntity>> DRAINED_PIG_CARCASS = register("drained_pig_carcass", ButcheryModBlocks.DRAINED_PIG_CARCASS, DrainedpigcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedcowcarcassBlockEntity>> DRAINED_COW_CARCASS = register("drained_cow_carcass", ButcheryModBlocks.DRAINED_COW_CARCASS, DrainedcowcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CowcarcassBlockEntity>> COW_CARCASS = register("cow_carcass", ButcheryModBlocks.COW_CARCASS, CowcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SheepcarcassBlockEntity>> SHEEP_CARCASS = register("sheep_carcass", ButcheryModBlocks.SHEEP_CARCASS, SheepcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedSheepcarcassBlockEntity>> DRAINED_SHEEP_CARCASS = register("drained_sheep_carcass", ButcheryModBlocks.DRAINED_SHEEP_CARCASS, DrainedSheepcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ChickencarcassBlockEntity>> CHICKEN_CARCASS = register("chicken_carcass", ButcheryModBlocks.CHICKEN_CARCASS, ChickencarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedchickencarcassBlockEntity>> DRAINED_CHICKEN_CARCASS = register("drained_chicken_carcass", ButcheryModBlocks.DRAINED_CHICKEN_CARCASS,
			DrainedchickencarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BatcarcassBlockEntity>> BAT_CARCASS = register("bat_carcass", ButcheryModBlocks.BAT_CARCASS, BatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedbatcarcassBlockEntity>> DRAINED_BAT_CARCASS = register("drained_bat_carcass", ButcheryModBlocks.DRAINED_BAT_CARCASS, DrainedbatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DolphincarcassBlockEntity>> DOLPHIN_CARCASS = register("dolphin_carcass", ButcheryModBlocks.DOLPHIN_CARCASS, DolphincarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DraineddolphincarcassBlockEntity>> DRAINED_DOLPHIN_CARCASS = register("drained_dolphin_carcass", ButcheryModBlocks.DRAINED_DOLPHIN_CARCASS,
			DraineddolphincarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GlowsquidcarcassBlockEntity>> GLOW_SQUID_CARCASS = register("glow_squid_carcass", ButcheryModBlocks.GLOW_SQUID_CARCASS, GlowsquidcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SquidcarcassBlockEntity>> SQUID_CARCASS = register("squid_carcass", ButcheryModBlocks.SQUID_CARCASS, SquidcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GoatcarcassBlockEntity>> GOAT_CARCASS = register("goat_carcass", ButcheryModBlocks.GOAT_CARCASS, GoatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedgoatcarcassBlockEntity>> DRAINED_GOAT_CARCASS = register("drained_goat_carcass", ButcheryModBlocks.DRAINED_GOAT_CARCASS, DrainedgoatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RedmooshroomcarcassBlockEntity>> RED_MOOSHROOM_CARCASS = register("red_mooshroom_carcass", ButcheryModBlocks.RED_MOOSHROOM_CARCASS, RedmooshroomcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedredmooshroomcarcassBlockEntity>> DRAINED_RED_MOOSHROOM_CARCASS = register("drained_red_mooshroom_carcass", ButcheryModBlocks.DRAINED_RED_MOOSHROOM_CARCASS,
			DrainedredmooshroomcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BrownmooshroomcarcassBlockEntity>> BROWN_MOOSHROOM_CARCASS = register("brown_mooshroom_carcass", ButcheryModBlocks.BROWN_MOOSHROOM_CARCASS,
			BrownmooshroomcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedbrownmooshroomcarcassBlockEntity>> DRAINED_BROWN_MOOSHROOM_CARCASS = register("drained_brown_mooshroom_carcass", ButcheryModBlocks.DRAINED_BROWN_MOOSHROOM_CARCASS,
			DrainedbrownmooshroomcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OcelotcarcassBlockEntity>> OCELOT_CARCASS = register("ocelot_carcass", ButcheryModBlocks.OCELOT_CARCASS, OcelotcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedocelotcarcassBlockEntity>> DRAINED_OCELOT_CARCASS = register("drained_ocelot_carcass", ButcheryModBlocks.DRAINED_OCELOT_CARCASS, DrainedocelotcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CamelcarcassBlockEntity>> CAMEL_CARCASS = register("camel_carcass", ButcheryModBlocks.CAMEL_CARCASS, CamelcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedcamelcarcassBlockEntity>> DRAINED_CAMEL_CARCASS = register("drained_camel_carcass", ButcheryModBlocks.DRAINED_CAMEL_CARCASS, DrainedcamelcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CavespidercarcassBlockEntity>> CAVE_SPIDER_CARCASS = register("cave_spider_carcass", ButcheryModBlocks.CAVE_SPIDER_CARCASS, CavespidercarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SpidercarcassBlockEntity>> SPIDER_CARCASS = register("spider_carcass", ButcheryModBlocks.SPIDER_CARCASS, SpidercarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CreepercarcassBlockEntity>> CREEPER_CARCASS = register("creeper_carcass", ButcheryModBlocks.CREEPER_CARCASS, CreepercarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedcreepercarcassBlockEntity>> DRAINED_CREEPER_CARCASS = register("drained_creeper_carcass", ButcheryModBlocks.DRAINED_CREEPER_CARCASS,
			DrainedcreepercarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DonkeycarcassBlockEntity>> DONKEY_CARCASS = register("donkey_carcass", ButcheryModBlocks.DONKEY_CARCASS, DonkeycarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DraineddonkeycarcassBlockEntity>> DRAINED_DONKEY_CARCASS = register("drained_donkey_carcass", ButcheryModBlocks.DRAINED_DONKEY_CARCASS, DraineddonkeycarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MulecarcassBlockEntity>> MULE_CARCASS = register("mule_carcass", ButcheryModBlocks.MULE_CARCASS, MulecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedmulecarcassBlockEntity>> DRAINED_MULE_CARCASS = register("drained_mule_carcass", ButcheryModBlocks.DRAINED_MULE_CARCASS, DrainedmulecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrownedcorpseBlockEntity>> DROWNED_CORPSE = register("drowned_corpse", ButcheryModBlocks.DROWNED_CORPSE, DrownedcorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DraineddrownedcorpseBlockEntity>> DRAINED_DROWNED_CORPSE = register("drained_drowned_corpse", ButcheryModBlocks.DRAINED_DROWNED_CORPSE, DraineddrownedcorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedhuskcorpseBlockEntity>> DRAINED_HUSK_CORPSE = register("drained_husk_corpse", ButcheryModBlocks.DRAINED_HUSK_CORPSE, DrainedhuskcorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<HuskcorpseBlockEntity>> HUSK_CORPSE = register("husk_corpse", ButcheryModBlocks.HUSK_CORPSE, HuskcorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ZombiecorpseBlockEntity>> ZOMBIE_CORPSE = register("zombie_corpse", ButcheryModBlocks.ZOMBIE_CORPSE, ZombiecorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedzombiecorpseBlockEntity>> DRAINED_ZOMBIE_CORPSE = register("drained_zombie_corpse", ButcheryModBlocks.DRAINED_ZOMBIE_CORPSE, DrainedzombiecorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EvokercorpseBlockEntity>> EVOKER_CORPSE = register("evoker_corpse", ButcheryModBlocks.EVOKER_CORPSE, EvokercorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FoxcarcassBlockEntity>> FOX_CARCASS = register("fox_carcass", ButcheryModBlocks.FOX_CARCASS, FoxcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedfoxcarcassBlockEntity>> DRAINED_FOX_CARCASS = register("drained_fox_carcass", ButcheryModBlocks.DRAINED_FOX_CARCASS, DrainedfoxcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SnowfoxcarcassBlockEntity>> SNOW_FOX_CARCASS = register("snow_fox_carcass", ButcheryModBlocks.SNOW_FOX_CARCASS, SnowfoxcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedSnowfoxcarcassBlockEntity>> DRAINED_SNOWFOX_CARCASS = register("drained_snowfox_carcass", ButcheryModBlocks.DRAINED_SNOWFOX_CARCASS,
			DrainedSnowfoxcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GuardiancarcassBlockEntity>> GUARDIAN_CARCASS = register("guardian_carcass", ButcheryModBlocks.GUARDIAN_CARCASS, GuardiancarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedguardiancarcassBlockEntity>> DRAINED_GUARDIAN_CARCASS = register("drained_guardian_carcass", ButcheryModBlocks.DRAINED_GUARDIAN_CARCASS,
			DrainedguardiancarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<HoglincarcassBlockEntity>> HOGLIN_CARCASS = register("hoglin_carcass", ButcheryModBlocks.HOGLIN_CARCASS, HoglincarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedhoglincarcassBlockEntity>> DRAINED_HOGLIN_CARCASS = register("drained_hoglin_carcass", ButcheryModBlocks.DRAINED_HOGLIN_CARCASS, DrainedhoglincarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PandacarcassBlockEntity>> PANDA_CARCASS = register("panda_carcass", ButcheryModBlocks.PANDA_CARCASS, PandacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedpandacarcassBlockEntity>> DRAINED_PANDA_CARCASS = register("drained_panda_carcass", ButcheryModBlocks.DRAINED_PANDA_CARCASS, DrainedpandacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PiglincorpseBlockEntity>> PIGLIN_CORPSE = register("piglin_corpse", ButcheryModBlocks.PIGLIN_CORPSE, PiglincorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedpiglincorpseBlockEntity>> DRAINED_PIGLIN_CORPSE = register("drained_piglin_corpse", ButcheryModBlocks.DRAINED_PIGLIN_CORPSE, DrainedpiglincorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PiglinbrutecorpseBlockEntity>> PIGLIN_BRUTE_CORPSE = register("piglin_brute_corpse", ButcheryModBlocks.PIGLIN_BRUTE_CORPSE, PiglinbrutecorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedPiglinbrutecorpseBlockEntity>> DRAINED_PIGLIN_BRUTE_CORPSE = register("drained_piglin_brute_corpse", ButcheryModBlocks.DRAINED_PIGLIN_BRUTE_CORPSE,
			DrainedPiglinbrutecorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedevokercorpseBlockEntity>> DRAINED_EVOKER_CORPSE = register("drained_evoker_corpse", ButcheryModBlocks.DRAINED_EVOKER_CORPSE, DrainedevokercorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PillagercorpseBlockEntity>> PILLAGER_CORPSE = register("pillager_corpse", ButcheryModBlocks.PILLAGER_CORPSE, PillagercorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedPillagercorpseBlockEntity>> DRAINED_PILLAGER_CORPSE = register("drained_pillager_corpse", ButcheryModBlocks.DRAINED_PILLAGER_CORPSE,
			DrainedPillagercorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<VindicatorcorpseBlockEntity>> VINDICATOR_CORPSE = register("vindicator_corpse", ButcheryModBlocks.VINDICATOR_CORPSE, VindicatorcorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedVindicatorcorpseBlockEntity>> DRAINED_VINDICATOR_CORPSE = register("drained_vindicator_corpse", ButcheryModBlocks.DRAINED_VINDICATOR_CORPSE,
			DrainedVindicatorcorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PolarbearcarcassBlockEntity>> POLAR_BEAR_CARCASS = register("polar_bear_carcass", ButcheryModBlocks.POLAR_BEAR_CARCASS, PolarbearcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedPolarbearcarcassBlockEntity>> DRAINED_POLAR_BEAR_CARCASS = register("drained_polar_bear_carcass", ButcheryModBlocks.DRAINED_POLAR_BEAR_CARCASS,
			DrainedPolarbearcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RabbitcarcassBlockEntity>> RABBIT_CARCASS = register("rabbit_carcass", ButcheryModBlocks.RABBIT_CARCASS, RabbitcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedrabbitcarcassBlockEntity>> DRAINED_RABBIT_CARCASS = register("drained_rabbit_carcass", ButcheryModBlocks.DRAINED_RABBIT_CARCASS, DrainedrabbitcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SkeletoncorpseBlockEntity>> SKELETON_CORPSE = register("skeleton_corpse", ButcheryModBlocks.SKELETON_CORPSE, SkeletoncorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<StraycorpseBlockEntity>> STRAY_CORPSE = register("stray_corpse", ButcheryModBlocks.STRAY_CORPSE, StraycorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MediummagmacubecarcassBlockEntity>> MEDIUM_MAGMA_CUBE_CARCASS = register("medium_magma_cube_carcass", ButcheryModBlocks.MEDIUM_MAGMA_CUBE_CARCASS,
			MediummagmacubecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MagmacubecarcassBlockEntity>> MAGMA_CUBE_CARCASS = register("magma_cube_carcass", ButcheryModBlocks.MAGMA_CUBE_CARCASS, MagmacubecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<StridercarcassBlockEntity>> STRIDER_CARCASS = register("strider_carcass", ButcheryModBlocks.STRIDER_CARCASS, StridercarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedstridercarcassBlockEntity>> DRAINED_STRIDER_CARCASS = register("drained_strider_carcass", ButcheryModBlocks.DRAINED_STRIDER_CARCASS,
			DrainedstridercarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<VillagercorpseBlockEntity>> VILLAGER_CORPSE = register("villager_corpse", ButcheryModBlocks.VILLAGER_CORPSE, VillagercorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedvillagerBlockEntity>> DRAINED_VILLAGER = register("drained_villager", ButcheryModBlocks.DRAINED_VILLAGER, DrainedvillagerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ZombievillagercorpseBlockEntity>> ZOMBIE_VILLAGER_CORPSE = register("zombie_villager_corpse", ButcheryModBlocks.ZOMBIE_VILLAGER_CORPSE, ZombievillagercorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedzombievillagerBlockEntity>> DRAINED_ZOMBIE_VILLAGER = register("drained_zombie_villager", ButcheryModBlocks.DRAINED_ZOMBIE_VILLAGER,
			DrainedzombievillagerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ZombiepiglincorpseBlockEntity>> ZOMBIFIED_PIGLIN_CORPSE = register("zombified_piglin_corpse", ButcheryModBlocks.ZOMBIFIED_PIGLIN_CORPSE, ZombiepiglincorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedZombiepiglincorpseBlockEntity>> DRAINED_ZOMBIFIED_PIGLIN_CORPSE = register("drained_zombified_piglin_corpse", ButcheryModBlocks.DRAINED_ZOMBIFIED_PIGLIN_CORPSE,
			DrainedZombiepiglincorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WitherskeletoncorpseBlockEntity>> WITHER_SKELETON_CORPSE = register("wither_skeleton_corpse", ButcheryModBlocks.WITHER_SKELETON_CORPSE, WitherskeletoncorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TurtlecarcassBlockEntity>> TURTLE_CARCASS = register("turtle_carcass", ButcheryModBlocks.TURTLE_CARCASS, TurtlecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedTurtlecarcassBlockEntity>> DRAINED_TURTLE_CARCASS = register("drained_turtle_carcass", ButcheryModBlocks.DRAINED_TURTLE_CARCASS, DrainedTurtlecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MetaltrayBlockEntity>> METAL_TRAY = register("metal_tray", ButcheryModBlocks.METAL_TRAY, MetaltrayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GrayfrogcarcassBlockEntity>> GRAY_FROG_CARCASS = register("gray_frog_carcass", ButcheryModBlocks.GRAY_FROG_CARCASS, GrayfrogcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GreenfrogcarcassBlockEntity>> GREEN_FROG_CARCASS = register("green_frog_carcass", ButcheryModBlocks.GREEN_FROG_CARCASS, GreenfrogcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OrangefrogcarcassBlockEntity>> ORANGE_FROG_CARCASS = register("orange_frog_carcass", ButcheryModBlocks.ORANGE_FROG_CARCASS, OrangefrogcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BrownllamacarcassBlockEntity>> BROWN_LLAMA_CARCASS = register("brown_llama_carcass", ButcheryModBlocks.BROWN_LLAMA_CARCASS, BrownllamacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedbrownllamacarcassBlockEntity>> DRAINED_BROWN_LLAMA_CARCASS = register("drained_brown_llama_carcass", ButcheryModBlocks.DRAINED_BROWN_LLAMA_CARCASS,
			DrainedbrownllamacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CreamyllamacarcassBlockEntity>> CREAMY_LLAMA_CARCASS = register("creamy_llama_carcass", ButcheryModBlocks.CREAMY_LLAMA_CARCASS, CreamyllamacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedCreamyllamacarcassBlockEntity>> DRAINED_CREAMY_LLAMA_CARCASS = register("drained_creamy_llama_carcass", ButcheryModBlocks.DRAINED_CREAMY_LLAMA_CARCASS,
			DrainedCreamyllamacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GrayllamacarcassBlockEntity>> GRAY_LLAMA_CARCASS = register("gray_llama_carcass", ButcheryModBlocks.GRAY_LLAMA_CARCASS, GrayllamacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedGrayllamacarcassBlockEntity>> DRAINED_GRAY_LLAMA_CARCASS = register("drained_gray_llama_carcass", ButcheryModBlocks.DRAINED_GRAY_LLAMA_CARCASS,
			DrainedGrayllamacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedWhitellamacarcassBlockEntity>> DRAINED_WHITE_LLAMA_CARCASS = register("drained_white_llama_carcass", ButcheryModBlocks.DRAINED_WHITE_LLAMA_CARCASS,
			DrainedWhitellamacarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WhiteLlamaCarcassBlockEntity>> WHITE_LLAMA_CARCASS = register("white_llama_carcass", ButcheryModBlocks.WHITE_LLAMA_CARCASS, WhiteLlamaCarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FreezerBlockEntity>> FREEZER = register("freezer", ButcheryModBlocks.FREEZER, FreezerBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TaxidermytableBlockEntity>> TAXIDERMY_TABLE = register("taxidermy_table", ButcheryModBlocks.TAXIDERMY_TABLE, TaxidermytableBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EnderdragoncarcassBlockEntity>> ENDER_DRAGON_CARCASS = register("ender_dragon_carcass", ButcheryModBlocks.ENDER_DRAGON_CARCASS, EnderdragoncarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EnderdragoncarcassheadlessBlockEntity>> ENDER_DRAGON_CARCASS_HEADLESS = register("ender_dragon_carcass_headless", ButcheryModBlocks.ENDER_DRAGON_CARCASS_HEADLESS,
			EnderdragoncarcassheadlessBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut1BlockEntity>> ENDERDRAGONCUT_1 = register("enderdragoncut_1", ButcheryModBlocks.ENDERDRAGONCUT_1, Enderdragoncut1BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut2BlockEntity>> ENDERDRAGONCUT_2 = register("enderdragoncut_2", ButcheryModBlocks.ENDERDRAGONCUT_2, Enderdragoncut2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut3BlockEntity>> ENDERDRAGONCUT_3 = register("enderdragoncut_3", ButcheryModBlocks.ENDERDRAGONCUT_3, Enderdragoncut3BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut4BlockEntity>> ENDERDRAGONCUT_4 = register("enderdragoncut_4", ButcheryModBlocks.ENDERDRAGONCUT_4, Enderdragoncut4BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut5BlockEntity>> ENDERDRAGONCUT_5 = register("enderdragoncut_5", ButcheryModBlocks.ENDERDRAGONCUT_5, Enderdragoncut5BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut6BlockEntity>> ENDERDRAGONCUT_6 = register("enderdragoncut_6", ButcheryModBlocks.ENDERDRAGONCUT_6, Enderdragoncut6BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut7BlockEntity>> ENDERDRAGONCUT_7 = register("enderdragoncut_7", ButcheryModBlocks.ENDERDRAGONCUT_7, Enderdragoncut7BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut8BlockEntity>> ENDERDRAGONCUT_8 = register("enderdragoncut_8", ButcheryModBlocks.ENDERDRAGONCUT_8, Enderdragoncut8BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut9BlockEntity>> ENDERDRAGONCUT_9 = register("enderdragoncut_9", ButcheryModBlocks.ENDERDRAGONCUT_9, Enderdragoncut9BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut10BlockEntity>> ENDERDRAGONCUT_10 = register("enderdragoncut_10", ButcheryModBlocks.ENDERDRAGONCUT_10, Enderdragoncut10BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut11BlockEntity>> ENDERDRAGONCUT_11 = register("enderdragoncut_11", ButcheryModBlocks.ENDERDRAGONCUT_11, Enderdragoncut11BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut12BlockEntity>> ENDERDRAGONCUT_12 = register("enderdragoncut_12", ButcheryModBlocks.ENDERDRAGONCUT_12, Enderdragoncut12BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut13BlockEntity>> ENDERDRAGONCUT_13 = register("enderdragoncut_13", ButcheryModBlocks.ENDERDRAGONCUT_13, Enderdragoncut13BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Enderdragoncut14BlockEntity>> ENDERDRAGONCUT_14 = register("enderdragoncut_14", ButcheryModBlocks.ENDERDRAGONCUT_14, Enderdragoncut14BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenspitrotisserieBlockEntity>> WOODEN_SPIT_ROTISSERIE = register("wooden_spit_rotisserie", ButcheryModBlocks.WOODEN_SPIT_ROTISSERIE, WoodenspitrotisserieBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CashregisterblockBlockEntity>> CASH_REGISTER_BLOCK = register("cash_register_block", ButcheryModBlocks.CASH_REGISTER_BLOCK, CashregisterblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AcaciabutcherdisplayBlockEntity>> ACACIA_BUTCHER_DISPLAY = register("acacia_butcher_display", ButcheryModBlocks.ACACIA_BUTCHER_DISPLAY, AcaciabutcherdisplayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BirchbutcherdisplayBlockEntity>> BIRCH_BUTCHER_DISPLAY = register("birch_butcher_display", ButcheryModBlocks.BIRCH_BUTCHER_DISPLAY, BirchbutcherdisplayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CrimsonbutcherdisplayBlockEntity>> CRIMSON_BUTCHER_DISPLAY = register("crimson_butcher_display", ButcheryModBlocks.CRIMSON_BUTCHER_DISPLAY,
			CrimsonbutcherdisplayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DarkoakbutcherdisplayBlockEntity>> DARK_OAK_BUTCHER_DISPLAY = register("dark_oak_butcher_display", ButcheryModBlocks.DARK_OAK_BUTCHER_DISPLAY,
			DarkoakbutcherdisplayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<JunglebutcherdisplayBlockEntity>> JUNGLE_BUTCHER_DISPLAY = register("jungle_butcher_display", ButcheryModBlocks.JUNGLE_BUTCHER_DISPLAY, JunglebutcherdisplayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OakbutcherdisplayBlockEntity>> OAK_BUTCHER_DISPLAY = register("oak_butcher_display", ButcheryModBlocks.OAK_BUTCHER_DISPLAY, OakbutcherdisplayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SpruceButcherdisplayBlockEntity>> SPRUCE_BUTCHER_DISPLAY = register("spruce_butcher_display", ButcheryModBlocks.SPRUCE_BUTCHER_DISPLAY, SpruceButcherdisplayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WarpedbutcherdisplayBlockEntity>> WARPED_BUTCHER_DISPLAY = register("warped_butcher_display", ButcheryModBlocks.WARPED_BUTCHER_DISPLAY, WarpedbutcherdisplayBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MuleheadmountBlockEntity>> MULE_HEAD_MOUNT = register("mule_head_mount", ButcheryModBlocks.MULE_HEAD_MOUNT, MuleheadmountBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<HangingendermancarcassBlockEntity>> HANGING_ENDERMAN_CARCASS = register("hanging_enderman_carcass", ButcheryModBlocks.HANGING_ENDERMAN_CARCASS,
			HangingendermancarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EndermancarcassBlockEntity>> ENDERMAN_CARCASS = register("enderman_carcass", ButcheryModBlocks.ENDERMAN_CARCASS, EndermancarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedendermancarcassBlockEntity>> DRAINED_ENDERMAN_CARCASS = register("drained_enderman_carcass", ButcheryModBlocks.DRAINED_ENDERMAN_CARCASS,
			DrainedendermancarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<HangingdrainedendermancarcassBlockEntity>> HANGING_DRAINED_ENDERMAN_CARCASS = register("hanging_drained_enderman_carcass", ButcheryModBlocks.HANGING_DRAINED_ENDERMAN_CARCASS,
			HangingdrainedendermancarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PhantomcarcassBlockEntity>> PHANTOM_CARCASS = register("phantom_carcass", ButcheryModBlocks.PHANTOM_CARCASS, PhantomcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedphantomcarcassBlockEntity>> DRAINED_PHANTOM_CARCASS = register("drained_phantom_carcass", ButcheryModBlocks.DRAINED_PHANTOM_CARCASS,
			DrainedphantomcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AllblackcatcarcassBlockEntity>> ALL_BLACK_CAT_CARCASS = register("all_black_cat_carcass", ButcheryModBlocks.ALL_BLACK_CAT_CARCASS, AllblackcatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedallblackcatcarcassBlockEntity>> DRAINED_ALL_BLACK_CAT_CARCASS = register("drained_all_black_cat_carcass", ButcheryModBlocks.DRAINED_ALL_BLACK_CAT_CARCASS,
			DrainedallblackcatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BlackcatcarcassBlockEntity>> BLACK_CAT_CARCASS = register("black_cat_carcass", ButcheryModBlocks.BLACK_CAT_CARCASS, BlackcatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedblackcatcarcassBlockEntity>> DRAINED_BLACK_CAT_CARCASS = register("drained_black_cat_carcass", ButcheryModBlocks.DRAINED_BLACK_CAT_CARCASS,
			DrainedblackcatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BritishshorthaircatcarcassBlockEntity>> BRITISH_SHORTHAIR_CAT_CARCASS = register("british_shorthair_cat_carcass", ButcheryModBlocks.BRITISH_SHORTHAIR_CAT_CARCASS,
			BritishshorthaircatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedBritishshorthaircatcarcassBlockEntity>> DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS = register("drained_british_shorthair_cat_carcass",
			ButcheryModBlocks.DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS, DrainedBritishshorthaircatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CalicocatcarcassBlockEntity>> CALICO_CAT_CARCASS = register("calico_cat_carcass", ButcheryModBlocks.CALICO_CAT_CARCASS, CalicocatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedCalicocatcarcassBlockEntity>> DRAINED_CALICO_CAT_CARCASS = register("drained_calico_cat_carcass", ButcheryModBlocks.DRAINED_CALICO_CAT_CARCASS,
			DrainedCalicocatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<JelliecatcarcassBlockEntity>> JELLIE_CAT_CARCASS = register("jellie_cat_carcass", ButcheryModBlocks.JELLIE_CAT_CARCASS, JelliecatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedJelliecatcarcassBlockEntity>> DRAINED_JELLIE_CAT_CARCASS = register("drained_jellie_cat_carcass", ButcheryModBlocks.DRAINED_JELLIE_CAT_CARCASS,
			DrainedJelliecatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PersiancatcarcassBlockEntity>> PERSIAN_CAT_CARCASS = register("persian_cat_carcass", ButcheryModBlocks.PERSIAN_CAT_CARCASS, PersiancatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedPersiancatcarcassBlockEntity>> DRAINED_PERSIAN_CAT_CARCASS = register("drained_persian_cat_carcass", ButcheryModBlocks.DRAINED_PERSIAN_CAT_CARCASS,
			DrainedPersiancatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RagdollcatcarcassBlockEntity>> RAGDOLL_CAT_CARCASS = register("ragdoll_cat_carcass", ButcheryModBlocks.RAGDOLL_CAT_CARCASS, RagdollcatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedRagdollcatcarcassBlockEntity>> DRAINED_RAGDOLL_CAT_CARCASS = register("drained_ragdoll_cat_carcass", ButcheryModBlocks.DRAINED_RAGDOLL_CAT_CARCASS,
			DrainedRagdollcatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RedcatcarcassBlockEntity>> RED_CAT_CARCASS = register("red_cat_carcass", ButcheryModBlocks.RED_CAT_CARCASS, RedcatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedRedcatcarcassBlockEntity>> DRAINED_RED_CAT_CARCASS = register("drained_red_cat_carcass", ButcheryModBlocks.DRAINED_RED_CAT_CARCASS,
			DrainedRedcatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SiamesecatcarcassBlockEntity>> SIAMESE_CAT_CARCASS = register("siamese_cat_carcass", ButcheryModBlocks.SIAMESE_CAT_CARCASS, SiamesecatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedSiamesecatcarcassBlockEntity>> DRAINED_SIAMESE_CAT_CARCASS = register("drained_siamese_cat_carcass", ButcheryModBlocks.DRAINED_SIAMESE_CAT_CARCASS,
			DrainedSiamesecatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TabbycatcarcassBlockEntity>> TABBY_CAT_CARCASS = register("tabby_cat_carcass", ButcheryModBlocks.TABBY_CAT_CARCASS, TabbycatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedTabbycatcarcassBlockEntity>> DRAINED_TABBY_CAT_CARCASS = register("drained_tabby_cat_carcass", ButcheryModBlocks.DRAINED_TABBY_CAT_CARCASS,
			DrainedTabbycatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WhitecatcarcassBlockEntity>> WHITE_CAT_CARCASS = register("white_cat_carcass", ButcheryModBlocks.WHITE_CAT_CARCASS, WhitecatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedWhitecatcarcassBlockEntity>> DRAINED_WHITE_CAT_CARCASS = register("drained_white_cat_carcass", ButcheryModBlocks.DRAINED_WHITE_CAT_CARCASS,
			DrainedWhitecatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CatcarcassBlockEntity>> CAT_CARCASS = register("cat_carcass", ButcheryModBlocks.CAT_CARCASS, CatcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ElderguardiancarcassBlockEntity>> ELDER_GUARDIAN_CARCASS = register("elder_guardian_carcass", ButcheryModBlocks.ELDER_GUARDIAN_CARCASS, ElderguardiancarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WitchcorpseBlockEntity>> WITCH_CORPSE = register("witch_corpse", ButcheryModBlocks.WITCH_CORPSE, WitchcorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedwitchcorpseBlockEntity>> DRAINED_WITCH_CORPSE = register("drained_witch_corpse", ButcheryModBlocks.DRAINED_WITCH_CORPSE, DrainedwitchcorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IrongolemBlockEntity>> IRON_GOLEM = register("iron_golem", ButcheryModBlocks.IRON_GOLEM, IrongolemBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IrongolemheadBlockEntity>> IRON_GOLEM_HEAD = register("iron_golem_head", ButcheryModBlocks.IRON_GOLEM_HEAD, IrongolemheadBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IrongolemarmsBlockEntity>> IRON_GOLEM_ARMS = register("iron_golem_arms", ButcheryModBlocks.IRON_GOLEM_ARMS, IrongolemarmsBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IrongolemlegsBlockEntity>> IRON_GOLEM_LEGS = register("iron_golem_legs", ButcheryModBlocks.IRON_GOLEM_LEGS, IrongolemlegsBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<IrongolembodyBlockEntity>> IRON_GOLEM_BODY = register("iron_golem_body", ButcheryModBlocks.IRON_GOLEM_BODY, IrongolembodyBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RepairedIrongolemheadBlockEntity>> REPAIRED_IRON_GOLEM_HEAD = register("repaired_iron_golem_head", ButcheryModBlocks.REPAIRED_IRON_GOLEM_HEAD,
			RepairedIrongolemheadBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RepairedIrongolemarmsBlockEntity>> REPAIRED_IRON_GOLEM_ARMS = register("repaired_iron_golem_arms", ButcheryModBlocks.REPAIRED_IRON_GOLEM_ARMS,
			RepairedIrongolemarmsBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RepairedIrongolemlegsBlockEntity>> REPAIRED_IRON_GOLEM_LEGS = register("repaired_iron_golem_legs", ButcheryModBlocks.REPAIRED_IRON_GOLEM_LEGS,
			RepairedIrongolemlegsBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RepairedIrongolembodyBlockEntity>> REPAIRED_IRON_GOLEM_BODY = register("repaired_iron_golem_body", ButcheryModBlocks.REPAIRED_IRON_GOLEM_BODY,
			RepairedIrongolembodyBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WithercarcassBlockEntity>> WITHER_CARCASS = register("wither_carcass", ButcheryModBlocks.WITHER_CARCASS, WithercarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ZoglincarcassBlockEntity>> ZOGLIN_CARCASS = register("zoglin_carcass", ButcheryModBlocks.ZOGLIN_CARCASS, ZoglincarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedzoglincarcassBlockEntity>> DRAINED_ZOGLIN_CARCASS = register("drained_zoglin_carcass", ButcheryModBlocks.DRAINED_ZOGLIN_CARCASS, DrainedzoglincarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WolfcarcassBlockEntity>> WOLF_CARCASS = register("wolf_carcass", ButcheryModBlocks.WOLF_CARCASS, WolfcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedWolfcarcassBlockEntity>> DRAINED_WOLF_CARCASS = register("drained_wolf_carcass", ButcheryModBlocks.DRAINED_WOLF_CARCASS, DrainedWolfcarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SkeletonhorsecarcassBlockEntity>> SKELETON_HORSE_CARCASS = register("skeleton_horse_carcass", ButcheryModBlocks.SKELETON_HORSE_CARCASS, SkeletonhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WardencarcassBlockEntity>> WARDEN_CARCASS = register("warden_carcass", ButcheryModBlocks.WARDEN_CARCASS, WardencarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ZombiehorsecarcassBlockEntity>> ZOMBIE_HORSE_CARCASS = register("zombie_horse_carcass", ButcheryModBlocks.ZOMBIE_HORSE_CARCASS, ZombiehorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedZombiehorsecarcassBlockEntity>> DRAINED_ZOMBIE_HORSE_CARCASS = register("drained_zombie_horse_carcass", ButcheryModBlocks.DRAINED_ZOMBIE_HORSE_CARCASS,
			DrainedZombiehorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ZombiehorseheadmountBlockEntity>> ZOMBIE_HORSE_HEAD_MOUNT = register("zombie_horse_head_mount", ButcheryModBlocks.ZOMBIE_HORSE_HEAD_MOUNT,
			ZombiehorseheadmountBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BrainBlockEntity>> BRAIN = register("brain", ButcheryModBlocks.BRAIN, BrainBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SniffercarcassblockBlockEntity>> SNIFFER_CARCASS_BLOCK = register("sniffer_carcass_block", ButcheryModBlocks.SNIFFER_CARCASS_BLOCK, SniffercarcassblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedsniffercarcassblockBlockEntity>> DRAINED_SNIFFER_CARCASS_BLOCK = register("drained_sniffer_carcass_block", ButcheryModBlocks.DRAINED_SNIFFER_CARCASS_BLOCK,
			DrainedsniffercarcassblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RepairedIrongolemBlockEntity>> REPAIRED_IRONGOLEM = register("repaired_irongolem", ButcheryModBlocks.REPAIRED_IRONGOLEM, RepairedIrongolemBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RegularblackhorsecarcassBlockEntity>> REGULAR_BLACK_HORSE_CARCASS = register("regular_black_horse_carcass", ButcheryModBlocks.REGULAR_BLACK_HORSE_CARCASS,
			RegularblackhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedRegularblackhorsecarcassBlockEntity>> DRAINED_REGULAR_BLACK_HORSE_CARCASS = register("drained_regular_black_horse_carcass",
			ButcheryModBlocks.DRAINED_REGULAR_BLACK_HORSE_CARCASS, DrainedRegularblackhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RegularBrownhorsecarcassBlockEntity>> REGULAR_BROWN_HORSE_CARCASS = register("regular_brown_horse_carcass", ButcheryModBlocks.REGULAR_BROWN_HORSE_CARCASS,
			RegularBrownhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedRegularBrownhorsecarcassBlockEntity>> DRAINED_REGULAR_BROWN_HORSE_CARCASS = register("drained_regular_brown_horse_carcass",
			ButcheryModBlocks.DRAINED_REGULAR_BROWN_HORSE_CARCASS, DrainedRegularBrownhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RegularChestnuthorsecarcassBlockEntity>> REGULAR_CHESTNUT_HORSE_CARCASS = register("regular_chestnut_horse_carcass", ButcheryModBlocks.REGULAR_CHESTNUT_HORSE_CARCASS,
			RegularChestnuthorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedRegularChestnuthorsecarcassBlockEntity>> DRAINED_REGULAR_CHESTNUT_HORSE_CARCASS = register("drained_regular_chestnut_horse_carcass",
			ButcheryModBlocks.DRAINED_REGULAR_CHESTNUT_HORSE_CARCASS, DrainedRegularChestnuthorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RegularCreamyhorsecarcassBlockEntity>> REGULAR_CREAMY_HORSE_CARCASS = register("regular_creamy_horse_carcass", ButcheryModBlocks.REGULAR_CREAMY_HORSE_CARCASS,
			RegularCreamyhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedRegularCreamyhorsecarcassBlockEntity>> DRAINED_REGULAR_CREAMY_HORSE_CARCASS = register("drained_regular_creamy_horse_carcass",
			ButcheryModBlocks.DRAINED_REGULAR_CREAMY_HORSE_CARCASS, DrainedRegularCreamyhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RegularDarkbrownhorsecarcassBlockEntity>> REGULAR_DARK_BROWN_HORSE_CARCASS = register("regular_dark_brown_horse_carcass", ButcheryModBlocks.REGULAR_DARK_BROWN_HORSE_CARCASS,
			RegularDarkbrownhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedRegularDarkbrownhorsecarcassBlockEntity>> DRAINED_REGULAR_DARK_BROWN_HORSE_CARCASS = register("drained_regular_dark_brown_horse_carcass",
			ButcheryModBlocks.DRAINED_REGULAR_DARK_BROWN_HORSE_CARCASS, DrainedRegularDarkbrownhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RegularGrayhorsecarcassBlockEntity>> REGULAR_GRAY_HORSE_CARCASS = register("regular_gray_horse_carcass", ButcheryModBlocks.REGULAR_GRAY_HORSE_CARCASS,
			RegularGrayhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RegularWhitehorsecarcassBlockEntity>> REGULAR_WHITE_HORSE_CARCASS = register("regular_white_horse_carcass", ButcheryModBlocks.REGULAR_WHITE_HORSE_CARCASS,
			RegularWhitehorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedGrayhorsecarcassBlockEntity>> DRAINED_GRAY_HORSE_CARCASS = register("drained_gray_horse_carcass", ButcheryModBlocks.DRAINED_GRAY_HORSE_CARCASS,
			DrainedGrayhorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedWhitehorsecarcassBlockEntity>> DRAINED_WHITE_HORSE_CARCASS = register("drained_white_horse_carcass", ButcheryModBlocks.DRAINED_WHITE_HORSE_CARCASS,
			DrainedWhitehorsecarcassBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PestleandmortarBlockEntity>> PESTLE_AND_MORTAR = register("pestle_and_mortar", ButcheryModBlocks.PESTLE_AND_MORTAR, PestleandmortarBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BatskeletonBlockEntity>> BAT_SKELETON = register("bat_skeleton", ButcheryModBlocks.BAT_SKELETON, BatskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MooshroomskeletonBlockEntity>> MOOSHROOM_SKELETON = register("mooshroom_skeleton", ButcheryModBlocks.MOOSHROOM_SKELETON, MooshroomskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CamelskeletonBlockEntity>> CAMEL_SKELETON = register("camel_skeleton", ButcheryModBlocks.CAMEL_SKELETON, CamelskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CatskeletonBlockEntity>> CAT_SKELETON = register("cat_skeleton", ButcheryModBlocks.CAT_SKELETON, CatskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ChickenskeletonBlockEntity>> CHICKEN_SKELETON = register("chicken_skeleton", ButcheryModBlocks.CHICKEN_SKELETON, ChickenskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CowskeletonBlockEntity>> COW_SKELETON = register("cow_skeleton", ButcheryModBlocks.COW_SKELETON, CowskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CreeperskeletonBlockEntity>> CREEPER_SKELETON = register("creeper_skeleton", ButcheryModBlocks.CREEPER_SKELETON, CreeperskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DolphinskeletonBlockEntity>> DOLPHIN_SKELETON = register("dolphin_skeleton", ButcheryModBlocks.DOLPHIN_SKELETON, DolphinskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DonkeyskeletonBlockEntity>> DONKEY_SKELETON = register("donkey_skeleton", ButcheryModBlocks.DONKEY_SKELETON, DonkeyskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SkeletonBlockEntity>> SKELETON = register("skeleton", ButcheryModBlocks.SKELETON, SkeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<FoxskeletonBlockEntity>> FOX_SKELETON = register("fox_skeleton", ButcheryModBlocks.FOX_SKELETON, FoxskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GoatskeletonBlockEntity>> GOAT_SKELETON = register("goat_skeleton", ButcheryModBlocks.GOAT_SKELETON, GoatskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<HoglinskeletonBlockEntity>> HOGLIN_SKELETON = register("hoglin_skeleton", ButcheryModBlocks.HOGLIN_SKELETON, HoglinskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LlamaskeletonBlockEntity>> LLAMA_SKELETON = register("llama_skeleton", ButcheryModBlocks.LLAMA_SKELETON, LlamaskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MuleskeletonBlockEntity>> MULE_SKELETON = register("mule_skeleton", ButcheryModBlocks.MULE_SKELETON, MuleskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OcelotskeletonBlockEntity>> OCELOT_SKELETON = register("ocelot_skeleton", ButcheryModBlocks.OCELOT_SKELETON, OcelotskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PandaskeletonBlockEntity>> PANDA_SKELETON = register("panda_skeleton", ButcheryModBlocks.PANDA_SKELETON, PandaskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PhantomskeletonBlockEntity>> PHANTOM_SKELETON = register("phantom_skeleton", ButcheryModBlocks.PHANTOM_SKELETON, PhantomskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PigskeletonBlockEntity>> PIG_SKELETON = register("pig_skeleton", ButcheryModBlocks.PIG_SKELETON, PigskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PiglinskeletonBlockEntity>> PIGLIN_SKELETON = register("piglin_skeleton", ButcheryModBlocks.PIGLIN_SKELETON, PiglinskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PolarbearskeletonBlockEntity>> POLARBEAR_SKELETON = register("polarbear_skeleton", ButcheryModBlocks.POLARBEAR_SKELETON, PolarbearskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SheepskeletonBlockEntity>> SHEEP_SKELETON = register("sheep_skeleton", ButcheryModBlocks.SHEEP_SKELETON, SheepskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WolfskeletonBlockEntity>> WOLF_SKELETON = register("wolf_skeleton", ButcheryModBlocks.WOLF_SKELETON, WolfskeletonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PlayercorpseBlockEntity>> PLAYERCORPSE = register("playercorpse", ButcheryModBlocks.PLAYERCORPSE, PlayercorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DrainedplayercorpseBlockEntity>> DRAINEDPLAYERCORPSE = register("drainedplayercorpse", ButcheryModBlocks.DRAINEDPLAYERCORPSE, DrainedplayercorpseBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RavagerBlockEntity>> RAVAGER = register("ravager", ButcheryModBlocks.RAVAGER, RavagerBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OAK_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ACACIA_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BIRCH_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CRIMSON_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_OAK_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, JUNGLE_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MANGROVE_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SPRUCE_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WARPED_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_BUTCHERS_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLOOD_GRATE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, BLOOD_GRATE.get(), (blockEntity, side) -> blockEntity.getFluidTank());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MEAT_GRINDER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SKIN_RACK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BASIN.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, BASIN.get(), (blockEntity, side) -> blockEntity.getFluidTank());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLOOD_PUDDLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIG_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIG_HEAD.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_PIG_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_COW_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COW_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SHEEP_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_SHEEP_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CHICKEN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_CHICKEN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_BAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DOLPHIN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_DOLPHIN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GLOW_SQUID_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SQUID_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GOAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_GOAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RED_MOOSHROOM_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_RED_MOOSHROOM_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BROWN_MOOSHROOM_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_BROWN_MOOSHROOM_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OCELOT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_OCELOT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CAMEL_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_CAMEL_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CAVE_SPIDER_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SPIDER_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CREEPER_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_CREEPER_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DONKEY_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_DONKEY_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MULE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_MULE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DROWNED_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_DROWNED_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_HUSK_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HUSK_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ZOMBIE_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_ZOMBIE_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EVOKER_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FOX_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_FOX_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SNOW_FOX_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_SNOWFOX_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GUARDIAN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_GUARDIAN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HOGLIN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_HOGLIN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PANDA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_PANDA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIGLIN_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_PIGLIN_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIGLIN_BRUTE_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_PIGLIN_BRUTE_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_EVOKER_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PILLAGER_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_PILLAGER_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, VINDICATOR_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_VINDICATOR_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, POLAR_BEAR_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_POLAR_BEAR_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RABBIT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_RABBIT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SKELETON_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, STRAY_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MEDIUM_MAGMA_CUBE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MAGMA_CUBE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, STRIDER_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_STRIDER_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, VILLAGER_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_VILLAGER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ZOMBIE_VILLAGER_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_ZOMBIE_VILLAGER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ZOMBIFIED_PIGLIN_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_ZOMBIFIED_PIGLIN_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WITHER_SKELETON_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TURTLE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_TURTLE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, METAL_TRAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAY_FROG_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GREEN_FROG_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ORANGE_FROG_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BROWN_LLAMA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_BROWN_LLAMA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CREAMY_LLAMA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_CREAMY_LLAMA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRAY_LLAMA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_GRAY_LLAMA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_WHITE_LLAMA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WHITE_LLAMA_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FREEZER.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TAXIDERMY_TABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDER_DRAGON_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDER_DRAGON_CARCASS_HEADLESS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_1.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_2.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_3.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_4.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_5.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_6.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_7.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_8.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_9.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_10.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_11.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_12.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_13.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERDRAGONCUT_14.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOODEN_SPIT_ROTISSERIE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CASH_REGISTER_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ACACIA_BUTCHER_DISPLAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BIRCH_BUTCHER_DISPLAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CRIMSON_BUTCHER_DISPLAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DARK_OAK_BUTCHER_DISPLAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, JUNGLE_BUTCHER_DISPLAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OAK_BUTCHER_DISPLAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SPRUCE_BUTCHER_DISPLAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WARPED_BUTCHER_DISPLAY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MULE_HEAD_MOUNT.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HANGING_ENDERMAN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENDERMAN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_ENDERMAN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HANGING_DRAINED_ENDERMAN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PHANTOM_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_PHANTOM_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ALL_BLACK_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_ALL_BLACK_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLACK_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_BLACK_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BRITISH_SHORTHAIR_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_BRITISH_SHORTHAIR_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CALICO_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_CALICO_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, JELLIE_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_JELLIE_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PERSIAN_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_PERSIAN_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAGDOLL_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_RAGDOLL_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RED_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_RED_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SIAMESE_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_SIAMESE_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TABBY_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_TABBY_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WHITE_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_WHITE_CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CAT_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ELDER_GUARDIAN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WITCH_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_WITCH_CORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, IRON_GOLEM.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, IRON_GOLEM_HEAD.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, IRON_GOLEM_ARMS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, IRON_GOLEM_LEGS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, IRON_GOLEM_BODY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REPAIRED_IRON_GOLEM_HEAD.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REPAIRED_IRON_GOLEM_ARMS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REPAIRED_IRON_GOLEM_LEGS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REPAIRED_IRON_GOLEM_BODY.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WITHER_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ZOGLIN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_ZOGLIN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOLF_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_WOLF_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SKELETON_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WARDEN_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ZOMBIE_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_ZOMBIE_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ZOMBIE_HORSE_HEAD_MOUNT.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BRAIN.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SNIFFER_CARCASS_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_SNIFFER_CARCASS_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REPAIRED_IRONGOLEM.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REGULAR_BLACK_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_REGULAR_BLACK_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REGULAR_BROWN_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_REGULAR_BROWN_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REGULAR_CHESTNUT_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_REGULAR_CHESTNUT_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REGULAR_CREAMY_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_REGULAR_CREAMY_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REGULAR_DARK_BROWN_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_REGULAR_DARK_BROWN_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REGULAR_GRAY_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, REGULAR_WHITE_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_GRAY_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINED_WHITE_HORSE_CARCASS.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PESTLE_AND_MORTAR.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BAT_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MOOSHROOM_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CAMEL_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CAT_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CHICKEN_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COW_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CREEPER_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DOLPHIN_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DONKEY_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FOX_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GOAT_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, HOGLIN_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LLAMA_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, MULE_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OCELOT_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PANDA_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PHANTOM_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIG_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIGLIN_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, POLARBEAR_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SHEEP_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, WOLF_SKELETON.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PLAYERCORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DRAINEDPLAYERCORPSE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, RAVAGER.get(), SidedInvWrapper::new);
	}
}