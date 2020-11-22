/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

//import java.awt.Color;
//import static java.awt.Color.*;
//import java.util.concurrent.TimeUnit;
//import java.lang.reflect.InvocationTargetException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 *
 * @author King Cobra
 */
public class MainForm extends Application {
    
    //*************methods***********
    Double deposit_fee = 50.0;
    Double chk_amount(double amount) {
        
        if (amount >= 10000) {
            return deposit_fee = 200.0;
        }
        if (amount < 10000 && amount >= 5000) {
            return deposit_fee = 100.0;
        }
        else {
            return deposit_fee = 50.0;
        }
    }
    //********************************
    Double atm_balance;
    Double atm_amount =0.0;
    
    
    @Override
    public void start(Stage st) {

        final Stage stATM = new Stage();
        final Stage stEmp = new Stage();
        final Stage stClient = new Stage();
        final Stage stClientData = new Stage();
        final Stage stEmpData = new Stage();
        
        final Pane pnMain = new Pane();
        final Pane pnATM = new Pane();
        final Pane pnEmp = new Pane();
        final Pane pnClient = new Pane();
        final Pane pnClientData = new Pane();
        final Pane pnEmpData = new Pane();
        
        Button btn1Main = new Button();
        Button btn2Main = new Button();
        Button btn3Main = new Button();
        Button btnC_ATM = new Button();
        final Button btnW_ATM = new Button();
        final Button btnD_ATM = new Button();
        btnW_ATM.setDisable(true);
        btnD_ATM.setDisable(true);
        Button btn1Client = new Button();
        Button btn2Client = new Button();
        
        Button btn1Emp = new Button();
        Button btn2Emp = new Button();
        Button btn3Emp = new Button();
        Button btn4Emp = new Button();
        
        Label lb1Main = new Label();
        Label lb1ATM = new Label();
        final Label lb2ATM = new Label();
        Label lb3ATM = new Label();
        Label lb1Client = new Label();
        Label lb2Client = new Label();
        Label lb3Client = new Label();
        Label lb4Client = new Label();
        Label lb5Client = new Label();
        final Label lb6Client = new Label();
        final TextArea lb1ClientData = new TextArea();
        lb1ClientData.setEditable(false);
        
        Label lb1Emp = new Label();
        Label lb2Emp = new Label();
        Label lb3Emp = new Label();
        Label lb4Emp = new Label();
        final Label lb5Emp = new Label();
        final Label lb6Emp = new Label();
        final TextArea lb7EmpData = new TextArea();
        lb7EmpData.setEditable(false);
        
        final TextField tb1ATM =new TextField();
        final TextField tb2ATM =new TextField();
        final TextField tb3ATM =new TextField();
        final TextField tb1Client =new TextField();
        final TextField tb2Client =new TextField();
        final TextField tb3Client =new TextField();
        final TextField tb4Client =new TextField();
        final TextField tb5Client =new TextField();
        final TextField tb1Emp = new TextField();
        final TextField tb2Emp = new TextField();
        final TextField tb3Emp = new TextField();
        final TextField tb4Emp = new TextField();
        final TextField tbBalanceID_Emp = new TextField();
        
        //************textbox setting************
        tb1ATM.setLayoutX(120);
        tb1ATM.setLayoutY(20);
        tb2ATM.setLayoutX(120);
        tb2ATM.setLayoutY(70);
        tb2ATM.getText();
        tb3ATM.setLayoutX(80);
        tb3ATM.setLayoutY(130);
        tb3ATM.setDisable(true);
        
        
        
        tb1Client.setLayoutX(120);
        tb1Client.setLayoutY(20);
        tb2Client.setLayoutX(120);
        tb2Client.setLayoutY(60);
        tb3Client.setLayoutX(120);
        tb3Client.setLayoutY(100);
        tb4Client.setLayoutX(120);
        tb4Client.setLayoutY(140);
        tb5Client.setLayoutX(120);
        tb5Client.setLayoutY(180);
        tb1Emp.setLayoutX(120);
        tb1Emp.setLayoutY(20);
        tb2Emp.setLayoutX(120);
        tb2Emp.setLayoutY(60);
        tb3Emp.setLayoutX(120);
        tb3Emp.setLayoutY(100);
        tb4Emp.setLayoutX(120);
        tb4Emp.setLayoutY(140);
        tbBalanceID_Emp.setLayoutX(120);
        tbBalanceID_Emp.setLayoutY(180);
        
        //************buttons setting************
        double butYloc = 250;
        btn1Main.setText("ATM");
        btn1Main.setLayoutX(100);
        btn1Main.setLayoutY(butYloc);
        btn1Main.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                pnMain.setDisable(true);
                stATM.show();
            }
        });
        
        
        btn2Main.setText("Client");
        btn2Main.setLayoutX(200);
        btn2Main.setLayoutY(butYloc);
        btn2Main.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                pn.setDisable(true);
                stClient.show();
            }
        });
        
        btn3Main.setText("Employee");
        btn3Main.setLayoutX(300);
        btn3Main.setLayoutY(butYloc);
        btn3Main.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                pn.setDisable(true);
                stEmp.show();
            }
        });
        
        final Alert alert = new Alert(AlertType.INFORMATION);
        final String[][] EmpData = new String[9999][6];
        final String[][] clientData = new String[9999][5];
        int balanceOFdata = 0;
        final int balanceIDdata = 0;
        btnC_ATM.setText("Check data");
        btnC_ATM.setLayoutX(100);
        btnC_ATM.setLayoutY(170);
        btnC_ATM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int balanceID_atm=0;
                balanceID_atm = Integer.parseInt(tb1ATM.getText());
                boolean ans = false;
                for(int i=0;i<9999;i++){
                    if(clientData[i][4] != null && tb1ATM.getText()!=""){
                        if(balanceID_atm == Integer.parseInt(clientData[i][4])){
                        ans = true;
                        btnW_ATM.setDisable(false);
                        btnD_ATM.setDisable(false);
                        tb3ATM.setText(clientData[i][3]);
                    }
                        else{
                            ans = false;
                            btnW_ATM.setDisable(true);
                            btnD_ATM.setDisable(true);
                        }
                    }
                    
                }
                if(ans == false){
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("404 not found");
                    alert.showAndWait();
                }
                else{
                    alert.setTitle("Sucess");
                    alert.setHeaderText(null);
                    alert.setContentText("balance id matched");
                    alert.showAndWait();
                }
            }
        });
