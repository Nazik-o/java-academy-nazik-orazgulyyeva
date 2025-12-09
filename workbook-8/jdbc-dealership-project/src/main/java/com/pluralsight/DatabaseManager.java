package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

    public class DatabaseManager {

        private static BasicDataSource dataSource;

        public static DataSource getDataSource() {
            if (dataSource == null) {
                dataSource = new BasicDataSource();
                dataSource.setUrl("jdbc:mysql://localhost:3306/CarDealership");
                dataSource.setUsername("root");
                dataSource.setPassword("yearup25");
            }
            return dataSource;
        }
    }
}
