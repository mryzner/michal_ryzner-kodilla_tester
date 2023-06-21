package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;
    private static final String listName = "New List";
    private static final String description = "This is a test list";

    @Test
    public void testFindByListName() {

        TaskList taskList = new TaskList(listName, description);
        taskListRepository.save(taskList);
        String name = taskList.getListName();

        List<TaskList> readTaskLists = taskListRepository.findByListName(name);

        assertEquals(1, readTaskLists.size());

        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
