package domain;

public enum CommandWord {

    TEMPERATURE("temperatur"),
    CO2("co2"),
    STOP("stop"),
    UNKNOWN("what?");




    private String commandString;




    CommandWord(String commandString){
        this.commandString = commandString;

    }

    @Override
    public String toString() {
        return commandString;
    }
}
