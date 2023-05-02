class KomporMi {
    private CaraMasakMi caraMasakMi;

    public KomporMi() {}

    public void aturCaraMasakMi(CaraMasakMi caraMasakMi) {
        this.caraMasakMi = caraMasakMi;
    }

    public void mulaiMasakMi() {
        caraMasakMi.masakMi();
    }
}