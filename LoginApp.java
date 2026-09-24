import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp extends JFrame {
    private JTextField txtCorreo;
    private JPasswordField txtPassword;
    private JButton btnIngresar;

    public LoginApp() {
        setTitle("Acceso al Sistema");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("  Correo electronico:"));
        txtCorreo = new JTextField();
        add(txtCorreo);

        add(new JLabel("  Contrasena:"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        btnIngresar = new JButton("Iniciar Sesion");
        add(new JLabel(""));
        add(btnIngresar);

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });
    }

    private void validarLogin() {
        String correo = txtCorreo.getText().trim();
        String password = new String(txtPassword.getPassword());

        if (!correo.contains("@")) {
            JOptionPane.showMessageDialog(this, "El correo debe contener '@'", "Error de validacion", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (password.length() < 8) {
            JOptionPane.showMessageDialog(this, "La contrasena debe tener al menos 8 caracteres", "Error de validacion", JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso!", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginApp().setVisible(true));
    }
}
