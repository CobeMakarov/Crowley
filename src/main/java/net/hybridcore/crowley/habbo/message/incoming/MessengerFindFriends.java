package net.hybridcore.crowley.habbo.message.incoming;

import net.hybridcore.crowley.Crowley;
import net.hybridcore.crowley.habbo.game.GameSession;
import net.hybridcore.crowley.habbo.message.ClientMessage;
import net.hybridcore.crowley.habbo.message.IncomingMessage;
import net.hybridcore.crowley.habbo.message.outgoing.MessengerSearch;
import net.hybridcore.crowley.habbo.security.UserInputFilter;

/**
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <crowlie@hybridcore.net> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return Crowley.
 */
public class MessengerFindFriends implements IncomingMessage {

    public void handle(GameSession gameSession, ClientMessage message) {
        String search = UserInputFilter.filterString(message.readString());

        Crowley.getExecutorService().execute(new MessengerSearch(gameSession, search));
    }
}