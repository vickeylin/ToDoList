package com.wenqi.todolist.db;

import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.wenqi.todolist.db";
    public static final int DB_VERSION = 1;

    //To prevent someone from accidentally instantiating the contract class
    private TaskContract(){}

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }
}
