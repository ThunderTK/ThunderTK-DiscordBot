package tk.Thunder;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by tbkid on 2016-09-14.
 */
public interface commands {

        public boolean called(String[] args, MessageReceivedEvent event);
        public void action (String[] args, MessageReceivedEvent event);
        public String help();
        public void executed(boolean success, MessageReceivedEvent event);


}
