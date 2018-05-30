package net.proselyte.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Util class that contains Connection connected logic.
 *
 * @author Eugene Suleimanov
 */
public class ConnectionUtil {

    FileInputStream fis;

    public Connection getConnection(){

        try {
            fis = new FileInputStream("src/main/resources/application.properties");
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("database.url");
            String name = properties.getProperty("database.username");
            String password = properties.getProperty("database.pass");
            return DriverManager.getConnection(url, name, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