//        atm_balance = Double.parseDouble(tb3ATM.getText());
        btnW_ATM.setText("Withdraw");
        btnW_ATM.setLayoutX(50);
        btnW_ATM.setLayoutY(220);
        tb3ATM.setText("" + tb1ATM.getText());
        btnW_ATM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                int atm_amount = 0;
                atm_amount = Double.parseDouble(tb2ATM.getText());
                if(atm_amount <= atm_balance && atm_amount >=0){
                    atm_balance = atm_balance -  atm_amount;
//                    int atm_balance =500;
                    tb3ATM.setText("" + atm_balance);
                }
                else{
                    if(Double.parseDouble(tb3ATM.getText()) != 0.0){
                        alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("you cant withdraw more than "+Double.parseDouble(tb3ATM.getText()));
                    alert.showAndWait();
                    }else{
                        alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("your balance is 0");
                    alert.showAndWait();
                    }
                    
                }
            }
        });
        
        btnD_ATM.setText("Deposit");
        btnD_ATM.setLayoutX(170);
        btnD_ATM.setLayoutY(220);
        btnD_ATM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                Double deposit_fee = 0.05* atm_amount;
                atm_amount = Double.parseDouble(tb2ATM.getText());
                atm_balance = Double.parseDouble(tb3ATM.getText());
                
               if (atm_amount < deposit_fee && atm_balance > 0) {
                    chk_amount(atm_balance);
                    atm_balance += atm_amount;
                     tb3ATM.setText("" + atm_balance);
            }
               if(atm_amount < deposit_fee){
                   atm_balance += atm_amount;
                   tb3ATM.setText("" + atm_balance);
               }
               else {
                   chk_amount(atm_balance);
            atm_balance = atm_balance + atm_amount - deposit_fee;
             tb3ATM.setText("" + atm_balance);
            }
            }
        });
        btn1Client.setText("ADD");
        btn1Client.setLayoutX(100);
        btn1Client.setLayoutY(220);
        btn1Client.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                
                
                if(tb1Client.getText().equals("") && tb2Client.getText().equals("") && tb3Client.getText().equals("") &&
                        tb4Client.getText().equals("") && tb5Client.getText().equals("")){
                    lb6Client.setText("all fields ar blank");
                }
                else{
                    int n=0;
                        clientData[n][0]=tb1Client.getText();
                        clientData[n][1]=tb2Client.getText();
                        clientData[n][2]=tb3Client.getText();
                        clientData[n][3]=tb4Client.getText();
                        clientData[n][4]=tb5Client.getText();
                        
                    if(clientData[n][0] != null && clientData[n][1] != null&& clientData[n][2] != null &&
                        clientData[n][3] != null && clientData[n][4] != null){
                    for(int i=0; i<=n; i++){
                    lb1ClientData.appendText("name: "+clientData[i][0]+
                                            "\nage: "+clientData[i][1]+
                                            "\ns.s: "+clientData[i][2]+
                                            "\nbalance: "+clientData[i][3]+
                                            "\nbalance id: "+clientData[i][4]+"\n--#--\n");
                    }
                    n++;
                }
                    alert.setTitle("Sucess!!");
                    alert.setHeaderText(null);
                    alert.setContentText("Data has been added");
                    alert.showAndWait();
                }
            }
        });
        
        btn2Client.setText("Show data");
        btn2Client.setLayoutX(150);
        btn2Client.setLayoutY(220);
        btn2Client.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                lb1ClientData.setText("");
                for(int i=0;i<9999;i++){
                            if(clientData[i][0] != null && clientData[i][1] != null && clientData[i][2] != null &&
                                     clientData[i][3] != null && clientData[i][4] != null){
                                lb1ClientData.appendText("name: "+clientData[i][0]+
                                            "\nage: "+clientData[i][1]+
                                            "\ns.s: "+clientData[i][2]+
                                            "\nbalance: "+clientData[i][3]+
                                            "\nbalance id: "+clientData[i][4]+"\n--#--\n");
                            }
                            
                        }
                stClientData.show();
            }
        });
        
        
        btn1Emp.setText("Employee");
        btn1Emp.setLayoutX(20);
        btn1Emp.setLayoutY(220);
        btn1Emp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int n =0;
                if(tb1Emp.getText().equals("") && tb2Emp.getText().equals("") && tb3Emp.getText().equals("")){
                    if(tb4Emp.getText().equals("") && tbBalanceID_Emp.getText().equals("")){
                        lb6Emp.setText("all fields ar blank");
                    }
                    else{
                        EmpData[n][0]=tb1Emp.getText();
                        EmpData[n][1]=tb2Emp.getText();
                        EmpData[n][2]=tb3Emp.getText();
                        EmpData[n][3]=tb4Emp.getText();
                        EmpData[n][4]=tbBalanceID_Emp.getText();
                        EmpData[n][5]="Employee";
                        
                    if(EmpData[n][0] != null && EmpData[n][1] != null&& EmpData[n][2] != null &&
                        EmpData[n][3] != null && EmpData[n][4] != null){
                    for(int i=0; i<=n; i++){
                    lb7EmpData.appendText("name: "+EmpData[i][0]+
                                            "\nage: "+EmpData[i][1]+
                                            "\ns.s: "+EmpData[i][2]+
                                            "\nbalance: "+EmpData[i][3]+
                                            "\nbalance id: "+EmpData[i][4]+
                                            "\ncat: "+EmpData[i][5]+"\n--#--\n");
                    }
                    n++;
                }
                    alert.setTitle("Sucess!!");
                    alert.setHeaderText(null);
                    alert.setContentText("Data has been added");
                    alert.showAndWait();
                }
                    alert.setTitle("Sucess!!");
                    alert.setHeaderText(null);
                    alert.setContentText("Data has been added");
                    alert.showAndWait();
                    
                }
            }
        });
        
        
        //------------------------------------
                btn2Emp.setText("manager");
                btn2Emp.setLayoutX(100);
                btn2Emp.setLayoutY(220);
                btn2Emp.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        int n=0;
                        if(tb1Emp.getText().equals("") && tb2Emp.getText().equals("") && tb3Emp.getText().equals("") &&
                                tb4Emp.getText().equals("") && tbBalanceID_Emp.getText().equals("")){
                        lb6Emp.setText("all fields ar blank");
                    
                    }
                    else{
                        EmpData[n][0]=tb1Emp.getText();
                        EmpData[n][1]=tb2Emp.getText();
                        EmpData[n][2]=tb3Emp.getText();
                        EmpData[n][3]=tb4Emp.getText();
                        EmpData[n][4]=tbBalanceID_Emp.getText();
                        EmpData[n][5]="manager";
                        
                    if(EmpData[n][0] != null && EmpData[n][1] != null&& EmpData[n][2] != null &&
                        EmpData[n][3] != null && EmpData[n][4] != null){
                    for(int i=0; i<=n; i++){
                    lb7EmpData.appendText("name: "+EmpData[i][0]+
                                            "\nage: "+EmpData[i][1]+
                                            "\ns.s: "+EmpData[i][2]+
                                            "\nbalance: "+EmpData[i][3]+
                                            "\nbalance id: "+EmpData[i][4]+
                                            "\ncat: "+EmpData[i][5]+"\n--#--\n");
                    }
                    n++;
                }
                    alert.setTitle("Sucess!!");
                    alert.setHeaderText(null);
                    alert.setContentText("Data has been added");
                    alert.showAndWait();
                }
                    }
                });
                
                //----------------------------
                btn3Emp.setText("Intern");
                btn3Emp.setLayoutX(180);
                btn3Emp.setLayoutY(220);
                btn3Emp.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        int n=0;
                        if(tb1Emp.getText().equals("") && tb2Emp.getText().equals("") && tb3Emp.getText().equals("") &&
                                tb4Emp.getText().equals("") && tbBalanceID_Emp.getText().equals("")){
                        lb6Emp.setText("all fields ar blank");
                    
                    }
                    else{
                        EmpData[n][0]=tb1Emp.getText();
                        EmpData[n][1]=tb2Emp.getText();
                        EmpData[n][2]=tb3Emp.getText();
                        EmpData[n][3]=tb4Emp.getText();
                        EmpData[n][4]=tbBalanceID_Emp.getText();
                        EmpData[n][5]="intern";
                        
                    if(EmpData[n][0] != null && EmpData[n][1] != null&& EmpData[n][2] != null &&
                        EmpData[n][3] != null && EmpData[n][4] != null){
                    for(int i=0; i<=n; i++){
                    lb7EmpData.appendText("name: "+EmpData[i][0]+
                                            "\nage: "+EmpData[i][1]+
                                            "\ns.s: "+EmpData[i][2]+
                                            "\nbalance: "+EmpData[i][3]+
                                            "\nbalance id: "+EmpData[i][4]+
                                            "\ncat: "+EmpData[i][5]+"\n--#--\n");
                    }
                    n++;
                }
                    alert.setTitle("Sucess!!");
                    alert.setHeaderText(null);
                    alert.setContentText("Data has been added");
                    alert.showAndWait();
                }
                    }
                    
                });
                
                //-------------------------
                
                btn4Emp.setText("data");
                btn4Emp.setLayoutX(240);
                btn4Emp.setLayoutY(220);
                btn4Emp.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        lb7EmpData.setText("");
                        
                        for(int i=0;i<9999;i++){
                            if(EmpData[i][0] != null && EmpData[i][1] != null && EmpData[i][2] != null &&
                                     EmpData[i][3] != null && EmpData[i][4] != null){
                                lb7EmpData.appendText("name: "+EmpData[i][0]+
                                            "\nage: "+EmpData[i][1]+
                                            "\ns.s: "+EmpData[i][2]+
                                            "\nbalance: "+EmpData[i][3]+
                                            "\nbalance id: "+EmpData[i][4]+
                                            "\ncat: "+EmpData[i][5]+"\n--#--\n");
                            }
                            
                        }
                      stEmpData.showAndWait();
                   }
                });
                
                
        //************Label settings************
