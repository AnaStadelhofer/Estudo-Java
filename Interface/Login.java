package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame {
    private JLabel userName;
    private JLabel password;
    private JTextField writeName;
    private JPasswordField writePassword;
    private JButton buttonLogin;
    private JButton buttonCancel;

    public Login(){
        userName = new JLabel("Nome", JLabel.CENTER);
        password = new JLabel("Senha", JLabel.CENTER);
        buttonLogin = new JButton("Logar");
        buttonCancel = new JButton("Cancelar");
        writeName = new JTextField(31);
        writePassword = new JPasswordField(31);
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        pane.add(userName);
        pane.add(writeName);
        pane.add(password);
        pane.add(writePassword);
        pane.add(buttonLogin);
        pane.add(buttonCancel);
        
        buttonLogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonMensagemActionPerformed(e);
            }
        });

        buttonCancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonConfirmaActionPerformed(e);
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);
        this.setResizable(false);
        this.setVisible(true);
    }

        private void buttonMensagemActionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(
                this, 
                "VOCÊ LOGOU",
                "PARABENS, TOME SEU NADA!",
                JOptionPane.INFORMATION_MESSAGE
            );
        }

        private void buttonConfirmaActionPerformed(ActionEvent e){
            int ret = JOptionPane.showConfirmDialog(
                this, 
                "Deseja Cancelar?",
                "Cancelar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            if(ret == JOptionPane.OK_OPTION){
                System.exit(0);
            }
        }
    public static void main(String[] args){
        Login janela = new Login();
    }
}
