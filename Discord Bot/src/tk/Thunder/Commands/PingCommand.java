package tk.Thunder.Commands;

import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.events.user.UserTypingEvent;
import tk.Thunder.commands;

/**
 * Created by tbkid on 2016-09-14.
 */
public class PingCommand implements commands {
        private final String HELP = "usage: &!ping";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {



        event.getTextChannel().sendMessage("");
    }

    @Override
    public String help() {
        return HELP;
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
        return;
    }
}
