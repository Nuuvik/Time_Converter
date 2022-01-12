import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите что вы хотите конвертировать (день, час, минута, секунда): ");
        Scanner scanner11 = new Scanner(System.in);
        String ed_izm_time_word_in = scanner11.nextLine();
        System.out.println("Введите количество: ");
        Scanner scanner12 = new Scanner(System.in);
        double ed_izm_time_num_in = scanner12.nextInt();

        System.out.println("Введите во что вы хотите конвертировать (день, час, минута, секунда): ");
        Scanner scanner21 = new Scanner(System.in);
        String ed_izm_time_word_out = scanner21.nextLine();

        if ((ed_izm_time_word_in.equals("день")) && (ed_izm_time_word_out.equals("день"))) {
            System.out.println(ed_izm_time_num_in);
        } else if ((ed_izm_time_word_in.equals("день")) && (ed_izm_time_word_out.equals("час"))) {
            System.out.println(ed_izm_time_num_in * 24);
        } else if ((ed_izm_time_word_in.equals("день")) && (ed_izm_time_word_out.equals("минута"))) {
            System.out.println(ed_izm_time_num_in * 24 * 60);
        } else if ((ed_izm_time_word_in.equals("день")) && (ed_izm_time_word_out.equals("секунда"))) {
            System.out.println(ed_izm_time_num_in * 24 * 60 * 60);

        } else if ((ed_izm_time_word_in.equals("час")) && (ed_izm_time_word_out.equals("день"))) {
            System.out.println(ed_izm_time_num_in / 24);
        } else if ((ed_izm_time_word_in.equals("час")) && (ed_izm_time_word_out.equals("час"))) {
            System.out.println(ed_izm_time_num_in);
        } else if ((ed_izm_time_word_in.equals("час")) && (ed_izm_time_word_out.equals("минута"))) {
            System.out.println(ed_izm_time_num_in * 60);
        } else if ((ed_izm_time_word_in.equals("час")) && (ed_izm_time_word_out.equals("секунда"))) {
            System.out.println(ed_izm_time_num_in * 60 * 60);

        } else if ((ed_izm_time_word_in.equals("минута")) && (ed_izm_time_word_out.equals("день"))) {
            System.out.println(ed_izm_time_num_in / 24 / 60);
        } else if ((ed_izm_time_word_in.equals("минута")) && (ed_izm_time_word_out.equals("час"))) {
            System.out.println(ed_izm_time_num_in / 60);
        } else if ((ed_izm_time_word_in.equals("минута")) && (ed_izm_time_word_out.equals("минута"))) {
            System.out.println(ed_izm_time_num_in);
        } else if ((ed_izm_time_word_in.equals("минута")) && (ed_izm_time_word_out.equals("секунда"))) {
            System.out.println(ed_izm_time_num_in * 60);

        } else if ((ed_izm_time_word_in.equals("секунда")) && (ed_izm_time_word_out.equals("день"))) {
            System.out.println("В "+ed_izm_time_num_in+" сек "+(ed_izm_time_num_in / 24 / 60 / 60)+" дн");
        } else if ((ed_izm_time_word_in.equals("секунда")) && (ed_izm_time_word_out.equals("час"))) {
            System.out.println("В "+ed_izm_time_num_in+" сек "+(ed_izm_time_num_in / 60 / 60)+" ч");
        } else if ((ed_izm_time_word_in.equals("секунда")) && (ed_izm_time_word_out.equals("минута"))) {
            System.out.println("В "+ed_izm_time_num_in+" сек "+(ed_izm_time_num_in / 60)+" мин");
        } else if ((ed_izm_time_word_in.equals("секунда")) && (ed_izm_time_word_out.equals("секунда"))) {
            System.out.println("В "+ed_izm_time_num_in+" сек "+ed_izm_time_num_in+" сек");


        }
    }
}
