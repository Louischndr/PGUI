
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ali
 */
public class TugasPt3 extends Application{
    @Override
    public void start(Stage window){
        
       window.setTitle("Form Pendaftaran");
         //GridPane
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25,25,25,25));
        root.setVgap(10);
        root.setHgap(10);
        
        
        //Text
        Text txtnama = new Text("Nama :");
        root.add(txtnama, 0,0);
        
        Text txttelp = new Text("Telepon :");
        root.add(txttelp, 0,1);
        
        Text txtalamat = new Text("Alamat :");
        root.add(txtalamat, 0,2);
        
        //Text Area & Text Field
        TextField TFnama = new TextField();
        root.add(TFnama, 1,0);
        
        TextField TFtelp = new TextField();
        root.add(TFtelp, 1,1);
        
        TextArea TAalamat = new TextArea();
        root.add(TAalamat, 1,2);
        
        //Button Kirim
        Button btnkirim = new Button("Kirim");
        root.add(btnkirim, 0,4);
       
        //Button Hapus
        Button btnhapus = new Button("Hapus");
        root.add(btnhapus, 1,4);
         
       Scene scene = new Scene(root,450,400);
       
       window.setScene(scene);
       window.show();
        
        
        
        }
    public static void main(String args[]){
    Application.launch(args);  
    }
}
