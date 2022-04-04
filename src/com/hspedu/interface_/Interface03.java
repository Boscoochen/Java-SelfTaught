package com.hspedu.interface_;

public class Interface03 {

    public static void main(String[] args) {

        OracleDB oracleDB = new OracleDB();
        MySqlDB mySqlDB = new MySqlDB();
        Interface03.t(oracleDB);
        Interface03.t(mySqlDB);
    }

    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}
