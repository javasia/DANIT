package cw20180708.task1;

import java.util.Scanner;

public class OperatorConsole {

    private TimeTable table;

    public OperatorConsole(TimeTable table) {
        this.table = table;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        String command = "";
        boolean run = true;
        while (run) {
            System.out.println("Please type a command:");
            try {
                run = processCommand(Command.valueOf(Command.class, sc.next().toUpperCase()));
            } catch (IllegalArgumentException e) {
                run = printNoSuchCommand(true);
            }
        }
    }

    public boolean processCommand(Command command) {
        switch (command) {
            case EXIT:
                return false;
            case PRINT:
                table.printTimeTable();
                break;
            case HELP:
                printHelp();
                break;
            default:
                return printNoSuchCommand(false);
        }
        return true;
    }

    private void printHelp() {
        System.out.println("Available commands:");
        for (Command cmd : Command.values()) {
            System.out.printf("%s \n", cmd.toString());
        }
    }

    private boolean printNoSuchCommand(boolean shouldContinue) {
        System.out.println("No such command!");
        if (shouldContinue) printHelp();
        return shouldContinue;
    }
}
