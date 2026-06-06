package strings_04;

public class NameSurname {
    static void main() {
        String name = "Vadim";
        String surname = "Guk";
        String patronymic = "Sergeevich";
        System.out.println(Name(name, surname, patronymic));
    }

    public static String Name(String name, String surname, String patronymic)
    {
        char FirstNameChar = name.toUpperCase().charAt(0);
        char SecondNameChar = surname.toUpperCase().charAt(0);
        char ThirdNameChar = patronymic.toUpperCase().charAt(0);
        return FirstNameChar + "." + SecondNameChar + "." + ThirdNameChar + ".";
    }
}
