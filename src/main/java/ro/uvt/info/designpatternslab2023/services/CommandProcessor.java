package ro.uvt.info.designpatternslab2023.services;

public interface CommandProcessor {

    void executeCommand(Command command, CommandContext context);
}
