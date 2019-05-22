package br.com.example1.app;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.example1.model.Aluguel;
import br.com.example1.model.Carro;
import br.com.example1.model.Cliente;
import br.com.example1.model.Locadora;
import br.com.example1.model.Marca;

public class App {

	public static void main(String[] args) {
		Locadora locadora = new Locadora("Doug Veículos");
		System.out.println("----------- MENU ------------");
		System.out.println("Selecione o nº da opção desejada: ");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Cadastrar Carro");
		System.out.println("3 - Realizar Locacao");
		System.out.println("4 - Listar Clientes");
		System.out.println("5 - Listar Carros");
		System.out.println("6 - Listar Alugueis");
		System.out.println("0 - Sair\n");
		System.out.println("Opcao Escolhida: ");

		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		do {

			switch (Integer.parseInt(texto)) {

			case 1:
				Scanner cliente = new Scanner(System.in);
				System.out.println("Digite o nome do Cliente: ");
				String nome = cliente.nextLine();
				System.out.println("Digite o CPF do Cliente: ");
				String cpf = cliente.nextLine();
				System.out.println("Cliente Adicionado com Sucesso!\n");
				System.out.println("##########################\n");
				Cliente novoCliente = new Cliente(nome, cpf);
				locadora.addCliente(novoCliente);
				break;

			case 2:
				Scanner carro = new Scanner(System.in);
				System.out.println("Digite o Modelo do Veículo: ");
				String modelo = carro.nextLine();
				System.out.println("Digite a Marca do Veículo: ");
				String marca = carro.nextLine();
				System.out.println("Digite a placa do Veículo: ");
				String placa = carro.nextLine();
				try {
					Carro novoCarro = new Carro();
					novoCarro.setModelo(modelo);
					novoCarro.setMarca(new Marca(marca));
					novoCarro.setPlaca(placa);
					novoCarro.setAlugado(false);
					locadora.addCarro(novoCarro);
					System.out.println("Carro Adicionado com Sucesso!\n");
					System.out.println("##########################\n");
				} catch (Exception e) {
					System.out.println(e.getMessage()+"\n");
				}
				
				break;

			case 3:
				Scanner aluguel = new Scanner(System.in);
				System.out.println("Digite o CPF do Cliente: ");
				String cpfAluguel = aluguel.nextLine();
				Cliente clienteAluguel = locadora.getCliente(cpfAluguel);
				while (clienteAluguel == null) {
					System.out.println("Cliente não encontrado! \nConfira os dados ");
					System.out.println("Digite o CPF do Cliente: ");
					cpfAluguel = aluguel.nextLine();
					System.out.println(cpfAluguel);
					clienteAluguel = locadora.getCliente(cpfAluguel);
				}
				System.out.println("Digite a placa do Veículo: ");
				String placaAluguel = aluguel.nextLine();
				Carro carroAluguel = locadora.getCarro(placaAluguel);
				while (carroAluguel == null) {
					System.out.println("Carro não encontrado! \nConfira os dados novamente");
					System.out.println("Digite a placa do Veículo: ");
					placaAluguel = aluguel.nextLine();
					carroAluguel = locadora.getCarro(placaAluguel);
				}
				Aluguel novoAluguel = new Aluguel(clienteAluguel, carroAluguel, 10, 150.00, false);
				locadora.addAluguel(novoAluguel);
				System.out.println("Aluguel realizado com Sucesso!\n");
				System.out.println("##########################\n");
				break;

			case 4:
				ArrayList<Cliente> clientes = locadora.getClientes();
				for (int i = 0; i < clientes.size(); i++) {
					Cliente aux = clientes.get(i);
					System.out.println("[Nome: " + aux.getNome() + " CPF: " + aux.getCpf() + "]");
				}
				break;
			case 5:
				ArrayList<Carro> carros = locadora.getCarros();
				for (int i = 0; i < carros.size(); i++) {
					Carro aux = carros.get(i);
					System.out.println("[Modelo: " + aux.getModelo() + " Marca: " + aux.getMarca().getNome()
							+ " Placa: " + aux.getPlaca() + "]");
				}
				break;
			case 6:
				ArrayList<Aluguel> alugueis = locadora.getAlugueis();
				for (int i = 0; i < alugueis.size(); i++) {
					Aluguel aux = alugueis.get(i);
					System.out.println("[Cliente: " + aux.getCliente().getNome() + " CPF: " + aux.getCliente().getCpf()
							+ " Carro: " + aux.getCarro().getModelo() + " Placa: " + aux.getCarro().getPlaca() + "]");
				}
				break;
			case 0:
				System.out.println("##########################");
				System.out.println("MUITO OBRIGADO, VOLTE SEMPRE!");
				System.out.println("##########################\n");
				System.exit(0);
				break;

			}

			System.out.println("----------- MENU ------------");
			System.out.println("Selecione o nº da opção desejada: ");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Carro");
			System.out.println("3 - Realizar Locacao");
			System.out.println("4 - Listar Clientes");
			System.out.println("5 - Listar Carros");
			System.out.println("6 - Listar Alugueis");
			System.out.println("0 - Sair\n");
			System.out.println("Opcao Escolhida: ");
			texto = scanner.nextLine();
		} while (texto != null);

		scanner.close();

	}

}
