package net.mcreator.butchery.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.butchery.world.inventory.MeatgrinderguiMenu;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay9Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay8Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay7Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay6Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay5Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay4Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay3Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay2Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay1Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay0Procedure;
import net.mcreator.butchery.procedures.MEATGRINDERPROGRESSDEFAULTProcedure;
import net.mcreator.butchery.init.ButcheryModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class MeatgrinderguiScreen extends AbstractContainerScreen<MeatgrinderguiMenu> implements ButcheryModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public MeatgrinderguiScreen(MeatgrinderguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("butchery:textures/screens/meatgrindergui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_gui.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 256, 256, 256, 256);
		if (Meatgrinderprogressdisplay0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_0.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_1.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_2.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_3.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_4.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_5.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_6.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_7.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_8.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (Meatgrinderprogressdisplay9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_9.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		if (MEATGRINDERPROGRESSDEFAULTProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderType::guiTextured, ResourceLocation.parse("butchery:textures/screens/meat_grinder_0.png"), this.leftPos + 67, this.topPos + 42, 0, 0, 37, 27, 37, 27);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.butchery.meatgrindergui.label_meat_grinder"), 57, 4, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}