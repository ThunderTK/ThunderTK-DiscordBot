package tk.Thunder;
import net.dv8tion.jda.*;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import tk.Thunder.Commands.PingCommand;
import tk.Thunder.Commands.TypoCommand;
import tk.Thunder.utils.CommandParser;
import tk.Thunder.utils.Token;

import java.util.HashMap;

/**
 * Created by tbkid on 2016-09-14.
 */
public class Main {


    private static JDA jda;
    public static final CommandParser parser = new CommandParser();
    public static HashMap<String, commands> commands = new HashMap<String, commands>();

    public static void main(String args[]) {

        try {
            jda = new JDABuilder().addListener(new BotListener()).setBotToken(Token.BOT_TOKEN()).buildBlocking();
        } catch (Exception e) {
            e.printStackTrace();


        }


        commands.put("ping", new PingCommand());
        commands.put("test", new TypoCommand());
    }

    public static void handleCommand(CommandParser.CommandContainer cmd){

        if(commands.containsKey(cmd.invoke)){
                boolean safe = commands.get(cmd.invoke).called(cmd.args, cmd.event);

                if(safe){
                    commands.get(cmd.invoke).action(cmd.args, cmd.event);
                    commands.get(cmd.invoke).executed(safe, cmd.event);

                }
                else commands.get(cmd.invoke).executed(safe, cmd.event);


        }








    }



}