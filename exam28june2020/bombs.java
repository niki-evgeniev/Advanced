package exam28june2020;

import java.util.*;

public class bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");

        ArrayDeque<Integer> effectQueue = new ArrayDeque<>();
        ArrayDeque<Integer> castingStack = new ArrayDeque<>();

        for (int i = 0; i < data.length; i++) {
            effectQueue.offer(Integer.parseInt(data[i]));
        }
        data = scanner.nextLine().split(", ");
        for (int i = 0; i < data.length; i++) {
            castingStack.push(Integer.parseInt(data[i]));
        }

        int cherryBomb = 0;
        int daturaBomb = 0;
        int smokeBomb = 0;
        boolean isCreateBomb = false;

        while (!isCreateBomb) {
            if (daturaBomb >= 3 && cherryBomb >= 3 && smokeBomb >= 3) {
                isCreateBomb = true;
                break;
            }
            int a = effectQueue.peek();
            int b = castingStack.peek();

            if (a + b == 40) {
                effectQueue.poll();
                castingStack.pop();
                daturaBomb++;
            } else if (a + b == 60) {
                effectQueue.poll();
                castingStack.pop();
                cherryBomb++;
            } else if (a + b == 120) {
                effectQueue.poll();
                castingStack.pop();
                smokeBomb++;
            } else {
                int decraseElement = castingStack.pop();
                decraseElement = decraseElement - 5;
                castingStack.push(decraseElement);
            }

            if (effectQueue.isEmpty() || castingStack.isEmpty()) {
                break;
            }
        }
        if (isCreateBomb) {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        } else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        if (effectQueue.isEmpty()) {
            System.out.println("Bomb Effects: empty");
        } else {
            List<String> list = new ArrayList<>();
            for (Integer material : effectQueue) {
                list.add(material + "");
            }
            System.out.println("Bomb Effects: " + String.join(", ", list));
        }
        if (castingStack.isEmpty()) {
            System.out.println("Bomb Casings: empty");
        } else {
            List<String> list = new ArrayList<>();
            for (Integer mat : castingStack) {
                String material = mat + "";
                list.add(material);
            }
            System.out.println("Bomb Casings: " + String.join(", ", list));
        }

        System.out.println("Cherry Bombs: " + cherryBomb);
        System.out.println("Datura Bombs: " + daturaBomb);
        System.out.println("Smoke Decoy Bombs: " + smokeBomb);

    }

}
