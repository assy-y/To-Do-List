package list;

import java.util.ArrayList;
import java.util.Scanner;

public class toDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Gestionnaire de Tâches ===");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Supprimer une tâche");
            System.out.println("3. Afficher les tâches");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le saut de ligne

            switch (choice) {
                case 1:
                    System.out.print("Entrez la tâche à ajouter : ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("✅ Tâche ajoutée !");
                    break;
                case 2:
                    System.out.println("Liste des tâches :");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    System.out.print("Numéro de la tâche à supprimer : ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                        System.out.println("🗑️ Tâche supprimée !");
                    } else {
                        System.out.println("❌ Numéro invalide.");
                    }
                    break;
                case 3:
                    System.out.println("📋 Vos tâches :");
                    if (tasks.isEmpty()) {
                        System.out.println("Aucune tâche.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("👋 Au revoir !");
                    break;
                default:
                    System.out.println("❌ Choix invalide !");
            }

        } while (choice != 4);

        scanner.close();
    }
}
