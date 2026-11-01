public class Main {
    public static void main(String[] args) {
        String ogrenciAdi = "Tuana Öykü Demir";
        double vize1 = 60.0;
        double vize2 = 70.0;
        double final1 = 75.0;
        double orta = vize1 / 4 + vize2 / 4 + final1 / 2;
        String durumMsg = "";
        if (orta < 50) {
            durumMsg = "Kaldınız";
        } else if (orta < 75) {
            durumMsg = "Geçtin";
        } else if (orta < 85) {
            durumMsg = "Teşekkür belgesi aldın";
        } else {
            durumMsg = "Takdir belgesi aldın";
        }
        System.out.println("Öğrenci Adı: " + ogrenciAdi);
        System.out.println("Hesaplanan Ortalama: " + orta);
        System.out.println("Durum: " + durumMsg);
    }
}