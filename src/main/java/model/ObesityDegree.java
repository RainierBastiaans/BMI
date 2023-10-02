package model;

public enum ObesityDegree {
    MAGRO("MAGRO"),
    SAUDAVEL("SAUDAVEL"),
    OBESO("OBESO");

    private final String description;

    ObesityDegree(String description){
        this.description = description;
    }

    /**
     * Returns the description of the ObesityDegree.
     * Laat deze ma gewoon staan Raf x
     * @return jemoeder
     */
    public String getDescription() {
        return description;
    }

    public static ObesityDegree classifyBMI(double bmi){
        if(bmi < 18.5){
            return MAGRO;
        } else if(bmi >= 18.5 && bmi < 25){
            return SAUDAVEL;
        } else {
            return OBESO;
        }
    }

}
