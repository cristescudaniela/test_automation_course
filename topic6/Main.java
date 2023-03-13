package topic6;

public class Main {


    public static void main(String[] args) {
        ContulPersoanei mia = new ContulPersoanei();
        mia.setId(45487965);
        mia.setNumePersoana("Bianca");
        mia.setSumaCurenta(65000.78f);
        System.out.println(mia.getId());
        System.out.println(mia.getNumePersoana());
        System.out.println(mia.getSumaCurenta());

        System.out.println("----- incercare sustragere de bani --------");
        mia.verificareSiValidateSustragereDeBani(1500);
        mia.verificareSiValidateSustragereDeBani(67100);
        mia.verificareSiValidateSustragereDeBani(1700);

        System.out.println("----- incercare transfer catre persoana --------");
        mia.verificareSiValidareTransferPersoana(4500, "Daniela");
        mia.verificareSiValidareTransferPersoana(1500, "");
        mia.verificareSiValidareTransferPersoana(70000, "Viorel");
        mia.verificareSiValidareTransferPersoana(1500, "Maria");
    }
}
