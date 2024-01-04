import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WisataController {

    @FXML
    private Label jumlahMobilLabel;

    @FXML
    private Label jumlahMotorLabel;

    @FXML
    private Label pemasukanLabel;

    @FXML
    private TextField hariTextField;

    @FXML
    private TextField tanggalTextField;

    private int jumlahMobil = 0;
    private int jumlahMotor = 0;

    private final int hargaPerMotor = 2000;
    private final int hargaPerMobil = 5000;

    public WisataController() {
        // Konstruktor default
    }

    @FXML
    public void handleTambahMobil(ActionEvent event) {
        jumlahMobil++;
        updateLabelsAndPemasukan();
    }

    @FXML
    public void handleTambahMotor(ActionEvent event) {
        jumlahMotor++;
        updateLabelsAndPemasukan();
    }

    private void updateLabelsAndPemasukan() {
        jumlahMobilLabel.setText("Jumlah Mobil: " + jumlahMobil);
        jumlahMotorLabel.setText("Jumlah Motor: " + jumlahMotor);

        // Hitung pemasukan berdasarkan jumlah mobil dan motor
        int totalPemasukan = (jumlahMobil * hargaPerMobil) + (jumlahMotor * hargaPerMotor);
        pemasukanLabel.setText("Pemasukan: Rp " + totalPemasukan);

        // Ambil nilai dari inputan hari dan tanggal (sesuaikan dengan kebutuhan Anda)
        String hari = hariTextField.getText();
        String tanggal = tanggalTextField.getText();

        // Lakukan sesuatu dengan nilai hari dan tanggal (misalnya, tampilkan atau simpan)
        System.out.println("Hari: " + hari + ", Tanggal: " + tanggal);
    }

    public int getHargaPerMotor() {
        return hargaPerMotor;
    }

    public int getHargaPerMobil() {
        return hargaPerMobil;
    }
}
