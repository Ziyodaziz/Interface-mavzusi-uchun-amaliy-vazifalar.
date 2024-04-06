package InterfaceTask;

public class Converter implements BaseConverter {

    double Kelvin;
    double Farangeyt;


    @Override
    public void converterKelvin(double selsiy) {
         Kelvin = 273.15 + selsiy;
        System.out.println(Kelvin);
    }

    @Override
    public void converterFarangeyt(double selsiy) {
        Farangeyt = ((selsiy * 9 / 5) + 32);
        System.out.println(Farangeyt);
    }


    public static void main(String[] args) {
        Converter conK = new Converter();
        Converter conF = new Converter();

        conK.converterKelvin(30);
        conF.converterFarangeyt(30);

    }
}
