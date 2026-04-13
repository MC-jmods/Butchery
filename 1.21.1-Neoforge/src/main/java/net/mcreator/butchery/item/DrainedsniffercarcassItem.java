package net.mcreator.butchery.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.butchery.procedures.DrainedsniffercarcassplacedProcedure;

public class DrainedsniffercarcassItem extends Item {
	public DrainedsniffercarcassItem() {
		super(new Item.Properties().stacksTo(8));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DrainedsniffercarcassplacedProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}