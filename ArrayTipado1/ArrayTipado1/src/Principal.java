    import java.util.Scanner;
    import arraytipado.Pessoa;
    public class Principal {
    public static void main(String[] args) {
        
        Pessoa listaPessoas [] = new Pessoa[1];
        Scanner leia = new Scanner(System.in);
        
        for (int i = 0;  i < listaPessoas.length; i++) {
            listaPessoas[i] = new Pessoa(); // Inicializando cada objeto Pessoa
            
            System.out.printf("\n Dados da %dª Pessoa: \n", i+1);
            System.out.print("Nome: ");
            listaPessoas[i].nome = leia.nextLine();
            
            System.out.print("Email: ");
            listaPessoas[i].email = leia.nextLine();
            
            System.out.print("Telefone: ");
            listaPessoas[i].telefone = leia.nextLine();
            
            System.out.print("Idade: ");
            listaPessoas[i].idade = leia.nextInt();
            
            // Consumir a quebra de linha pendente após o próximo número inteiro
            leia.nextLine(); 
            
            System.out.println(); // Adicionando uma linha em branco para separar os dados das pessoas
        }
        
        // Exibindo os dados das pessoas após a entrada
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.printf("\n Dados da %dª Pessoa: \n", i+1);
            System.out.printf("\tNome: %s\n", listaPessoas[i].nome);
            System.out.printf("\tEmail: %s\n", listaPessoas[i].email);
            System.out.printf("\tTelefone: %s\n", listaPessoas[i].telefone);
            System.out.printf("\tIdade: %d\n", listaPessoas[i].idade);
        }
        
        leia.close(); // Fechando o scanner no final do programa
    }
}

