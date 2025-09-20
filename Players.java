import java.util.Random;

public class Players {

String name;
int jogadaAtual;
int vitorias;

String jogada(){

    Random rng = new Random();
    jogadaAtual=rng.nextInt(3);

    switch (jogadaAtual) {
    case 0: return "Pedra";
    case 1: return "Papel";
    case 2: return "Tesoura";
    default: return " ";
}
}

int somaVitorias(){
    vitorias++;
    return vitorias;
}

}


