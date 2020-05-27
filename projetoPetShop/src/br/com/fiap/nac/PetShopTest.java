package br.com.fiap.nac;
import javax.swing.JOptionPane;

public class PetShopTest {

    public static void main(String[] args) {
        //CADASTRAR ANIMAL
        String porteAnimal[] = {"Porte Pequeno", "Porte Médio", "Porte Grande"};
        String tipoAnimal[] = {"Cachorro", "Gato", "Outro"};

        //SERVIÇOS
        String acaoServico[] = {"Examinar Anmial", "Dar Banho", "Vacinar Animal"};


        Animal animal = new Animal();
        Cliente cliente = new Cliente();

        //Cadastro
        int inicio;

        //Serviços
        int num;
        do{
            inicio = cadastrarPet();
            if(inicio == 0){
                JOptionPane.showMessageDialog(null, "O sistema será encerrado.");
            }else if(inicio == 1){

                String nome = JOptionPane.showInputDialog("Digite o nome do seu Pet: ");

                Integer porte = JOptionPane.showOptionDialog(null, "Qual o porte do seu Pet?",
                        "PetShop",0, JOptionPane.QUESTION_MESSAGE, null, porteAnimal, porteAnimal[0]);

                Integer tipo = JOptionPane.showOptionDialog(null, "Qual o tipo do seu Pet?",
                        "PetShop",0, JOptionPane.QUESTION_MESSAGE, null, tipoAnimal, tipoAnimal[0]);

                animal.cadastrarAnimal(nome, porte, tipo);

            }else if (inicio == 2 && (animal.getPorte() != null)){

                num = JOptionPane.showOptionDialog(null, "Escolha uma das opções", "PetShop",
                        0, JOptionPane.QUESTION_MESSAGE, null, acaoServico, acaoServico[0]);

                switch (num) {
                    case 0:
                        cliente.setTotalGasto(cliente.getTotalGasto() + 70);
                        break;

                    case 1:
                        String descricaoPorte = animal.getPorte();
                        if (descricaoPorte.equals("Porte Pequeno")) {
                            cliente.setTotalGasto(cliente.getTotalGasto() + 40);
                        } else if (descricaoPorte.equals("Porte Médio")) {
                            cliente.setTotalGasto(cliente.getTotalGasto() + 50);
                        } else if (descricaoPorte.equals("Porte Grande")) {
                            cliente.setTotalGasto(cliente.getTotalGasto() + 60);
                        }

                        break;

                    case 2:
                        String descricaoTipo = animal.getTipo();
                        if (descricaoTipo.equals("Cachorro") || descricaoTipo.equals("Gato")) {
                            cliente.setTotalGasto(cliente.getTotalGasto() + 100);
                        } else if (descricaoTipo.equals("Outro")) {
                            cliente.setTotalGasto(cliente.getTotalGasto() + 150);
                        }
                        break;
                }

            }else if(inicio == 3){
                JOptionPane.showMessageDialog(null, "Valor total: R$" + cliente.getTotalGasto());
            }else{
                JOptionPane.showMessageDialog(null, "Você não cadastrou nenhum animal!");
            }
        }while (inicio != 0);

    }

    public static int cadastrarPet(){
        String opcaoInicial[] = {"Sair", "Cadastrar Animal", "Serviços", "Valor Total"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo", "PetShop",
                0, JOptionPane.QUESTION_MESSAGE, null, opcaoInicial, opcaoInicial[0]);
        return escolha;
    }
}
