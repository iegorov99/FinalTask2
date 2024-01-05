package PetRegistry.Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pet {
    private int id;
    private String name;
    private LocalDate birthday;
    private String command;

    public void setPetId(int petId) {
        this.id = petId;
    }

    public int getPetId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }

    public LocalDate getBirthdayDate(){
        return birthday;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    public void setCommand(String command){
        this.command = command;
    }

    public String getCommand(){
        return command;
    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, дата рождения: %s , команды: %s", getPetId(), getClass().getSimpleName(), name, getBirthday(), getCommand());
    }
}