package primeirobi.exemplos.classes;

public class Professor {
    
    String nome;
    String materia;

    public void apresentarse() {
        String msg = " Olá! Sou o professor"
                .concat(nome)
                .concat(" e vou lecionar")
                .concat(materia);

        System.out.println(msg);
    }
}

