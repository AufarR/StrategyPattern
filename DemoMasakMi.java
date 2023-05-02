class DemoMasakMi {
    
    public static void main(String[] args) {
        // Menyiapkan kompor
        KomporMi komporAan1 = new KomporMi();
        KomporMi komporAan2 = new KomporMi();

        // Menyiapkan cara masak mi
        CaraMasakMi rebus = new RebusMi();
        CaraMasakMi goreng = new GorengMi();

        // Mengatur cara masak mi
        komporAan1.aturCaraMasakMi(rebus);
        komporAan2.aturCaraMasakMi(goreng);

        // Mulai masak mi
        komporAan1.mulaiMasakMi();
        komporAan2.mulaiMasakMi();
    }

}