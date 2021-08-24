package com.escuelaing.Lab012.service;

import com.escuelaing.Lab012.data.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService{
    private final HashMap<String, Task> hashTask = new HashMap();
    @Override
    public Task create(Task task) {
        hashTask.put(task.getId(), task);
        return task;
    }
    @Override
    public Task findById(String id) {
        Task task = hashTask.get(id);
        return task;
    }
    @Override
    public List<Task> all() {
        return new ArrayList<>(hashTask.values());
    }

    @Override
    public void deleteById(String id) {
        hashTask.remove(id);
    }
    @Override
    public Task update(Task task, String id) {
        hashTask.put(id, task);
        return task;
    }
}
