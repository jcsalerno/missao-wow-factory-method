package missao;

public class MissaoDeColeta implements Missao{

    @Override
    public void iniciar() {
        System.out.println("Objetivo da Missão: Colete 10 Ervas do Sol para o alquimista.");
    }

    @Override
    public void entregar() {
        System.out.println("Recompensa: Ótimo trabalho! Aqui estão 50 moedas de ouro.");
    }
}
