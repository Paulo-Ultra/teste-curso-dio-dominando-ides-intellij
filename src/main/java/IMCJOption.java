import javax.swing.JOptionPane;

    public class IMCJOption {

        public static void main(String[] args) {
            double peso, altura, imc;
            String aux = "";
            try {
                aux = JOptionPane.showInputDialog("Digite o seu peso: ");
                peso = Float.parseFloat(aux);
                aux = JOptionPane.showInputDialog("Digite a sua altura: ");
                altura = Float.parseFloat(aux);

                imc = peso / (altura * altura);
                JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
                if (imc <= 19)
                    JOptionPane.showMessageDialog(null, "Você está abaixo do peso. ");
                else if (imc > 19 && imc <= 25)
                    JOptionPane.showMessageDialog(null, "Você está no peso ideal. ");
                else if (imc > 25 && imc <= 30)
                    JOptionPane.showMessageDialog(null, "Você está acima peso. ");
                else if (imc > 30 && imc <= 35)
                    JOptionPane.showMessageDialog(null, "Obesidade leve. ");
                else
                    JOptionPane.showMessageDialog(null, "Obesidade mórbida. ");
            }
            catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Houve erro de conversão, digite apenas caracteres núméricos" + erro.toString());
            }
            System.exit(0);
        }

    }


