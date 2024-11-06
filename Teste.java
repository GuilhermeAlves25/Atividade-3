import java.text.DecimalFormat;

public class Teste {
    public static void main(String[] args) {

        Empregado E1 = new Empregado("Guilherme","Alves da Silva",2.500);
        Empregado E2 = new Empregado("João","Pereira",1.630);

        DecimalFormat df = new DecimalFormat("#.000");

        System.out.println(df.format(E1.CalcularSalarioAnual()));
        System.out.println(df.format(E2.CalcularSalarioAnual()));

        E1.Aumento(10);
        E2.Aumento(10);


        System.out.println(df.format(E1.CalcularSalarioAnual()));
        System.out.println(df.format(E2.CalcularSalarioAnual()));

        //-----------------------------------------------------------

        Fatura f1 = new Fatura("4","Sapatos",8,54.86);

        System.out.println(f1.getTotalFatura());

        //-----------------------------------------------------------

        Data d1 = new Data(14,10,2001);

        d1.displayData();

        //-----------------------------------------------------------

        ContaCorrente c1 = new ContaCorrente("5",2500,true,5.500);
        c1.saque(50);
        c1.deposito(2000);
        c1.consultaSaldo();
        c1.chequeEspecial();

    }
}
