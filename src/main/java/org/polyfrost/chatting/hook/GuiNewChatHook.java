package org.polyfrost.chatting.hook;

import net.minecraft.client.gui.ChatLine;

import java.awt.datatransfer.Transferable;

public interface GuiNewChatHook {
    int getRight();

    boolean isHovering();

    ChatLine getHoveredLine(int mouseY);

    Transferable getChattingChatComponent(int mouseY);

    default ChatLine getFullMessage(ChatLine line) {
        throw new AssertionError("getFullMessage not overridden on GuiNewChat");
    }

    int getTextOpacity();
}