package ipod.inventory.problem.design;

public class Util {

    public static boolean isValidArgentinePassport(String passportId) {
        if (null == passportId)
            return false;
        else if (passportId.length() != 13)
            return false;
        else if (!passportId.substring(0, 1).equalsIgnoreCase("A"))
            return false;
        else if (!passportId.substring(1, 4).matches("^[0-9]{3}$")) //Regex to match 3 digits
            return false;
        else if (!passportId.substring(4, 6).matches("^[a-zA-Z]*$")) //Rgex to match 2 charachters
            return false;
        else if (!passportId.substring(6).matches("^[a-zA-Z0-9]*$"))
            return false;

        return true;
    }

    public static boolean isValidBrazilPassport(String passportId) {

        if (null == passportId)
            return false;
        else if (passportId.length() != 12)
            return false;
        else if (!passportId.substring(0, 1).equalsIgnoreCase("B"))
            return false;
        else if (!passportId.substring(1, 3).matches("^[a-zA-Z]*$")) //Rgex to match 2 charachters
            return false;
        else if (!passportId.substring(3).matches("^[a-zA-Z0-9]*$"))
            return false;

        return true;
    }

    public static boolean otherCountryPassport(String orderCountry, String passportId) {
        if (null == passportId || passportId.length() < 2 || orderCountry == null && orderCountry.length() < 2)
            return false;
        else {
            switch (orderCountry) {
                case "ARGENTINA":
                    return isValidBrazilPassport(passportId);

                case "BRAZIL":
                    return isValidArgentinePassport(passportId);

                default:
                    return false;
            }
        }
    }

}
