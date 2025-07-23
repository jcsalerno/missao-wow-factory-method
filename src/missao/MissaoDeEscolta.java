package missao;

public class MissaoDeEscolta implements Missao {

    @Override
    public void iniciar() {
        System.out.println("Objetivo da Missão: Escolte o Garrosh em segurança até a próxima cidade.");
    }

    @Override
    public void entregar() {
        System.out.println("Recompensa: Missão concluída! Sua reputação com o reino aumentou.");
    }
}
