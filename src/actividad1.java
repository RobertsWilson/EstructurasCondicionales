public class actividad1 {
    public static void main(String[] args) {

        int variable_1 = 12;
        int variable_2= 25;
        int variable_3= 21;
        int esmayor= 0;
        String NombreMayor= "";

        if (variable_1>esmayor) {
            esmayor=variable_1;
            NombreMayor="Variable 1";
        }
        if (variable_2>esmayor){
            esmayor=variable_2;
            NombreMayor="Variable 2";
        }
        if (variable_3>esmayor) {
            esmayor=variable_3;
            NombreMayor="Variable 3";
        }
        System.out.println(NombreMayor + " Es mayor a las demas");
    }
}
