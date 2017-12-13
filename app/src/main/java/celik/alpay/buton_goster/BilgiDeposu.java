package celik.alpay.buton_goster;
import java.util.Random;

public class BilgiDeposu {
    public String[] mBilgiler = {
            "Merhaba ve Şey kelimeleri Arapçadır",
            "Sağ ayağınız ile sağ ayağınıza dokunamazsınız.",
            "Amerika ilk yabancı antlaşmayı Osmanli ile yapmıştır."
    };

    public String getBilgi(){
        // Array oluşturuyoruz

        // Butona tıkladığımızda yazıyı bu bölümde değiştiriyoruz.
        String bilgi = "";
        // rastgele yazı oluşturacağız
        Random rastgeleSayiOlusturucu = new Random(); // rastgele satı oluşturuyoruz.
        int rastgeleSayi = rastgeleSayiOlusturucu.nextInt(mBilgiler.length);
        // rakamları stringe dönüştürüyoruz..
                    /*
                    if(rastgeleSayi == 0){
                       bilgi = "Merhaba ve Şey kelimeleri Arapçadır";
                    }
                    else if(rastgeleSayi == 1){
                        bilgi = "Sağ ayağınız ile sağ ayağınıza dokunamazsınız.";
                    }
                    else if(rastgeleSayi == 2){
                        bilgi = "Amerika ilk yabancı antlaşmayı Osmanli ile yapmıştır.";
                    }
                    else{
                        bilgi = "Bir hata oluştu.";
                    }
                    */
        bilgi = mBilgiler[rastgeleSayi];
        return bilgi;
    }
}