//        Label lb1Main = new Label();
        lb1Main.setLayoutX(150);
        lb1Main.setLayoutY(100);
        lb1Main.setText("choose category:");
        lb1ATM.setLayoutX(20);
        lb1ATM.setLayoutY(20);
        lb1ATM.setText("Balance ID: ");
        lb2ATM.setLayoutX(20);
        lb2ATM.setLayoutY(70);
        lb2ATM.setText("Amount: ");
        lb3ATM.setLayoutX(100);
        lb3ATM.setLayoutY(100);
        lb3ATM.setText("Balance: ");
        lb1Client.setLayoutX(20);
        lb1Client.setLayoutY(20);
        lb1Client.setText("Name: ");
        lb2Client.setLayoutX(20);
        lb2Client.setLayoutY(60);
        lb2Client.setText("Age: ");
        lb3Client.setLayoutX(20);
        lb3Client.setLayoutY(100);
        lb3Client.setText("S.S : ");
        lb4Client.setLayoutX(20);
        lb4Client.setLayoutY(140);
        lb4Client.setText("Balance: ");
        lb5Client.setLayoutX(20);
        lb5Client.setLayoutY(180);
        lb5Client.setText("Balance ID: ");
        lb6Client.setLayoutX(180);
        lb6Client.setLayoutY(250);
        
        lb1Emp.setLayoutX(20);
        lb1Emp.setLayoutY(20);
        lb1Emp.setText("Name: ");
        lb2Emp.setLayoutX(20);
        lb2Emp.setLayoutY(60);
        lb2Emp.setText("Age: ");
        lb3Emp.setLayoutX(20);
        lb3Emp.setLayoutY(100);
        lb3Emp.setText("S.S : ");
        lb4Emp.setLayoutX(20);
        lb4Emp.setLayoutY(140);
        lb4Emp.setText("Balance: ");
        lb5Emp.setLayoutX(20);
        lb5Emp.setLayoutY(180);
        lb5Emp.setText("Balance ID: ");
        lb6Emp.setLayoutX(115);
        lb6Emp.setLayoutY(250);
        
        //************scene settings************
        Scene sceneMain = new Scene(pnMain,350,450);
        Scene sceneATM = new Scene(pnATM,350,450);
        Scene sceneClient = new Scene(pnClient,350,450);
        Scene sceneEmp = new Scene(pnEmp,350,450);
        Scene sceneClientData = new Scene(pnClientData,350,450);
        Scene sceneEmpData = new Scene(pnEmpData,350,450);
        
        
        //************main stage && pane settings************
        st.setFullScreen(false);
        st.setResizable(false);
        st.setTitle("Bank");
        st.setHeight(350);
        st.setWidth(450);
        st.setScene(sceneMain);
        pnMain.getChildren().addAll(btn1Main,btn2Main,btn3Main,lb1Main);
        
        //************atm stage & pane settings************
        stATM.setFullScreen(false);
        stATM.setResizable(false);
        stATM.setTitle("ATM");
        stATM.setHeight(300);
        stATM.setWidth(300);
        stATM.setScene(sceneATM);
        pnATM.getChildren().addAll(tb1ATM,tb2ATM,tb3ATM,lb1ATM,
                lb2ATM,lb3ATM,btnC_ATM,btnW_ATM,btnD_ATM);
        
        //************client stage & pane settings************
        stClient.setFullScreen(false);
        stClient.setResizable(false);
        stClient.setTitle("Client");
        stClient.setHeight(300);
        stClient.setWidth(300);
        stClient.setScene(sceneClient);
        pnClient.getChildren().addAll(lb1Client,lb2Client,lb3Client,lb4Client,lb5Client,
                tb1Client,tb2Client,tb3Client,tb4Client,tb5Client,btn1Client,lb6Client,btn2Client);
        
        //************client data stage && pane settings************
        stClientData.setFullScreen(false);
        stClientData.setResizable(false);
        stClientData.setTitle("Client");
        stClientData.setHeight(300);
        stClientData.setWidth(500);
        stClientData.setScene(sceneClientData);
        pnClientData.getChildren().addAll(lb1ClientData);
        
        //************employee stage & pane settings************
        stEmp.setFullScreen(false);
        stEmp.setResizable(false);
        stEmp.setTitle("Client");
        stEmp.setHeight(300);
        stEmp.setWidth(300);
        stEmp.setScene(sceneEmp);
        pnEmp.getChildren().addAll(lb1Emp,lb2Emp,lb3Emp,lb4Emp,lb5Emp,tb1Emp,tb2Emp,tb3Emp,tb4Emp,tbBalanceID_Emp,
                btn1Emp,btn2Emp,btn3Emp,lb6Emp,btn4Emp);
        
        //************employee data stage & pane settings************
        stEmpData.setFullScreen(false);
        stEmpData.setResizable(false);
        stEmpData.setTitle("emp data");
        stEmpData.setHeight(300);
        stEmpData.setWidth(500);
        stEmpData.setScene(sceneEmpData);
        pnEmpData.getChildren().addAll(lb7EmpData);
         
//        if(stATM.show() == true){
//            pnMain.setDisable(true);
//        }
        st.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
