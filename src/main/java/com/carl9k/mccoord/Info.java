package com.carl9k.mccoord;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;

@Environment(EnvType.CLIENT)
public class Info {
    private final MinecraftClient client;
    private final TextRenderer fontRenderer;

    public Info(MinecraftClient client) {
        this.client = client;
        this.fontRenderer = client.textRenderer;
    }

    public void draw(MatrixStack matrixStack) {
        String coordinates = String.format("%.0f, %.0f, %.0f", this.client.player.getX(), this.client.player.getY(), this.client.player.getZ());

        this.fontRenderer.drawWithShadow(matrixStack, coordinates, 6, 6, 16777215);
    }
}
