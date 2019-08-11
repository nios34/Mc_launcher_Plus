package test;

import Operating.Conf;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Conf X = new Conf();
        System.out.println(X.Is_CONF_exists());
        System.out.println(X.Is_CONF_need_COMPLET());
        X.Conf_Init("Nios34", "C:\\Program Files\\Java\\jre1.8.0_221\\bin\\");
    }
}
