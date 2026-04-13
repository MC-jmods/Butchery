package net.mcreator.butchery.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.butchery.world.inventory.PestleandmotarguiMenu;
import net.mcreator.butchery.procedures.Progressbardisplay8Procedure;
import net.mcreator.butchery.procedures.Progressbardisplay7Procedure;
import net.mcreator.butchery.procedures.Progressbardisplay6Procedure;
import net.mcreator.butchery.procedures.Progressbardisplay5Procedure;
import net.mcreator.butchery.procedures.Progressbardisplay4Procedure;
import net.mcreator.butchery.procedures.Progressbardisplay3Procedure;
import net.mcreator.butchery.procedures.Progressbardisplay2Procedure;
import net.mcreator.butchery.procedures.Progressbardisplay1Procedure;
import net.mcreator.butchery.procedures.Progressbardisplay0Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay3Procedure;
import net.mcreator.butchery.procedures.Meatgrinderprogressdisplay2Procedure;
import net.mcreator.butchery.init.ButcheryModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class PestleandmotarguiScreen extends AbstractContainerScreen<PestleandmotarguiMenu> implements ButcheryModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public PestleandmotarguiScreen(PestleandmotarguiMenu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = ResourceLocation.parse("butchery:textures/screens/pestleandmotargui.png");

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
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestleandmotarguibg.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);
		if (Progressbardisplay0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay0.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay1.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay2.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay3.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay4.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay5.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay6.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay7.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/progressbardisplay8.png"), this.leftPos + 73, this.topPos + 60, 0, 0, 32, 19, 32, 19);
		}
		if (Progressbardisplay0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_1.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
		}
		if (Progressbardisplay1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_2.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
		}
		if (Meatgrinderprogressdisplay2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_3.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
		}
		if (Meatgrinderprogressdisplay3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_2.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
		}
		if (Progressbardisplay4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_1.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
		}
		if (Progressbardisplay5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_2.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
		}
		if (Progressbardisplay6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_3.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
		}
		if (Progressbardisplay7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_2.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
		}
		if (Progressbardisplay8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("butchery:textures/screens/pestle_gui_1.png"), this.leftPos + 65, this.topPos + 25, 0, 0, 42, 38, 42, 38);
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
	}

	@Override
	public void init() {
		super.init();
	}
}