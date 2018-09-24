package cw12092018.task1;

public class Run {
    public static void main(String[] args) {
        Model[] models = new Model[100];
        for (int i = 0; i < 100; i++) {
            models[i] = new Model();
        }
        System.out.println(models[0].count);
    }
}

