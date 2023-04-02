package com.br.agendacontato;

import java.util.Scanner;

public class Menu {
    HashTable hashTable = new HashTable(1000);
    Scanner sc = new Scanner(System.in);
    public Menu() {
        System.out.print("\n|------------------------------------|");
        System.out.print("\n|-- Bem-vindo à Agenda de Contatos --|");
        System.out.print("\n|------------------------------------|\n");

        exibirMenu();
    }

    private void exibirMenu() {
        System.out.print("\n|---------- Menu ----------|");
        System.out.print("\n|   1. Adicionar contato   |");
        System.out.print("\n|   2. Excluir contato     |");
        System.out.print("\n|   3. Pesquisar contato   |");
        System.out.print("\n|   4. Exibir contatos     |");
        System.out.print("\n|   0. Sair                |");
        System.out.print("\n|--------------------------|");
        System.out.print("\n\nDigite a opção desejada: ");

        int opcaoSelecionada = sc.nextInt();

        switch (opcaoSelecionada) {
            case 1:
                adicionarContato();
            case 2:
                excluirContato();
            case 3:
                pesquisarContato();
            case 4: {
                System.out.print(hashTable.toString());
                exibirMenu();
            }
            case 0:
                break;
            default:
                exibirMenu();

        }
    }

    private void pesquisarContato() {
        sc.skip("\\R?");

        System.out.print("Digite o termo de busca: ");
        String chave = sc.nextLine();
        Contato resultado = hashTable.buscar(chave);

        if(chave.trim().length() == 0) {
            System.out.print("\nNão é possível buscar sem um termo de busca, tente novamente.\n");
            exibirMenu();
            return;
        }

        if(resultado != null) {
            System.out.print("\nResultado: " + resultado.toString() + "\n");
        } else {
            System.out.print("\nNenhum resultado encontrado.\n");
        }


        exibirMenu();
    }

    private void excluirContato() {
        sc.skip("\\R?");
        System.out.print("Digite o nome do contato a excluir: ");
        String chave = sc.nextLine();
        if(chave.trim().length() != 0) {
            hashTable.excluir(chave);
        } else {
            System.out.print("\nNão é possível excluir sem um nome inserido, tente novamente.\n");
        }

        System.out.print("\nOperação de exclusão concluída.\n");

        exibirMenu();
    }

    private void adicionarContato() {
        sc.skip("\\R?");

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        while (nome.trim().length() == 0) {
            System.out.print("O nome é obrigatório. Por favor, digite novamente: ");
            nome = sc.nextLine();
        }

        System.out.print("Digite o telefone: ");
        String telefone = sc.nextLine();
        while (telefone.trim().length() == 0) {
            System.out.print("O telefone é obrigatório. Por favor, digite novamente: ");
            telefone = sc.nextLine();
        }

        System.out.print("Digite o nascimento: ");
        String nascimento = sc.nextLine();
        System.out.print("Digite o celular: ");
        String celular = sc.nextLine();
        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        hashTable.inserir(new Contato(nome, telefone, nascimento, celular, email));

        exibirMenu();
    }
}
