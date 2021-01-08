package com.MBugajski.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoardTestSuite {
    public Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");
        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));
        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);
        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    public void testAddTaskList() {
        //Given
        Board project = prepareTestData();

        //When

        //Then
        Assert.assertEquals(3, project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListFindUsersTasks(){
        //Given
        Board project = prepareTestData();

        //When
        List<Task> tasksOfADeveloper = project.getTaskLists().stream().
                flatMap(l -> l.getTasks().stream()).
                filter(t -> t.getAssignedUser().getUsername().equals("developer1"))
                .collect(Collectors.toList());

        //Then
        Assert.assertEquals(2, tasksOfADeveloper.size());
        Assert.assertEquals("developer1", tasksOfADeveloper.get(0).getAssignedUser().getUsername());
        Assert.assertEquals("developer1", tasksOfADeveloper.get(1).getAssignedUser().getUsername());
    }

    @Test
    public void testAddTaskListFindOutdatedTasks(){
        //Given
        Board project = prepareTestData();

        //When
        List<Task> outdatedTasks = project.getTaskLists().stream()
                .filter(l -> !l.getName().equals("Done"))
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(Collectors.toList());

        //Then
        Assert.assertEquals(1, outdatedTasks.size());
        Assert.assertEquals("HQLs for analysis", outdatedTasks.get(0).getTitle());
    }

    @Test
    public void testAddTaskListFindingLongTasks(){
        //Given
        Board project = prepareTestData();

        //When
       long longTasks = project.getTaskLists().stream()
               .filter(l -> l.getName().equals("In progress"))
               .flatMap(t -> t.getTasks().stream())
               .map(t -> t.getCreated())
               .filter(t -> t.plusDays(9).isBefore(LocalDate.now()))
               .count();

        //Then
        Assert.assertEquals(2, longTasks);


    }
}


