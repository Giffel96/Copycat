package de.arraying.Copycat.commands;

import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;

/**
 * Copyright 2017 Arraying
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class CommandWoof extends Command {

    /**
     * Readies the woof command.
     */
    public CommandWoof() {
        super("woof", "Checks how fast I can meow back.", Permission.MESSAGE_WRITE, "woof", false);
        getAliases().add("ping");
    }

    @Override
    public void onCommand(GuildMessageReceivedEvent e, String[] args) {
        long before = System.currentTimeMillis();
        e.getChannel().sendMessage("Did I hear a dog?")
                .queue(message -> message.editMessage("Meow ("+(System.currentTimeMillis()-before)+"ms)!").queue());
    }

}
