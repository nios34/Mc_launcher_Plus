package Operating;

import java.io.IOException;
import java.io.File;

import org.dtools.ini.*;

public class Conf {
    public Conf() {

    }

    public boolean Is_CONF_exists() {
        boolean rt = ((new File("./MC_launcher_Plus.ini")).exists());
        return rt;
    }

    public boolean Is_CONF_need_COMPLET() {
        IniFile CONF = new BasicIniFile();
        try {
            System.out.println((CONF.getSection(0)).getName());
        } catch (Exception e) {
            throw(e);
        }
        return true;
    }

    public boolean Conf_Init(String Login_Name, String Jre_path) throws IOException {
        IniFile CONF = new BasicIniFile();
        IniSection Add = CONF.addSection("MC launcher Plus");
        IniItem Add_0 = new IniItem("Login_Name");
        IniItem Add_1 = new IniItem("Jre");
        Add_0.setValue(Login_Name);
        Add_1.setValue(Jre_path);
        Add.addItem(Add_0);
        Add.addItem(Add_1);
        IniFileWriter wrt = new IniFileWriter(CONF, new File("./MC_launcher_Plus.ini"));
        wrt.write();
        return true;
    }
}

