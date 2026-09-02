package io.github.matheusapolo.javafundamentals.collections;

import java.util.Scanner;

public final class NameListConsoleApp {

    private NameListConsoleApp() {
    }

    public static void main(String[] args) {
        NameListManager manager = new NameListManager();

        try (Scanner scanner = new Scanner(System.in)) {
            int option;
            do {
                printMenu();
                option = readOption(scanner);

                switch (option) {
                    case 1 -> addName(scanner, manager);
                    case 2 -> removeName(scanner, manager);
                    case 3 -> showNames(manager);
                    case 4 -> System.out.println("Até logo!");
                    default -> System.out.println("Opção inválida.");
                }
            } while (option != 4);
        }
    }

    private static int readOption(Scanner scanner) {
        System.out.print("Escolha uma opção: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            return -1;
        }
    }

    private static void addName(Scanner scanner, NameListManager manager) {
        System.out.print("Digite o nome: ");
        try {
            manager.add(scanner.nextLine());
            System.out.println("Nome adicionado.");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void removeName(Scanner scanner, NameListManager manager) {
        System.out.print("Digite o nome que deseja remover: ");
        boolean removed = manager.remove(scanner.nextLine());
        System.out.println(removed ? "Nome removido." : "Nome não encontrado.");
    }

    private static void showNames(NameListManager manager) {
        if (manager.isEmpty()) {
            System.out.println("Nenhum nome cadastrado.");
            return;
        }

        System.out.println("Nomes cadastrados:");
        manager.list().forEach(name -> System.out.println("- " + name));
    }

    private static void printMenu() {
        System.out.println("""

                1 - Adicionar nome
                2 - Remover nome
                3 - Mostrar lista
                4 - Sair
                """);
    }
}

