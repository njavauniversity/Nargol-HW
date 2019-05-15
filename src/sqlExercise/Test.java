package sqlExercise;

import java.sql.SQLException;

public class Test
{

    public static void main(String[] args) throws Exception {
        JDBCsample sample = new JDBCsample();
        sample.insert(7,"salam ", "chetori");
    }

}
