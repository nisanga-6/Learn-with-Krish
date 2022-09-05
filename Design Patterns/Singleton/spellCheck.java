package com.Example.Singleton;

import java.sql.*;

public class spellCheck {

    private static volatile spellCheck instance;
    private static volatile Connection connection;

    private spellCheck() {
    }

    public static spellCheck getInstance() {

        if (instance == null) {

            instance = new spellCheck();
        }
        return instance;
    }



    }
