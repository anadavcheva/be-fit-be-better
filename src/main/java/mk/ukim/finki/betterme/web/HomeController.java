package mk.ukim.finki.betterme.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping("/home")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/workouts")
    public String getWorkouts() {
        return "classes";
    }

    @GetMapping("/advice")
    public String getAdvice() {
        return "blog";
    }

    @GetMapping("/habits")
    public String getHabits() {
        return "habits";
    }


    @GetMapping("/about-us")
    public String getInfo() {
        return "about-us";
    }

    @GetMapping("/daily-planner")
    public String getPlanner() {
        return "elements";
    }

    @GetMapping("/task")
    public String setTask() {
        return "calendar";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "contact";
    }

}
