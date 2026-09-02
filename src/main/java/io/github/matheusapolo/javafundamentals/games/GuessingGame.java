package io.github.matheusapolo.javafundamentals.games;

import java.util.Random;
import java.util.Scanner;

public final class GuessingGame {

    public enum GuessResult {
        TOO_LOW,
        TOO_HIGH,
        CORRECT
    }

    private GuessingGame() {
    }

    public static GuessResult compareGuess(int secretNumber, int guess) {
        if (guess < secretNumber) {
            return GuessResult.TOO_LOW;
        }
        if (guess > secretNumber) {
            return GuessResult.TOO_HIGH;
        }
        return GuessResult.CORRECT;
    }

    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(10) + 1;

        try (Scanner scanner = new Scanner(System.in)) {
            GuessResult result;
            do {
                System.out.print("Digite um número entre 1 e 10: ");
                int guess = scanner.nextInt();
                result = compareGuess(secretNumber, guess);

                switch (result) {
                    case TOO_LOW -> System.out.println("O número secreto é maior.");
                    case TOO_HIGH -> System.out.println("O número secreto é menor.");
                    case CORRECT -> System.out.println("Acertou!");
                }
            } while (result != GuessResult.CORRECT);
        }
    }
}

