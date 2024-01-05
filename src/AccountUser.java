public class AccountUser {

    private int number;
    private int agencia;
    private String Username;
    private double saldo;



    public int getNumber() {
        return number;
    }

    public int getAgencia() {
        return agencia;
    }


    public String getUsername() {
        return Username;
    }

    public AccountUser(int number, int agencia, String username) {
        this.number = number;
        this.agencia = agencia;
        Username = username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
