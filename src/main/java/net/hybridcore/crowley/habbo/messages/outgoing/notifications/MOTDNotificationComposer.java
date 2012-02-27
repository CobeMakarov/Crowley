package net.hybridcore.crowley.habbo.messages.outgoing.notifications;

import net.hybridcore.crowley.Crowley;
import net.hybridcore.crowley.habbo.game.GameSession;
import net.hybridcore.crowley.habbo.messages.OutgoingMessage;
import net.hybridcore.crowley.habbo.messages.ServerMessage;

/**
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <crowlie@hybridcore.net> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return Crowley.
 */
public class MOTDNotificationComposer extends OutgoingMessage {
    public MOTDNotificationComposer(GameSession gameSession) {
        super(gameSession);
    }

    @Override
    public void run() {
        this.gameSession.sendMessage(
                new ServerMessage(810)
                .append(true)
                .appendString(Crowley.getConfiguration().getString("net.hybridcore.crowley.habbo.messages.incoming.user.GetMOTDMessageEvent"))
        );
    }
}