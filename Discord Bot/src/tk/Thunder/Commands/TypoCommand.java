package tk.Thunder.Commands;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import  tk.Thunder.commands;
import tk.Thunder.utils.FileData;
import tk.Thunder.utils.WriteFile;

import java.io.FileWriter;

// Created by tbkid on 2016-09-15.import java.util.StringJoiner;

public class TypoCommand implements commands {
    private final String HELP = "usage: &!Test";
    public String Userid="111588136018022400";
    public String Vy="162018829713670144";
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

    if(event.getAuthor().getId().equals(Userid)){

        event.getTextChannel().sendMessage("HI");
        WriteFile((event.getMessage()));
        }
    else if(event.getAuthor().getId().equals(Vy)) {

        event.getTextChannel().sendMessage("No Typos to display");

    }
        else {
        event.getTextChannel().sendMessage("Wrong person");

    }

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