package org.levi.engine.cmd;

public class CommandExecutor {
    public <T> T execute(Command<T> command) {
        return command.execute();
    }
}
