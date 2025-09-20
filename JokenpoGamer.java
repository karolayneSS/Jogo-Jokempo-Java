
public class JokenpoGamer {

    void start(){

    Players p1 = new Players();
    Players p2 = new Players();
    Players p3 = new Players();

    p1.name="Karol";
    p2.name="João";
    p3.name="Alexandre";


    int qntVitoria = 3;
    int rodada=1;

    System.out.println("==== Jokenpô ====");
    System.out.println("Alvo: " + qntVitoria + " vitórias");

    while (p1.vitorias < qntVitoria  && p2.vitorias < qntVitoria  && p3.vitorias < qntVitoria ) {
    System.out.println("Rodada " + rodada + ":");
   
    System.out.println("Jogador " + p1.name + ": " + p1.jogada());
    System.out.println("Jogador " + p2.name + ": " + p2.jogada());
    System.out.println("jogador " + p3.name + ": " + p3.jogada());

    int j1 = p1.jogadaAtual;
    int j2 = p2.jogadaAtual;
    int j3 = p3.jogadaAtual;

    if ((j1 == j2 && j2 == j3) || (j1 != j2 && j2 != j3 && j3 != j1)){
        System.out.println("Empate! Ninguém pontua.");
    } else {
        if (j1==j2){
            if (quemGanhou(j3, j1)){
                p3.somaVitorias();
                System.out.println("Vencedor(es): " + p3.name);
            } else {
                p1.somaVitorias();
                p2.somaVitorias();
                System.out.println("Vencedor(es): " + p1.name + " e " + p2.name);   
            }

            } else if (j1==j3){
                if (quemGanhou(j2, j1)){
                    p2.somaVitorias();
                    System.out.println("Vencedor(es) " + p2.name);
                } else {
                    p1.somaVitorias();
                    p3.somaVitorias();
                    System.out.println("Vencedor(es): " + p1.name + " e " + p3.name);
                }
            } else {
                if (quemGanhou(j1, j2)){
                    p1.somaVitorias();
                    System.out.println("Vencedor(es) " + p1.name);
                }else{
                    p2.somaVitorias();
                    p3.somaVitorias();
                    System.out.println("Vencedor(es): " + p2.name + " e " + p3.name);
                }
            }
        }
        System.out.println("Placar: " + p1.name + " = " + p1.vitorias + " | " + 
    p2.name + " = " + p2.vitorias + " | " + p3.name + " = " + p3.vitorias);
    rodada ++; 
    }
        System.out.println("=== Fim de jogo ===");
    System.out.println("Rodadas totais: " + (rodada-1));
    System.out.println("Placar final: " + p1.name + "=" + p1.vitorias +
                           " | " + p2.name + "=" + p2.vitorias +
                           " | " + p3.name + "=" + p3.vitorias);

    if (p1.vitorias == qntVitoria) System.out.println("Vencedor: " + p1.name);
    if (p2.vitorias == qntVitoria) System.out.println("Vencedor: " + p2.name);
    if (p3.vitorias == qntVitoria) System.out.println("Vencedor: " + p3.name);
    }

    

 boolean quemGanhou(int a, int b){
    if (a==0 && b==2) return true;
    if (a==2 && b==1) return true;
    if (a==1 && b==0) return true;
    return false; 
        
    }

    
}





    



