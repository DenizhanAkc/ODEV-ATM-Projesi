import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        String userName, passWord;
        Scanner inp = new Scanner(in);

        int right = 3;
        int balance = 5000;
        int select;

        while (right > 0) {
            out.print("Kullanici Adiniz : ");
            userName = inp.nextLine();
            out.print("Kullanici Sifreniz : ");
            passWord = inp.nextLine();

            if (userName.equals("Tamacti") && passWord.equals("jun123")) {
                out.println("Merhaba, Drogo Bankasina Hosgeldiniz!");

                do {
                    out.println("1-Para Yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Cikis Yap");
                    out.println("Lutfen yapmak istediginiz islemi seciniz.");
                    select = inp.nextInt();
                    int price;
                    switch (select) {

                        case 1:
                            out.print("Para Miktari : ");
                            price = inp.nextInt();
                            balance += price;
                            break;

                        case 2:
                            out.print("Para Miktari : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                out.println("Bakiye Yetersiz ");
                            } else {
                                balance -= price;
                            }
                            break;

                        case 3:
                            out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            break;

                        default:
                            out.println("Hatali Bir Giris Yaptiniz ");
                    }
                }
                while (select != 4);
                out.println("Tekrar gorusmek uzere! ");
                break;
            }else{
                right--;
                out.println("Kullanici Adi veya Parola HATALI! Tekrar Deneyiniz.");

                if (right == 0) {
                    out.println("Hesabiniz Bloke Olmustur. Banka ile iletisime geciniz.");
                } else {
                    out.println("Kalan Hakkiniz : " + right);

                    }
                }
            }
        }
    }
