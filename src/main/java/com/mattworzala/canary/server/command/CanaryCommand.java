package com.mattworzala.canary.server.command;

import com.mattworzala.canary.server.command.canary.DebugCommand;
import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;

public class CanaryCommand extends Command {
    public CanaryCommand() {
        super("canary");

        setDefaultExecutor(this::onHelp);

        addSubcommand(new DebugCommand());  // debug
    }

    private void onHelp(CommandSender sender, CommandContext context) {
        sender.sendMessage("/canary help");
    }
}
