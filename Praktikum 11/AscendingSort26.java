public class AscendingSort26 {
    public static void main(String[] args) {
        
        System.out.println("=======DAFTAR ATLET PORSENI 2024======= \n");
        // Nama atlet
        String[][] atlet = {
                { "Saka", "Cahya", "Fitri", "Indah", "Wahyu" },
                { "Dila", "Rizki", "Gita", "Rama", "Alya" },
                { "Taufan", "Vina", "Laras", "Irfan", "Nina" },
                { "Rafi", "Putri", "Fajar", "Salma", "Bambang" },
        };
        String[] cabor = { "Badminton", "Tenis Meja", "Basket", "Bola Voli" }; // Nama cabang olahraga
        
        // Sorting
        for (int i = 0; i < atlet.length; i++) {
            for (int j = 0; j < atlet[i].length - 1; j++) {
                for (int k = 0; k < atlet[i].length - j - 1; k++) {
                    if (atlet[i][k].compareToIgnoreCase(atlet[i][k + 1]) > 0) {
                        String temp = atlet[i][k];
                        atlet[i][k] = atlet[i][k + 1];
                        atlet[i][k + 1] = temp;
                    }
                }
            }
        }
        
        for (int i = 0; i < atlet.length; i++) {
            System.out.println("Cabang Olahraga " + cabor[i]);
            for (int j = 0; j < atlet[i].length; j++) {
                System.out.println("Atlet ke-" + (j + 1) + " : " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}