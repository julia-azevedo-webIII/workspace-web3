package br.edu.ifpr.todo_list.controllers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import br.edu.ifpr.todo_list.models.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TaskController {
    
    private List<Task> tasks = new ArrayList<>();

    @GetMapping({"", "/", "tasks"})
    
    public String listTask(Model model){

        model.addAttribute("tasks", tasks);
        return "task-list"; //essa string precisa ser o nome de um arquivo html para retornar a pagina para o usuario 

        
    }
    @GetMapping("/create")
    public String createTask(){
        return "task-create";
    }

    @PostMapping("/savetask")
        public String saveTask(Task task){
            
            task.setId(Long.valueOf(tasks.size()+1));

            tasks.add(task);

            return "redirect:/tasks";
    }

    @GetMapping("/edit{id}")
    public String edit(@PathVariable Long id, Model model){

        for(Task task: tasks){
            if(task.getId() ==  id){
                model.addAttribute("task", task);
                return "task-edit";
            }
        }
        return "redirect:/tasks";


    }
    @PostMapping("/edittask")
    public String editTask(Task taskForm) {
        
        for (Task task : tasks){
            if (taskForm.getId() == task.getId()){
              tasks.set(tasks.indexOf(task), taskForm); //nao edita, substitui o campo
            }
        }
        return "redirect:/tasks";
    }

    @GetMapping("/remove")
    public  String removeTaske(@PathVariable Long id) {

        tasks.removeIf(task -> task.getId().equals(id));

        return "redirect:/tasks";
    }
    
    
}
