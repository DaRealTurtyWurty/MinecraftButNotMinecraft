package io.github.darealturtywurty.notminecraft.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import net.minecraft.client.Minecraft;

@Mixin(Minecraft.class)
public class NotMinecraftMixin {

	@Inject(at = @At(value = "INVOKE_ASSIGN", target = "Ljava/lang/StringBuilder();"), method = "Lnet/minecraft/client/Minecraft;createTitle()Ljava/lang/String;", locals = LocalCapture.CAPTURE_FAILSOFT)
	private void createTitle(CallbackInfo callback, StringBuilder stringbuilder) {
		stringbuilder = new StringBuilder("Not Minecraft");
	}
}
