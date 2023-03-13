package topic6;

public class ContulPersoanei {
    private String numePersoana;
    private int id;
    private float sumaCurenta;

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(float sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public void sustragereDeBani(float sumaExtrasa) {
        System.out.println("Vreau sa extrag acum " + sumaExtrasa + " lei");
        if (sumaExtrasa > sumaCurenta) {
            throw new ArithmeticException("Insuficient sold");
        } else {
            sumaCurenta = sumaCurenta - sumaExtrasa;
            System.out.println("Soldul ramas in cont dupa extragere este " + sumaCurenta + " lei");
        }
    }

    public void verificareSiValidateSustragereDeBani(float sumaExtrasa) {
        try {
            sustragereDeBani(sumaExtrasa);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }


    public void transferCatreOPersoana(float sumaTransferului, String destinatar) {
        System.out.println("Incercare transfer de " + sumaTransferului + " lei catre " + destinatar);
        if (sumaTransferului > sumaCurenta) {
            throw new ArithmeticException("Transfer esuat");
        } else if (destinatar.length() == 0) {
            throw new NullPointerException("Nume incomplet");
        } else {
            sumaCurenta = sumaCurenta - sumaTransferului;
            System.out.println("Sold ramas in cont dupa transfer este " + sumaCurenta + " lei");

        }
    }

    public void verificareSiValidareTransferPersoana(float sumaTransferului, String destinatar) {
        try {
            transferCatreOPersoana(sumaTransferului, destinatar);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

}

